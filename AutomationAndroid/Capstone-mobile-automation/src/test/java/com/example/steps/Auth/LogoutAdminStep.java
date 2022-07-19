package com.example.steps.Auth;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutAdminStep {
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the Logged Admin account")
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
    }
    @When("I validate dashboard admin page")
    public void iValidateDashboardAdmin() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.verifyButtonLogoutDisplayed();
    }
    @And("click logout button")
    public void iClickLogoutButton() throws InterruptedException {
        Thread.sleep(10, 100);
        dashboardAdminPage.clickButtonLogout();
    }
    @Then("I get logout account admin")
    public void iGetLogoutAccountAdmin() throws InterruptedException {
        Thread.sleep(10,100);
        loginPage.verifyTextWelcomeDisplayed();
    }
}
