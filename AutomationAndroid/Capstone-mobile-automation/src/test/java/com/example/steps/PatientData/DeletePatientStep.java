package com.example.steps.PatientData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataPatientPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeletePatientStep {
    DataPatientPage dataPatientPage = new DataPatientPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am the logged account admin")
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
        Thread.sleep(10,100);
        dashboardAdminPage.verifyLoginSuccessDisplayed();
        dashboardAdminPage.verifyOverviewDisplayed();
    }
    @When("I click button delete in data patient")
    public void iClickButtonInformationPatient() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonPatient();
        Thread.sleep(10,100);
        dataPatientPage.clickButtonTrash();
        dataPatientPage.verifyTextMessageDeleteDisplayed();
        dataPatientPage.clickButtonDelete();
    }
    @Then("I get success delete patient from the list")
    public void iGetSuccessDeletePatient() throws InterruptedException {
        Thread.sleep(10,100);
        dataPatientPage.verifyTextDeleteSuccessPatientDisplayed();
    }
}
