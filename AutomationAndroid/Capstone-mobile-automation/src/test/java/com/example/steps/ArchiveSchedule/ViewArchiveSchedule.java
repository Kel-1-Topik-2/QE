package com.example.steps.ArchiveSchedule;

import com.example.app.pages.ArchiveSchedulePage;
import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewArchiveSchedule {
    ArchiveSchedulePage archiveSchedulePage = new ArchiveSchedulePage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am the Logged Level Admin account")
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
    @When("I click button archive schedule")
    public void iClickButtonDataArchiveSchedule() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonSchedule();
    }
    @Then("I get view list archive schedule")
    public void iGetViewListArchiveSchedule() throws InterruptedException {
        Thread.sleep(10,100);
        archiveSchedulePage.verifyTextListArchiveScheduleDisplayed();
    }
}
