package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ArsipJadwalPage;
import starter.pages.DashboardPage;
import starter.pages.PatientDataPage;

public class ArsipJadwalSteps {
    @Steps
    DashboardPage dashboardPage;
    @Steps
    PatientDataPage patientDataPage;
    @Steps
    ArsipJadwalPage arsipJadwalPage;
    @When("Click button archive")
    public void clickButtonArchive() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickButtonArsipJadwal();
    }
    @Then("View archive")
    public void viewArchive() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validPagePasien();
    }
    @And("Click search all category archive")
    public void clickSearchAllCategoryArchive() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.clickButtonAllCategory();
    }
    @Then("Valid data category archive")
    public void validDataCategoryArchive() throws InterruptedException {
        Thread.sleep(2000);
        patientDataPage.validPagePasien();
    }
    @When("Click chose nama pasien")
    public void clickChoseNamaPasien() throws InterruptedException {
        Thread.sleep(1000);
        arsipJadwalPage.clickButtonChooseCategoryNamaOnArsip();
    }
    @And("Click icon aksi on archive")
    public void clickIconAksiOnArchive() throws InterruptedException {
        Thread.sleep(5000);
        arsipJadwalPage.clickIconAksiOnArsip();
    }
    @And("Validate review")
    public void validateReview() throws InterruptedException {
        Thread.sleep(5000);
        arsipJadwalPage.validateOnReviewPage();
    }
}
