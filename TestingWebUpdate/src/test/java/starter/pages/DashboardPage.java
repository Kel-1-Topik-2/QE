package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By viewPageDashbord() {
        return By.xpath("//*[@class=\"style_container__2YNFk\"]/table");
    }
    private By buttonDashbord() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[1]");
    }
    private By buttonDataPasien() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[2]");
    }
    private By buttonDataDokter() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[3]");
    }
    private By buttonKelolaJadwal() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[4]");
    }
    private By buttonArsipJadwal() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[5]");
    }
    private By buttonLogout() {
        return By.xpath("//*[@class=\"style_navigation_container__3kZQj\"]/ul/a[6]");
    }
    private By buttonLogoutYes() {
        return By.xpath("//*[@class=\"swal2-actions\"]/button[1]");
    }
    private By buttonLogoutNo() {
        return By.xpath("//*[@class=\"swal2-actions\"]/button[3]");
    }
    @Step
    public void openDashbord() {
        open();
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
    @Step
    public void clickButtonLogoutAccountYes() {
        $(buttonLogoutYes()).click();
    }
    @Step
    public void clickButtonLogoutAccountNo() {
        $(buttonLogoutNo()).click();
    }
}
