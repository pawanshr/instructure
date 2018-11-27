
package com.sevadevelopment.getbridge.tests;

import com.sevadevelopment.getbridge.pageobjects.BridgePageFooter;
import com.sevadevelopment.utility.Browser;
import com.sevadevelopment.utility.TLDriverFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestBridgeFooterLinks extends BaseTest {
	//GenerateTestReport generateTestReport = new GenerateTestReport(driver);

	@AfterSuite
	public void doAfterSuite() {
		//generateTestReport.flushReport(driver);
	}


	@AfterMethod
	public void tearDownTestMethod(ITestResult result) {
		//generateTestReport.getReport(result);
	}

	@Test
	public void verifyAccessibilityUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnAccessibilityLink();

		String accessibilityUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(accessibilityUrl);
		Assert.assertEquals(accessibilityUrl, "https://community.bridgeapp.com/docs/DOC-1629");

		// verify accessibility redirected page contents
		String accessibilityRedirectedPage = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"jive-body-main\"]/div[2]"))
				.getText();
		Assert.assertTrue(accessibilityRedirectedPage.contains("Bridge Voluntary Product Accessibility Template"));
		Assert.assertTrue(accessibilityRedirectedPage.contains("Web Content Accessibility Guidelines 2.0"));
	}

	@Test
	public void verifyPrivacyPolicyUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnPrivacyPolicyLink();
		String accessibilityUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(accessibilityUrl);
		Assert.assertEquals(accessibilityUrl, "https://www.instructure.com/policies/privacy/");

		// verify Privacy Policy redirected page contents
		String privacyPolicyRedirectedPage = TLDriverFactory.getDriver().findElement(By.id("spotMtext")).getText();
		Assert.assertTrue(privacyPolicyRedirectedPage.contains("Instructure Privacy Policy"));
	}

	@Test
	public void verifyTermsOfUseUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnTermsOfUse();
		String termsOfUseUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(termsOfUseUrl);
		Assert.assertEquals(termsOfUseUrl, "https://www.getbridge.com/policies/terms-of-use");

		// verify Privacy Policy redirected page contents
		Assert.assertTrue(TLDriverFactory.getDriver().findElement(By.className("PRtitle2")).getText().contains("Terms of Use"));
		Assert.assertTrue(
				TLDriverFactory.getDriver().findElement(By.className("PRbody")).getText().contains("Agreement between You and Instructure"));
	}

	@Test
	public void verifyContactSalesUrl() throws Exception {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		String contactSalesNumber = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-top-links\"]/div/a[4]"))
				.getAttribute("href");
		System.out.println(contactSalesNumber);
		Assert.assertEquals(contactSalesNumber, "tel:+1-877-576-5364");
	}

	@Test
	public void verifyManagementUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnManagement();
		String managementUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(managementUrl);
		Assert.assertEquals(managementUrl, "https://www.getbridge.com/features/continuous-1%3A1-management");

		// verify management redirected page contents
		String managementRedirectedPage = TLDriverFactory.getDriver()
				.findElement(By.xpath("//*[@id=\"block-mainpagecontent-2\"]/section/section[1]/div/div[1]")).getText();
		Assert.assertTrue(managementRedirectedPage.contains("Continuous 1:1 Management"));
	}

	@Test
	public void verifyTimelineModuleUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnTimelineModule();
		String timelineModuleUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(timelineModuleUrl);
		Assert.assertEquals(timelineModuleUrl, "https://www.getbridge.com/features/employee-timeline");

		// verify timeline module redirected page contents
		String timelineModuleRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(timelineModuleRedirectedPage.contains("Employee Timeline"));
	}

	@Test
	public void verifySkillsAsseessmentUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnSkillsAssessment();
		String skillsAsseessmentUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(skillsAsseessmentUrl);
		Assert.assertEquals(skillsAsseessmentUrl, "https://www.getbridge.com/features/skills-assessment");

		// verify skills management redirected page contents
		String skillsAssessmentRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(skillsAssessmentRedirectedPage.contains("Skills Assessment"));
	}

	@Test
	public void verifyGoalsAndTasksUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnGoalsAndTasks();
		String goalsAndTasksUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(goalsAndTasksUrl);
		Assert.assertEquals(goalsAndTasksUrl, "https://www.getbridge.com/features/goals-and-tasks");

		// verify goals and tasks redirected page contents
		String goalsAndTasksRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(goalsAndTasksRedirectedPage.contains("Goals and Tasks"));
	}

	@Test
	public void verifyRobustReportingUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnRobustReporting();
		String robustReportingUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(robustReportingUrl);
		Assert.assertEquals(robustReportingUrl, "https://www.getbridge.com/features/robust-reporting");

		// verify robust reporting redirected page contents
		String robustReportingRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(robustReportingRedirectedPage.contains("Robust Reporting"));
	}

	@Test
	public void verifyRetainUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnRetain();
		String retainUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(retainUrl);
		Assert.assertEquals(retainUrl, "https://www.getbridge.com/features/retain");

		// verify retain redirected page contents
		String retainRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(retainRedirectedPage.contains("Retain"));
	}

	@Test
	public void verifyContentServicesUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnContentServices();
		String contentServicesUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(contentServicesUrl);
		Assert.assertEquals(contentServicesUrl, "https://www.getbridge.com/features/content-services");

		// verify content services redirected page contents
		String contentServicesRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(contentServicesRedirectedPage.contains("Content Services"));
	}

	@Test
	public void verifyOffTheShelfCoursesUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnOffTheShelfCourses();
		String offTheShelfCoursesUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(offTheShelfCoursesUrl);
		Assert.assertEquals(offTheShelfCoursesUrl, "https://www.getbridge.com/features/lms-content");

		// verify off the shelf courses redirected page contents
		String offTheShelfCoursesRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(offTheShelfCoursesRedirectedPage.contains("Off-the-Shelf-Courses"));
	}

	@Test
	public void verifyArcVideoUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnArcVideo();
		String arcVideoUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(arcVideoUrl);
		Assert.assertEquals(arcVideoUrl, "https://www.getbridge.com/features/arc-video-for-bridge");

		// verify arc video redirected page contents
		String arcVideoRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(arcVideoRedirectedPage.contains("Arc Video"));
	}

	@Test
	public void verifyLearnFromYourLearningUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnLearnFromYourLearning();
		String learnFromYourLearningUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(learnFromYourLearningUrl);
		Assert.assertEquals(learnFromYourLearningUrl, "https://www.getbridge.com/features/learn-more");

		// verify learn more redirected page contents
		String learnMoreRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(learnMoreRedirectedPage.contains("Learn from your Learning"));
	}

	@Test
	public void verifyManagerDashboardUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnManagerDashboard();
		String managerDashboardUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(managerDashboardUrl);
		Assert.assertEquals(managerDashboardUrl, "https://www.getbridge.com/features/manager-dashboard");

		// verify manager dashboard redirected page contents
		String managerDashboardRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(managerDashboardRedirectedPage.contains("Manager Dashboard"));
	}

	@Test
	public void verifyAdminUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnAdmin();
		String adminUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(adminUrl);
		Assert.assertEquals(adminUrl, "https://www.getbridge.com/features/admin-features");

		// verify admin redirected page contents
		String adminRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(adminRedirectedPage.contains("Admin"));
	}

	@Test
	public void verifyEasyToUseUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnEasyToUse();
		String easyToUseUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(easyToUseUrl);
		Assert.assertEquals(easyToUseUrl, "https://www.getbridge.com/features/ease-of-use");

		// verify easy to use redirected page contents
		String easyToUseRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(easyToUseRedirectedPage.contains("Easy to Use, Easy to Love"));
	}

	@Test
	public void verifyAnytimeAnywhereUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnAnytimeAnywhere();
		String anytimeAnywhereUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(anytimeAnywhereUrl);
		Assert.assertEquals(anytimeAnywhereUrl, "https://www.getbridge.com/features/learn-anywhere");

		// verify anytime anywhere redirected page contents
		String anytimeAnywhereRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("feature-title")).getText();
		Assert.assertTrue(anytimeAnywhereRedirectedPage.contains("Anytime, Anywhere Learning"));
	}

	@Test
	public void verifyContactTelephoneEmailAndLocation() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		String contactTelNo = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-phone\"]/a")).getAttribute("href");
		Assert.assertEquals(contactTelNo, "tel:+1877.576.5364");

		String contactEmail = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-email\"]/a")).getAttribute("href");
		Assert.assertEquals(contactEmail, "mailto:info@getbridge.com");

		String contactLocationUrl = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-address\"]/a")).getAttribute("href");
		Assert.assertEquals(contactLocationUrl, "https://goo.gl/maps/zrKJGEnDyhu");

		String contactLocationText1 = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-address\"]/a/text()[1]")).getText();
		Assert.assertEquals(contactLocationText1, "6630 South 3000 east, Suite 700");

		String contactLocationText2 = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-address\"]/a/text()[2]")).getText();
		Assert.assertEquals(contactLocationText2, "Salt Lake City, UT 84121");
	}

	@Test
	public void verifySocialNetworkPagesUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		String fbUrl = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-social-icons\"]/a[1]")).getAttribute("href");
		Assert.assertEquals(fbUrl, "https://www.facebook.com/GetBridge/");

		String twitterUrl = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-social-icons\"]/a[2]")).getAttribute("href");
		Assert.assertEquals(twitterUrl, "https://twitter.com/getbridge");

		String youtubeUrl = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-social-icons\"]/a[3]")).getAttribute("href");
		Assert.assertEquals(youtubeUrl, "https://www.youtube.com/user/bridgelms");

		String linkedinUrl = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"footer-social-icons\"]/a[4]")).getAttribute("href");
		Assert.assertEquals(linkedinUrl, "https://www.linkedin.com/showcase/get-bridge/");
	}

	@Test
	public void verifyBottomSupportTermsUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnSupportTerms();
		String supportTermsUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(supportTermsUrl);
		Assert.assertEquals(supportTermsUrl, "https://www.getbridge.com/support-terms");

		// verify support terms redirected page contents
		String supportTermsRedirectedPage = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"support-body-text\"]/div/div[1]/h3"))
				.getText();
		Assert.assertTrue(supportTermsRedirectedPage.contains("Support Terms"));
	}

	@Test
	public void verifyBottomPrivacyPolicyUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomPrivacyPolicy();
		String bottomPrivacyPolicyUrl = TLDriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(bottomPrivacyPolicyUrl, "https://www.instructure.com/policies/privacy/");

		// verify bottom privacy policy redirected page contents
		String privacyPolicyRedirectedPage = TLDriverFactory.getDriver().findElement(By.id("spotMtext")).getText();
		Assert.assertTrue(privacyPolicyRedirectedPage.contains("Instructure Privacy Policy"));
	}

	@Test
	public void verifyBottomTermsOfUseUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomTermsOfUse();
		String bottomTermsOfUseUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomTermsOfUseUrl);
		Assert.assertEquals(bottomTermsOfUseUrl, "https://www.getbridge.com/policies/terms-of-use");

		// verify bottom terms of use redirected page contents
		String supportTermsRedirectedPage = TLDriverFactory.getDriver().findElement(By.className("PRtitle2")).getText();
		Assert.assertTrue(supportTermsRedirectedPage.contains("Terms of Use"));
	}

	@Test
	public void verifyBottomAccessibilityUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomAccessibility();
		String bottomAccessibilityUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomAccessibilityUrl);
		Assert.assertEquals(bottomAccessibilityUrl, "https://community.bridgeapp.com/docs/DOC-1629");

		// verify bottom accessibility redirected page contents
		String bottomAccessibilityRedirectedPage = TLDriverFactory.getDriver()
				.findElement(By.xpath("//*[@id=\\\"jive-body-main\\\"]/div[2]")).getText();
		Assert.assertTrue(
				bottomAccessibilityRedirectedPage.contains("Bridge Voluntary Product Accessibility Template"));
		Assert.assertTrue(bottomAccessibilityRedirectedPage.contains("Web Content Accessibility Guidelines 2.0"));
	}

	@Test
	public void verifyBottomGDPRUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomGDPR();
		String bottomGDPRUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomGDPRUrl);
		Assert.assertEquals(bottomGDPRUrl, "https://www.getbridge.com/policies/gdpr");

		// verify bottom GDPR redirected page contents
		String bottomGDPRRedirectedPage = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"main\"]/h2[1]")).getText();
		Assert.assertTrue(bottomGDPRRedirectedPage.contains("THE GENERAL DATA PROTECTION REGULATION (GDPR)"));
	}

	@Test
	public void verifyBottomNewsUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomNews();
		String bottomNewsUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomNewsUrl);
		Assert.assertEquals(bottomNewsUrl, "https://www.getbridge.com/news");

		// verify bottom news redirected page contents
		String bottomNewsRedirectedPage = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"news-hero\"]/h1")).getText();
		Assert.assertTrue(bottomNewsRedirectedPage.contains("Bridge News"));
	}

}
