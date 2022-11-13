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
        return driver.findElement(By.xpath("//a[@id='nameofuser']"));
    }

    public boolean isDisplayed() {
        boolean toRetun = false;
        if (this.WelcomeMarijaM().equals("Welcome MarijaM")) {
            toRetun = true;
        }
        return toRetun;

    }

    public void closeProductPage() {
        this.driver.close();
        this.driver.quit();
    }
}
