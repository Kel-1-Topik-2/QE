package Starter.User;

import Utils.General;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserEncryption {
    String username,password,tokenAdmin;
    General general = new General();
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Update user encryption by id")
    public String setAnEndpointForUpdateUserEncryption(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "api/auth/updateuser/{idUserNew}";
        }else if (endpoint.equals("invalid")){
            return base_url + "api/auth/updateuser/0";
        }else {
            return base_url + "api/auth/updateuser/null";
        }
    }

    @Step("I request {String} for Update detail user encryption")
    public void requestUpdateFieldDetailUserEncryption(String field) throws IOException {
        switch (field) {
            case "validAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("new_username", this.username = General.randomUsername());
                requestBody.put("new_password", this.password = General.randomPassword());

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUserEncryption("valid"));
                break;
            }
            case "nullEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("new_username", this.username = General.randomUsername());
                requestBody.put("new_password", this.password = General.randomPassword());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUserEncryption("null"));
                break;
            }
            case "invalidEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("new_username", this.username = General.randomUsername());
                requestBody.put("new_password", this.password = General.randomPassword());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUserEncryption("invalid"));
                break;
            }
            case "emptyUsername": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("new_username", "");
                requestBody.put("new_password", this.password = General.randomPassword());

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUserEncryption("valid"));
                break;
            }
            case "emptyPassword": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("new_username", this.username = General.randomUsername());
                requestBody.put("new_password", "");

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUserEncryption("valid"));
                break;
            }
            case "emptyAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("new_username", "");
                requestBody.put("new_password", "");

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUserEncryption("valid"));
                break;
            }
            default:
                JSONObject requestBody = new JSONObject();

                requestBody.put("new_username", null);
                requestBody.put("new_password", null);

                String idUserNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idUserNew", idUserNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateUserEncryption("valid"));
                break;
        }
    }

    @Step("I validate the status code for Update data user encryption is {int}")
    public void validateTheStatusCodeForUpdateDataUserEncryption(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after update user encryption")
    public void validateTheDataDetailAfterUpdateUserEncryption(String message) {
        switch (message) {
            case "success":
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
