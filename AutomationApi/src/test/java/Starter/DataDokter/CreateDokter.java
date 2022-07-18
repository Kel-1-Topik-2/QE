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

public class CreateDokter {
    String srp,phone,nameDoctor,tokenAdmin;
    General general = new General();
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for create Doctor")
    public String setEndpointDoctor(){
        return base_url + "dokter/";
    }

    @Step("I request {String} get detail list doctor")
    public void requestCreateDataDoctor(String field)throws Exception{
        switch (field) {
            case "emptyName":
                JSONObject requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", "");
                requestBody.put("spesialis", "Dokter Umum");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "invalidName":
                requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", "23442");
                requestBody.put("spesialis", "Dokter Umum");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "emptySpesialis":
                requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "invalidSpesialis":
                requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "252532");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "emptySrp":
                requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Umum");
                requestBody.put("srp", "");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "invalidSrp":
                requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Umum");
                requestBody.put("srp", "NPA IDI");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "emptyAll":
                requestBody = new JSONObject();

                requestBody.put("user_id", 9);
                requestBody.put("namadokter", "");
                requestBody.put("spesialis", "");
                requestBody.put("srp", "");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "invalidAll":
                requestBody = new JSONObject();

                requestBody.put("user_id", 0);
                requestBody.put("namadokter", "14141");
                requestBody.put("spesialis", "141414");
                requestBody.put("srp", "NPA Idi");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "nullAll":
                requestBody = new JSONObject();

                requestBody.put("user_id", null);
                requestBody.put("namadokter", null);
                requestBody.put("spesialis", null);
                requestBody.put("srp", null);

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            case "invalidId":
                requestBody = new JSONObject();

                requestBody.put("user_id", 0);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Umum");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
            default:
                requestBody = new JSONObject();

                requestBody.put("user_id", 32);
                requestBody.put("namadokter", this.nameDoctor = General.randomNameDoctor());
                requestBody.put("spesialis", "Dokter Umum");
                requestBody.put("srp", this.srp = General.randomNpaIdi());

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointDoctor());
                break;
        }
    }

    @Step("I validate the status code for Create doctor is {int}")
    public void validateTheStatusCodeForCreateDoctor(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after create doctor")
    public void validateTheDataDetailAfterCreateDoctor(String message) {
        if (message.equals("success")) {
            Response responseRatings = SerenityRest.lastResponse();
            String idDokter = responseRatings.jsonPath().getString("data.id");
            System.out.println(idDokter);
            try (FileWriter file = new FileWriter("src/test/resources/filejson/idDokterNew.json")) {
                file.write(idDokter);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            restAssuredThat(response -> response.body("responseCode", equalTo("SUCCESS")));
            restAssuredThat(response -> response.body("message", equalTo("Success!")));
            restAssuredThat(response -> response.body("data.created_by", equalTo("SYSTEM")));
        } else if (message.equals("badRequest")){
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        } else{
            restAssuredThat(response -> response.body("message", equalTo("Happened error!")));
            restAssuredThat(response -> response.body("responseCode", equalTo("UNKNOWN_ERROR")));
        }
    }
}
