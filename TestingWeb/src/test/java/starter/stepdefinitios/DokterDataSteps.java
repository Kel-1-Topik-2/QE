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
    public void clickButtonDataDokter() {
        dashboardPage.clickButtonDataDokter();
    }
    @Then("View Dokter data")
    public void viewDokterData() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validPagePasien();
    }
    @Given("Open page data dokter")
    public void openPageDataDokter(){
        dashboardPage.openDataDokter();
    }
    @When("Click Detail dokter data")
    public void clickDetailDokterData() {
        patientDataPage.clickButtonDetail();
    }
    @Then("Valid data detail dokter")
    public void validDataDetailDokter() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.checkValidDataPasien();
    }
    @Then("I input {string} {string} {string} {string} {string} dokter")
    public void iInputDokter(String arg0, String arg1, String arg2, String arg3, String arg4) throws InterruptedException {
        Thread.sleep(500);
        dokterDataPage.inputDataDokter(arg0, arg1, arg2, arg3, arg4);
    }
    @Then("I input edit {string} {string} {string} {string} {string} dokter")
    public void iInputEditDokter(String arg0, String arg1, String arg2, String arg3, String arg4) throws InterruptedException {
        Thread.sleep(500);
        dokterDataPage.inputDataDokterEdit(arg0, arg1, arg2, arg3, arg4);
    }
    @And("Valid data dokter")
    public void validDataDokter() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validAddData();
        Thread.sleep(500);
        patientDataPage.buttonClickOK();
    }
    @And("Validate add error messenger {string} dokter")
    public void validateAddErrorMessegerDokter(String text) throws InterruptedException {
        Thread.sleep(1000);
        dokterDataPage.validateTextMessegerDokter(text);
    }
    @When("Click Delete dokter data")
    public void clickDeleteDokterData() {
        patientDataPage.clickButtonSampah();
    }
    @Then("Valid data delete dokter")
    public void validDataDeleteDokter() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validPagePasien();
    }
    @And("Click search all category dokter data")
    public void clickSearchAllCategoryDokterData() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validPagePasien();
    }
}
