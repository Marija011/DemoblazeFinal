package com.code.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {
    public WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage () {
        this.driver.get("https://demoblaze.com/");
        this.driver.manage().window().maximize();
    }

    public WebElement Cart () {
        return driver.findElement(By.xpath("//a[@id='cartur']"));
    }

    public void clickOnCart () {
        Cart().click();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void verifyProductsInCart () {
        String nameOfProductsInCart = driver.findElement(By.id("tbodyid")).getText();
        Assert.assertTrue(nameOfProductsInCart.contains("Nokia lumia 1520"));
        Assert.assertTrue(nameOfProductsInCart.contains("Nexus 6"));
        Assert.assertTrue(nameOfProductsInCart.contains("Samsung galaxy s6"));

    }

    public void verifyingTotalPrice (String expectedTotalPrice) {
        String actualTotalPrice = driver.findElement(By.id("totalp")).getText();
        Assert.assertTrue(actualTotalPrice.contains(expectedTotalPrice));
    }

}
