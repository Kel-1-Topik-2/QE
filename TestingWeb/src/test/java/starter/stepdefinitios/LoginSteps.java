package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;


public class LoginSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    DashboardPage dashboardPage;
    @Given("User selects admin role")
    public void userSelectsAdminRole() {
        loginPage.clickButtonRole();
        loginPage.clickAdmin();
    }
    @Given("User selects dokter role")
    public void userSelectsDokterRole() {
        loginPage.clickButtonRole();
        loginPage.clickDokter();
    }
    @When("I input {string} login email")
    public void iInputEmailLogin(String username) {
        loginPage.inputEmailLogin(username);
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
    @And("Click icon logout account")
    public void clickIconLogoutAccount() {
        dashboardPage.clickButtonLogoutAccount();
    }
}
