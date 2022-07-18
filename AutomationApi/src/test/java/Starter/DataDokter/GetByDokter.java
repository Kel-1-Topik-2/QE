package Starter.DataDokter;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class GetByDokter {
    String tokenDokter;
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET By Token Doctor")
    public String getEndpointByDoctor(){
        return base_url + "dokter/getbydokter/";
    }

    @Step("I request get detail data by doctor")
    public void requestGetDataByDoctor()throws Exception{
        tokenDokter = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenDokter)
                .header("Content-Type", "application/json")
                .when()
                .get(getEndpointByDoctor());
    }

    @Step("verify status code get by doctor is {int}")
    public void verifyStatusCodeByDoctor(int code){
        then().statusCode(equalTo(code));
    }

    @Step("validate the data detail after get data doctor")
    public void setValidateDataDetailAfterGetDataDoctor() {
        comparesEqualTo("");
    }
}
