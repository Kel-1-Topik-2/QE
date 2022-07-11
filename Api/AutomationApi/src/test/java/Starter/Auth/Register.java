package Starter.Auth;

import Utils.General;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class Register {
    String username,password;
    General general = new General();
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for register account")
    public String setEndpointRegister(){
        return base_url + "api/auth/register/";
    }

    @Step("I request {String} get detail regis new account")
    public void requestRegisterNewAccount(String field)throws Exception{
        switch (field) {
            case "nullUser":
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", null);
                requestBody.put("password", "zahra01");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointRegister());
                break;
            case "nullPass":
                requestBody = new JSONObject();

                requestBody.put("username", "Zahra");
                requestBody.put("password", null);

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointRegister());
                break;
            case "nullAll":
                requestBody = new JSONObject();

                requestBody.put("username", null);
                requestBody.put("password", null);

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointRegister());
                break;

            case "invalidUser":
                requestBody = new JSONObject();

                requestBody.put("username", "sasa");
                requestBody.put("password", "sasa123");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointRegister());
                break;
            default:
                requestBody = new JSONObject();

                requestBody.put("username", this.username = General.randomUsername());
                requestBody.put("password", this.password = General.randomPassword());

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointRegister());
                break;
        }
    }

    @Step("I validate the status code for register new account is {int}")
    public void validateTheStatusCodeForRegisterNewAccount(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after create new account")
    public void validateTheDataDetailAfterRegisterNewAccount(String message) {
        if (message.equals("success")) {
            Response responseRatings = SerenityRest.lastResponse();
            String idUsername = responseRatings.jsonPath().getString("data.id");
            System.out.println(idUsername);
            try (FileWriter file = new FileWriter("src/test/resources/filejson/idUserNew.json")) {
                file.write(idUsername);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            restAssuredThat(response -> response.body("responseCode", equalTo("SUCCESS")));
            restAssuredThat(response -> response.body("message", equalTo("Success!")));
        } else {
            comparesEqualTo("");
        }
    }
}
