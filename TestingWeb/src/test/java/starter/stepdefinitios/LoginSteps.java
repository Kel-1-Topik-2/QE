package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;


public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Given("I am open the login page")
    public void iAmOpenTheLoginPage() {
        loginPage.openLoginPage();
    }
    @When("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.validateOnLoginPage();
    }
    @And("I input {string} login email")
    public void iInputEmailLogin(String email) {
        loginPage.inputEmailLogin(email);
    }
    @And("I input {string} login password")
    public void iInputPasswordLogin(String password) {
        loginPage.inputPasswordLogin(password);
    }
    @Then("I click button login")
    public void iClickButtonLogin() {
        loginPage.clickButtonLogin();
    }
    @And("Login validation {string}")
    public void loginValidation(String error) {
        loginPage.loginTextError();
        loginPage.validateEqualErrorText(error);
    }
}
