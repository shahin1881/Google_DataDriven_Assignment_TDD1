package google_dd_tests;

import java.io.IOException;
import java.util.List;

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

public class googleTest_05 extends CoreTest {
	SoftAssert softAssert;

	@BeforeTest
	public void init1() {

		if (!testUtil.isExecutable("googleTest_05")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}

	}

	@Test(priority = 5)
	public void VerifyClickOnLang() throws InterruptedException, IOException {
		try {
			softAssert = new SoftAssert();
			// driver.navigate().back();

			WebElement hinde = driver.findElement(By.linkText("हिन्दी"));
			Assert.assertTrue(hinde.isEnabled());
			hinde.click();
			app_logs.debug("Click On hindi Link");

			WebElement signin = driver.findElement(By.linkText("साइन इन"));
			Assert.assertTrue(signin.isEnabled());
			app_logs.debug("Click And Verify Hindi language");

			WebElement image = driver.findElement(By.linkText("इमेज"));
			Assert.assertTrue(image.isEnabled());
			app_logs.debug("Verify Image");

			WebElement signin1 = driver.findElement(By.xpath("(//input[@value='आज मेरी किस्मत अच्छी है'])[2]"));
			Assert.assertTrue(signin1.isEnabled());
			app_logs.debug("Verify I'm Feeling Lucky button");
			Thread.sleep(5000);

			driver.findElement(By.linkText(object.getProperty("clickEnglishbtn"))).click();
			app_logs.debug("Click On English Language");

			softAssert.assertAll();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_05");
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@DataProvider
	public static Object[][] getData() {

       return testUtil.getData("googleTest_05");
	}

}
