package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By viewPageDashbord() {
        return By.xpath("//*[@class=\"style_container__2YNFk\"]/table");
    }
    private By buttonDashbord() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[1]/img");
    }
    private By buttonDataPasien() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[2]/img");
    }
    private By buttonDataDokter() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[3]/img");
    }
    private By buttonKelolaJadwal() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[4]/img");
    }
    private By buttonArsipJadwal() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[5]/img");
    }
    private By buttonLogout() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[6]/img");
    }
    @Step
    public void openDashbord() {
        open();
    }
    @Step
    public void openLogin() {
        openAt("/login");
    }
    @Step
    public void openDataPasien() {
        openAt("/data-pasien");
    }
    @Step
    public void openDataDokter() {
        openAt("/data-dokter");
    }
    @Step
    public void openKelolaJadwal() {
        openAt("/kelola-jadwal");
    }
    @Step
    public void openArsipJadwal() {
        openAt("/arsip-jadwal");
    }
    @Step
    public boolean validViewDashbord() {
        return $(viewPageDashbord()).isDisabled();
    }
    @Step
    public void clickButtonDashbord() {
        $(buttonDashbord()).click();
    }
    @Step
    public void clickButtonDataPasien() {
        $(buttonDataPasien()).click();
    }
    @Step
    public void clickButtonDataDokter() {
        $(buttonDataDokter()).click();
    }
    @Step
    public void clickButtonKelolaJadwal() {
        $(buttonKelolaJadwal()).click();
    }
    @Step
    public void clickButtonArsipJadwal() {
        $(buttonArsipJadwal()).click();
    }
    @Step
    public void clickButtonLogoutAccount() {
        $(buttonLogout()).click();
    }
}
