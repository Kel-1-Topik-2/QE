package com.example.steps.Auth;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAdminStep {
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void iValidateLoginPage() throws InterruptedException {
        Thread.sleep(10,100);
        loginPage.verifyTextWelcomeDisplayed();
    }
    @And("I choose role admin")
    public void iClickButtonRoleAdmin() {
        loginPage.clickButtonRole();
        loginPage.clickButtonAdmin();
    }
    @When("I input {string} with {string}")
    public void iInputFieldUsernameAndPassword(String username,String password) throws InterruptedException {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }
    @And("click login button")
    public void iClickLoginButton() {
        loginPage.clickButtonLogin();
    }
    @Then("I get the {string}")
    public void getResultLoginAdmin(String result) {
        switch (result) {
            case "Success":
                dashboardAdminPage.verifyLoginSuccessDisplayed();
                dashboardAdminPage.verifyOverviewDisplayed();
                dashboardAdminPage.verifyOverviewEqual();
                break;
            case "Empty Username":
                loginPage.verifyErrorUsernameDisplayed();
                loginPage.verifyErrorUsernameEqual();
                break;
            case "Empty Password":
                loginPage.verifyErrorPasswordDisplayed();
                loginPage.verifyErrorPasswordEqual();
                break;
            case "Empty All":
                loginPage.verifyErrorUsernameDisplayed();
                loginPage.verifyErrorPasswordDisplayed();
                break;
            case "Invalid Username":
            case "Invalid Password":
            default:
                loginPage.verifyLoginFailedDisplayed();
                loginPage.verifyLoginFailedEqual();
                break;
        }
    }
}
