package Starter.KelolaJadwal;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetAllJadwal {
    String tokenAdmin;
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET All Schedule")
    public String getEndpointSchedule(){
        return base_url + "jadwal/";
    }

    @Step("I request get detail list schedule")
    public void requestGetListSchedule()throws Exception{
        tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenAdmin)
                .header("Content-Type", "application/json")
                .when()
                .get(getEndpointSchedule());
    }

    @Step("verify status code get all schedule is {int}")
    public void verifyStatusCodeSchedule(int code){
        then().statusCode(equalTo(code));
    }

    @Step("validate the data detail after get schedule")
    public void setValidateDataDetailAfterGetSchedule() {
        restAssuredThat(response -> response.body("[0].created_by",equalTo("SYSTEM")));
    }
}
