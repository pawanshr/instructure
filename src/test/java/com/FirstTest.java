package com;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 03.12.2016.
 */
public class FirstTest extends TestBase {

    @Test
    public void Google_text_Test() throws Exception {
        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToPage("GOOGLE0 TEST", "http://www.google.com");
        Assert.assertEquals(browser.getDriver().getTitle(), "Google");

        GooglePage googlePage=new GooglePage(TLDriverFactory.getDriver());
        GoogleResultPage googleResultPage=googlePage.search("selenium");
        googleResultPage.click_First_Link();
        String text= googleResultPage.getSeleniumText();

        Assert.assertNotEquals("Selenium",text);
   }

    @Test
    public void Google_text_Test1() throws Exception {
        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToPage("GOOGLE0 TEST", "http://www.google.com");
        Assert.assertEquals(browser.getDriver().getTitle(), "Google");

        GooglePage googlePage=new GooglePage(TLDriverFactory.getDriver());
        GoogleResultPage googleResultPage=googlePage.search("selenium");
        googleResultPage.click_First_Link();
        String text= googleResultPage.getSeleniumText();

        Assert.assertNotEquals("Selenium",text);
    }






}