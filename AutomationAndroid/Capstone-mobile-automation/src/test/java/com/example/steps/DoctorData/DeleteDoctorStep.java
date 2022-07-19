package com.example.steps.DoctorData;

import com.example.app.pages.DashboardAdminPage;
import com.example.app.pages.DataDoctorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteDoctorStep {
    DataDoctorPage dataDoctorPage = new DataDoctorPage();
    DashboardAdminPage dashboardAdminPage = new DashboardAdminPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am the logged Account admin")
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
        Thread.sleep(10,100);
        dashboardAdminPage.verifyLoginSuccessDisplayed();
        dashboardAdminPage.verifyOverviewDisplayed();
    }
    @When("I click button delete in data doctor")
    public void iClickButtonDeleteDoctor() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardAdminPage.clickButtonDoctor();
        Thread.sleep(10,100);
        dataDoctorPage.clickButtonTrash();
        dataDoctorPage.verifyTextMessageDeleteDisplayed();
        dataDoctorPage.clickButtonDelete();
    }
    @Then("I get success delete doctor from the list")
    public void iGetSuccessDeleteDoctor() throws InterruptedException {
        Thread.sleep(10,100);
        dataDoctorPage.verifyTextListDoctorDisplayed();
    }
}
