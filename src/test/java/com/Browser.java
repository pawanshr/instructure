package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    WebDriver driver;

    Browser(WebDriver driver){
        this.driver = driver;
    }

    public void goToPage(String testName, String url){
        WebDriverWait wait = TLDriverFactory.getWait(driver);
        System.out.println(testName+" Started! " + Thread.currentThread().getId());
        driver.navigate().to(url);
        System.out.println(testName+"'s Page title is: " + driver.getTitle() + " " + Thread.currentThread().getId());
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
