package com.example.steps.Review;

import com.example.app.pages.DashboardDoctorPage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.ReviewDoctorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewListReviewStep {
    DashboardDoctorPage dashboardDoctorPage = new DashboardDoctorPage();
    ReviewDoctorPage reviewDoctorPage = new ReviewDoctorPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am the Logged level Doctor account")
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
    @When("I click button view more")
    public void iClickButtonViewMore() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardDoctorPage.verifyMeetingDisplayed();
        dashboardDoctorPage.clickButtonViewMore();
    }
    @Then("I get view list review patient")
    public void iGetListReviewPatient() throws InterruptedException {
        Thread.sleep(10,100);
        reviewDoctorPage.verifyTextListReviewPatientDisplayed();
    }
}
