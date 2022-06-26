package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.PatientDataPage;

public class ArsipJadwalSteps {
    @Steps
    DashboardPage dashboardPage;
    @Steps
    PatientDataPage patientDataPage;
    @When("Click button archive")
    public void clickButtonArchive() {
        dashboardPage.clickButtonArsipJadwal();
    }
    @Then("View archive")
    public void viewArchive() {
        patientDataPage.validPagePasien();
    }
    @Given("Open page archive")
    public void openPageArchive() {
        dashboardPage.openArsipJadwal();
    }
    @And("Click search all category archive")
    public void clickSearchAllCategoryArchive() {
        patientDataPage.clickButtonAllCategory();
    }
    @Then("Valid data category archive")
    public void validDataCategoryArchive() {
        patientDataPage.validPagePasien();
    }
}
