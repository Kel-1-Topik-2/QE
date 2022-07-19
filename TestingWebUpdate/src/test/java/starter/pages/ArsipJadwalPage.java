package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class ArsipJadwalPage extends PageObject {
    private By categoryNamaLengkapOnArsip() {
        return By.xpath("//*[@value=\"namapasien\"]");
    }
    private By buttonAksi() {
        return By.xpath("//*[@class=\"style_aksi__3Lc-v\"]/img");
    }
    private By reviewPage() {
        return By.xpath("//*[@class=\"style_rowDua__211Jn\"]");
    }
    @Step
    public void clickButtonChooseCategoryNamaOnArsip(){
        $(categoryNamaLengkapOnArsip()).click();
    }
    @Step
    public void clickIconAksiOnArsip() {
        $(buttonAksi()).click();
    }
    @Step
    public void validateOnReviewPage() {
        $(reviewPage()).isDisabled();
    }
}
