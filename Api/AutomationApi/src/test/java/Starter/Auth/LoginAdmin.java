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

public class LoginAdmin {

    String username,password;
    General general = new General();
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for login account admin")
    public String setEndpointLoginAccountAdmin(){
        return base_url + "api/auth/login/";
    }

    @Step("I request {String} get detail account admin")
    public void requestLoginAccountAdmin(String field)throws Exception{
        switch (field) {
            case "nullUser":
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", null);
                requestBody.put("password", "admin123");
                requestBody.put("role", "ROLE_ADMIN");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountAdmin());
                break;
            case "nullPass":
                requestBody = new JSONObject();

                requestBody.put("username", "admin");
                requestBody.put("password", null);
                requestBody.put("role", "ROLE_ADMIN");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountAdmin());
                break;
            case "nullAll":
                requestBody = new JSONObject();

                requestBody.put("username", null);
                requestBody.put("password", null);
                requestBody.put("role", "ROLE_ADMIN");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountAdmin());
                break;

            case "invalidUser":
                requestBody = new JSONObject();

                requestBody.put("username", this.username = General. randomUsername());
                requestBody.put("password", "admin123");
                requestBody.put("role", "ROLE_ADMIN");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountAdmin());
                break;
            case "invalidPass":
                requestBody = new JSONObject();

                requestBody.put("username", "admin");
                requestBody.put("password", this.password = General.randomPassword());
                requestBody.put("role", "ROLE_ADMIN");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountAdmin());
                break;
            case "invalidAll":
                requestBody = new JSONObject();

                requestBody.put("username", this.username = General. randomUsername());
                requestBody.put("password", this.password = General.randomPassword());
                requestBody.put("role", "ROLE_ADMIN");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountAdmin());
                break;
            default:
                requestBody = new JSONObject();

                requestBody.put("username", "admin");
                requestBody.put("password", "admin123");
                requestBody.put("role", "ROLE_ADMIN");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountAdmin());
                break;
        }
    }

    @Step("I validate the status code for login admin is {int}")
    public void validateTheStatusCodeForLoginAdmin(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after login account admin")
    public void validateTheDataDetailAfterLoginAccountAdmin(String message) {
        if (message.equals("success")) {
            Response responseRatings = SerenityRest.lastResponse();
            String token = responseRatings.jsonPath().getString("token");
            System.out.println(token);
            try (FileWriter file = new FileWriter("src/test/resources/filejson/tokenAdmin.json")) {
                file.write(token);
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
