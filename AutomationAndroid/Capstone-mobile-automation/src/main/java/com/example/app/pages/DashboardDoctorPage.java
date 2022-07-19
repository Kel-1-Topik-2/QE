package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DashboardDoctorPage extends BasePageObject {
    By textMeeting() {return MobileBy.AccessibilityId("Lihat Selengkapnya");}
    By textSuccessLogin() {return MobileBy.AccessibilityId("Login Success");}
    By buttonSideBarLogoutDoctor() {return MobileBy.AccessibilityId("Show menu");}
    By buttonLogoutDoctor() {return MobileBy.AccessibilityId("Logout");}
    By buttonClose() {return MobileBy.AccessibilityId("CLOSE");}
    By buttonViewMore() {return MobileBy.AccessibilityId("Lihat Selengkapnya");}

    public void verifyMeetingDisplayed(){
        Assertions.assertTrue(find(textMeeting()).isDisplayed());
    }
    public void verifyLoginSuccessDisplayed(){
        Assertions.assertTrue(find(textSuccessLogin()).isDisplayed());
    }
    public void clickButtonLogout(){
        click(buttonLogoutDoctor());
    }
    public void clickButtonShowMenu(){
        click(buttonSideBarLogoutDoctor());
    }
    public void clickButtonClose(){
        click(buttonClose());
    }
    public void clickButtonViewMore(){
        click(buttonViewMore());
    }
    public void verifyMeetingEqual(){
        Assertions.assertEquals("", getText(textMeeting()));
    }



}
