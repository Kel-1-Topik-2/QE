package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.DokterDataPage;
import starter.pages.PatientDataPage;

public class DokterDataSteps {
    @Steps
    DashboardPage dashboardPage;
    @Steps
    PatientDataPage patientDataPage;
    @Steps
    DokterDataPage dokterDataPage;
    @When("Click button data dokter")
    public void clickButtonDataDokter() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickButtonDataDokter();
    }
    @Then("View Dokter data")
    public void viewDokterData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validPagePasien();
    }
    @When("Click Detail dokter data")
    public void clickDetailDokterData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.clickButtonDetail();
    }
    @Then("Valid data detail dokter")
    public void validDataDetailDokter() throws InterruptedException {
        Thread.sleep(3000);
        patientDataPage.checkValidDataPasien();
    }
    @Then("I input {string} {string} {string} {string} {string} {string} dokter")
    public void iInputDokter(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(500);
        dokterDataPage.inputDataDokter(arg0, arg1, arg2, arg3, arg4, arg5);
    }
    @Then("I input edit {string} {string} {string} {string} {string} {string} dokter")
    public void iInputEditDokter(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(500);
        dokterDataPage.inputDataDokterEdit(arg0, arg1, arg2, arg3, arg4, arg5);
    }
    @And("Valid data dokter")
    public void validDataDokter() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validAddData();
        Thread.sleep(1000);
        patientDataPage.buttonClickOK();
        Thread.sleep(5000);
        patientDataPage.validPagePasien();
    }
    @And("Validate add error messenger {string} dokter")
    public void validateAddErrorMessegerDokter(String text) throws InterruptedException {
        Thread.sleep(1000);
        dokterDataPage.validateTextMessegerDokter(text);
    }
    @When("Click Delete dokter data")
    public void clickDeleteDokterData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.clickButtonSampah();
    }
    @Then("Valid data delete dokter")
    public void validDataDeleteDokter() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validPagePasien();
    }
    @And("Click search all category dokter data")
    public void clickSearchAllCategoryDokterData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.clickButtonAllCategory();
    }
    @And("Click chose nama dokter")
    public void clickChoseNamaDokter() throws InterruptedException {
        Thread.sleep(5000);
        dokterDataPage.clickNamaDokter();
    }
}
