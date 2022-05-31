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
    private By loginPage() {
        return By.xpath("//*[@class=\"v-main\"]/div/div/div/div");
    }

    @Step
    public void openLoginPage() {
        openAt("/auth/login");
    }
    @Step
    public void inputEmailLogin(String emailLogin) {
        $(emailFieldLogin()).type(emailLogin);
    }
    @Step
    public void inputPasswordLogin(String passwordLogin) {
        $(passwordFieldLogin()).type(passwordLogin);
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
    @Step
    public boolean validateOnLoginPage() {
        return $(loginPage()).isDisabled();
    }
    @Step
    public boolean loginInvalidPassword() {
        return $(errorMessager()).isDisabled();
    }
    @Step
    public boolean validateEqualErrorPassword(String errorpassword){
        return $(errorMessager()).getText().equalsIgnoreCase(errorpassword);
    }
}
