package starter.stepdefinitios;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.DokterDataPage;
import starter.pages.PatientDataPage;

import java.util.Locale;

public class PatientDataSteps {
    @Steps
    PatientDataPage patientDataPage;
    @Steps
    DashboardPage dashboardPage;
    @Steps
    DokterDataPage dokterDataPage;
    @And("Click button data pasien")
    public void clickButtonDataPasien() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickButtonDataPasien();
    }
    @And("View Patient data")
    public void viewPatientData() throws InterruptedException {
        Thread.sleep(3000);
        patientDataPage.validPagePasien();
    }
    @And("Click button tambah data")
    public void clickButtonTambahData() throws InterruptedException {
        Thread.sleep(6000);
        patientDataPage.clickButtonTambah();
    }
    @And("Click Detail Patient data")
    public void clickDetailPatientData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.clickButtonDetail();
    }
    @When("I input {string} {string} {string} {string} {string} patient")
    public void iInput(String namalengkap, String nik, String usia, String nomortelepon, String alamat) throws InterruptedException {
        Thread.sleep(1000);
        patientDataPage.inputDataPasien(namalengkap, nik, usia, nomortelepon, alamat);
    }
    @Then("I input edit {string} {string} {string} {string} {string} patient")
    public void iInputEditPatient(String namalengkap, String nik, String usia, String nomortelepon, String alamat) throws InterruptedException {
        Thread.sleep(1000);
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
    public void clickButtonSimpan() throws InterruptedException {
        patientDataPage.clickButtonSave();
        Thread.sleep(1000);
    }
//    @Then("Pressing the trash image in action")
//    public void pressingTheTrashImageIneAction() {
//        patientDataPage.clickButtonSampah();
//    }
    @Then("Valid data detail pasien")
    public void validData() throws InterruptedException {
        Thread.sleep(1500);
        patientDataPage.checkValidDataPasien();
    }
    @And("Click button edit profil")
    public void clickButtonEditProfil() throws InterruptedException {
        Thread.sleep(3000);
        patientDataPage.clickButtonEditDataPasien();
    }
    @And("Valid edit data")
    public void validEditData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validAddData();
        Thread.sleep(1000);
        patientDataPage.buttonClickOK();
        Thread.sleep(1000);
        patientDataPage.checkValidDataPasien();
    }
    @When("Click Delete Patient data")
    public void clickDeletePatientData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.clickButtonSampah();
    }
    @And("Click button hapus ya")
    public void clickButtonHapusYa() throws InterruptedException {
        Thread.sleep(3000);
        patientDataPage.clickButtonDeleteYa();
    }
    @And("Click button hapus tidak")
    public void clickButtonHapusTidak() throws InterruptedException {
        Thread.sleep(3000);
        patientDataPage.clickButtonDeleteTidak();
    }
    @Then("Valid data delete pasien")
    public void validDataDeletePasien() throws InterruptedException {
        Thread.sleep(3000);
        patientDataPage.validPagePasien();
    }
    @And("Valid data pasien")
    public void validDataPasien() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.validAddData();
        Thread.sleep(1000);
        patientDataPage.buttonClickOK();
    }
    @And("Click search all category Patient data")
    public void clickSearchAllCategoryPatientData() throws InterruptedException {
        Thread.sleep(5000);
        patientDataPage.clickButtonAllCategory();
    }
    @When("Click chose nama")
    public void clickChoseNama() throws InterruptedException {
        Thread.sleep(3000);
        patientDataPage.clickButtonChooseCategoryNama();
    }
    @And("Input data {string} category")
    public void inputDataCategory(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        patientDataPage.inputDataCategory(arg0);
    }
    @Then("Valid data category pasien")
    public void validDataCategoryPasien() throws InterruptedException {
        Thread.sleep(2000);
        patientDataPage.validPagePasien();
    }
    @And("Validate add error messenger {string} Pasien")
    public void validateAddErrorMessengerPasien(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        dokterDataPage.validateTextMessegerDokter(arg0);
    }
}
