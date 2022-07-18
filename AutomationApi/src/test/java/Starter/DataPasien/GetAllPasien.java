package Starter.DataPasien;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class GetAllPasien {
    String tokenAdmin;
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET All Patient")
    public String getEndpointPatient(){
        return base_url + "pasien/";
    }

    @Step("I request get detail list patient")
    public void requestGetListPatient()throws Exception{
        tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenAdmin)
                .header("Content-Type", "application/json")
                .when()
                .get(getEndpointPatient());
    }

    @Step("verify status code get all patient is {int}")
    public void verifyStatusCodePatient(int code){
        then().statusCode(equalTo(code));
    }

    @Step("validate the data detail after get patient")
    public void setValidateDataDetailAfterGetPatient() {
        comparesEqualTo("");
    }
}
