package com.code.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage {
    public WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage () {
        this.driver.get("https://demoblaze.com/");
        this.driver.manage().window().maximize();
    }
    public WebElement WelcomeMarijaM () {

        return driver.findElement(By.xpath("//div[@class='navbar-collapse']/ul[@class='navbar-nav ml-auto']/a[text()='Welcome MarijaM']"));
    }


    public boolean isDisplayed() {
        boolean toReturn = false;
        if (this.WelcomeMarijaM().isDisplayed()) {
            toReturn = true;
        }
        return toReturn;
    }

    public WebElement NokiaLumia1520 () {
        return driver.findElement(By.xpath("//h4[@class='card-title']/a[text()='Nokia lumia 1520']"));
    }
    public void clickOnNokia () {
        NokiaLumia1520().click();
        try { Thread.sleep(1500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public WebElement AddToCartBtn () {
        return driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-6 col-lg-6']/a[text()='Add to cart']"));
    }
    public void clickOnAddToCart () {
        AddToCartBtn().click();
        try { Thread.sleep(1500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeProductPage() {
        this.driver.close();
        this.driver.quit();
    }
}
