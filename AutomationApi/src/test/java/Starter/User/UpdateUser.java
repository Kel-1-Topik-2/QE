package Starter.User;

import Utils.General;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUser {
    String username,password,tokenAdmin;
    General general = new General();
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Update user by id")
    public String setAnEndpointForUpdateUser(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "user/{idUserNew}";
        }else if (endpoint.equals("invalid")){
            return base_url + "user/0";
        }else {
            return base_url + "user/null";
        }
    }

    @Step("I request {String} for Update detail user")
    public void requestUpdateFieldDetailUser(String field) throws IOException {
        switch (field) {
            case "validAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", this.username = General.randomUsername());
                requestBody.put("password", this.password = General.randomPassword());

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUser("valid"));
                break;
            }
            case "nullEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", this.username = General.randomUsername());
                requestBody.put("password", this.password = General.randomPassword());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUser("null"));
                break;
            }
            case "invalidEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", this.username = General.randomUsername());
                requestBody.put("password", this.password = General.randomPassword());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUser("invalid"));
                break;
            }
            case "emptyUsername": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", "");
                requestBody.put("password", this.password = General.randomPassword());

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUser("valid"));
                break;
            }
            case "emptyPassword": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", this.username = General.randomUsername());
                requestBody.put("password", "");

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUser("valid"));
                break;
            }
            case "emptyAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", "");
                requestBody.put("password", "");

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUser("valid"));
                break;
            }
            default:
                JSONObject requestBody = new JSONObject();

                requestBody.put("username", null);
                requestBody.put("password", null);

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUser("valid"));
                break;
        }
    }

    @Step("I validate the status code for Update data user is {int}")
    public void validateTheStatusCodeForUpdateDataUser(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after update user")
    public void validateTheDataDetailAfterUpdateUser(String message) {
        switch (message) {
            case "success":
                Response responseRatings = SerenityRest.lastResponse();
                String idUserUpdate = responseRatings.jsonPath().getString("data.id");
                System.out.println(idUserUpdate);
                try (FileWriter file = new FileWriter("src/test/resources/filejson/idUserUpdate.json")) {
                    file.write(idUserUpdate);
                    file.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                restAssuredThat(response -> response.body("responseCode", equalTo("SUCCESS")));
                restAssuredThat(response -> response.body("message", equalTo("Success!")));
                restAssuredThat(response -> response.body("data.created_by", equalTo("SYSTEM")));
                break;
            case "notFound":
                restAssuredThat(response -> response.body("responseCode", equalTo("DATA_NOT_FOUND")));
                restAssuredThat(response -> response.body("message", equalTo("Data not found!")));
                break;
            case "badRequest":
                restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
                break;
            default:
                restAssuredThat(response -> response.body("responseCode", equalTo("UNKNOWN_ERROR")));
                restAssuredThat(response -> response.body("message", equalTo("Happened error!")));
                break;
        }
    }
}
