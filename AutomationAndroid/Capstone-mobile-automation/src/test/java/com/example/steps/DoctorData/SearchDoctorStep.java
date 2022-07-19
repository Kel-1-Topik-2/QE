package com.example.steps.DoctorData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataDoctorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDoctorStep {
    DataDoctorPage dataDoctorPage = new DataDoctorPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the logged level Account Admin")
    public void iValidateLoggedAccountLevelAdmin() throws InterruptedException {
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
    @When("I searching {string} in data doctor")
    public void iInputFieldSearch(String search) throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonDoctor();
        Thread.sleep(10,100);
        dataDoctorPage.inputSearching(search);
    }
    @Then("I get the {string} search doctor")
    public void iGetOutcomeSearchDoctor(String outcome) throws InterruptedException {
        if ("success".equals(outcome)) {
            dataDoctorPage.verifyTextListDoctorDisplayed();
        } else {
            dataDoctorPage.verifyTextDataNotFoundDisplayed();
        }
    }
}
