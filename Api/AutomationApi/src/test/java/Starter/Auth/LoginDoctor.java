package Starter.Auth;

import Utils.General;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class LoginDoctor {

    String username,password;
    General general = new General();
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for login account doctor")
    public String setEndpointLoginAccountDoctor(){
        return base_url + "api/auth/login/";
    }

    @Step("I request {String} get detail account doctor")
    public void requestLoginAccountDoctor(String field)throws Exception{
        switch (field) {
            case "nullUser":
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", null);
                requestBody.put("password", "zahra01");
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "nullPass":
                requestBody = new JSONObject();

                requestBody.put("username", "Zahra");
                requestBody.put("password", null);
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "nullAll":
                requestBody = new JSONObject();

                requestBody.put("username", null);
                requestBody.put("password", null);
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;

            case "invalidUser":
                requestBody = new JSONObject();

                requestBody.put("username", this.username = General. randomUsername());
                requestBody.put("password", "zahra01");
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "invalidPass":
                requestBody = new JSONObject();

                requestBody.put("username", "Zahra");
                requestBody.put("password", this.password = General.randomPassword());
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "invalidAll":
                requestBody = new JSONObject();

                requestBody.put("username", this.username = General. randomUsername());
                requestBody.put("password", this.password = General.randomPassword());
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            default:
                requestBody = new JSONObject();

                requestBody.put("username", "Hanif");
                requestBody.put("password", "hanif11");
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
        }
    }

    @Step("I validate the status code for login doctor is {int}")
    public void validateTheStatusCodeForLoginDoctor(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after login account doctor")
    public void validateTheDataDetailAfterLoginAccountDoctor(String message) {
        if (message.equals("success")) {
            Response responseRatings = SerenityRest.lastResponse();
            String tokenDoctor = responseRatings.jsonPath().getString("token");
            System.out.println(tokenDoctor);
            try (FileWriter file = new FileWriter("src/test/resources/filejson/tokenDoctor.json")) {
                file.write(tokenDoctor);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            comparesEqualTo("");
        } else {
            comparesEqualTo("");
        }
    }
}
