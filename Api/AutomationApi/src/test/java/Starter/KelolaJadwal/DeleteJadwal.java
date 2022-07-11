package Starter.KelolaJadwal;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteJadwal {
    String tokenAdmin;
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Delete schedule")
    public String setAnEndpointForDeleteSchedule(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "jadwal/42";
        }else if (endpoint.equals("invalid")){
            return base_url + "jadwal/0";
        }else {
            return base_url + "jadwal/null";
        }
    }

    @Step("I request {String} for Delete detail schedule")
    public void requestParamDeleteDetailSchedule(String param) throws IOException {
        if (param.equals("dataValid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeleteSchedule("valid"));
        }else if (param.equals("dataInvalid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeleteSchedule("invalid"));
        }else {
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeleteSchedule("empty"));
        }
    }

    @Step("I validate the status code for Delete schedule is {int}")
    public void validateTheStatusCodeForDeleteSchedule(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after delete schedule")
    public void validateTheDataDetailAfterDeleteSchedule(String message) {
        if (message.equals("success")) {
            restAssuredThat(response -> response.body("responseCode", equalTo("SUCCESS")));
            restAssuredThat(response -> response.body("message", equalTo("Success!")));
        } else if (message.equals("notFound")) {
            restAssuredThat(response -> response.body("responseCode", equalTo("DATA_NOT_FOUND")));
            restAssuredThat(response -> response.body("message", equalTo("Data not found!")));
        } else {
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        }
    }
}
