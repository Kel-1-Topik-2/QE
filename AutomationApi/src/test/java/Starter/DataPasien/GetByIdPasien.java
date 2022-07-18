package Starter.DataPasien;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class GetByIdPasien {
    String tokenAdmin;
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET patient by id")
    public String setAnEndpointForGetPatientById(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "pasien/{idPasienUpdate}";
        }else if (endpoint.equals("invalid")){
            return base_url + "pasien/0";
        }else {
            return base_url + "pasien/null";
        }
    }

    @Step("I request {String} for GET detail patient")
    public void requestParamGetDetailPatient(String param) throws IOException {
        if (param.equals("dataValid")){
            String idPasienUpdate = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idPasienUpdate.json"), StandardCharsets.UTF_8);
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .pathParam("idPasienUpdate", idPasienUpdate)
                    .get(setAnEndpointForGetPatientById("valid"));
        }else if (param.equals("dataInvalid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetPatientById("invalid"));
        }else {
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetPatientById("empty"));
        }
    }

    @Step("I validate the status code for GET patient by id is {int}")
    public void validateTheStatusCodeForGetPatientById(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data details")
    public void validateTheDataDetails(String message) {
        if (message.equals("success")) {
            comparesEqualTo("");
        } else if (message.equals("notFound")) {
            restAssuredThat(response -> response.body("message", equalTo("Data not found!")));
        } else {
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        }
    }
}
