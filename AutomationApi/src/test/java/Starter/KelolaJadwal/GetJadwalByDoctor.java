package Starter.KelolaJadwal;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class GetJadwalByDoctor {
    String tokenDokter;
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET schedule By Doctor")
    public String getEndpointScheduleByDoctor(){
        return base_url + "jadwal/jadwalbydokter/";
    }

    @Step("I request get detail data schedule by doctor")
    public void requestGetDataScheduleByDoctor()throws Exception{
        tokenDokter = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenDoctor.json"), StandardCharsets.UTF_8);
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenDokter)
                .header("Content-Type", "application/json")
                .when()
                .get(getEndpointScheduleByDoctor());
    }

    @Step("verify status code get by schedule doctor is {int}")
    public void verifyStatusCodeByScheduleDoctor(int code){
        then().statusCode(equalTo(code));
    }

    @Step("validate the data detail after get data schedule doctor")
    public void setValidateDataDetailAfterGetDataScheduleDoctor() {
        comparesEqualTo("");
    }
}
