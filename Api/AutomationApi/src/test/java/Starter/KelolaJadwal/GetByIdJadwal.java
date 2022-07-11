package Starter.KelolaJadwal;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class GetByIdJadwal {
    String tokenAdmin;
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET schedule by id")
    public String setAnEndpointForGetScheduleById(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "jadwal/{idJadwalUpdate}";
        }else if (endpoint.equals("invalid")){
            return base_url + "jadwal/0";
        }else {
            return base_url + "jadwal/null";
        }
    }

    @Step("I request {String} for GET detail schedule")
    public void requestParamGetDetailSchedule(String param) throws IOException {
        if (param.equals("dataValid")){
            String idJadwalUpdate = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idJadwalUpdate.json"), StandardCharsets.UTF_8);
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .pathParam("idJadwalUpdate", idJadwalUpdate)
                    .get(setAnEndpointForGetScheduleById("valid"));
        }else if (param.equals("dataInvalid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetScheduleById("invalid"));
        }else {
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetScheduleById("empty"));
        }
    }

    @Step("I validate the status code for GET schedule by id is {int}")
    public void validateTheStatusCodeForGetScheduleById(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after get by id schedule")
    public void validateTheDataDetailAfterGetByIdSchedule(String message) {
        if (message.equals("success")) {
            comparesEqualTo("");
        } else if (message.equals("notFound")) {
            restAssuredThat(response -> response.body("message", equalTo("Data not found!")));
        } else {
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        }
    }
}
