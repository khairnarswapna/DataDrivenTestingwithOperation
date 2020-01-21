package com.bridgelabz.webpage;
import com.sun.tools.javac.jvm.Profile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//*[@name='xhpc_message']")
    private WebElement clickOnPostDialogBox;

    @FindBy(xpath = "//div[@class='_1mf _1mj']")
    private WebElement inputStatus;

/*   //@FindBy(xpath ="//div[@id='userNavigationLabel']")
    @FindBy(className="_6a _6b uiPopover _1io_ _5v-0")
    private WebElement SettingTab;

    @FindBy(xpath="//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")
    private WebElement LogoutBtn;*/

    @FindBy(xpath= "//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")
    private WebElement postBottom;

    @FindBy(xpath= "//*[@id=\"js_7q\"]")
    private WebElement photoVideoBtn;

    @FindBy(xpath="//span[@xpath=\"1\"]")
    private WebElement ProfileTab;

    @FindBy(id="u_ps_fetchstream_3_5_4")
    private WebElement FBPostMenu;

    public void clickPhotoVideo() { photoVideoBtn.click(); }

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnPostDialogBox() {
        clickOnPostDialogBox.click();
    }

    public void input() {
        inputStatus.sendKeys("hi ,Uploading image for testing");
    }

    public void getProfileTab(){
        ProfileTab.click();
    }
    public void getFBPostMenu(){
        FBPostMenu.click();
    }
/*
    public void getSettingTab(){ SettingTab.click(); }

    public void Logout() {LogoutBtn.click();}*/

    public void postBottom() {
        postBottom.click();
    }


}
