package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ArsipJadwalPage extends PageObject {
    private By categoryNamaLengkapOnArsip() {
        return By.xpath("//*[@value=\"namaPasien\"]");
    }
    @Step
    public void clickButtonChooseCategoryNamaOnArsip(){
        $(categoryNamaLengkapOnArsip()).click();
    }
}
