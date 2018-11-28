package com.sevadevelopment.getbridge.tests;

import org.apache.commons.lang3.SystemUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * Created by ONUR on 03.12.2016.
 */
public class BaseTest {
    String homePage = "http://www.getbridge.com";

    @BeforeMethod
    @Parameters(value={"browser"})
    public void setupTest (@Optional String browser) {
        if(browser.equalsIgnoreCase("chrome")) {
            //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
            if (SystemUtils.IS_OS_LINUX)
                System.setProperty("webdriver.chrome.driver",
                        "src/test/resources/drivers/chromeDriver/chromedriver_linux_64");
            else if (SystemUtils.IS_OS_WINDOWS)
                System.setProperty("webdriver.chrome.driver",
                        "src/test/resources/drivers/chromeDriver/chromedriver_win32/chromedriver(2.42 v68-70).exe");
        }

        else if(browser.equalsIgnoreCase("firefox")){
            if (SystemUtils.IS_OS_LINUX)
                System.setProperty("webdriver.gecko.driver",
                        "src/test/resources/drivers/geckoDriver/geckodriver_linux_64");
            else if (SystemUtils.IS_OS_WINDOWS)
                System.setProperty("webdriver.gecko.driver",
                        "src/test/resources/drivers/geckoDriver/geckodriver.exe");
        }

        else if (browser.equalsIgnoreCase("ie")) {

        }
        System.out.println("BFFORE METHOD : "+Thread.currentThread().getId());
    }
}
