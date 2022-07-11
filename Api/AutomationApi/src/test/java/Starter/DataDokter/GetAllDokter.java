package Starter.DataDokter;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetAllDokter {
    String tokenAdmin;
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET All Doctor")
    public String getEndpointDoctor(){
        return base_url + "dokter/";
    }

    @Step("I request get detail list doctor")
    public void requestGetListDoctor()throws Exception{
        tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenAdmin)
                .header("Content-Type", "application/json")
                .when()
                .get(getEndpointDoctor());
    }

    @Step("verify status code get all doctor is {int}")
    public void verifyStatusCodeDoctor(int code){
        then().statusCode(equalTo(code));
    }

    @Step("validate the data detail after get doctor")
    public void setValidateDataDetailAfterGetDoctor() {
        restAssuredThat(response -> response.body("[0].created_by",equalTo("SYSTEM")));

    }
}
