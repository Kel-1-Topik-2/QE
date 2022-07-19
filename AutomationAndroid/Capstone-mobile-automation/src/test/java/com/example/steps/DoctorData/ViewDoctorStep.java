package com.example.steps.DoctorData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataDoctorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewDoctorStep {
    DataDoctorPage dataDoctorPage = new DataDoctorPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am the logged level Admin account")
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
        dashboardAdminPage.verifyOverviewEqual();
    }
    @When("I click button data doctor")
    public void iClickButtonDataDoctor() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonDoctor();
    }
    @Then("I get The view list doctor")
    public void iGetViewListDoctor() throws InterruptedException {
        Thread.sleep(10,100);
        dataDoctorPage.verifyTextListDoctorDisplayed();
    }
}
