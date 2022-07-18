package Starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class DeleteUser {
    String tokenAdmin;
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for Delete user")
    public String setAnEndpointForDeleteUser(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "user/30";
        }else if (endpoint.equals("invalid")){
            return base_url + "user/0";
        }else {
            return base_url + "user/null";
        }
    }

    @Step("I request {String} for Delete detail user")
    public void requestParamDeleteDetailUser(String param) throws IOException {
        if (param.equals("dataValid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeleteUser("valid"));
        }else if (param.equals("dataInvalid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeleteUser("invalid"));
        }else {
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .when().delete(setAnEndpointForDeleteUser("empty"));
        }
    }

    @Step("I validate the status code for Delete user is {int}")
    public void validateTheStatusCodeForDeleteUser(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after delete user")
    public void validateTheDataDetailAfterDeleteUser(String message) {
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
