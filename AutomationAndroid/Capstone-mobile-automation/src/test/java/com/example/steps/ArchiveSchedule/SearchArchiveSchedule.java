package com.example.steps.ArchiveSchedule;

import com.example.app.pages.ArchiveSchedulePage;
import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchArchiveSchedule {
    ArchiveSchedulePage archiveSchedulePage = new ArchiveSchedulePage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the Logged level Account Admin")
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
    @When("I searching {string} in archive schedule data")
    public void iInputFieldSearch(String search) throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonArchive();
        Thread.sleep(10,100);
        archiveSchedulePage.inputSearching(search);
    }
    @Then("I get {string} search archive schedule")
    public void iGetOutcomeSearchArchiveSchedule(String Outcome) throws InterruptedException {
        if ("success".equals(Outcome)) {
            archiveSchedulePage.verifyTextListArchiveScheduleDisplayed();
        } else {
            archiveSchedulePage.verifyTextDataNotFoundDisplayed();
        }
    }
}
