package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailFieldLogin() {
        return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
    }
    private By passwordFieldLogin() {
        return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
    }
    private By buttonLogin() {
        return By.xpath("//*[@class=\"text-center\"]/button");
    }
    private By errorMessager() {
        return By.xpath("//*[@class=\"v-card__text\"]/div/div/div");
    }
    private By pilihRole() {
        return By.xpath("");
    }
    private By roleAdmin() {
        return By.xpath("");
    }
    private By roleDokter() {
        return By.xpath("");
    }

    @Step
    public void clickButtonRole() {
        $(pilihRole()).click();
    }
    @Step
    public void clickAdmin() {
        $(roleAdmin()).click();
    }
    @Step
    public void clickDokter() {
        $(roleDokter()).click();
    }
    @Step
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
        return $(errorMessager()).isDisabled();
    }
    @Step
    public boolean validateEqualErrorText(String error){
        return $(errorMessager()).getText().equalsIgnoreCase(error);
    }
}

