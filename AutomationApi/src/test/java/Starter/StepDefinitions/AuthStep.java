package Starter.StepDefinitions;

import Starter.Auth.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AuthStep {
    @Steps
    LoginAdmin loginAdmin;
    @Steps
    LoginDoctor loginDoctor;
    @Steps
    Register register;

//Step For Login Admin
    @Given("I set an endpoint for login account admin")
    public void iSetAnEndpointForLoginAccountAdmin() {
        loginAdmin.setEndpointLoginAccountAdmin();
    }
    @When("I request input {string} for login account admin")
    public void iRequestPostDetailAccountAdmin(String field) throws Exception {
        loginAdmin.requestLoginAccountAdmin(field);
    }
    @Then("I validate the status code for login admin is {int}")
    public void iValidateTheStatusCodeForLoginAdminIsStatusCode(int statusCode) {
        loginAdmin.validateTheStatusCodeForLoginAdmin(statusCode);
    }
    @And("validate the data detail login admin and {string} login admin")
    public void validateTheDataDetailAfterLoginAccountAdmin(String message) {
        loginAdmin.validateTheDataDetailAfterLoginAccountAdmin(message);
    }

//Step For Login Doctor
    @Given("I set an endpoint for login account doctor")
    public void iSetAnEndpointForLoginAccountDoctor() {
        loginDoctor.setEndpointLoginAccountDoctor();
    }
    @When("I request input {string} for login account doctor")
    public void iRequestPostDetailAccountDoctor(String field) throws Exception {
        loginDoctor.requestLoginAccountDoctor(field);
    }
    @Then("I validate the status code for login doctor is {int}")
    public void iValidateTheStatusCodeForLoginDoctorIsStatusCode(int statusCode) {
        loginDoctor.validateTheStatusCodeForLoginDoctor(statusCode);
    }
    @And("validate the data detail login doctor and {string} login doctor")
    public void validateTheDataDetailAfterLoginAccountDoctor(String message) {
        loginDoctor.validateTheDataDetailAfterLoginAccountDoctor(message);
    }

//Step For Register
    @Given("I set an endpoint for register")
    public void iSetAnEndpointForRegisterNewAccount() {
        register.setEndpointRegister();
    }
    @When("I request input {string} for regis new account doctor")
    public void iRequestPostDetailCreateNewAccountDoctor(String field) throws Exception {
        register.requestRegisterNewAccount(field);
    }
    @Then("I validate the status code for regis new account doctor is {int}")
    public void iValidateTheStatusCodeForRegisterAccountDoctorIsStatusCode(int statusCode) {
        register.validateTheStatusCodeForRegisterNewAccount(statusCode);
    }
    @And("validate the data detail register and {string} after create new account doctor")
    public void validateTheDataDetailAfterRegisNewAccountDoctor(String message) {
        register.validateTheDataDetailAfterRegisterNewAccount(message);
    }
}
