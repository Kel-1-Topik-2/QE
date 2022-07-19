package com.example.steps.DoctorData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataDoctorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditDoctorStep {
    DataDoctorPage dataDoctorPage = new DataDoctorPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am logged Account admin")
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
    @And("I click edit data in data doctor")
    public void iClickEditDataDoctor() throws InterruptedException {
        Thread.sleep(20,100);
        dashboardAdminPage.clickButtonDoctor();
        Thread.sleep(20,100);
        dataDoctorPage.clickButtonInformation();
        Thread.sleep(10,100);
        dataDoctorPage.clickButtonEditDoctor();
    }
    @When("I input Field {string} with field {string} and field {string}")
    public void iInputFieldFullNameWithNpaIdiAndSpesialis(String FullName,String NpaIdi,String Spesialis) throws InterruptedException {
        Thread.sleep(10,100);
        dataDoctorPage.inputFullName(FullName);
        Thread.sleep(10,100);
        dataDoctorPage.inputNpaIdi(NpaIdi);
        Thread.sleep(10,100);
        dataDoctorPage.inputSpesialis(Spesialis);
    }
    @And("I input Field {string} and {string} and field {string}")
    public void iInputFieldUsernameAndPasswordAndConfirmPass(String Username,String Password,String ConfirmPass) throws InterruptedException {
        Thread.sleep(10,100);
        dataDoctorPage.inputUsername(Username);
        Thread.sleep(10,100);
        dataDoctorPage.inputPassword(Password);
        Thread.sleep(10,100);
        dataDoctorPage.inputConfirmPassword(ConfirmPass);
    }
    @And("click button save doctor")
    public void iClickButtonSaveDoctor() {
        dataDoctorPage.clickButtonSave();
    }
    @Then("I get the {string} edit doctor")
    public void getResultEditDoctor(String Output) throws InterruptedException {
        switch (Output) {
            case "Success":
                Thread.sleep(15,100);
                dataDoctorPage.verifyButtonEditDoctorDisplayed();
                break;
            case "Empty fullName":
                dataDoctorPage.verifyErrorFullNameDisplayed();
                dataDoctorPage.verifyErrorFullNameEqual();
                break;
            case "Invalid npaIdi":
            case "Empty npaIdi":
                dataDoctorPage.verifyErrorNpaIdiDisplayed();
                dataDoctorPage.verifyErrorNpaIdiDisplayed();
                break;
            case "Empty spesialis":
                dataDoctorPage.verifyErrorSpesialisDisplayed();
                dataDoctorPage.verifyErrorSpesialisEqual();
                break;
            case "Empty username":
                dataDoctorPage.verifyErrorEditUsernameDisplayed();
                dataDoctorPage.verifyErrorEditUsernameEqual();
                break;
            case "Limit username":
                dataDoctorPage.verifyErrorLimitUsernameDisplayed();
                dataDoctorPage.verifyErrorLimitUsernameEqual();
                break;
            case "Empty password":
                dataDoctorPage.verifyErrorNewPasswordDisplayed();
                dataDoctorPage.verifyErrorNewPasswordEqual();
                break;
            case "Limit password":
                dataDoctorPage.verifyErrorNewLimitPasswordDisplayed();
                dataDoctorPage.verifyErrorNewLimitConfirmPasswordDisplayed();
                break;
            case "not SamePass":
                dataDoctorPage.verifyErrorNotSamePassDisplayed();
                dataDoctorPage.verifyErrorNotSamePassEqual();
                break;
            default:
                Thread.sleep(15,100);
                dataDoctorPage.verifyErrorFullNameDisplayed();
                dataDoctorPage.verifyErrorNpaIdiDisplayed();
                dataDoctorPage.verifyErrorSpesialisDisplayed();
                dataDoctorPage.verifyErrorEditUsernameDisplayed();
                dataDoctorPage.verifyErrorNewPasswordDisplayed();
                dataDoctorPage.verifyErrorNewConfirmPasswordDisplayed();
                break;
        }
    }
}
