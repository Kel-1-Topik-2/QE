package Starter.KelolaJadwal;

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

public class UpdateJadwalDoctor {

    String note,tokenDoctor;
    General general = new General();
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Update schedule doctor by id")
    public String setAnEndpointForUpdateScheduleDoctor(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "jadwal/editbydokter/{idJadwalNew}";
        }else if (endpoint.equals("invalid")){
            return base_url + "jadwal/editbydokter/0";
        }else {
            return base_url + "jadwal/editbydokter/null";
        }
    }

    @Step("I request {String} for Update detail schedule doctor")
    public void requestUpdateFieldDetailScheduleDoctor(String field) throws IOException {
        switch (field) {
            case "validAll": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", "2022-07-11");
                requestBody.put("catatan", this.note = General.randomNote());
                requestBody.put("diagnosa", "Diabetes");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("valid"));
                break;
            }
            case "nullEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", "2022-06-27");
                requestBody.put("catatan", this.note = General.randomNote());
                requestBody.put("diagnosa", "Diabetes");

                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("null"));
                break;
            }
            case "invalidEndpoint": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", "2022-06-27");
                requestBody.put("catatan", this.note = General.randomNote());
                requestBody.put("diagnosa", "Diabetes");

                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("invalid"));
                break;
            }
            case "nullControl": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", null);
                requestBody.put("catatan", this.note = General.randomNote());
                requestBody.put("diagnosa", "Diabetes");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("valid"));
                break;
            }
            case "nullNote": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", "2022-07-11");
                requestBody.put("catatan", null);
                requestBody.put("diagnosa", "Diabetes");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("valid"));
                break;
            }
            case "nullDiagnosa": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", "2022-07-11");
                requestBody.put("catatan", this.note = General.randomNote());
                requestBody.put("diagnosa", null);

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("valid"));
                break;
            }
            case "invalidControl": {
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", "99");
                requestBody.put("catatan", this.note = General.randomNote());
                requestBody.put("diagnosa", "Diabetes");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("valid"));
                break;
            }
            default:
                JSONObject requestBody = new JSONObject();

                requestBody.put("controll", "date");
                requestBody.put("catatan", this.note = General.randomNote());
                requestBody.put("diagnosa", "Diabetes");

                String idJadwalNew = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalNew.json"), StandardCharsets.UTF_8);
                tokenDoctor = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenDoctor)
                        .header("Content-Type", "application/json")
                        .pathParam("idJadwalNew", idJadwalNew)
                        .body(requestBody.toJSONString()).put(setAnEndpointForUpdateScheduleDoctor("valid"));
                break;
            }
    }

    @Step("I validate the status code for Update data schedule doctor is {int}")
    public void validateTheStatusCodeForUpdateDataScheduleDoctor(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after update schedule doctor")
    public void validateTheDataDetailAfterUpdateScheduleDoctor(String message) {
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
