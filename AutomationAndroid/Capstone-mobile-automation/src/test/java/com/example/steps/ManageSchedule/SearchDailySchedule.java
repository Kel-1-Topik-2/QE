package com.example.steps.ManageSchedule;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.ManageSchedulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDailySchedule {
    ManageSchedulePage manageSchedulePage = new ManageSchedulePage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the Logged Level Account Admin")
    public void iValidateLoggedAccountAdminLevel() throws InterruptedException {
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
    @When("I searching {string} in daily schedule data")
    public void iInputFieldSearch(String search) throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonSchedule();
        Thread.sleep(10,100);
        manageSchedulePage.inputSearching(search);
    }
    @Then("I get {string} search daily schedule")
    public void iGetOutcomeSearchDailySchedule(String Outcome) throws InterruptedException {
        if ("success".equals(Outcome)) {
            manageSchedulePage.verifyTextListDailyScheduleDisplayed();
        } else {
            manageSchedulePage.verifyTextDataNotFoundDisplayed();
        }
    }
}
