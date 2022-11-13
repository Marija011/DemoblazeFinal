package com.code.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    public WebDriver driver;

    public void setup() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Marija\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
    }

        public WebDriver getDriver() {
            return driver;
        }

        public void setDriver(WebDriver driver) {
            this.driver = driver;
        }

        public MainPage (WebDriver driver) {
            this.driver = driver;
        }

        public void openPage () {
            this.driver.get("https://demoblaze.com/");
            this.driver.manage().window().maximize();
        }

    public WebElement LoginBtn() {

            return driver.findElement(By.xpath("//a[@id='login2']"));
    }

    public void LoginClick() {
            LoginBtn().click();
        }


    public WebElement getInpUsername() {
        return driver.findElement(By.xpath("//input[@id='loginusername']"));
    }

    /*public void clickUsername() {
        this.getInpUsername().click();
    }*/
    public WebElement getInpPassword() {
        return driver.findElement(By.xpath("//input[@id='loginpassword']"));
    }
    /*public void clickPassword() {
        this.getInpPassword().click();
    }*/
    public void setUsername(String username) {
        this.getInpUsername().sendKeys(username);

    }
    public void setPassword(String password) {

        this.getInpPassword().sendKeys(password);

    }

    public WebElement BtnLogin () {
            return driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
    }

    public void clickOnLogin() {
        BtnLogin().click();
    }

    /*public void login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.clickOnLogin();
    }*/

    public void closePage() {
        this.driver.close();
        this.driver.quit();
    }
}
