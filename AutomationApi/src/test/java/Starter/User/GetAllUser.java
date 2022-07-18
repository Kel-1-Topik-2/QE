package Starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class GetAllUser {
    String tokenAdmin;
    protected static String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET All User")
    public String getEndpointUser(){
        return base_url + "user/";
    }

    @Step("I request get detail list user")
    public void requestGetListUser()throws Exception{
        tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
        SerenityRest.given()
                .header("Authorization", "Bearer " + tokenAdmin)
                .header("Content-Type", "application/json")
                .when()
                .get(getEndpointUser());
    }

    @Step("verify status code get all user is {int}")
    public void verifyStatusCodeUser(int code){
        then().statusCode(equalTo(code));
    }

    @Step("validate the data detail after get user")
    public void setValidateDataDetailAfterGetUser() {
        restAssuredThat(response -> response.body("responseCode", equalTo("SUCCESS")));
        restAssuredThat(response -> response.body("message", equalTo("Success!")));
        comparesEqualTo("");
    }
}
