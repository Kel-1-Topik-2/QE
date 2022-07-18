package Starter.DataPasien;

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

public class UpdatePasien {

    String nik,umur,phone,name,address,tokenAdmin;
    General general = new General();
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Update patient by id")
    public String setAnEndpointForUpdatePatient(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "pasien/{idPasienNew}";
        }else if (endpoint.equals("invalid")){
            return base_url + "pasien/0";
        }else {
            return base_url + "pasien/null";
        }
    }

    @Step("I request {String} for Update detail patient")
    public void requestUpdateFieldDetailPatient(String field) throws IOException {
        switch (field) {
            case "validAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            case "nullEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("null"));
                break;
            }
            case "invalidEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("invalid"));
                break;
            }
            case "emptyName": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", "");
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            case "invalidName": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", "2555252");
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            case "emptyNik": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", "");
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            case "invalidNik": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", "Nomer Induk");
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            case "emptyGender": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            case "invalidGender": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "5234224");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            case "emptyPhone": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", "");
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
                }
            case "invalidPhone": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Perempuan");
                requestBody.put("telp", "phone number");
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
                case "emptyAddress": {
                    JSONObject requestBody = new JSONObject();

                    requestBody.put("namapasien", this.name = General.randomName());
                    requestBody.put("nik", this.nik = General.randomNik());
                    requestBody.put("umur", this.umur = General.randomUmur());
                    requestBody.put("jeniskelamin", "Perempuan");
                    requestBody.put("telp", this.phone = General.randomPhone());
                    requestBody.put("alamat", "");

                    String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                    tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                    SerenityRest.given()
                            .header("Content-Type", "application/json")
                            .header("Authorization", "Bearer " + tokenAdmin)
                            .pathParam("idPasienNew", idPasienNew)
                            .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                    break;
                }
                case "emptyAll": {
                    JSONObject requestBody = new JSONObject();

                    requestBody.put("namapasien", "");
                    requestBody.put("nik", "");
                    requestBody.put("umur", this.umur = General.randomUmur());
                    requestBody.put("jeniskelamin", "");
                    requestBody.put("telp", "");
                    requestBody.put("alamat", "");

                    String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                    tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                    SerenityRest.given()
                            .header("Content-Type", "application/json")
                            .header("Authorization", "Bearer " + tokenAdmin)
                            .pathParam("idPasienNew", idPasienNew)
                            .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                    break;
                }
            case "invalidAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", "35352");
                requestBody.put("nik", "NIK");
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "5242432");
                requestBody.put("telp", "Phone Number");
                requestBody.put("alamat", this.address = General.randomAddress());

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
            }
            default:
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", null);
                requestBody.put("nik", null);
                requestBody.put("umur", null);
                requestBody.put("jeniskelamin", null);
                requestBody.put("telp", null);
                requestBody.put("alamat", null);

                String idPasienNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .pathParam("idPasienNew", idPasienNew)
                .body(requestBody.toJSONString()).put(setAnEndpointForUpdatePatient("valid"));
                break;
        }
    }

    @Step("I validate the status code for Update data patient is {int}")
    public void validateTheStatusCodeForUpdateDataPatient(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data details")
    public void validateTheDataDetails(String message) {
        switch (message) {
            case "success":
                Response responseRatings = SerenityRest.lastResponse();
                String idPasienUpdate = responseRatings.jsonPath().getString("data.id");
                System.out.println(idPasienUpdate);
                try (FileWriter file = new FileWriter("src/test/resources/filejson/idPasienUpdate.json")) {
                    file.write(idPasienUpdate);
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
