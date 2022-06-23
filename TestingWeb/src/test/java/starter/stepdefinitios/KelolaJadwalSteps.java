package starter.stepdefinitios;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;

public class KelolaJadwalSteps {
    @Steps
    DashboardPage dashboardPage;
    @When("Click button manage schedule")
    public void clickButtonManageSchedule() {
        dashboardPage.clickButtonKelolaJadwal();
    }

    @Then("View manage schedule")
    public void viewManageSchedule() {

    }
}
