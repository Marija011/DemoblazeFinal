package com.code.demoblaze.tests;

import com.code.demoblaze.pages.CartPage;
import com.code.demoblaze.pages.MainPage;
import com.code.demoblaze.pages.ProductPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductTest {

    @Test
    public void verifyAddingToCart () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marija\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        MainPage mainPage = new MainPage(chromeDriver);
        mainPage.openPage();
        mainPage.LoginClick();
        mainPage.setUsername("MarijaM");
        mainPage.setPassword("marija123");
        mainPage.clickOnLogin();

        ProductPage productPage = new ProductPage(chromeDriver);
        productPage.clickOnNokia();
        productPage.clickOnAddToCart();
        chromeDriver.switchTo().alert().accept();
        productPage.clickOnHome();
        productPage.clickOnSamsung();
        productPage.clickOnAddToCart();
        chromeDriver.switchTo().alert().accept();
        productPage.clickOnHome();
        productPage.clickOnNexus();
        productPage.clickOnAddToCart();
        chromeDriver.switchTo().alert().accept();

        CartPage cartPage = new CartPage(chromeDriver);
        cartPage.clickOnCart();
        cartPage.verifyProductsInCart();
    }
}
