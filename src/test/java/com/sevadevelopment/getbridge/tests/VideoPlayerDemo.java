package com.sevadevelopment.getbridge.tests;

import com.sevadevelopment.utility.Browser;
import com.sevadevelopment.utility.TLDriverFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class VideoPlayerDemo extends BaseTest{
	//GenerateTestReport generateTestReport = new GenerateTestReport(driver);

	@AfterSuite
	public void doAfterSuite() {
		//generateTestReport.flushReport(driver);
	}

	@AfterMethod
	public void tearDownTestMethod(ITestResult result) {
		//generateTestReport.getReport(result);
	}

	@Test(description = "To verify video source is available")
	public void verifyVideoSourceIsAvailable() throws Exception {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		String elementval = TLDriverFactory.getDriver().findElement(By.className("paragraph-play-button")).getAttribute("data-wistiaid");
		System.out.println("WISTIA-VIDEO-ID: " + elementval);

		RestAssured.baseURI = "https://fast.wistia.net/embed/iframe/" + elementval;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();

		String contentType = response.header("Content-Type");
		System.out.println("Header body response type: " + contentType);

		assertTrue(contentType.contains("text/html"));

	}
}
