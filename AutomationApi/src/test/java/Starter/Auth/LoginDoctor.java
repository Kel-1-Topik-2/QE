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
            case "emptyUser":
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", "");
                requestBody.put("password", "lulu123");
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "emptyPass":
                requestBody = new JSONObject();

                requestBody.put("username", "lulu");
                requestBody.put("password", "");
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "emptyRole":
                requestBody = new JSONObject();

                requestBody.put("username", "lulu");
                requestBody.put("password", "lulu123");
                requestBody.put("role", "ROLES");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "emptyAll":
                requestBody = new JSONObject();

                requestBody.put("username", "");
                requestBody.put("password", "");
                requestBody.put("role", "");

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
                requestBody.put("password", "lulu123");
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "invalidPass":
                requestBody = new JSONObject();

                requestBody.put("username", "lulu");
                requestBody.put("password", this.password = General.randomPassword());
                requestBody.put("role", "ROLE_DOKTER");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "invalidAll":
                requestBody = new JSONObject();

                requestBody.put("username", this.username = General. randomUsername());
                requestBody.put("password", this.password = General.randomPassword());
                requestBody.put("role", "ROLES");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "invalidRole":
                requestBody = new JSONObject();

                requestBody.put("username", "admin");
                requestBody.put("password", "admin123");
                requestBody.put("role", "ROLES");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            case "invalid All":
                requestBody = new JSONObject();

                requestBody.put("username", this.username = General. randomUsername());
                requestBody.put("password", this.password = General.randomPassword());
                requestBody.put("role", "ROLES-");

                SerenityRest.given().header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointLoginAccountDoctor());
                break;
            default:
                requestBody = new JSONObject();

                requestBody.put("username", "sasa");
                requestBody.put("password", "sasa123");
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
            } else if (message.equals("badRequest")) {
                restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
            } else {
                comparesEqualTo("");
            }
        }
}
