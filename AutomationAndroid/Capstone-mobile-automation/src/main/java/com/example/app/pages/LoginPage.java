package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject{
    By textWelcome() {return MobileBy.AccessibilityId("Selamat Datang Kembali!");}
    By buttonRole() {return MobileBy.AccessibilityId("Pilih Role");}
    By buttonAdmin() {return MobileBy.AccessibilityId("Admin");}
    By buttonDoctor() {return MobileBy.AccessibilityId("Doctor");}
    By fieldUsername() {return By.xpath("//android.widget.EditText[1]");}
    By fieldPassword() {return By.xpath("//android.widget.EditText[2]");}
    By buttonLogin() {return MobileBy.AccessibilityId("Login");}
    By errorUsername() {return MobileBy.AccessibilityId("Username Can't Be Empty!");}
    By errorPassword() {return MobileBy.AccessibilityId("Password Can't Be Empty!");}
    By textLoginFailed() {return MobileBy.AccessibilityId("Login Failed!");}
    By buttonClose() {return MobileBy.AccessibilityId("CLOSE");}

    public void clickButtonRole(){
        click(buttonRole());
    }
    public void clickButtonAdmin(){
        click(buttonAdmin());
    }
    public void clickButtonDoctor(){
        click(buttonDoctor());
    }
    public void clickButtonUsername(){
        click(fieldUsername());
    }
    public void clickButtonPassword(){
        click(fieldPassword());
    }
    public void inputUsername(String username) throws InterruptedException {
        onWait();
        click(fieldUsername());
        Thread.sleep(30,100);
        sendKeys(fieldUsername(),username);
    }
    public void inputPassword(String password) throws InterruptedException {
        onWait();
        click(fieldPassword());
        Thread.sleep(30,100);
        sendKeys(fieldPassword(), password);
    }
    public void clickButtonLogin(){
        click(buttonLogin());
    }
    public void clickButtonClose(){
        click(buttonClose());
    }
    public void verifyErrorUsernameDisplayed() {
        Assertions.assertTrue(isDisplayed(errorUsername()));
    }
    public void verifyErrorPasswordDisplayed() {
        Assertions.assertTrue(isDisplayed(errorPassword()));
    }
    public void verifyLoginFailedDisplayed() {
        Assertions.assertTrue(isDisplayed(textLoginFailed()));
    }
    public void verifyTextWelcomeDisplayed(){Assertions.assertTrue(find(textWelcome()).isDisplayed());}
    public void verifyErrorUsernameEqual(){
        Assertions.assertEquals("", getText(errorUsername()));
    }
    public void verifyErrorPasswordEqual(){
        Assertions.assertEquals("", getText(errorPassword()));
    }
    public void verifyLoginFailedEqual(){
        Assertions.assertEquals("", getText(textLoginFailed()));
    }
}
