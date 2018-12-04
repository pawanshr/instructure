package com.sevadevelopment.getbridge.tests;

import java.lang.reflect.Method;

import org.apache.commons.lang3.SystemUtils;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.sevadevelopment.utility.GenerateTestReport;
import com.sevadevelopment.utility.TLDriverFactory;

public class BaseTest {
	String homePage = "http://www.getbridge.com";
	GenerateTestReport generateTestReport = new GenerateTestReport(TLDriverFactory.getDriver());

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setupTest(@Optional String browser, Method method) {
		try {
			generateTestReport.startReport(browser, method);
		} catch (Exception e) {
			e.getMessage();
		}
		if (browser.equalsIgnoreCase("chrome")) {

			if (SystemUtils.IS_OS_LINUX) {
				System.out.println("should set chrome driver for linux");
				System.setProperty("webdriver.chrome.driver",
						"src/test/resources/drivers/chromeDriver/chromedriver_linux_64");
			} else if (SystemUtils.IS_OS_WINDOWS) {
				System.setProperty("webdriver.chrome.driver",
						"src/test/resources/drivers/chromeDriver/chromedriver_win32/chromedriver(2.42 v68-70).exe");
			}

		} else if (browser.equalsIgnoreCase("firefox")) {

			if (SystemUtils.IS_OS_LINUX) {
				System.out.println("should set gecko driver for linux");
				System.setProperty("webdriver.gecko.driver",
						"src/test/resources/drivers/geckoDriver/geckodriver_linux_64");
			} else if (SystemUtils.IS_OS_WINDOWS) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckoDriver/geckodriver.exe");
			}
			System.out.println("BEFORE METHOD : " + Thread.currentThread().getId());
		}

	}

	@AfterMethod
	@Parameters(value = { "browser" })
	public void tearDownTestMethod(String browser, ITestResult result) {
		System.out.println("================== " + browser);
		try {
			generateTestReport.getReport(browser, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void doAfterSuite() {
		System.out.println("GENERATING REPORT");
		try {
			generateTestReport.flushReport();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
