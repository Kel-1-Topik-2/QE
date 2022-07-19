package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;
import starter.pages.PatientDataPage;


public class LoginSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    DashboardPage dashboardPage;
    @Steps
    PatientDataPage patientDataPage;
//    @Given("User selects admin role")
//    public void userSelectsAdminRole() {
//        loginPage.clickButtonRole();
//        loginPage.clickAdmin();
//    }
//    @Given("User selects dokter role")
//    public void userSelectsDokterRole() {
//        loginPage.clickButtonRole();
//        loginPage.clickDokter();
//    }
    @When("I input {string} login email")
    public void iInputEmailLogin(String email) throws InterruptedException {
        Thread.sleep(1000);
        loginPage.inputEmailLogin(email);
    }
    @And("I input {string} login password")
    public void iInputPasswordLogin(String password) throws InterruptedException {
        Thread.sleep(1000);
        loginPage.inputPasswordLogin(password);
    }
    @Then("I click button login")
    public void iClickButtonLogin() throws InterruptedException {
        loginPage.clickButtonLogin();
        Thread.sleep(1000);
    }
    @And("Login validation kosong")
    public void loginValidation() throws InterruptedException {
        Thread.sleep(500);
        loginPage.loginTextError();
    }
    @And("Click icon logout account")
    public void clickIconLogoutAccount() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickButtonLogoutAccount();
    }
    @And("Click icon yes for logout")
    public void clickIconYesForLogout() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickButtonLogoutAccountYes();
    }
    @And("Click icon no for logout")
    public void clickIconNoForLogout() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickButtonLogoutAccountNo();
    }
    @And("Validate on login page")
    public void validateOnLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.loginTextError();
    }
    @Given("Open login page")
    public void openLoginPage() {
        loginPage.openLogin();
    }
    @And("Login validation invalid")
    public void loginValidationInvalid() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.loginInvalidError();
        Thread.sleep(500);
        loginPage.clickButtonErrorOK();
    }
    @And("I input {string} login password valid")
    public void iInputLoginPasswordValid(String arg0) throws InterruptedException {
        Thread.sleep(500);
        loginPage.inputPasswordLogin(arg0);
    }
    @When("I input {string} login email valid")
    public void iInputLoginEmailValid(String arg0) throws InterruptedException {
        Thread.sleep(500);
        loginPage.inputEmailLogin(arg0);
    }
    @And("Validate on dashboard")
    public void validateOnDashboard() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.validViewDashbord();
    }
    @And("Valid not logout")
    public void validNotLogout() throws InterruptedException {
        Thread.sleep(1500);
        patientDataPage.validPagePasien();
    }
}
