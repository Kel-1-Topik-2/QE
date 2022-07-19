package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.General;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DataPatientPage extends BasePageObject {
    By textDataNotFound() {return MobileBy.AccessibilityId("1");}
    By buttonAddPatient() {return MobileBy.AccessibilityId("Tambah Data");}
    By fieldSearch() {return MobileBy.xpath("//android.widget.EditText");}
    By textMessageDelete() {return MobileBy.AccessibilityId("Hapus Data Pasien");}
    By buttonDelete() {return MobileBy.AccessibilityId("HAPUS");}
    By buttonCancel() {return MobileBy.AccessibilityId("BATAL");}
    By buttonSave() {return MobileBy.AccessibilityId("SIMPAN");}
    By fieldFullName() {return By.xpath("//android.widget.EditText[1]");}
    By fieldNumberPhone() {return By.xpath("//android.widget.EditText[2]");}
    By fieldNik() {return By.xpath("//android.widget.EditText[3]");}
    By fieldUsia() {return By.xpath("//android.widget.EditText[4]");}
    By fieldAddress() {return By.xpath("//android.widget.EditText[5]");}
    By buttonMan() {return MobileBy.xpath("//android.view.View[@content-desc=\"Laki laki\"]/android.widget.RadioButton");}
    By buttonWomen() {return MobileBy.xpath("//android.view.View[@content-desc=\"Perempuan\"]/android.widget.RadioButton");}
    By buttonBack() {return MobileBy.xpath("//android.view.View/android.widget.Button");}
    By errorFullName() {return MobileBy.AccessibilityId("Nama Lengkap Tidak Boleh Kosong!");}
    By errorNumberPhone() {return MobileBy.AccessibilityId("Nomor Handphone Tidak Boleh Kosong!");}
    By errorNik() {return MobileBy.AccessibilityId("NIK Tidak Boleh Kosong!");}
    By errorUsia() {return MobileBy.AccessibilityId("Usia Tidak Boleh Kosong!");}
    By errorAddress() {return MobileBy.AccessibilityId("Alamat Rumah Tidak Boleh Kosong!");}
    By textAddDataPatient() {return MobileBy.AccessibilityId("Tambah Data Pasien");}
    By textSuccessAddPatient() {return MobileBy.AccessibilityId("Berhasil Menambahkan Data");}
    By textDetailDataPatient() {return MobileBy.AccessibilityId("Detail Data Pasien");}
    By buttonClose() {return MobileBy.AccessibilityId("CLOSE");}
    By buttonTrash() {return MobileBy.xpath("//android.view.View[@content-desc]/android.widget.Button[2]");}
    By buttonInformation() {return MobileBy.xpath("//android.view.View[@content-desc]/android.widget.Button[1]");}
    By buttonEditPatient() {return MobileBy.AccessibilityId("EDIT PASIEN");}
    By textEditDataPatient() {return MobileBy.AccessibilityId("Edit Data Pasien");}
    By textFailedAddPatient() {return MobileBy.AccessibilityId("Tambah Pasien gagal");}
    By textSuccessEditPatient() {return MobileBy.AccessibilityId("Berhasil Mengubah Data");}
    By textSuccessDeletePatient() {return MobileBy.AccessibilityId("Berhasil Menghapus Data");}
    By textListPatient() {return MobileBy.xpath("//android.view.View[@content-desc]");}

    public void clickButtonAddPatient(){click(buttonAddPatient());}
    public void clickButtonDelete(){
        click(buttonDelete());
    }
    public void clickButtonCancel(){
        click(buttonCancel());
    }
    public void clickButtonSave(){click(buttonSave());}
    public void clickButtonMan(){
        click(buttonMan());
    }
    public void clickButtonWomen(){
        click(buttonWomen());
    }
    public void clickButtonBack(){click(buttonBack());}
    public void clickButtonInformation(){click(buttonInformation());}
    public void clickButtonEditPatient(){
        click(buttonEditPatient());
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
        if (fullName.equals("newPatient")){
            sendKeys(fieldFullName(), General.randomName(fullName));
        } else {
            sendKeys(fieldFullName(),fullName);
        }
    }
    public void inputNumberPhone(String numberPhone) throws InterruptedException {
        onWait();
        click(fieldNumberPhone());
        Thread.sleep(30,100);
        sendClear(fieldNumberPhone());
        Thread.sleep(30,100);
        if (numberPhone.equals("newPhone")){
            sendKeys(fieldNumberPhone(),General.randomPhone(numberPhone));
        } else {
            sendKeys(fieldNumberPhone(),numberPhone);
        }
    }
    public void inputNik(String nik) throws InterruptedException {
        onWait();
        click(fieldNik());
        Thread.sleep(30,100);
        sendClear(fieldNik());
        Thread.sleep(30,100);
        if (nik.equals("newNik")){
            sendKeys(fieldNik(),General.randomNik(nik));
        } else {
            sendKeys(fieldNik(),nik);
        }
    }
    public void inputUsia(String usia) throws InterruptedException {
        onWait();
        click(fieldUsia());
        Thread.sleep(30,100);
        sendClear(fieldUsia());
        Thread.sleep(30,100);
        if (usia.equals("newUsia")){
            sendKeys(fieldUsia(),General.randomUmur(usia));
        } else {
            sendKeys(fieldUsia(),usia);
        }
    }
    public void inputAddress(String address) throws InterruptedException {
        onWait();
        click(fieldAddress());
        Thread.sleep(30,100);
        sendClear(fieldAddress());
        Thread.sleep(30,100);
        if (address.equals("newAddress")){
            sendKeys(fieldAddress(),General.randomAddress(address));
        } else {
            sendKeys(fieldAddress(),address);
        }
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
    public void verifyErrorNumberPhoneDisplayed() {
        Assertions.assertTrue(isDisplayed(errorNumberPhone()));
    }
    public void verifyErrorNikDisplayed() {
        Assertions.assertTrue(isDisplayed(errorNik()));
    }
    public void verifyErrorUsiaDisplayed() {
        Assertions.assertTrue(isDisplayed(errorUsia()));
    }
    public void verifyErrorAddressDisplayed() {
        Assertions.assertTrue(isDisplayed(errorAddress()));
    }
    public void verifyTextDataNotFoundDisplayed(){Assertions.assertTrue(find(textDataNotFound()).isDisplayed());}
    public void verifyTextMessageDeleteDisplayed(){Assertions.assertTrue(find(textMessageDelete()).isDisplayed());}
    public void verifyTextAddDataPatientDisplayed(){Assertions.assertTrue(find(textAddDataPatient()).isDisplayed());}
    public void verifyTextAddSuccessPatientDisplayed(){Assertions.assertTrue(find(textSuccessAddPatient()).isDisplayed());}
    public void verifyTextEditSuccessPatientDisplayed(){Assertions.assertTrue(find(textSuccessEditPatient()).isDisplayed());}
    public void verifyTextDeleteSuccessPatientDisplayed(){Assertions.assertTrue(find(textSuccessDeletePatient()).isDisplayed());}
    public void verifyTextDetailDataPatientDisplayed(){Assertions.assertTrue(find(textDetailDataPatient()).isDisplayed());}
    public void verifyTextEditDataPatientDisplayed(){Assertions.assertTrue(find(textEditDataPatient()).isDisplayed());}
    public void verifyTextFailedAddPatientDisplayed(){Assertions.assertTrue(find(textFailedAddPatient()).isDisplayed());}
    public void verifyTextListPatientDisplayed(){Assertions.assertTrue(find(textListPatient()).isDisplayed());}

    public void verifyErrorFullNameEqual(){Assertions.assertEquals("", getText(errorFullName()));}
    public void verifyErrorNumberPhoneEqual(){Assertions.assertEquals("", getText(errorNumberPhone()));}
    public void verifyErrorNikEqual(){
        Assertions.assertEquals("", getText(errorNik()));
    }
    public void verifyErrorUsiaEqual(){Assertions.assertEquals("", getText(errorUsia()));}
    public void verifyErrorAddressEqual(){
        Assertions.assertEquals("", getText(errorAddress()));
    }
}
