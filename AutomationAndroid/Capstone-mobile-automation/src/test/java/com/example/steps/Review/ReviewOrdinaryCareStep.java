package com.example.steps.Review;

import com.example.app.pages.DashboardDoctorPage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.ReviewDoctorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewOrdinaryCareStep {
    DashboardDoctorPage dashboardDoctorPage = new DashboardDoctorPage();
    ReviewDoctorPage reviewDoctorPage = new ReviewDoctorPage();
    LoginPage loginPage = new LoginPage();

    @Given("I am the Logged Level Doctor account")
    public void iValidateLoggedDoctorAccount() throws InterruptedException {
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
    @When("I click button process review")
    public void iClickButtonProcessReview() throws InterruptedException {
        Thread.sleep(10,100);
        dashboardDoctorPage.clickButtonViewMore();
        Thread.sleep(15,100);
        reviewDoctorPage.clickButtonProcessReview();
        Thread.sleep(15,100);
        reviewDoctorPage.verifyTextNumberPhonePatientDisplayed();
        reviewDoctorPage.scroll();
    }
    @And("I input field {string} and {string} review ordinary care")
    public void iInputFieldReviewOrdinaryCare(String diagnose,String note) throws InterruptedException{
        reviewDoctorPage.scroll();
        Thread.sleep(10,100);
        reviewDoctorPage.verifyButtonCancelDisplayed();
        reviewDoctorPage.inputDiagnose(diagnose);
        Thread.sleep(10,100);
        reviewDoctorPage.inputNote(note);
        Thread.sleep(10,100);
        reviewDoctorPage.clickButtonSave();
    }
    @Then("I get message success review ordinary care")
    public void iGetMessageSuccessReviewOrdinary() throws InterruptedException {
        Thread.sleep(10,100);
        reviewDoctorPage.verifyTextAddSuccessReviewDisplayed();
    }

}
