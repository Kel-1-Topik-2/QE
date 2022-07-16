package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailFieldLogin() {
        return By.xpath("//*[@name=\"username\"]");
    }
    private By passwordFieldLogin() {
        return By.xpath("//*[@name=\"password\"]");
    }
    private By buttonLogin() {
        return By.xpath("//*[@type=\"submit\"]");
    }
    private By kosongErrorMessager() {
        return By.xpath("//*[@class=\"style_containerForm__N7MYO\"]");
    }
    private By invalidErrorMessager() {
        return By.xpath("//*[@role=\"dialog\"]");
    }
    private By buttonOkErrorMessager() {
        return By.xpath("//*[@class=\"swal2-actions\"]/button");
    }
//    private By pilihRole() {
//        return By.xpath("//*[@name=\"role\"]");
//    }
//    private By roleAdmin() {
//        return By.xpath("//*[@value=\"admin\"]");
//    }
//    private By roleDokter() {
//        return By.xpath("//*[@value=\"dokter\"]");
//    }

    @Step
    public void openLogin() {
        openAt("/login");
    }
    //    @Step
//    public void clickButtonRole() {
//        $(pilihRole()).click();
//    }
//    @Step
//    public void clickAdmin() {
//        $(roleAdmin()).click();
//    }
//    @Step
//    public void clickDokter() {
//        $(roleDokter()).click();
//    }
//    @Step
    public void inputEmailLogin(String usernameLogin) {
        $(emailFieldLogin()).sendKeys(usernameLogin);
    }
    @Step
    public void inputPasswordLogin(String passwordLogin) {
        $(passwordFieldLogin()).sendKeys(passwordLogin);
    }
    @Step
    public void clickButtonLogin() {
        $(buttonLogin()).click();
    }
    @Step
    public boolean loginTextError() {
        return $(kosongErrorMessager()).isDisabled();
    }
    public boolean loginInvalidError() {
        return $(invalidErrorMessager()).isDisabled();
    }
    @Step
    public void clickButtonErrorOK() {
        $(buttonOkErrorMessager()).click();
    }
}

