package com.bridgelabz.script;

import com.bridgelabz.webpage.HomePage;
import com.bridgelabz.webpage.LoginPage;
import com.bridgelabz.controller.BaseTest;
import com.bridgelabz.controller.ReadExcelFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class faceBookTest extends BaseTest {

    @DataProvider(name="testdata")
    public Object[][] TestDataFeed()
    {
        ReadExcelFile config = new ReadExcelFile("/home/admin1/IdeaProjects/TestingDemo/src/test/resources/FBTestFile1.xlsx");
        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows][2];


        for(int i=0;i<rows;i++)
        {
            credentials[i][0] = config.getData(0, i, 0);
            credentials[i][1] = config.getData(0, i, 1);
        }
        return credentials;
    }
    @Test(dataProvider="testdata")
    public void UserLogin(String email, String password1) throws InterruptedException, AWTException {
        LoginPage loginPage  = new LoginPage(driver);
        Robot robot=new Robot();
       // FacebookHomePage facebookHomePage= new FacebookHomePage(driver);

        HomePage homePage=new HomePage(driver);

        loginPage.setUsername(email);
        Thread.sleep(1000);
        loginPage.setPassword(password1);
        Thread.sleep(1000);
        loginPage.clickLogin();
         Thread.sleep(5000);

/*

        homePage.clickOnPostDialogBox();
        Thread.sleep(4000);
        homePage.input();
        Thread.sleep(4000);

        homePage.uploadImage();
        //Thread.sleep(2000);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);

        homePage.postBottom();
        Thread.sleep(2000);



*/

        homePage.clickOnPostDialogBox();
        Thread.sleep(4000);
       // Robot robot = new Robot();
        WebElement clickPhotoVideo = driver.findElement(By.xpath("//input[@class='_n _5f0v' and @name='composer_photo[]']"));
        robot.mouseMove(340, 510);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        for (int j = 0; j < 11; j++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        homePage.input();
        Thread.sleep(4000);

        homePage.postBottom();
        Thread.sleep(2000);




    }


}
