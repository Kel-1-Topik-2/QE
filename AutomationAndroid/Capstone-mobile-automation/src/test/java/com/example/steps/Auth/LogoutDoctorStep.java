package com.example.steps.Auth;

import com.example.app.pages.DashboardDoctorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutDoctorStep {
    DashboardDoctorPage dashboardDoctorPage = new DashboardDoctorPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the Logged Doctor account")
    public void iValidateLoggedAccountDoctor() throws InterruptedException {
        loginPage.verifyTextWelcomeDisplayed();
        loginPage.clickButtonRole();
        loginPage.clickButtonDoctor();
        loginPage.clickButtonUsername();
        Thread.sleep(30,100);
        loginPage.inputUsername("husain1234");
        Thread.sleep(30,100);
        loginPage.clickButtonPassword();
        Thread.sleep(30,100);
        loginPage.inputPassword("husain1234");
        Thread.sleep(30,100);
        loginPage.clickButtonLogin();
        dashboardDoctorPage.verifyLoginSuccessDisplayed();
    }
    @When("I validate dashboard doctor page")
    public void iValidateDashboardDoctor() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardDoctorPage.verifyMeetingDisplayed();
    }
    @And("click logout doctor button")
    public void iClickLogoutDoctorButton() throws InterruptedException {
        dashboardDoctorPage.clickButtonViewMore();
        dashboardDoctorPage.clickButtonShowMenu();
        dashboardDoctorPage.clickButtonLogout();
    }
    @Then("I get logout account doctor")
    public void iGetLogoutAccountDoctor() throws InterruptedException {
        Thread.sleep(10,100);
        loginPage.verifyTextWelcomeDisplayed();
    }
}
