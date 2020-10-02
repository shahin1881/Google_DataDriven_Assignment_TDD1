package google_dd_tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Util.testUtil;
import google_dd_core.CoreTest;

//9th Question
public class googleLoginTest_09 extends CoreTest {
	public SoftAssert softAssert;
	googleTest_01 googleLoginTest01;

	@BeforeTest
	public void isSkip() throws IOException {
		if (!testUtil.isExecutable("googleLoginTest_09")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");

		}
	}

	@Test(priority = 10, dataProvider = "getData")
	public void doLogin(String email, String password) throws IOException, InterruptedException {

		try {
			softAssert = new SoftAssert();

			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();

			Thread.sleep(1000);
			// String url="https://mail.google.com/";
			driver.navigate().to("https://mail.google.com/");
			System.out.println(driver.getTitle());
            Thread.sleep(5000);

			/*
			 WebElement UseAnotherAc=driver.findElement(By.xpath("//div[text()='Use another account']")); UseAnotherAc.click();
			 */

			WebElement UseAnotherAc1 = driver.findElement(By.xpath("//div[@class='VRMoVc']/following-sibling::div"));
			UseAnotherAc1.click();

			Thread.sleep(3000);

			// xpath of FB username text box
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

			int li = driver.findElements(By.xpath(object.getProperty("GmailBox"))).size();
			System.out.println(li);

			WebElement gmailbox = driver.findElement(By.xpath(object.getProperty("gmailbox")));
			Assert.assertTrue(gmailbox.isEnabled());
			System.out.println("verify gmailbox");
			app_logs.debug("verify gmailbox");

			/*
			 WebElement More=driver.findElement(By.xpath(object.getProperty("More")));
			 Assert.assertTrue(More.isEnabled()); System.out.println("verify More");
			 */
			
			app_logs.debug("Tasks 9th are sucessfully complete....!");
			softAssert = new SoftAssert();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleLoginTest_09");
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleLoginTest");
	}

}
