package com;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 03.12.2016.
 */
public class SecondTest extends TestBase {


    @Test
    public void GOOGLE1() throws Exception {
        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToPage("Google1 Test", "http://www.google.com");

        Assert.assertEquals(browser.getDriver().getTitle(), "Google");
        System.out.println("Google1 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void YANDEX() throws Exception {
        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToPage("Yandex Test", "http://www.yandex.com");

        Assert.assertEquals(browser.getDriver().getTitle(), "Yandex");
        System.out.println("Yandex Test Ended! " + Thread.currentThread().getId());
    }
}