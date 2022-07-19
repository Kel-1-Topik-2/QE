package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ArchiveSchedulePage extends BasePageObject {
    By textDataNotFound() {return MobileBy.AccessibilityId("1");}
    By buttonAksi() {return MobileBy.xpath("(//android.widget.Button[@content-desc])[2]");}
    By textListArchiveSchedule() {return MobileBy.xpath("//android.view.View[@content-desc]");}
    By fieldSearch() {return MobileBy.xpath("//android.widget.EditText");}
    By textReview() {return MobileBy.AccessibilityId("Review");}

    public void inputSearching(String search) throws InterruptedException {
        onWait();
        click(fieldSearch());
        Thread.sleep(30,100);
        sendKeys(fieldSearch(), search);
    }
    public void clickButtonAksi(){
        click(buttonAksi());
    }
    public void verifyTextDataNotFoundDisplayed(){
        Assertions.assertTrue(find(textDataNotFound()).isDisplayed());}
    public void verifyTextListArchiveScheduleDisplayed(){Assertions.assertTrue(find(textListArchiveSchedule()).isDisplayed());}
}
