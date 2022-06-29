package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.DokterDataPage;
import starter.pages.PatientDataPage;

public class PatientDataSteps {
    @Steps
    PatientDataPage patientDataPage;
    @Steps
    DashboardPage dashboardPage;
    @Steps
    DokterDataPage dokterDataPage;
    @Given("Open page dasbord")
    public void openPageDasbord() { dashboardPage.openDashbord();
    }
    @Given("Open page data pasien")
    public void openPageDataPasien() { dashboardPage.openDataPasien();
    }
    @And("Click button data pasien")
    public void clickButtonDataPasien() {
        dashboardPage.clickButtonDataPasien();
    }
    @And("View Patient data")
    public void viewPatientData() throws InterruptedException {
        Thread.sleep(1000);
        patientDataPage.validPagePasien();
    }
    @And("Click button tambah data")
    public void clickButtonTambahData() {
        patientDataPage.clickButtonTambah();
    }
    @And("Click Detail Patient data")
    public void clickDetailPatientData() {
        patientDataPage.clickButtonDetail();
    }
    @When("I input {string} {string} {string} {string} {string} patient")
    public void iInput(String namalengkap, String nik, String usia, String nomortelepon, String alamat) throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.inputDataPasien(namalengkap, nik, usia, nomortelepon, alamat);
    }
    @Then("I input edit {string} {string} {string} {string} {string} patient")
    public void iInputEditPatient(String namalengkap, String nik, String usia, String nomortelepon, String alamat) throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.inputDataPasienEdit(namalengkap, nik, usia, nomortelepon, alamat);
    }

    @And("I click button jenis kelamin laki-laki")
    public void iClickButtonJenisKelamin() {
        patientDataPage.clickLaki();
    }
    @And("I click button jenis kelamin perempuan")
    public void iClickButtonJenisKelaminPerempuan() {
        patientDataPage.clickPerempuan();
    }
    @Then("Click button simpan")
    public void clickButtonSimpan() {
        patientDataPage.clickButtonSave();
    }
    @Then("Pressing the trash image in action")
    public void pressingTheTrashImageIneAction() {
        patientDataPage.clickButtonSampah();
    }
    @Then("Valid data detail pasien")
    public void validData() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.checkValidDataPasien();
    }
    @And("Click button edit profil")
    public void clickButtonEditProfil() {
        patientDataPage.clickButtonEditDataPasien();
    }
    @And("Valid edit data")
    public void validEditData() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validAddData();
        Thread.sleep(500);
        patientDataPage.buttonClickOK();
        Thread.sleep(500);
        patientDataPage.checkValidDataPasien();
    }
    @When("Click Delete Patient data")
    public void clickDeletePatientData() {
        patientDataPage.clickButtonSampah();
    }
    @And("Click button hapus ya")
    public void clickButtonHapusYa() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.clickButtonDeleteYa();
    }
    @And("Click button hapus tidak")
    public void clickButtonHapusTidak() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.clickButtonDeleteTidak();
    }
    @Then("Valid data delete pasien")
    public void validDataDeletePasien() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validPagePasien();
    }
    @And("Valid data pasien")
    public void validDataPasien() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validAddData();
        patientDataPage.buttonClickOK();
    }
    @And("Click search all category Patient data")
    public void clickSearchAllCategoryPatientData() {
        patientDataPage.clickButtonAllCategory();
    }
    @When("Click chose nama")
    public void clickChoseNama() {
        patientDataPage.clickButtonChooseCategoryNama();
    }
    @And("Input data {string} category")
    public void inputDataCategory(String arg0) {
        patientDataPage.inputDataCategory(arg0);
    }
    @Then("Valid data category pasien")
    public void validDataCategoryPasien() throws InterruptedException {
        Thread.sleep(500);
        patientDataPage.validPagePasien();
    }
    @And("Validate add error messenger {string} Pasien")
    public void validateAddErrorMessengerPasien(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        patientDataPage.checkValidDataPasien();
        Thread.sleep(1000);
        dokterDataPage.validateTextMessegerDokter(arg0);
    }
}
