package com.example.steps.Auth;

import com.example.app.pages.DashboardDoctorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDoctorStep {
    DashboardDoctorPage dashboardDoctorPage = new DashboardDoctorPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the page login")
    public void iValidatePageLogin() {
        loginPage.verifyTextWelcomeDisplayed();
    }
    @And("I choose role doctor")
    public void iClickButtonRoleDoctor() {
        loginPage.clickButtonRole();
        loginPage.clickButtonDoctor();
    }
    @When("I input field {string} with field {string}")
    public void iEnterUsernameAndPassword(String Username,String Password) throws InterruptedException {
        loginPage.inputUsername(Username);
        loginPage.inputPassword(Password);
    }
    @And("click button login")
    public void iClickButtonLogin() {
        loginPage.clickButtonLogin();
    }
    @Then("I get {string}")
    public void getResultLoginDoctor(String Result) {
        switch (Result) {
            case "Success":
                dashboardDoctorPage.verifyLoginSuccessDisplayed();
                dashboardDoctorPage.verifyMeetingDisplayed();
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
