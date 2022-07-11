package Starter.StepDefinitions;

import Starter.User.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class UserStep {

    @Steps
    GetAllUser getAllUser;
    @Steps
    GetByIdUser getByIdUser;

    @Steps
    UpdateUser updateUser;
    @Steps
    DeleteUser deleteUser;

//Step For Get All User
    @Given("I set endpoint for get list user")
    public void iSetEndpointForGetListUser() {
        getAllUser.getEndpointUser();
    }
    @When("I request get list user")
    public void iRequestGetListUser() throws Exception {
        getAllUser.requestGetListUser();
    }
    @Then("verify status code user is {int}")
    public void VerifyStatusCodeUserIs(int code) {
        getAllUser.verifyStatusCodeUser(code);
    }
    @And("I validate data detail after get user")
    public void validateTheDataDetailAfterGetUser() {
        getAllUser.setValidateDataDetailAfterGetUser();
    }

//Step For Get ById User
    @Given("I set an {string} for GET user by id")
    public void iSetAnEndpointForGETUserById(String endpoint) {
        getByIdUser.setAnEndpointForGetUserById(endpoint);
    }
    @When("I request {string} for GET detail user by id")
    public void iRequestGETDetailUserById(String param) throws IOException {
        getByIdUser.requestParamGetDetailUser(param);
    }
    @Then("I validate the status code for GET user by id is {int}")
    public void iValidateTheStatusCodeForGETUserByIdIsStatusCode(int statusCode) {
        getByIdUser.validateTheStatusCodeForGetUserById(statusCode);
    }
    @And("validate the data detail user and {string}")
    public void validateTheDataDetailUserById(String message) {
        getByIdUser.validateTheDataDetailAfterGetByIdUser(message);
    }

//Step For Update User
    @Given("I set an {string} for update data user")
    public void iSetAnEndpointForUpdateUser(String endpoint) {
        updateUser.setAnEndpointForUpdateUser(endpoint);
    }
    @When("I request input {string} for update data user")
    public void iRequestPutDetailUser(String field) throws IOException {
        updateUser.requestUpdateFieldDetailUser(field);
    }
    @Then("I validate the status code for update user is {int}")
    public void iValidateTheStatusCodeForUpdateUserIsStatusCode(int statusCode) {
        updateUser.validateTheStatusCodeForUpdateDataUser(statusCode);
    }
    @And("validate the data detail user and {string} after update user")
    public void validateTheDataDetailAfterUpdateUser(String message) {
        updateUser.validateTheDataDetailAfterUpdateUser(message);
    }

//Step For Delete User
    @Given("I set an {string} for Delete user by id")
    public void iSetAnForDeleteUserById(String endpoint) {
        deleteUser.setAnEndpointForDeleteUser(endpoint);
    }
    @When("I request {string} for Delete detail user by id")
    public void iRequestForDeleteDetailUserById(String param) throws IOException {
        deleteUser.requestParamDeleteDetailUser(param);
    }
    @Then("I validate the status code for Delete user is {int}")
    public void iValidateTheStatusCodeForDeleteUserIsStatusCode(int statusCode) {
        deleteUser.validateTheStatusCodeForDeleteUser(statusCode);
    }
    @And("validate the data detail user and {string} after delete user")
    public void validateTheDataDetailUserAndAfterDeleteUser(String message) {
        deleteUser.validateTheDataDetailAfterDeleteUser(message);
    }

}
