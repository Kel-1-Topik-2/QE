package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DokterDataPage extends PageObject {
    private By namaDokter() {
        return By.xpath("//*[@name=\"nama\"]");
    }
    private By idiDokter() {
        return By.xpath("//*[@name=\"npa\"]");
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
    private By validTextError() {
        return By.xpath("");
    }

    @Step
    public void inputDataDokter(String namadokter, String idi, String spesialis,  String username, String pass) {
        $(namaDokter()).sendKeys(namadokter);
        $(idiDokter()).sendKeys(idi);
        $(spesialisDokter()).sendKeys(spesialis);
        $(usernameDokter()).sendKeys(username);
        $(passDokter()).sendKeys(pass);
    }
    @Step
    public void inputDataDokterEdit(String namadokter, String idi, String spesialis,  String username, String pass) {
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
    }
    @Step
    public boolean validateTextMessegerDokter(String text) {
        return $(validTextError()).getText().equalsIgnoreCase(text);
    }
}
