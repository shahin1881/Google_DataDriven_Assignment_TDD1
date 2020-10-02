package google_dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Util.testUtil;
import google_dd_core.CoreTest;

public class googleTest_02 extends CoreTest {
	SoftAssert softAssert;

	googleTest_01 googleLoginTest01;

	@BeforeTest
	public void init1() {

		if (!testUtil.isExecutable("googleTest_02")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}

	}

	@Test(priority = 2)
	public void VerifyGoogleAllApps() throws InterruptedException, IOException {
		try {

			softAssert = new SoftAssert();

			googleLoginTest01 = new googleTest_01();
			googleLoginTest01.Googleapp();

			driver.switchTo().frame(0);
			Thread.sleep(3000);
			WebElement Account = driver.findElement(By.xpath(object.getProperty("Account")));
			Assert.assertTrue(Account.isDisplayed());
			app_logs.debug("Verify Account App");
			System.out.println("Verify Account App");

			WebElement Search = driver.findElement(By.xpath(object.getProperty("Search")));
			Assert.assertTrue(Search.isDisplayed());
			app_logs.debug("Verify Search App");
			System.out.println("Verify Search App");

			WebElement Maps = driver.findElement(By.xpath(object.getProperty("Maps")));
			Assert.assertTrue(Maps.isDisplayed());
			app_logs.debug("Verify Maps App");
			System.out.println("Verify Maps App");

			WebElement YouTube = driver.findElement(By.xpath(object.getProperty("YouTube")));
			Assert.assertTrue(YouTube.isDisplayed());
			app_logs.debug("Verify YouTube App");
			System.out.println("Verify YouTube App");

			WebElement Play = driver.findElement(By.xpath(object.getProperty("Play")));
			Assert.assertTrue(Play.isDisplayed());
			app_logs.debug("Verify Play App");
			System.out.println("Verify Play App");

			WebElement News = driver.findElement(By.xpath(object.getProperty("News")));
			Assert.assertTrue(News.isDisplayed());
			app_logs.debug("Verify News App");
			System.out.println("Verify News App");

			Thread.sleep(5000);
			WebElement Gmails = driver.findElement(By.xpath(object.getProperty("Gmails")));
			Assert.assertTrue(Gmails.isDisplayed());
			app_logs.debug("Verify Gmails App");
			System.out.println("Verify Gmail App");

			WebElement Drive = driver.findElement(By.xpath(object.getProperty("Drive")));
			Assert.assertTrue(Drive.isDisplayed());
			app_logs.debug("Verify Drive App");
			System.out.println("Verify Drive App");

			WebElement Calender = driver.findElement(By.xpath(object.getProperty("Calender")));
			Assert.assertTrue(Calender.isDisplayed());
			app_logs.debug("Verify Calender App");
			System.out.println("Verify Calender App");

			WebElement Translate = driver.findElement(By.xpath(object.getProperty("Translate")));
			Assert.assertTrue(Translate.isDisplayed());
			app_logs.debug("Verify Translate App");
			System.out.println("Verify Translate App");

			WebElement Photos = driver.findElement(By.xpath(object.getProperty("Photos")));
			Assert.assertTrue(Photos.isDisplayed());
			app_logs.debug("Verify Photos App");
			System.out.println("Verify Photos App");

			WebElement Duo = driver.findElement(By.xpath(object.getProperty("Duo")));
			Assert.assertTrue(Duo.isDisplayed());
			app_logs.debug("Verify Duo App");
			System.out.println("Verify Duo App");
			System.out.println("Tasks 2nd are sucessfully completely....!");
			app_logs.debug("Tasks 2nd are sucessfully completely....!");
			softAssert.assertAll();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_02");
			Assert.assertTrue(false, t.getMessage());
		}
	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleTest_02");
	}

}
