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

public class CreatePasien {
    String nik,umur,phone,name,address,tokenAdmin;
    General general = new General();
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for create Patient")
    public String setEndpointPatient(){
        return base_url + "pasien/";
    }

    @Step("I request {String} get detail list patient")
    public void requestCreateDataPatient(String field)throws Exception{
        switch (field) {
            case "nullName":
                JSONObject requestBody = new JSONObject();

                requestBody.put("namapasien", null);
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Laki laki");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointPatient());
                break;
            case "nullNik":
                requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", null);
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Laki laki");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointPatient());
                break;
            case "nullUmur":
                requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", null);
                requestBody.put("jeniskelamin", "Laki laki");
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointPatient());
                break;
            case "nullGender":
                requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur =General.randomUmur());
                requestBody.put("jeniskelamin", null);
                requestBody.put("telp", this.phone = General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointPatient());
                break;
            case "nullPhone":
                    requestBody = new JSONObject();

                    requestBody.put("namapasien", this.name = General.randomName());
                    requestBody.put("nik", this.nik = General.randomNik());
                    requestBody.put("umur", this.umur = General.randomUmur());
                    requestBody.put("jeniskelamin", "Laki laki");
                    requestBody.put("telp", null);
                    requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                            .body(requestBody.toJSONString()).post(setEndpointPatient());
                    break;
                case "nullAll":
                    requestBody = new JSONObject();

                    requestBody.put("namapasien", null);
                    requestBody.put("nik", null);
                    requestBody.put("umur", null);
                    requestBody.put("jeniskelamin", null);
                    requestBody.put("telp", null);
                    requestBody.put("alamat", null);

                    tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                    SerenityRest.given()
                            .header("Authorization", "Bearer " + tokenAdmin)
                            .header("Content-Type", "application/json")
                            .body(requestBody.toJSONString()).post(setEndpointPatient());
                    break;

            default:
                requestBody = new JSONObject();

                requestBody.put("namapasien", this.name = General.randomName());;
                requestBody.put("nik", this.nik = General.randomNik());
                requestBody.put("umur", this.umur = General.randomUmur());
                requestBody.put("jeniskelamin", "Laki laki");
                requestBody.put("telp", this.phone =General.randomPhone());
                requestBody.put("alamat", this.address = General.randomAddress());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointPatient());
                break;
            }
        }

    @Step("I validate the status code for Create patient is {int}")
    public void validateTheStatusCodeForCreatePatient(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data details")
    public void validateTheDataDetails(String message) {
        if (message.equals("success")) {
            Response responseRatings = SerenityRest.lastResponse();
            String idPasien = responseRatings.jsonPath().getString("data.id");
            System.out.println(idPasien);
            try (FileWriter file = new FileWriter("src/test/resources/filejson/idPasienNew.json")) {
                file.write(idPasien);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            restAssuredThat(response -> response.body("responseCode", equalTo("SUCCESS")));
            restAssuredThat(response -> response.body("message", equalTo("Success!")));
            restAssuredThat(response -> response.body("data.created_by", equalTo("SYSTEM")));
        } else {
            restAssuredThat(response -> response.body("message", equalTo("Happened error!")));
            restAssuredThat(response -> response.body("responseCode", equalTo("UNKNOWN_ERROR")));
        }
    }
}
