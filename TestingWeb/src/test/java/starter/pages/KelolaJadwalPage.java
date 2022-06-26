package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class KelolaJadwalPage extends PageObject {
    private By aksiPilih() {
        return By.xpath("//*[@class=\"style_container__2YNFk\"]/table/tbody/tr[3]/td[5]/div/img");
    }
    private By save() {
        return By.xpath("//*[@type=\"submit\"]");
    }
    private By back() {
        return By.xpath("//*[@type=\"button\"]");
    }
    private By tanggal() {
        return By.xpath("//*[@type=\"date\"]");
    }
    private By jenisPerawatan() {
        return By.xpath("//*[@class=\"style_input_container__2eLrm\"]/select");
    }
    private By rawatBiasa() {
        return By.xpath("//*[@value=\"Rawat_biasa\"]");
    }
    private By rawatJalan() {
        return By.xpath("//*[@value=\"Rawat_biasa\"]");
    }
    @Step
    public void buttonPilihPasien() {
        $(aksiPilih()).click();
    }
    @Step
    public void buttonPilihDokter() {
        $(aksiPilih()).click();
    }
    @Step
    public void inputTanggal(String tgl) {
        $(tanggal()).sendKeys(tgl);
    }
    @Step
    public void buttonJenisPerawatan() {
        $(jenisPerawatan()).click();
    }
    @Step
    public void buttonRawatBiasa() {
        $(rawatBiasa()).click();
    }
    @Step
    public void buttonRawatJalan() {
        $(rawatJalan()).click();
    }
    @Step
    public void buttonSave() {
        $(save()).click();
    }
    @Step
    public void buttonBack() {
        $(back()).click();
    }
}
