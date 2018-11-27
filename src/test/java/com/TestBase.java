package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

/**
 * Created by ONUR on 03.12.2016.
 */
public class TestBase {

    //public Map<Long, WebDriver> driverMap = new ConcurrentHashMap();
    //public WebDriverWait wait;
    //public TLDriverFactory tlDriverFactory = new TLDriverFactory();

    //Do the test setup
    @BeforeMethod
    @Parameters(value={"browser"})
    public void setupTest (@Optional String browser) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");

        //System.out.println("BeforeMethod is started. " + Thread.currentThread().getId());
        //Set & Get ThreadLocal Driver with Browser
        //TLDriverFactory.setDriver(browser);
        //driver = TLDriverFactory.getDriver();
        //driverMap.put(Thread.currentThread().getId(),TLDriverFactory.getDriver());
        //driver = driverMap.get(Long.valueOf(Thread.currentThread().getId()));
        //wait = new WebDriverWait(driver, 15);

        /*driver = TLDriverFactory.getDriver();
        System.out.println("PPPPPPPPPPPPPPPPPPPPPpp"+driver);
        wait = TLDriverFactory.getWait(driver);
        driver.navigate().to("http://www.google.com");*/
    }

    @AfterMethod
    public void tearDown() throws Exception {
        //System.out.println("AfterMethod is started. " + Thread.currentThread().getId());
        //TLDriverFactory.getDriver().quit();
        //TLDriverFactory.getTLDriver().remove();
    }
}