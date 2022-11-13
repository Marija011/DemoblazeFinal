package com.code.demoblaze.tests;

import com.code.demoblaze.pages.MainPage;
import com.code.demoblaze.pages.ProductPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyLoginUser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marija\\Downloads\\chromedriver_win32\\chromedriver.exe");
        MainPage mainPage = new MainPage(new ChromeDriver());
        mainPage.openPage();
        mainPage.LoginClick();
        mainPage.setUsername("MarijaM");
        mainPage.setPassword("marija123");
        mainPage.clickOnLogin();
        mainPage.closePage();

        ProductPage productPage = new ProductPage(new ChromeDriver());
        Assert.assertEquals(productPage.isDisplayed(), false);

    }
}
