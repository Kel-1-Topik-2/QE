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

public class CreateJadwal {

    Integer id,antrian,idPatient,idDoctor;
    String tokenAdmin;
    General general = new General();
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for create Schedule")
    public String setEndpointSchedule(){
        return base_url + "jadwal/";
    }

    @Step("I request {String} get detail list schedule")
    public void requestCreateDataSchedule(String field)throws Exception{
        switch (field) {
            case "nullId":
                JSONObject requestBody = new JSONObject();

                requestBody.put("dokter_id", null);
                requestBody.put("pasien_id", null);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Jalan");
                requestBody.put("tanggal", "2022-06-27");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
            case "invalidId":
                requestBody = new JSONObject();

                requestBody.put("dokter_id", this.id = General.randomId());
                requestBody.put("pasien_id", this.id = General.randomId());
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Jalan");
                requestBody.put("tanggal", "2022-06-27");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
            case "nullAntrian":
                requestBody = new JSONObject();

                requestBody.put("dokter_id", this.id = General.randomId());
                requestBody.put("pasien_id", this.id = General.randomId());
                requestBody.put("nourut", null);
                requestBody.put("jp", "Rawat Jalan");
                requestBody.put("tanggal", "2022-06-27");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
            case "nullDate":
                requestBody = new JSONObject();

                requestBody.put("dokter_id", this.id = General.randomId());
                requestBody.put("pasien_id", this.id = General.randomId());
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Jalan");
                requestBody.put("tanggal", null);

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
            case "nullAll":
                requestBody = new JSONObject();

                requestBody.put("dokter_id", null);
                requestBody.put("pasien_id", null);
                requestBody.put("nourut", null);
                requestBody.put("jp", null);
                requestBody.put("tanggal", null);

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
            case "invalidDate":
                requestBody = new JSONObject();

                requestBody.put("dokter_id", this.id = General.randomId());
                requestBody.put("pasien_id", this.id = General.randomId());
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Jalan");
                requestBody.put("tanggal", "1");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
            case "stringDate":
                requestBody = new JSONObject();

                requestBody.put("dokter_id", new Integer[]{idDoctor});
                requestBody.put("pasien_id", new Integer[]{idPatient});
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Rawat Jalan");
                requestBody.put("tanggal", "x");

                idPatient = Integer.valueOf(FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienUpdate.json"), StandardCharsets.UTF_8));
                idDoctor = Integer.valueOf(FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterUpdate.json"), StandardCharsets.UTF_8));
                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
            default:
                requestBody = new JSONObject();

                requestBody.put("dokter_id", 1);
                requestBody.put("pasien_id", 10);
                requestBody.put("nourut", this.antrian = General.randomAntrian());
                requestBody.put("jp", "Perawatan Biasa");
                requestBody.put("tanggal", "2022-07-10");

                tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
                SerenityRest.given()
                        .header("Authorization", "Bearer " + tokenAdmin)
                        .header("Content-Type", "application/json")
                        .body(requestBody.toJSONString()).post(setEndpointSchedule());
                break;
        }
    }

    @Step("I validate the status code for Create schedule is {int}")
    public void validateTheStatusCodeForCreateSchedule(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after create schedule")
    public void validateTheDataDetailAfterCreateSchedule(String message) {
        if (message.equals("success")) {
            Response responseRatings = SerenityRest.lastResponse();
            String idJadwal = responseRatings.jsonPath().getString("data.id");
            System.out.println(idJadwal);
            try (FileWriter file = new FileWriter("src/test/resources/filejson/idJadwalNew.json")) {
                file.write(idJadwal);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            restAssuredThat(response -> response.body("responseCode", equalTo("SUCCESS")));
            restAssuredThat(response -> response.body("message", equalTo("Success!")));
        } else if (message.equals("error")) {
            restAssuredThat(response -> response.body("message", equalTo("Happened error!")));
            restAssuredThat(response -> response.body("responseCode", equalTo("UNKNOWN_ERROR")));
        } else{
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        }
    }
}
