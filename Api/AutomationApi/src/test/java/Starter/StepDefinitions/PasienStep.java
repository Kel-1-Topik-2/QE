package Starter.StepDefinitions;

import Starter.DataPasien.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class PasienStep {
    @Steps
    GetAllPasien getAllPasien;
    @Steps
    GetByIdPasien getByIdPasien;
    @Steps
    CreatePasien createPasien;
    @Steps
    UpdatePasien updatePasien;
    @Steps
    DeletePasien deletePasien;


//Step For Get All Patient
    @Given("I set endpoint for get list patient")
    public void iSetEndpointForGetListPatient() {
        getAllPasien.getEndpointPatient();
    }
    @When("I request get list patient")
    public void iRequestGetListPatient() throws Exception {
        getAllPasien.requestGetListPatient();
    }
    @Then("verify status code patient is {int}")
    public void VerifyStatusCodePatientIs(int code) {
        getAllPasien.verifyStatusCodePatient(code);
    }
    @And("I validate data detail after get patient")
    public void validateTheDataDetailAfterGetPatient() {
        getAllPasien.setValidateDataDetailAfterGetPatient();
    }

//Step For Get ById Patient
    @Given("I set an {string} for GET patient by id")
    public void iSetAnEndpointForGETPatientById(String endpoint) {
        getByIdPasien.setAnEndpointForGetPatientById(endpoint);
    }
    @When("I request {string} for GET detail patient by id")
    public void iRequestGETDetailPatientById(String param) throws IOException {
        getByIdPasien.requestParamGetDetailPatient(param);
    }
    @Then("I validate the status code for GET patient by id is {int}")
    public void iValidateTheStatusCodeForGETPatientByIdIsStatusCode(int statusCode) {
        getByIdPasien.validateTheStatusCodeForGetPatientById(statusCode);
    }
    @And("validate the data detail patient and {string}")
    public void validateTheDataDetailsAndDetails(String message) {
        getByIdPasien.validateTheDataDetails(message);
    }

//Step For Create Patient
    @Given("I set an endpoint for create patient")
    public void iSetAnEndpointForCreatePatient() {
    createPasien.setEndpointPatient();
    }
    @When("I request input {string} for create data patient")
    public void iRequestPostDetailPatient(String field) throws Exception {
        createPasien.requestCreateDataPatient(field);
    }
    @Then("I validate the status code for create patient is {int}")
    public void iValidateTheStatusCodeForCreatePatientIsStatusCode(int statusCode) {
        createPasien.validateTheStatusCodeForCreatePatient(statusCode);
    }
    @And("validate the data detail patient and {string} after create patient")
    public void validateTheDataDetailAfterCreatePatient(String message) {
        createPasien.validateTheDataDetails(message);
    }

//Step For Update Patient
    @Given("I set an {string} for update data patient")
    public void iSetAnEndpointForUpdatePatient(String endpoint) {
        updatePasien.setAnEndpointForUpdatePatient(endpoint);
    }
    @When("I request input {string} for update data patient")
    public void iRequestPutDetailPatient(String field) throws IOException {
        updatePasien.requestUpdateFieldDetailPatient(field);
    }
    @Then("I validate the status code for update patient is {int}")
    public void iValidateTheStatusCodeForUpdatePatientIsStatusCode(int statusCode) {
        updatePasien.validateTheStatusCodeForUpdateDataPatient(statusCode);
    }
    @And("validate the data detail patient and {string} after update patient")
    public void validateTheDataDetailAfterUpdatePatient(String message) {
        updatePasien.validateTheDataDetails(message);
    }

//Step For Delete Patient
    @Given("I set an {string} for Delete patient by id")
    public void iSetAnForDeletePatientById(String endpoint) {
        deletePasien.setAnEndpointForDeletePatient(endpoint);
    }
    @When("I request {string} for Delete detail patient by id")
    public void iRequestForDeleteDetailPatientById(String param) throws IOException {
        deletePasien.requestParamDeleteDetailPatient(param);
    }
    @Then("I validate the status code for Delete patient is {int}")
    public void iValidateTheStatusCodeForDeletePatientIsStatusCode(int statusCode) {
        deletePasien.validateTheStatusCodeForDeletePatient(statusCode);
    }
    @And("validate the data detail patient and {string} after delete patient")
    public void validateTheDataDetailPatientAndAfterDeletePatient(String message) {
        deletePasien.validateTheDataDetailAfterDeletePatient(message);
    }
}
