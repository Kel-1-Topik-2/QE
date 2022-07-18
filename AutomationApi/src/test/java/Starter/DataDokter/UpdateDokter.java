package Starter.DataDokter;

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

public class UpdateDokter {

    String srp,nameDoctor,tokenAdmin;
    General general = new General();
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Update doctor by id")
    public String setAnEndpointForUpdateDoctor(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "dokter/{idDokterNew}";
        }else if (endpoint.equals("invalid")){
            return base_url + "dokter/0";
        }else {
            return base_url + "dokter/null";
        }
    }

    @Step("I request {String} for Update detail doctor")
    public void requestUpdateFieldDetailDoctor(String field) throws IOException {
        switch (field) {
            case "validAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 17);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "nullEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("null"));
                break;
            }
            case "invalidEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("invalid"));
                break;
            }
            case "emptyName": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", "");
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "invalidName": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", "4342242");
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "emptySpesialis": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "invalidSpesialis": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "2414241");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "emptySrp": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", "");

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "InvalidSrp": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", "NPA IDI");

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "emptyAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", "");
                requestBody.put("spesialis", "");
                requestBody.put("srp", "");

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "invalidAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 0);
                requestBody.put("namadokter", "32434412");
                requestBody.put("spesialis", "14211");
                requestBody.put("srp", "NPA IDI");

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            case "invalidId": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 0);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Gigi");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
            }
            default:
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", null);
                requestBody.put("namadokter", null);
                requestBody.put("spesialis", null);
                requestBody.put("srp", null);

                String idDokterNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idDokterNew", idDokterNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateDoctor("valid"));
                break;
        }
    }

    @Step("I validate the status code for Update data doctor is {int}")
    public void validateTheStatusCodeForUpdateDataDoctor(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after update doctor")
    public void validateTheDataDetailAfterUpdateDoctor(String message) {
        switch (message) {
            case "success":
                Response responseRatings = SerenityRest.lastResponse();
                String idDokterUpdate = responseRatings.jsonPath().getString("data.id");
                System.out.println(idDokterUpdate);
                try (FileWriter file = new FileWriter("src/test/resources/filejson/idDokterUpdate.json")) {
                    file.write(idDokterUpdate);
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
