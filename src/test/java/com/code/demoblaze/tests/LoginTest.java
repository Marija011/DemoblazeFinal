package com.code.demoblaze.tests;

import com.code.demoblaze.pages.MainPage;
import com.code.demoblaze.pages.ProductPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test (invocationCount = 1)
    public void verifyLoginUser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marija\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        MainPage mainPage = new MainPage(chromeDriver);
        mainPage.openPage();
        mainPage.LoginClick();
        mainPage.setUsername("MarijaM");
        mainPage.setPassword("marija123");
        mainPage.clickOnLogin();
        mainPage.closePage();

        ProductPage productPage = new ProductPage(chromeDriver);
        Assert.assertEquals(productPage.isDisplayed(), true);

    }
}
