package google_dd_tests;

import java.io.IOException;

import javax.mail.MessagingException;

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

public class googleLoginTest_04 extends CoreTest {
	SoftAssert softAssert;
	googleTest_01 googleTest01;

	@BeforeTest
	public void isSkip() {

		if (!testUtil.isExecutable("googleLoginTest_04")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");

		}
	}

	@Test(priority = 4, dataProvider = "getData")
	public void SignInGoogleApp(String email, String password)
			throws InterruptedException, IOException, MessagingException {
		try {
			softAssert = new SoftAssert();
			driver.navigate().back();

			driver.findElement(By.xpath(object.getProperty("signin"))).click();

			Thread.sleep(2000);
			WebElement username = driver.findElement(By.xpath(object.getProperty("username")));
			username.sendKeys(email);
			app_logs.debug("Giving username");

			WebElement Next = driver.findElement(By.xpath(object.getProperty("Next")));
			Next.click();
			app_logs.debug("Click on Next Button");

			Thread.sleep(5000);
			// xpath of FB password TextBOx
			WebElement pass = driver.findElement(By.xpath(object.getProperty("password")));
			pass.sendKeys(password);
			app_logs.debug("Giving password");

			// xpath of Log In Button
			app_logs.debug("Click on login button");
			Thread.sleep(3000);
			WebElement Nextbtn = driver.findElement(By.xpath(object.getProperty("Nextbtn")));
			Nextbtn.click();
			app_logs.debug("login SignIn Successfully");

			WebElement signinlogo = driver.findElement(By.xpath(object.getProperty("signinLogo")));
			boolean signinLogo = signinlogo.isDisplayed();
			Assert.assertTrue(signinLogo);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo");

			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Account"))).click();
			app_logs.debug("Click On Account");

			WebElement FirstName = driver.findElement(By.xpath(object.getProperty("FirstName")));
			Assert.assertTrue(FirstName.isEnabled());
			System.out.println("Welcome, Shahin Sayyed");

			WebElement signinlogo1 = driver.findElement(By.xpath(object.getProperty("signinLogo1")));
			boolean signinLogo1 = signinlogo1.isDisplayed();
			Assert.assertTrue(signinLogo1);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Search1"))).click();
			app_logs.debug("Click On Search");

			WebElement signinlogo2 = driver.findElement(By.xpath(object.getProperty("signinLogo2")));
			boolean signinLogo2 = signinlogo2.isDisplayed();
			Assert.assertTrue(signinLogo2);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Maps"))).click();
			app_logs.debug("Click On Maps");

			WebElement signinLo3 = driver.findElement(By.xpath(object.getProperty("signinLogo3")));
			boolean signinLogo3 = signinLo3.isDisplayed();
			Assert.assertTrue(signinLogo3);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("YouTube"))).click();
			app_logs.debug("Click On YouTube");

			WebElement signinlogo4 = driver.findElement(By.xpath(object.getProperty("signinLo4")));
			boolean signinLo4 = signinlogo4.isDisplayed();
			Assert.assertTrue(signinLo4);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Play"))).click();
			app_logs.debug("Click On Play");

			WebElement signinlogo5 = driver.findElement(By.xpath(object.getProperty("signinLogo5")));
			boolean signinLogo5 = signinlogo5.isDisplayed();
			Assert.assertTrue(signinLogo5);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("News"))).click();
			app_logs.debug("Click On News");

			WebElement signinlogo6 = driver.findElement(By.xpath(object.getProperty("signinLogo6")));
			boolean signinLogo6 = signinlogo6.isDisplayed();
			Assert.assertTrue(signinLogo6);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Gmails"))).click();
			app_logs.debug("Click On Gmails");

			WebElement signinlogo7 = driver.findElement(By.xpath(object.getProperty("signinLogo7")));
			boolean signinLogo7 = signinlogo7.isDisplayed();
			Assert.assertTrue(signinLogo7);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Translate"))).click();
			//Cancel popup google Translate
			driver.findElement(By.xpath(object.getProperty("Translatpopupcancel"))).click();
			app_logs.debug("Click On Translate");

			

			WebElement signinLog = driver.findElement(By.xpath(object.getProperty("signinLogos")));
			boolean signinLogos = signinLog.isEnabled();
			Assert.assertTrue(signinLogos);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Photos"))).click();
			app_logs.debug("Click On Photos");

			WebElement signinlogs = driver.findElement(By.xpath(object.getProperty("signinLog1")));
			boolean signinLog1 = signinlogs.isDisplayed();
			Assert.assertTrue(signinLog1);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();
			googleTest01.Googleapp();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(object.getProperty("Duo"))).click();
			app_logs.debug("Click On Duo");

			WebElement signinlo = driver.findElement(By.xpath(object.getProperty("signinLo")));
			boolean signinLo = signinlo.isDisplayed();
			Assert.assertTrue(signinLo);
			System.out.println("Verify signIn Logo Sucessfully");
			app_logs.debug("Verify signIn Logo Sucessfully");

			driver.navigate().back();

			// signout google account
			WebElement SignInlogo = driver.findElement(By.xpath(object.getProperty("SignInlogo")));
			SignInlogo.click();

			WebElement signOut = driver.findElement(By.id(object.getProperty("signOut")));
			signOut.click();

			System.out.println("SignOut Google Account Sucessfully");
			app_logs.debug("SignOut Google Account Sucessfully");
			softAssert.assertAll();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleLoginTest_04");
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleLoginTest");
	}

}
