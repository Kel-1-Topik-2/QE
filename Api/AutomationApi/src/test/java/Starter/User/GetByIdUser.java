package Starter.User;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class GetByIdUser {
    String tokenAdmin;
    String base_url = "https://springboot-postgresql-capstone.herokuapp.com/";

    @Step("I set an endpoint for GET user by id")
    public String setAnEndpointForGetUserById(String endpoint) {
        if (endpoint.equals("valid")){
            return base_url + "user/{idUserUpdate}";
        }else if (endpoint.equals("invalid")){
            return base_url + "user/0";
        }else {
            return base_url + "user/null";
        }
    }

    @Step("I request {String} for GET detail user")
    public void requestParamGetDetailUser(String param) throws IOException {
        if (param.equals("dataValid")){
            String idUserUpdate = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idUserUpdate.json"), StandardCharsets.UTF_8);
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .pathParam("idUserUpdate", idUserUpdate)
                    .get(setAnEndpointForGetUserById("valid"));
        }else if (param.equals("dataInvalid")){
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetUserById("invalid"));
        }else {
            tokenAdmin = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//tokenAdmin.json"), StandardCharsets.UTF_8);
            SerenityRest.given()
                    .header("Authorization", "Bearer " + tokenAdmin)
                    .get(setAnEndpointForGetUserById("empty"));
        }
    }

    @Step("I validate the status code for GET user by id is {int}")
    public void validateTheStatusCodeForGetUserById(int statusCode) {
        SerenityRest.then().statusCode(equalTo(statusCode));
    }

    @Step("validate the data detail after get byId user")
    public void validateTheDataDetailAfterGetByIdUser(String message) {
        if (message.equals("success")) {
            comparesEqualTo("");
        } else if (message.equals("notFound")) {
            restAssuredThat(response -> response.body("message", equalTo("Data not found!")));
        } else {
            restAssuredThat(response -> response.body("error", equalTo("Bad Request")));
        }
    }
}
