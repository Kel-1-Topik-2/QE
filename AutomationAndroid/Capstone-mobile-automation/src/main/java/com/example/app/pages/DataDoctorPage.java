package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.General;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DataDoctorPage extends BasePageObject {
    By textDataNotFound() {return MobileBy.AccessibilityId("1");}
    By buttonAddDoctor() {return MobileBy.AccessibilityId("Tambah Data");}
    By fieldSearch() {return MobileBy.xpath("//android.widget.EditText");}
    By textMessageDelete() {return MobileBy.AccessibilityId("Hapus Data Dokter");}
    By buttonDelete() {return MobileBy.AccessibilityId("HAPUS");}
    By buttonCancel() {return MobileBy.AccessibilityId("BATAL");}
    By buttonSave() {return MobileBy.AccessibilityId("SIMPAN");}
    By fieldFullName() {return By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");}
    By fieldNpaIdi() {return By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");}
    By fieldSpesialis() {return By.xpath("//android.widget.ScrollView/android.widget.EditText[3]");}
    By fieldUsername() {return By.xpath("//android.widget.ScrollView/android.widget.EditText[4]");}
    By fieldPassword() {return By.xpath("//android.widget.ScrollView/android.widget.EditText[5]");}
    By fieldConfirmPassword() {return By.xpath("//android.widget.ScrollView/android.widget.EditText[6]");}
    By buttonBack() {return MobileBy.xpath("//android.view.View/android.widget.Button");}
    By errorFullName() {return MobileBy.AccessibilityId("Nama Lengkap Tidak Boleh Kosong!");}
    By errorNpaIdi() {return MobileBy.AccessibilityId("NPA ID Tidak Boleh Kosong!");}
    By errorSpesialis() {return MobileBy.AccessibilityId("Spesialis Tidak Boleh Kosong!");}
    By errorUsername() {return MobileBy.AccessibilityId("Username Tidak Boleh Kosong!");}
    By errorEditUsername() {return MobileBy.AccessibilityId("Username Tidak Boleh Kosong!");}
    By errorLimitUsername() {return MobileBy.AccessibilityId("Username Minimal 8 Karakter!");}
    By errorPassword() {return MobileBy.AccessibilityId("Kata Sandi Tidak Boleh Kosong!");}
    By errorNewPassword() {return MobileBy.AccessibilityId("Kata Sandi Baru Tidak Boleh Kosong!");}
    By errorConfirmPassword() {return MobileBy.AccessibilityId("Konfirmasi Kata Sandi Tidak Boleh Kosong!");}
    By errorNewConfirmPassword() {return MobileBy.AccessibilityId("Konfirmasi Kata Sandi Baru Tidak Boleh Kosong!");}
    By errorLimitPassword() {return MobileBy.AccessibilityId("Kata Sandi Minimal 8 Karakter!");}
    By errorNewLimitPassword() {return MobileBy.AccessibilityId("Kata Sandi Baru Minimal 8 Karakter!");}
    By errorNewLimitConfirmPassword() {return MobileBy.AccessibilityId("Konfirmasi Kata Sandi Baru Minimal 8 Karakter!");}
    By errorNotSamePass() {return MobileBy.AccessibilityId("Password Harus Sama");}
    By textAddDataDoctor() {return MobileBy.AccessibilityId("Tambah Data Dokter");}
    By textSuccessAddDoctor() {return MobileBy.AccessibilityId("Berhasil Menambahkan Data");}
    By textDetailDataDoctor() {return MobileBy.AccessibilityId("Detail Data Dokter");}
    By buttonClose() {return MobileBy.AccessibilityId("CLOSE");}
    By buttonTrash() {return MobileBy.xpath("//android.view.View[@content-desc]/android.widget.Button[2]");}
    By buttonInformation() {return MobileBy.xpath("//android.view.View[@content-desc]/android.widget.Button[1]");}
    By buttonEditDoctor() {return MobileBy.AccessibilityId("EDIT DOKTER");}
    By textEditDataDoctor() {return MobileBy.AccessibilityId("Edit Data Dokter");}
    By textSuccessEditDoctor() {return MobileBy.AccessibilityId("Berhasil Mengedit Data");}
    By textSuccessDeleteDoctor() {return MobileBy.AccessibilityId("Berhasil Menghapus Data");}
    By textListDoctor() {return MobileBy.xpath("//android.view.View[@content-desc]");}


    public void clickButtonAddDoctor(){click(buttonAddDoctor());}
    public void clickButtonDelete(){
        click(buttonDelete());
    }
    public void clickButtonCancel(){
        click(buttonCancel());
    }
    public void clickButtonSave(){click(buttonSave());}
    public void clickButtonBack(){click(buttonBack());}
    public void clickButtonInformation(){click(buttonInformation());}
    public void clickButtonEditDoctor(){
        click(buttonEditDoctor());
    }
    public void clickButtonClose(){
        click(buttonClose());
    }
    public void clickButtonTrash(){
        click(buttonTrash());
    }


    public void inputFullName(String fullName) throws InterruptedException {
        onWait();
        click(fieldFullName());
        Thread.sleep(30,100);
        sendClear(fieldFullName());
        Thread.sleep(30,100);
        if (fullName.equals("newName")){
            sendKeys(fieldFullName(),General.randomNameDoctor(fullName));
        } else {
            sendKeys(fieldFullName(), fullName);
        }
    }
    public void inputNpaIdi(String npaIdi) throws InterruptedException {
        onWait();
        click(fieldNpaIdi());
        Thread.sleep(30,100);
        sendClear(fieldNpaIdi());
        Thread.sleep(30,100);
        if (npaIdi.equals("newNpa")){
            sendKeys(fieldNpaIdi(),General.randomNpaIdi(npaIdi));
        } else {
            sendKeys(fieldNpaIdi(),npaIdi);
        }
    }
    public void inputSpesialis(String spesialis) throws InterruptedException {
        onWait();
        click(fieldSpesialis());
        Thread.sleep(30,100);
        sendClear(fieldSpesialis());
        Thread.sleep(30,100);
        sendKeys(fieldSpesialis(), spesialis);
    }
    public void inputUsername(String username) throws InterruptedException {
        onWait();
        click(fieldUsername());
        Thread.sleep(30,100);
        sendClear(fieldUsername());
        Thread.sleep(30,100);
        if (username.equals("newUser")){
            sendKeys(fieldUsername(),General.randomUsername(username));
        } else {
            sendKeys(fieldUsername(),username);
        }
    }
    public void inputPassword(String password) throws InterruptedException {
        onWait();
        click(fieldPassword());
        Thread.sleep(30,100);
        sendClear(fieldPassword());
        Thread.sleep(30,100);
        sendKeys(fieldPassword(), password);
    }
    public void inputConfirmPassword(String confirmPass) throws InterruptedException {
        onWait();
        click(fieldConfirmPassword());
        Thread.sleep(30,100);
        sendClear(fieldConfirmPassword());
        Thread.sleep(30,100);
        sendKeys(fieldConfirmPassword(), confirmPass);
    }
    public void inputSearching(String search) throws InterruptedException {
        onWait();
        click(fieldSearch());
        Thread.sleep(30,100);
        sendKeys(fieldSearch(), search);
    }

    public void verifyErrorFullNameDisplayed() {
        Assertions.assertTrue(isDisplayed(errorFullName()));
    }
    public void verifyErrorNpaIdiDisplayed() {
        Assertions.assertTrue(isDisplayed(errorNpaIdi()));
    }
    public void verifyErrorSpesialisDisplayed() {
        Assertions.assertTrue(isDisplayed(errorSpesialis()));
    }
    public void verifyErrorUsernameDisplayed() {
        Assertions.assertTrue(isDisplayed(errorUsername()));
    }
    public void verifyErrorEditUsernameDisplayed() {
        Assertions.assertTrue(isDisplayed(errorEditUsername()));
    }
    public void verifyErrorLimitUsernameDisplayed() {
        Assertions.assertTrue(isDisplayed(errorLimitUsername()));
    }
    public void verifyErrorPasswordDisplayed() {
        Assertions.assertTrue(isDisplayed(errorPassword()));
    }
    public void verifyErrorNewPasswordDisplayed() {
        Assertions.assertTrue(isDisplayed(errorNewPassword()));
    }
    public void verifyErrorLimitPasswordDisplayed() {
        Assertions.assertTrue(isDisplayed(errorLimitPassword()));
    }
    public void verifyErrorNewLimitPasswordDisplayed() {
        Assertions.assertTrue(isDisplayed(errorNewLimitPassword()));
    }
    public void verifyErrorNewLimitConfirmPasswordDisplayed() {Assertions.assertTrue(isDisplayed(errorNewLimitConfirmPassword()));}
    public void verifyErrorNotSamePassDisplayed() {
        Assertions.assertTrue(isDisplayed(errorNotSamePass()));
    }
    public void verifyErrorConfirmPasswordDisplayed() {
        Assertions.assertTrue(isDisplayed(errorConfirmPassword()));
    }
    public void verifyErrorNewConfirmPasswordDisplayed() {Assertions.assertTrue(isDisplayed(errorNewConfirmPassword()));}
    public void verifyTextDataNotFoundDisplayed(){Assertions.assertTrue(find(textDataNotFound()).isDisplayed());}
    public void verifyTextMessageDeleteDisplayed(){Assertions.assertTrue(find(textMessageDelete()).isDisplayed());}
    public void verifyTextAddDataDoctorDisplayed(){Assertions.assertTrue(find(textAddDataDoctor()).isDisplayed());}
    public void verifyTextAddSuccessDoctorDisplayed(){Assertions.assertTrue(find(textSuccessAddDoctor()).isDisplayed());}
    public void verifyTextEditSuccessDoctorDisplayed(){Assertions.assertTrue(find(textSuccessEditDoctor()).isDisplayed());}
    public void verifyTextDeleteSuccessDoctorDisplayed(){Assertions.assertTrue(find(textSuccessDeleteDoctor()).isDisplayed());}
    public void verifyTextDetailDataDoctorDisplayed(){Assertions.assertTrue(find(textDetailDataDoctor()).isDisplayed());}
    public void verifyTextEditDataDoctorDisplayed(){Assertions.assertTrue(find(textEditDataDoctor()).isDisplayed());}
    public void verifyTextListDoctorDisplayed(){Assertions.assertTrue(find(textListDoctor()).isDisplayed());}
    public void verifyButtonEditDoctorDisplayed(){Assertions.assertTrue(find(buttonEditDoctor()).isDisplayed());}

    public void verifyErrorFullNameEqual(){Assertions.assertEquals("", getText(errorFullName()));}
    public void verifyErrorNpaIdiEqual(){Assertions.assertEquals("", getText(errorNpaIdi()));}
    public void verifyErrorSpesialisEqual(){
        Assertions.assertEquals("", getText(errorSpesialis()));
    }
    public void verifyErrorUsernameEqual(){Assertions.assertEquals("", getText(errorUsername()));}
    public void verifyErrorEditUsernameEqual(){Assertions.assertEquals("", getText(errorEditUsername()));}
    public void verifyErrorLimitUsernameEqual(){Assertions.assertEquals("", getText(errorLimitUsername()));}
    public void verifyErrorPasswordEqual(){
        Assertions.assertEquals("", getText(errorPassword()));
    }
    public void verifyErrorNewPasswordEqual(){
        Assertions.assertEquals("", getText(errorNewPassword()));
    }
    public void verifyErrorLimitPasswordEqual(){Assertions.assertEquals("", getText(errorLimitPassword()));}
    public void verifyErrorConfirmPasswordEqual(){
        Assertions.assertEquals("", getText(errorConfirmPassword()));
    }
    public void verifyErrorNewConfirmPasswordEqual(){Assertions.assertEquals("", getText(errorNewConfirmPassword()));}
    public void verifyErrorNotSamePassEqual(){Assertions.assertEquals("", getText(errorNotSamePass()));}
}
