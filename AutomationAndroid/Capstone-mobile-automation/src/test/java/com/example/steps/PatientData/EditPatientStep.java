package com.example.steps.PatientData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataPatientPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditPatientStep {
    DataPatientPage dataPatientPage = new DataPatientPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the logged account Admin")
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
    @And("I click edit data in data patient")
    public void iClickEditDataPatient() throws InterruptedException {
        Thread.sleep(20,100);
        dashboardAdminPage.clickButtonPatient();
        Thread.sleep(20,100);
        dataPatientPage.clickButtonInformation();
        Thread.sleep(10,100);
        dataPatientPage.clickButtonEditPatient();
    }
    @When("I input field {string} and {string}")
    public void iInputFieldFullNameWithNumberPhone(String FullName,String NumberPhone) throws InterruptedException {
        Thread.sleep(25,100);
        dataPatientPage.inputFullName(FullName);
        Thread.sleep(15,100);
        dataPatientPage.inputNumberPhone(NumberPhone);
    }
    @And("I input field {string} with {string} with and {string}")
    public void iInputFieldNikAndUsiaAndAddress(String Nik,String Usia,String Address) throws InterruptedException {
        Thread.sleep(15,100);
        dataPatientPage.inputNik(Nik);
        Thread.sleep(15,100);
        dataPatientPage.inputUsia(Usia);
        dataPatientPage.clickButtonWomen();
        Thread.sleep(15,100);
        dataPatientPage.inputAddress(Address);
    }
    @And("click button save patient")
    public void iClickButtonSavePatient() {
        dataPatientPage.clickButtonSave();
    }
    @Then("I get the {string} edit patient")
    public void getResultEditPatient(String Output) throws InterruptedException {
        switch (Output) {
            case "Success":
                Thread.sleep(15,100);
                dataPatientPage.verifyTextEditSuccessPatientDisplayed();
                break;
            case "Empty fullName":
                dataPatientPage.verifyErrorFullNameDisplayed();
                dataPatientPage.verifyErrorFullNameEqual();
                break;
            case "Empty numberPhone":
            case "Invalid numberPhone":
                dataPatientPage.verifyErrorNumberPhoneDisplayed();
                dataPatientPage.verifyErrorNumberPhoneEqual();
                break;
            case "Empty nik":
            case "Invalid nik":
                dataPatientPage.verifyErrorNikDisplayed();
                dataPatientPage.verifyErrorNikEqual();
                break;
            case "Empty usia":
            case "Invalid usia":
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
