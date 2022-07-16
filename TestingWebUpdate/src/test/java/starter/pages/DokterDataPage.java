package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DokterDataPage extends PageObject {
    private By categoryNama() {
        return By.xpath("//*[@value=\"namadokter\"]");
    }
    private By namaDokter() {
        return By.xpath("//*[@name=\"namadokter\"]");
    }
    private By idiDokter() {
        return By.xpath("//*[@name=\"srp\"]");
    }
    private By spesialisDokter() {
        return By.xpath("//*[@name=\"spesialis\"]");
    }
    private By usernameDokter() {
        return By.xpath("//*[@name=\"username\"]");
    }
    private By passDokter() {
        return By.xpath("//*[@name=\"password\"]");
    }
    private By validPassDokter() {
        return By.xpath("//*[@name=\"confirmpassword\"]");
    }
    private By validTextError() {
        return By.xpath("//*[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation4 css-ao8rxk\"]");
    }
    @Step
    public void inputDataDokter(String namadokter, String idi, String spesialis,  String username, String pass, String confirmpass) {
        $(namaDokter()).sendKeys(namadokter);
        $(idiDokter()).sendKeys(idi);
        $(spesialisDokter()).sendKeys(spesialis);
        $(usernameDokter()).sendKeys(username);
        $(passDokter()).sendKeys(pass);
        $(validPassDokter()).sendKeys(confirmpass);
    }
    @Step
    public void inputDataDokterEdit(String namadokter, String idi, String spesialis,  String username, String pass, String confirmpass) {
        $(namaDokter()).sendKeys(namadokter, Keys.chord(Keys.CONTROL, "a"));
        $(namaDokter()).sendKeys(namadokter);
        $(idiDokter()).sendKeys(idi, Keys.chord(Keys.CONTROL, "a"));
        $(idiDokter()).sendKeys(idi);
        $(spesialisDokter()).sendKeys(spesialis, Keys.chord(Keys.CONTROL, "a"));
        $(spesialisDokter()).sendKeys(spesialis);
        $(usernameDokter()).sendKeys(username, Keys.chord(Keys.CONTROL, "a"));
        $(usernameDokter()).sendKeys(username);
        $(passDokter()).sendKeys(pass, Keys.chord(Keys.CONTROL, "a"));
        $(passDokter()).sendKeys(pass);
        $(validPassDokter()).sendKeys(confirmpass, Keys.chord(Keys.CONTROL, "a"));
        $(validPassDokter()).sendKeys(confirmpass);
    }
    @Step
    public boolean validateTextMessegerDokter(String text) {
        return $(validTextError()).getText().equalsIgnoreCase(text);
    }
    @Step
    public void clickNamaDokter() {
        $(categoryNama()).click();
    }
}
