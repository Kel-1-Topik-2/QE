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

public class DeletePasien {

    String tokenAdmin;
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Delete patient")
    public String setAnEndpointForDeletePatient(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "pasien/19";
        }else if (endpoint.equals("invalid")){
            return base_url + "pasien/0";
        }else {
            return base_url + "pasien/null";
        }
    }

    @Step("I request {String} for Delete detail patient")
    public void requestParamDeleteDetailPatient(String param) throws IOException {
        if (param.equals("dataValid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeletePatient("valid"));
        }else if (param.equals("dataInvalid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeletePatient("invalid"));
        }else {
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeletePatient("empty"));
        }
    }

    @Step("I validate the status code for Delete patient is {int}")
    public void validateTheStatusCodeForDeletePatient(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after delete patient")
    public void validateTheDataDetailAfterDeletePatient(String message) {
        if (message.equals("success")) {
            comparesEqualTo("");
        } else if (message.equals("notFound")) {
            restAssuredThat(response -> response.body("responseCode", equalTo("DATA_NOT_FOUND")));
            restAssuredThat(response -> response.body("message", equalTo("Data not found!")));
        } else {
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        }
    }
}
