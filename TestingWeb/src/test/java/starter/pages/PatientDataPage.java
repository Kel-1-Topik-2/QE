package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PatientDataPage extends PageObject {

    private By allCategory() {
        return By.xpath("//*[@id=\"filter\"]/option[1]");
    }
    private By categoryNamaLengkap() {
        return By.xpath("//*[@id=\"filter\"]/option[3]");
    }
    private By inputCategory() {
        return By.xpath("//*[@class=\"style_containerSearch__3p2Yu\"]/input");
    }
    private By pagePasien() {
        return By.xpath("//*[@class=\"style_container__2YNFk\"]/table/thead/tr/td[1]");
    }
    private By buttonTambah() {
        return By.xpath("//*[@type=\"submit\"]");
    }
    private By fldNama() {
        return By.xpath("//*[@name=\"nama\"]");
    }
    private By fldNomor() {
        return By.xpath("//*[@name=\"telp\"]");
    }
    private By fldNik() {
        return By.xpath("//*[@name=\"nik\"]");
    }
    private By fldUsia() {
        return By.xpath("//*[@name=\"usia\"]");
    }
    private By fldAlamat() {
        return By.xpath("//*[@name=\"alamat\"]");
    }
    private By jLaki() {
        return By.xpath("//*[@class=\"MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42\"]/div[5]/div/div/label[1]/span");
    }
    private By jPerempuan() {
        return By.xpath("//*[@class=\"MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42\"]/div[5]/div/div/label[2]/span");
    }
    private By simpan() {
        return By.xpath("//*[@type=\"submit\"]");
    }
    private By validDataPasien() {
        return By.xpath("//*[@class=\"MuiBox-root css-1ea6u22\"]/div");
    }
    private By tempatsampah() {
        return By.xpath("//*[@class=\"style_aksi__3Lc-v\"]/img[2]");
    }
    private By deleteYa() {
        return By.xpath("");
    }
    private By deleteTidak() {
        return By.xpath("");
    }
    private By detail() {
        return By.xpath("//*[@class=\"style_aksi__3Lc-v\"]/img[1]");
    }
    private By editDataPasien() {
        return By.xpath("//*[@class=\"MuiGrid-root MuiGrid-container css-if0jla\"]/button");
    }
    private By buttonBack(){
        return By.xpath("//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"]");
    }
    @Step
    public void clickButtonTambah() {
        $(buttonTambah()).click();
    }

    @Step
    public boolean validPagePasien() {
        return  $(pagePasien()).isDisabled();
    }
    @Step
    public boolean checkValidDataPasien() {
        return  $(validDataPasien()).isDisabled();
    }
    @Step
    public void inputDataPasien(String namalengkap, String nik, String usia,  String nomortelepon, String alamat){
        $(fldNama()).sendKeys(namalengkap);
        $(fldNik()).sendKeys(nik);
        $(fldUsia()).sendKeys(usia);
        $(fldNomor()).sendKeys(nomortelepon);
        $(fldAlamat()).sendKeys(alamat);
    }
    @Step
    public void inputDataPasienEdit(String namalengkap, String nik, String usia,  String nomortelepon, String alamat) {
        $(fldNama()).sendKeys(namalengkap, Keys.chord(Keys.CONTROL, "a"));
        $(fldNama()).sendKeys(namalengkap);
        $(fldNik()).sendKeys(nik, Keys.chord(Keys.CONTROL, "a"));
        $(fldNik()).sendKeys(nik);
        $(fldNomor()).sendKeys(nomortelepon, Keys.chord(Keys.CONTROL, "a"));
        $(fldNomor()).sendKeys(nomortelepon);
        $(fldAlamat()).sendKeys(alamat, Keys.chord(Keys.CONTROL, "a"));
        $(fldAlamat()).sendKeys(alamat);
        $(fldUsia()).sendKeys(usia, Keys.chord(Keys.CONTROL, "a"));
        $(fldUsia()).sendKeys(usia);
    }
    @Step
    public void clickLaki(){
        $(jLaki()).click();
    }
    @Step
    public void clickPerempuan(){
        $(jPerempuan()).click();
    }
    @Step
    public void clickButtonSave(){
        $(simpan()).click();
    }
    @Step
    public void clickButtonSampah(){
        $(tempatsampah()).click();
    }
    @Step
    public void clickButtonDeleteYa(){
        $(deleteYa()).click();
    }
    @Step
    public void clickButtonDeleteTidak(){
        $(deleteTidak()).click();
    }
    @Step
    public void clickButtonDetail(){
        $(detail()).click();
    }
    @Step
    public void clickButtonEditDataPasien(){
        $(editDataPasien()).click();
    }
    @Step
    public void clickButtonBack(){
        $(buttonBack()).click();
    }
    @Step
    public void clickButtonAllCategory(){
        $(allCategory()).click();
    }
    @Step
    public void clickButtonChooseCategoryNama(){
        $(categoryNamaLengkap()).click();
    }
    @Step
    public void inputDataCategory(String data){
        $(inputCategory()).type(data);
    }
}
