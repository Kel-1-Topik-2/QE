package Starter.StepDefinitions;

import Starter.DataDokter.*;
import Starter.DataPasien.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class DokterStep {
    @Steps
    GetAllDokter getAllDokter;
    @Steps
    GetByIdDokter getByIdDokter;
    @Steps
    CreateDokter createDokter;
    @Steps
    UpdateDokter updateDokter;
    @Steps
    DeleteDokter deleteDokter;


//Step For Get All Doctor
    @Given("I set endpoint for get list doctor")
    public void iSetEndpointForGetListDoctor() {
        getAllDokter.getEndpointDoctor();
    }
    @When("I request get list doctor")
    public void iRequestGetListDoctor() throws Exception {
        getAllDokter.requestGetListDoctor();
    }
    @Then("verify status code doctor is {int}")
    public void VerifyStatusCodeDoctorIs(int code) {
        getAllDokter.verifyStatusCodeDoctor(code);
    }
    @And("I validate data detail after get doctor")
    public void validateTheDataDetailAfterGetDoctor() {
        getAllDokter.setValidateDataDetailAfterGetDoctor();
    }

//Step For Get ById Doctor
    @Given("I set an {string} for GET doctor by id")
    public void iSetAnEndpointForGETDoctorById(String endpoint) {
        getByIdDokter.setAnEndpointForGetDoctorById(endpoint);
    }
    @When("I request {string} for GET detail doctor by id")
    public void iRequestGETDetailDoctorById(String param) throws IOException {
        getByIdDokter.requestParamGetDetailDoctor(param);
    }
    @Then("I validate the status code for GET doctor by id is {int}")
    public void iValidateTheStatusCodeForGETDoctorByIdIsStatusCode(int statusCode) {
        getByIdDokter.validateTheStatusCodeForGetDoctorById(statusCode);
    }
    @And("validate the data detail doctor and {string}")
    public void validateTheDataDetailAfterGetByIdDoctor(String message) {
        getByIdDokter.validateTheDataDetailAfterGetByIdDoctor(message);
    }

//Step For Create Patient
    @Given("I set an endpoint for create doctor")
    public void iSetAnEndpointForCreateDoctor() {
        createDokter.setEndpointDoctor();
    }
    @When("I request input {string} for create data doctor")
    public void iRequestPostDetailDoctor(String field) throws Exception {
        createDokter.requestCreateDataDoctor(field);
    }
    @Then("I validate the status code for create doctor is {int}")
    public void iValidateTheStatusCodeForCreateDoctorIsStatusCode(int statusCode) {
        createDokter.validateTheStatusCodeForCreateDoctor(statusCode);
    }
    @And("validate the data detail doctor and {string} after create doctor")
    public void validateTheDataDetailAfterCreateDoctor(String message) {
        createDokter.validateTheDataDetailAfterCreateDoctor(message);
    }

//Step For Update Doctor
    @Given("I set an {string} for update data doctor")
    public void iSetAnEndpointForUpdateDoctor(String endpoint) {
        updateDokter.setAnEndpointForUpdateDoctor(endpoint);
    }
    @When("I request input {string} for update data doctor")
    public void iRequestPutDetailDoctor(String field) throws IOException {
        updateDokter.requestUpdateFieldDetailDoctor(field);
    }
    @Then("I validate the status code for update doctor is {int}")
    public void iValidateTheStatusCodeForUpdateDoctorIsStatusCode(int statusCode) {
        updateDokter.validateTheStatusCodeForUpdateDataDoctor(statusCode);
    }
    @And("validate the data detail doctor and {string} after update doctor")
    public void validateTheDataDetailAfterUpdateDoctor(String message) {
        updateDokter.validateTheDataDetailAfterUpdateDoctor(message);
    }

//Step For Delete Doctor
    @Given("I set an {string} for Delete doctor by id")
    public void iSetAnForDeleteDoctorById(String endpoint) {
        deleteDokter.setAnEndpointForDeleteDoctor(endpoint);
    }
    @When("I request {string} for Delete detail doctor by id")
    public void iRequestForDeleteDetailDoctorById(String param) throws IOException {
        deleteDokter.requestParamDeleteDetailDoctor(param);
    }
    @Then("I validate the status code for Delete doctor is {int}")
    public void iValidateTheStatusCodeForDeleteDoctorIsStatusCode(int statusCode) {
        deleteDokter.validateTheStatusCodeForDeleteDoctor(statusCode);
    }
    @And("validate the data detail doctor and {string} after delete doctor")
    public void validateTheDataDetailDoctorAndAfterDeleteDoctor(String message) {
        deleteDokter.validateTheDataDetailAfterDeleteDoctor(message);
    }
}
