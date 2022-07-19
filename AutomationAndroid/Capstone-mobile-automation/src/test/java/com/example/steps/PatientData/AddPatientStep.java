package com.example.steps.PatientData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataPatientPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPatientStep {
    DataPatientPage dataPatientPage = new DataPatientPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the logged account admin")
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
    @And("I click add data in data patient")
    public void iClickAddDataPatient() throws InterruptedException {
        Thread.sleep(20,100);
        dashboardAdminPage.clickButtonPatient();
        Thread.sleep(20,100);
        dataPatientPage.clickButtonAddPatient();
    }
    @When("I input field {string} with {string}")
    public void iInputFieldFullNameAndNumberPhone(String fullName,String numberPhone) throws InterruptedException {
        Thread.sleep(10,100);
        dataPatientPage.inputFullName(fullName);
        Thread.sleep(10,100);
        dataPatientPage.inputNumberPhone(numberPhone);
    }
    @And("I input {string} with {string} and {string}")
    public void iInputFieldNikWithUsiaAndAddress(String nik,String usia,String address) throws InterruptedException {
        Thread.sleep(10,100);
        dataPatientPage.inputNik(nik);
        Thread.sleep(10,100);
        dataPatientPage.inputUsia(usia);
        dataPatientPage.clickButtonMan();
        Thread.sleep(10,100);
        dataPatientPage.inputAddress(address);
    }
    @And("click save patient button")
    public void iClickSavePatientButton() {
        dataPatientPage.clickButtonSave();
    }
    @Then("I get the {string} add patient")
    public void getResultAddPatient(String output) {
        switch (output) {
            case "Success":
                dataPatientPage.verifyTextAddSuccessPatientDisplayed();
                break;
            case "Empty fullName":
                dataPatientPage.verifyErrorFullNameDisplayed();
                dataPatientPage.verifyErrorFullNameEqual();
                break;
            case "Invalid numberPhone":
            case "Empty numberPhone":
                dataPatientPage.verifyErrorNumberPhoneDisplayed();
                dataPatientPage.verifyErrorNumberPhoneEqual();
                break;
            case "Empty nik":
            case "Invalid nik":
                dataPatientPage.verifyErrorNikDisplayed();
                dataPatientPage.verifyErrorNikEqual();
                break;
            case "Invalid usia":
            case "Empty usia":
                dataPatientPage.verifyErrorUsiaDisplayed();
                dataPatientPage.verifyErrorUsiaEqual();
                break;
            case "Empty address":
                dataPatientPage.verifyErrorAddressDisplayed();
                dataPatientPage.verifyErrorAddressEqual();
                break;
            case "Invalid all":
                dataPatientPage.verifyErrorNumberPhoneDisplayed();
                dataPatientPage.verifyErrorNikDisplayed();
                dataPatientPage.verifyErrorUsiaDisplayed();
                break;
            default:
                dataPatientPage.verifyErrorFullNameDisplayed();
                dataPatientPage.verifyErrorNumberPhoneDisplayed();
                dataPatientPage.verifyErrorNikDisplayed();
                dataPatientPage.verifyErrorUsiaDisplayed();
                dataPatientPage.verifyErrorAddressDisplayed();
                break;
        }
    }
}
