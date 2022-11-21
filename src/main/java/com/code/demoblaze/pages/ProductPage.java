package com.code.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ProductPage {
    public WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage () {
        this.driver.get("https://demoblaze.com/");
        this.driver.manage().window().maximize();
    }
    public WebElement SignUp () {

        return driver.findElement(By.xpath("//a[@id='signin2']"));
    }

    public boolean isDisplayed() {
        boolean toReturn = false;
        if (this.SignUp().isDisplayed()) {
            toReturn = true;
        }
        return toReturn;
    }

    /*public WebElement Cart () {
        return driver.findElement(By.xpath("//a[@id='cartur']"));
    }

    public void clickOnCart () {
        Cart().click();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }*/

    public WebElement Home () {
        return driver.findElement(By.xpath("//a[@id='nava']"));
    }
    public void clickOnHome () {
        Home().click();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



        public WebElement NokiaLumia1520 () {
            return driver.findElement(By.xpath("//h4[@class='card-title']/a[text()='Nokia lumia 1520']"));
        }
        public void clickOnNokia () {
            NokiaLumia1520().click();
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        public WebElement AddToCartBtn () {
            return driver.findElement(By.xpath("//a[text()='Add to cart']"));
        }
        public void clickOnAddToCart () {
            AddToCartBtn().click();
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public WebElement SamsungGalaxyS6 () {
        return driver.findElement(By.xpath("//h4[@class='card-title']/a[text()='Samsung galaxy s6']"));
        }

    public void clickOnSamsung () {
        SamsungGalaxyS6().click();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public WebElement Nexus6 () {
        return driver.findElement(By.xpath("//h4[@class='card-title']/a[text()='Nexus 6']"));
    }
    public void clickOnNexus () {
        Nexus6().click();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public void closeProductPage() {
        this.driver.close();
        this.driver.quit();
    }
}
