package Starter.DataDokter;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetByIdDokter {
    String tokenAdmin;
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET doctor by id")
    public String setAnEndpointForGetDoctorById(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "dokter/{idDokterUpdate}";
        }else if (endpoint.equals("invalid")){
            return base_url + "dokter/0";
        }else {
            return base_url + "dokter/null";
        }
    }

    @Step("I request {String} for GET detail doctor")
    public void requestParamGetDetailDoctor(String param) throws IOException {
        if (param.equals("dataValid")){
            String idDokterUpdate = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idDokterUpdate.json"), StandardCharsets.UTF_8);
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .pathParam("idDokterUpdate", idDokterUpdate)
                    .get(setAnEndpointForGetDoctorById("valid"));
        }else if (param.equals("dataInvalid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetDoctorById("invalid"));
        }else {
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetDoctorById("empty"));
        }
    }

    @Step("I validate the status code for GET doctor by id is {int}")
    public void validateTheStatusCodeForGetDoctorById(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after get by id doctor")
    public void validateTheDataDetailAfterGetByIdDoctor(String message) {
        if (message.equals("success")) {
            restAssuredThat(response -> response.body("message", equalTo("Success!")));
        } else if (message.equals("notFound")) {
            restAssuredThat(response -> response.body("message", equalTo("Data not found!")));
        } else {
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        }
    }
}
