package com.example.steps.PatientData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataPatientPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPatientStep {
    DataPatientPage dataPatientPage = new DataPatientPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the logged Account Admin")
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
        dashboardAdminPage.verifyOverviewDisplayed();
    }
    @When("I searching {string} in data patient")
    public void iInputFieldSearch(String search) throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonPatient();
        Thread.sleep(10,100);
        dataPatientPage.inputSearching(search);
    }
    @Then("I get the {string} search patient")
    public void iGetOutcomeSearchPatient(String outcome) throws InterruptedException {
        if ("success".equals(outcome)) {
            dataPatientPage.verifyTextListPatientDisplayed();
        } else {
            dataPatientPage.verifyTextDataNotFoundDisplayed();
        }
    }
}
