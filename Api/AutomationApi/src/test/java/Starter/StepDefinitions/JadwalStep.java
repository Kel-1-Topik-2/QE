package Starter.StepDefinitions;

import Starter.KelolaJadwal.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class JadwalStep {
    @Steps
    GetAllJadwal getAllJadwal;
    @Steps
    GetByIdJadwal getByIdJadwal;
    @Steps
    CreateJadwal createJadwal;
    @Steps
    UpdateJadwalAdmin updateJadwalAdmin;
    @Steps
    UpdateJadwalDoctor updateJadwalDoctor;
    @Steps
    DeleteJadwal deleteJadwal;

//Step For Get All Schedule
    @Given("I set endpoint for get list schedule")
    public void iSetEndpointForGetListSchedule() {
        getAllJadwal.getEndpointSchedule();
    }
    @When("I request get list schedule")
    public void iRequestGetListSchedule() throws Exception {
        getAllJadwal.requestGetListSchedule();
    }
    @Then("verify status code schedule is {int}")
    public void VerifyStatusCodeScheduleIs(int code) {
        getAllJadwal.verifyStatusCodeSchedule(code);
    }
    @And("I validate data detail after get schedule")
    public void validateTheDataDetailAfterGetSchedule() {
        getAllJadwal.setValidateDataDetailAfterGetSchedule();
    }

//Step For Get ById Schedule
    @Given("I set an {string} for GET schedule by id")
    public void iSetAnEndpointForGETScheduleById(String endpoint) {
        getByIdJadwal.setAnEndpointForGetScheduleById(endpoint);
    }
    @When("I request {string} for GET detail schedule by id")
    public void iRequestGETDetailScheduleById(String param) throws IOException {
        getByIdJadwal.requestParamGetDetailSchedule(param);
    }
    @Then("I validate the status code for GET schedule by id is {int}")
    public void iValidateTheStatusCodeForGETScheduleByIdIsStatusCode(int statusCode) {
        getByIdJadwal.validateTheStatusCodeForGetScheduleById(statusCode);
    }
    @And("validate the data detail schedule and {string}")
    public void validateTheDataDetailAfterGetByIdSchedule(String message) {
        getByIdJadwal.validateTheDataDetailAfterGetByIdSchedule(message);
    }

//Step For Create Schedule
    @Given("I set an endpoint for create schedule")
    public void iSetAnEndpointForCreateSchedule() {
        createJadwal.setEndpointSchedule();
    }
    @When("I request input {string} for create data schedule")
    public void iRequestPostDetailSchedule(String field) throws Exception {
        createJadwal.requestCreateDataSchedule(field);
    }
    @Then("I validate the status code for create schedule is {int}")
    public void iValidateTheStatusCodeForCreateScheduleIsStatusCode(int statusCode) {
        createJadwal.validateTheStatusCodeForCreateSchedule(statusCode);
    }
    @And("validate the data detail schedule and {string} after create schedule")
    public void validateTheDataDetailAfterCreateSchedule(String message) {
        createJadwal.validateTheDataDetailAfterCreateSchedule(message);
    }

//Step For Update Schedule Admin
    @Given("I set an {string} for update data schedule admin")
    public void iSetAnEndpointForUpdateScheduleAdmin(String endpoint) {
        updateJadwalAdmin.setAnEndpointForUpdateScheduleAdmin(endpoint);
    }
    @When("I request input {string} for update data schedule admin")
    public void iRequestPutDetailScheduleAdmin(String field) throws IOException {
        updateJadwalAdmin.requestUpdateFieldDetailScheduleAdmin(field);
    }
    @Then("I validate the status code for update schedule admin is {int}")
    public void iValidateTheStatusCodeForUpdateScheduleAdminIsStatusCode(int statusCode) {
        updateJadwalAdmin.validateTheStatusCodeForUpdateDataScheduleAdmin(statusCode);
    }
    @And("validate the data detail schedule admin and {string} after update schedule admin")
    public void validateTheDataDetailAfterUpdateScheduleAdmin(String message) {
        updateJadwalAdmin.validateTheDataDetailAfterUpdateScheduleAdmin(message);
    }

//Step For Update Schedule Doctor
    @Given("I set an {string} for update data schedule doctor")
    public void iSetAnEndpointForUpdateScheduleDoctor(String endpoint) {
        updateJadwalDoctor.setAnEndpointForUpdateScheduleDoctor(endpoint);
    }
    @When("I request input {string} for update data schedule doctor")
    public void iRequestPutDetailScheduleDoctor(String field) throws IOException {
        updateJadwalDoctor.requestUpdateFieldDetailScheduleDoctor(field);
    }
    @Then("I validate the status code for update schedule doctor is {int}")
    public void iValidateTheStatusCodeForUpdateScheduleIsStatusCode(int statusCode) {
        updateJadwalDoctor.validateTheStatusCodeForUpdateDataScheduleDoctor(statusCode);
    }
    @And("validate the data detail schedule doctor and {string} after update schedule doctor")
    public void validateTheDataDetailAfterUpdateSchedule(String message) {
        updateJadwalDoctor.validateTheDataDetailAfterUpdateScheduleDoctor(message);
    }

//Step For Delete Schedule
    @Given("I set an {string} for Delete schedule by id")
    public void iSetAnForDeleteScheduleById(String endpoint) {
        deleteJadwal.setAnEndpointForDeleteSchedule(endpoint);
    }
    @When("I request {string} for Delete detail schedule by id")
    public void iRequestForDeleteDetailScheduleById(String param) throws IOException {
        deleteJadwal.requestParamDeleteDetailSchedule(param);
    }
    @Then("I validate the status code for Delete schedule is {int}")
    public void iValidateTheStatusCodeForDeleteScheduleIsStatusCode(int statusCode) {
        deleteJadwal.validateTheStatusCodeForDeleteSchedule(statusCode);
    }
    @And("validate the data detail schedule and {string} after delete schedule")
    public void validateTheDataDetailScheduleAndAfterDeleteSchedule(String message) {
        deleteJadwal.validateTheDataDetailAfterDeleteSchedule(message);
    }
}
