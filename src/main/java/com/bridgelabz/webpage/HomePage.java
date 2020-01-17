package com.bridgelabz.webpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//*[@name='xhpc_message']")
    private WebElement clickOnPostDialogBox;

    @FindBy(xpath = "//div[@class='_1mf _1mj']")
    private WebElement inputStatus;

    //@FindBy(xpath ="//div[@id='userNavigationLabel']")
    @FindBy(id="userNavigationLabel")
    private WebElement SettingTab;

    @FindBy(xpath="//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem]")
    private WebElement LogoutBtn;

   /* @FindBy(xpath= "//input[@class='_n _5f0v' and @name='composer_photo[]']")
    private WebElement photoVideoBtn;*/
/*
    @FindBy(xpath = "//div[@class='clearfix _ikh']")
    private WebElement photoUploadButton;*/

    @FindBy(xpath= "//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")
    private WebElement postBottom;


    @FindBy(xpath= "//*[@id=\"js_7q\"]")
    private WebElement photoVideoBtn;

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

    public void getSettingTab(){ SettingTab.click(); }

    public void Logout() {LogoutBtn.click();}
/*
    public void uploadImage(){

        photoUploadButton.click();
    }
*/

   /* public void clickPhotoVideo() {
        photoVideoBtn.click();
    }*/
   /* @FindBy(xpath= "//input[@class='_n _5f0v' and @name='composer_photo[]']")
    private WebElement photoVideoBtn;*/
/*
    @FindBy(xpath = "//div[@class='clearfix _ikh']")
    private WebElement photoUploadButton;*/

    public void postBottom() {
        postBottom.click();
    }


   // driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
    //    Thread.sleep(5000);
     //   driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")).click();
}
