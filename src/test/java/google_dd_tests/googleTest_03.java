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

public class googleTest_03 extends CoreTest {
	SoftAssert softAssert;
	googleTest_01 googleTest01;

	@BeforeTest
	public void isSkip() {

		if (!testUtil.isExecutable("googleTest_03")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");

		}
	}

	@Test(priority = 3)
	public void verifyGoogleAppsTitle() throws InterruptedException, IOException {
		try {

			softAssert = new SoftAssert();

			googleTest01 = new googleTest_01();

			driver.findElement(By.xpath(object.getProperty("Account"))).click();
			// System.out.println(driver.getTitle());
			Thread.sleep(5000);
			String actual = driver.getTitle();
			String expected = "Google Account";
			Assert.assertEquals(actual, expected);

			System.out.println("title match");
			driver.navigate().back();

			Thread.sleep(5000);

			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("Search1"))).click();
			app_logs.debug("Click On Search1 App");

			WebElement googlesearchbox = driver.findElement(By.xpath(object.getProperty("googlesearchbox")));
			Assert.assertTrue(googlesearchbox.isDisplayed());
			app_logs.debug("Verify googlesearchbox");
			System.out.println("Verify googlesearchbox");

			WebElement googleSearchButton = driver.findElement(By.xpath(object.getProperty("googleSearchButton")));
			Assert.assertTrue(googleSearchButton.isDisplayed());
			app_logs.debug("Verify googleSearchButton");
			System.out.println("Verify googleSearchButton");

			WebElement ImFeelingLucky = driver.findElement(By.xpath(object.getProperty("ImFeelingLucky")));
			Assert.assertTrue(ImFeelingLucky.isDisplayed());
			app_logs.debug("Verify ImFeelingLucky");
			System.out.println("Verify ImFeelingLucky");
			driver.navigate().back();

			Thread.sleep(5000);
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Maps"))).click();
			app_logs.debug("Click On Maps App");
			Thread.sleep(7000);

			WebElement Map = driver.findElement(By.xpath(object.getProperty("Mapsearch")));
			boolean mapsearch = Map.isDisplayed();
			Assert.assertTrue(mapsearch);
			// Assert.assertTrue(Map.isDisplayed());
			app_logs.debug("Click On Mapsearch App");
			System.out.println("Verify MapSearch");

			WebElement Mapmain = driver.findElement(By.xpath(object.getProperty("Mapmenu")));
			boolean mapmenu = Map.isDisplayed();
			Assert.assertTrue(mapmenu);
			app_logs.debug("Click On Mapmenu App");
			System.out.println("Verify Mapmenu");
			driver.navigate().back();

			Thread.sleep(5000);
			googleTest01.Googleapp();
			driver.switchTo().frame(0);

			driver.findElement(By.xpath(object.getProperty("YouTube"))).click();
			app_logs.debug("Click On YouTube App");
			Thread.sleep(5000);

			String actual1 = driver.getTitle();
			String expected1 = "YouTube";
			Assert.assertEquals(actual1, expected1);
			app_logs.debug("Verify YouTube App");
			System.out.println("Verify YouTube Title Display");

			WebElement search = driver.findElement(By.xpath(object.getProperty("Search2")));
			boolean Search2 = search.isDisplayed();
			Assert.assertTrue(Search2);
			app_logs.debug("Click On Search2 App");
			System.out.println("Verify SearchBox");

			WebElement signIn = driver.findElement(By.xpath(object.getProperty("SignIn")));
			boolean SignIn = signIn.isDisplayed();
			Assert.assertTrue(SignIn);
			app_logs.debug("Verify SignIn App");
			System.out.println("Verify SignIn Button");
			driver.navigate().back();

			Thread.sleep(5000);
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Play"))).click();
			app_logs.debug("Click On Play App");
			Thread.sleep(5000);

			WebElement googlePlay = driver.findElement(By.xpath(object.getProperty("GooglePlay")));
			boolean GooglePlay = googlePlay.isDisplayed();
			Assert.assertTrue(GooglePlay);
			app_logs.debug("Verify GooglePlay App");
			System.out.println("Verify GooglePlay");

			String actual2 = driver.getTitle();
			String expected2 = "Google Play";
			Assert.assertEquals(actual2, expected2);
			app_logs.debug("Verify GooglePlay Logo Title App");
			System.out.println("Verify Google Play Logo Title Display");

			WebElement Entertainmentbox = driver.findElement(By.xpath(object.getProperty("EntertainmentBox")));
			Boolean EntertainmentBox = Entertainmentbox.isDisplayed();
			Assert.assertTrue(EntertainmentBox);
			app_logs.debug("Verify EntertainmentBox");
			System.out.println("Verify Google box is present");
			driver.navigate().back();

			Thread.sleep(5000);
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("News"))).click();
			app_logs.debug("Click On News App");
			Thread.sleep(5000);

			WebElement news = driver.findElement(By.xpath(object.getProperty("News")));
			boolean News = news.isDisplayed();
			Assert.assertTrue(News);
			app_logs.debug("Verify News App");
			System.out.println("Verify News");

			WebElement topstories = driver.findElement(By.xpath(object.getProperty("Topstories")));
			boolean Topstories = topstories.isDisplayed();
			Assert.assertTrue(Topstories);
			app_logs.debug("Verify Topstories");
			System.out.println("Verify Topstories");
			driver.navigate().back();

			Thread.sleep(5000);
			googleTest01.Googleapp();
			driver.switchTo().frame(0);

			driver.findElement(By.xpath(object.getProperty("Gmails"))).click();
			app_logs.debug("Click On Gmails App");
			Thread.sleep(6000);

			WebElement Gmails = driver.findElement(By.xpath(object.getProperty("Gmail1")));
			boolean Gmail1 = Gmails.isDisplayed();
			Assert.assertTrue(Gmail1);
			app_logs.debug("Verify Gmail1 App");
			System.out.println("Verify Gmail1");

			WebElement signingmail = driver.findElement(By.linkText(object.getProperty("signinGamil")));
			boolean signin = signingmail.isDisplayed();
			Assert.assertTrue(signin);
			app_logs.debug("Verify signinGamil");
			System.out.println("Verify signinGamil");

			WebElement createanAccount = driver.findElement(By.linkText(object.getProperty("Createanaccount")));
			boolean Createanaccount = createanAccount.isDisplayed();
			Assert.assertTrue(Createanaccount);
			app_logs.debug("Verify Createanaccount");
			System.out.println("Verify Createanaccount");

			driver.navigate().back();

			Thread.sleep(5000);

			googleTest01.Googleapp();
			driver.switchTo().frame(0);

			driver.findElement(By.xpath(object.getProperty("Translate"))).click();
			app_logs.debug("Click On Translate App");

			driver.findElement(By.xpath("//div[contains(@class,'tlid-dismiss-button dismiss-button')]")).click();
			Thread.sleep(5000);

			String actual0 = driver.getTitle();
			String expected0 = "Google Translate";
			Assert.assertEquals(actual0, expected0);
			app_logs.debug("Verify Google Translate Title");
			System.out.println("Title Match");

			WebElement translate = driver.findElement(By.xpath(object.getProperty("Translat")));
			boolean Translate = translate.isDisplayed();
			Assert.assertTrue(Translate);
			app_logs.debug("Verify Translate Title");
			System.out.println("Verify Translate");

			WebElement signin2 = driver.findElement(By.xpath(object.getProperty("Signin")));
			boolean Signin = signin2.isDisplayed();
			Assert.assertTrue(Signin);
			app_logs.debug("Verify Signin");
			System.out.println("Verify Signin");
			driver.navigate().back();

			Thread.sleep(5000);
			googleTest01.Googleapp();
			driver.switchTo().frame(0);

			driver.findElement(By.xpath(object.getProperty("Photos"))).click();
			app_logs.debug("Click On Photos App");
			Thread.sleep(5000);

			String actual4 = driver.getTitle();
			String expected4 = "Google Photos";
			Assert.assertEquals(actual4, expected4);
			app_logs.debug("Verify Google Photos Title");
			System.out.println("Title Match");

			WebElement gotoGooglePhotos = driver.findElement(By.xpath(object.getProperty("GotoGooglePhotos")));
			boolean GotoGooglePhotos = gotoGooglePhotos.isDisplayed();
			Assert.assertTrue(GotoGooglePhotos);
			app_logs.debug("Verify GooglePhotos");
			System.out.println("Verify GotoGooglePhotos");

			WebElement getGooglePhotos = driver.findElement(By.xpath(object.getProperty("GetGooglePhotos")));
			boolean GetGooglePhotos = getGooglePhotos.isDisplayed();
			Assert.assertTrue(GetGooglePhotos);
			app_logs.debug("Verify GetGooglePhotos");
			System.out.println("Verify GetGooglePhotos");
			driver.navigate().back();

			// Thread.sleep(5000);
			googleTest01.Googleapp();
			driver.switchTo().frame(0);

			driver.findElement(By.xpath(object.getProperty("Duo"))).click();
			app_logs.debug("Click On Duo App");
			Thread.sleep(5000);

			WebElement TryDuoforWeb = driver.findElement(By.xpath(object.getProperty("TryDuoforweb")));
			boolean TryDuoforweb = TryDuoforWeb.isDisplayed();
			Assert.assertTrue(TryDuoforweb);
			app_logs.debug("Verify TryDuoforweb");
			System.out.println("Verify TryDuoforweb");
			softAssert.assertAll();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_03");
			Assert.assertTrue(false, t.getMessage());
		}
	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleTest_03");
	}

}
