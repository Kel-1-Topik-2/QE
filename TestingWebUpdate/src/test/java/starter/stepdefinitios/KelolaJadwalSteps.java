package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ArsipJadwalPage;
import starter.pages.DashboardPage;
import starter.pages.KelolaJadwalPage;
import starter.pages.PatientDataPage;

public class KelolaJadwalSteps {
    @Steps
    DashboardPage dashboardPage;
    @Steps
    PatientDataPage patientDataPage;
    @Steps
    KelolaJadwalPage kelolaJadwalPage;
    @Steps
    ArsipJadwalPage arsipJadwalPage;
    @When("Click button manage schedule")
    public void clickButtonManageSchedule() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickButtonKelolaJadwal();
    }
    @Then("View manage schedule")
    public void viewManageSchedule() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validPagePasien();
    }
    @And("Click on the select patient action to select a patient")
    public void clickOnTheSelectPatientActionToSelectAPatient() throws InterruptedException {
        Thread.sleep(5000);
        kelolaJadwalPage.buttonPilihPasien();
    }
    @And("Click on the action choose a doctor to choose a doctor")
    public void clickOnTheActionChooseADoctorToChooseADoctor() throws InterruptedException {
        Thread.sleep(5000);
        kelolaJadwalPage.buttonPilihDokter();
    }
    @Then("Choose a date {string}")
    public void chooseADate(String tgl) throws InterruptedException {
        Thread.sleep(500);
        kelolaJadwalPage.inputTanggal(tgl);
    }
    @And("Choose the type of treatment")
    public void chooseTheTypeOfTreatment() throws InterruptedException {
        Thread.sleep(500);
        kelolaJadwalPage.buttonJenisPerawatan();
    }
    @And("Click simpan")
    public void clickSimpan() throws InterruptedException {
        Thread.sleep(500);
        kelolaJadwalPage.buttonSave();
    }
    @And("Validate data kelola jadwal")
    public void validateDataKelolaJadwal() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validAddData();
        Thread.sleep(1000);
        patientDataPage.buttonClickOK();
        Thread.sleep(5000);
        patientDataPage.validPagePasien();
    }
    @And("Click rawat jalan")
    public void clickRawatJalan() {
        kelolaJadwalPage.buttonRawatJalan();
    }
    @And("Click rawat biasa")
    public void clickRawatBiasa() {
        kelolaJadwalPage.buttonRawatBiasa();
    }
    @And("Validate data error kelola jadwal")
    public void validateDataErrorKelolaJadwal() {
        kelolaJadwalPage.validateErrorKelolaJadwal();
    }
    @And("Click search all category manage schedule")
    public void clickSearchAllCategoryManageSchedule() throws InterruptedException {
        Thread.sleep(5000);
        arsipJadwalPage.clickButtonChooseCategoryNamaOnArsip();
    }
}
