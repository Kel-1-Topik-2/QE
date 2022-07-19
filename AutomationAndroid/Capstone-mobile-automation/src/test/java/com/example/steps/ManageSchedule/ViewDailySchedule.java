package com.example.steps.ManageSchedule;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.ManageSchedulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewDailySchedule {
    ManageSchedulePage manageSchedulePage = new ManageSchedulePage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am the Logged level Admin account")
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
    @When("I click button manage schedule")
    public void iClickButtonDataMangeSchedule() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonSchedule();
    }
    @Then("I get view list daily schedule")
    public void iGetViewListDailySchedule() throws InterruptedException {
        Thread.sleep(10,100);
        manageSchedulePage.verifyTextListDailyScheduleDisplayed();
    }
}
