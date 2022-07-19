package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DashboardAdminPage extends BasePageObject {
    By textOverview() {return MobileBy.AccessibilityId("Overview");}
    By textSuccessLogin() {return MobileBy.AccessibilityId("Login Success");}
    By buttonPagePatient() {return MobileBy.AccessibilityId("Data Pasien");}
    By buttonPageDoctor() {return MobileBy.AccessibilityId("Data Dokter");}
    By buttonPageSchedule() {return MobileBy.AccessibilityId("Kelola Jadwal");}
    By buttonPageArchive() {return MobileBy.AccessibilityId("Arsip Jadwal");}
    By buttonLogoutAdmin() {return MobileBy.AccessibilityId("Logout");}
    By textUpdateListPatient() {return MobileBy.AccessibilityId("Data Pasien Terkini!");}
    By buttonClose() {return MobileBy.AccessibilityId("CLOSE");}

    public void verifyOverviewDisplayed(){
        Assertions.assertTrue(find(textOverview()).isDisplayed());
    }
    public void verifyLoginSuccessDisplayed(){
        Assertions.assertTrue(find(textSuccessLogin()).isDisplayed());
    }
    public void verifyButtonPatientDisplayed(){
        Assertions.assertTrue(find(buttonPagePatient()).isDisplayed());
    }
    public void verifyUpdateListPatientDisplayed(){Assertions.assertTrue(find(textUpdateListPatient()).isDisplayed());}
    public void verifyButtonLogoutDisplayed(){
        Assertions.assertTrue(find(buttonLogoutAdmin()).isDisplayed());
    }
    public void clickButtonPatient(){
        click(buttonPagePatient());
    }
    public void clickButtonDoctor(){
        click(buttonPageDoctor());
    }
    public void clickButtonSchedule(){
        click(buttonPageSchedule());
    }
    public void clickButtonArchive(){
        click(buttonPageArchive());
    }
    public void clickButtonLogout(){
        click(buttonLogoutAdmin());
    }
    public void clickButtonClose(){
        click(buttonClose());
    }
    public void verifyOverviewEqual(){
        Assertions.assertEquals("", getText(textOverview()));
    }
    public void verifyUpdateListPatientEqual(){
        Assertions.assertEquals("", getText(textUpdateListPatient()));
    }
}
