package google_dd_tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Util.testUtil;
import google_dd_core.CoreTest;

public class googleTest_01 extends CoreTest {

	SoftAssert softAssert;

	@BeforeTest
	public void isSkip() {

		if (!testUtil.isExecutable("googleTest_01")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");

		}
	}

	@Test(priority = 1)
	public void Verifygooglebutton() throws IOException {

		try {
			softAssert = new SoftAssert();
			app_logs.debug("Executing Verify Test");

			WebElement signin = driver.findElement(By.xpath(object.getProperty("signin")));
			Assert.assertTrue(signin.isDisplayed());
			System.out.println("Verify googlesignin button");
			app_logs.debug("Verify signin Button");

			WebElement googlesearchbox = driver.findElement(By.xpath(object.getProperty("googlesearchbox")));
			Assert.assertTrue(googlesearchbox.isDisplayed());
			System.out.println("Verify googlesearchbox ");
			app_logs.debug("Verify googlesearchbox");

			WebElement googleSearchButton = driver.findElement(By.xpath(object.getProperty("googleSearchButton")));
			Assert.assertTrue(googleSearchButton.isDisplayed());
			System.out.println("Verify googleSearchButton button");
			app_logs.debug("Verify googlesearchbox Button");

			WebElement ImFeelingLucky = driver.findElement(By.xpath(object.getProperty("ImFeelingLucky")));
			Assert.assertTrue(ImFeelingLucky.isDisplayed());
			System.out.println("Verify ImFeelingLucky button");
			System.out.println("1st Tast completely Done....!");
			app_logs.debug("Verify ImFeelingLucky Button");
			app_logs.debug("First Task Completely...!");

			softAssert.assertAll();

		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_01");
			Assert.assertTrue(false, t.getMessage());
		}
	}

	
	
	
	public void Googleapp() throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("GoogleApp"))).click();
			app_logs.debug("Click On GoogleApps");
			softAssert = new SoftAssert();
		} catch (Throwable t) {
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleTest_01");
	}
}