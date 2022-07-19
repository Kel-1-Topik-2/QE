package com.example.steps.DoctorData;

import com.example.app.base.BasePageObject;
import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataDoctorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDoctorStep {
    DataDoctorPage dataDoctorPage = new DataDoctorPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am logged account admin")
    public void iValidateLoggedAccountAdmin() throws InterruptedException {
        loginPage.verifyTextWelcomeDisplayed();
        loginPage.clickButtonRole();
        loginPage.clickButtonAdmin();
        loginPage.clickButtonUsername();
        Thread.sleep(30,100);
        loginPage.inputUsername("admin");
        Thread.sleep(30,100);
        loginPage.clickButtonPassword();
        Thread.sleep(30,100);
        loginPage.inputPassword("admin123");
        Thread.sleep(30,100);
        loginPage.clickButtonLogin();
        dashboardAdminPage.verifyLoginSuccessDisplayed();
        dashboardAdminPage.verifyButtonLogoutDisplayed();
    }
    @And("I click add data in data doctor")
    public void iClickAddDataDoctor() throws InterruptedException {
        Thread.sleep(20,100);
        dashboardAdminPage.clickButtonDoctor();
        Thread.sleep(20,100);
        dataDoctorPage.clickButtonAddDoctor();
    }
    @When("I input field {string} with field {string} and field {string}")
    public void iInputFieldFullNameWithNpaIdiAndSpesialis(String fullName,String npaIdi,String spesialis) throws InterruptedException {
        Thread.sleep(20,100);
        dataDoctorPage.inputFullName(fullName);
        Thread.sleep(20,100);
        dataDoctorPage.inputNpaIdi(npaIdi);
        Thread.sleep(20,100);
        dataDoctorPage.inputSpesialis(spesialis);
    }
    @And("I input field {string} and field {string} and field {string}")
    public void iInputFieldUsernameAndPasswordAndConfirmPass(String username,String password,String confirmpass) throws InterruptedException {
        Thread.sleep(20,100);
        dataDoctorPage.inputUsername(username);
        Thread.sleep(20,100);
        dataDoctorPage.inputPassword(password);
        Thread.sleep(20,100);
        dataDoctorPage.inputConfirmPassword(confirmpass);
    }
    @And("click save doctor button")
    public void iClickSaveDoctorButton() throws InterruptedException {
        Thread.sleep(20,100);
        dataDoctorPage.clickButtonSave();
    }
    @Then("I get the {string} add doctor")
    public void getResultAddDoctor(String output) {
        switch (output) {
            case "Success":
                dataDoctorPage.verifyTextAddSuccessDoctorDisplayed();
                break;
            case "Empty fullName":
                dataDoctorPage.verifyErrorFullNameDisplayed();
                dataDoctorPage.verifyErrorFullNameEqual();
                break;
            case "Invalid npaIdi":
            case "Empty npaIdi":
                dataDoctorPage.verifyErrorNpaIdiDisplayed();
                break;
            case "Empty spesialis":
                dataDoctorPage.verifyErrorSpesialisDisplayed();
                dataDoctorPage.verifyErrorSpesialisEqual();
                break;
            case "Empty username":
                dataDoctorPage.verifyErrorUsernameDisplayed();
                dataDoctorPage.verifyErrorUsernameEqual();
                break;
            case "Limit username":
                dataDoctorPage.verifyErrorLimitUsernameDisplayed();
                dataDoctorPage.verifyErrorLimitUsernameEqual();
                break;
            case "Empty password":
                dataDoctorPage.verifyErrorPasswordDisplayed();
                dataDoctorPage.verifyErrorPasswordEqual();
                break;
            case "Limit password":
                dataDoctorPage.verifyErrorLimitPasswordDisplayed();
                dataDoctorPage.verifyErrorLimitPasswordEqual();
                break;
            case "not SamePass":
                dataDoctorPage.verifyErrorNotSamePassDisplayed();
                dataDoctorPage.verifyErrorNotSamePassEqual();
                break;
            default:
                dataDoctorPage.verifyErrorFullNameDisplayed();
                dataDoctorPage.verifyErrorNpaIdiDisplayed();
                dataDoctorPage.verifyErrorSpesialisDisplayed();
                dataDoctorPage.verifyErrorUsernameDisplayed();
                dataDoctorPage.verifyErrorPasswordDisplayed();
                dataDoctorPage.verifyErrorConfirmPasswordDisplayed();
                break;
        }
    }
}
