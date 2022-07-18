package Starter.KelolaJadwal;

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

public class UpdateJadwalAdmin {

    String tokenAdmin;
    Integer id,antrian,idPatient,idDoctor;
    General general = new General();
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Update schedule admin by id")
    public String setAnEndpointForUpdateScheduleAdmin(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "jadwal/{idJadwalNew}";
        }else if (endpoint.equals("invalid")){
            return base_url + "jadwal/0";
        }else {
            return base_url + "jadwal/null";
        }
    }

    @Step("I request {String} for Update detail schedule admin")
    public void requestUpdateFieldDetailScheduleAdmin(String field) throws IOException {
        switch (field) {
            case "validAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 9);
                requestBody.put("pasien_id", 13);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "2022-07-11");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            case "nullEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", new Integer[]{idDoctor});
                requestBody.put("pasien_id", new Integer[]{idPatient});
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "2022-06-27");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("null"));
                break;
            }
            case "invalidEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 1);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "2022-06-27");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("invalid"));
                break;
            }
            case "invalidId": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", this.id = General.randomId());
                requestBody.put("pasien_id", this.id = General.randomId());
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "2022-06-27");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            case "invalidAntrian": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 10);
                requestBody.put("nourut", 0);
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "2022-06-27");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            case "invalidPerawatan": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 10);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "255232432");
                requestBody.put("tanggal", "2022-06-27");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            case "emptyPerawatan": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 1);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "");
                requestBody.put("tanggal", "2022-06-27");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            case "emptyDate": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 1);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            case "invalidDate": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 1);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "2022");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            case "stringDate": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 1);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Inap");
                requestBody.put("tanggal", "Date");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
            }
            default:
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", null);
                requestBody.put("pasien_id", null);
                requestBody.put("nourut", null);
                requestBody.put("jp", null);
                requestBody.put("tanggal", null);

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleAdmin("valid"));
                break;
        }
    }

    @Step("I validate the status code for Update data schedule admin is {int}")
    public void validateTheStatusCodeForUpdateDataScheduleAdmin(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after update schedule admin")
    public void validateTheDataDetailAfterUpdateScheduleAdmin(String message) {
        switch (message) {
            case "success":
                Response responseRatings = SerenityRest.lastResponse();
                String idJadwalUpdate = responseRatings.jsonPath().getString("data.id");
                System.out.println(idJadwalUpdate);
                try (FileWriter file = new FileWriter("src/test/resources/filejson/idJadwalUpdate.json")) {
                    file.write(idJadwalUpdate);
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
            case "notSupport":
                restAssuredThat(response -> response.body("error", equalTo("Unsupported Media Type")));
                break;
            default:
                restAssuredThat(response -> response.body("responseCode", equalTo("UNKNOWN_ERROR")));
                restAssuredThat(response -> response.body("message", equalTo("Happened error!")));
                break;
        }
    }
}
