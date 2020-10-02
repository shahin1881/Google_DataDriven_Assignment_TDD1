package google_dd_tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

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

public class googleTest_10 extends CoreTest {
	public SoftAssert softAssert;
	googleTest_01 googleLoginTest01;

	@BeforeTest
	public void isSkip() {

		if (!testUtil.isExecutable("googleTest_10")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");

		}
	}

	@Test(priority = 11, dataProvider = "getData")
	public void TotalNumOfemailinbox(String email, String password) throws InterruptedException, IOException {
		try {

			softAssert = new SoftAssert();

			Thread.sleep(3000);
			String str = driver.findElement(By.xpath(object.getProperty("one"))).getText();
			System.out.println(str);
			String sp = "1";
			app_logs.debug("Click On 1 Number");

			WebElement rightclick = driver.findElement(By.id(object.getProperty("rightClick")));
			Assert.assertTrue(rightclick.isEnabled());
			System.out.println("Right button are present");
			app_logs.debug("Right button are present");

			if (str.equals("1")) {

				driver.findElement(By.xpath(object.getProperty("Rightclickolder"))).click();
				// app_logs.debug("");
				Thread.sleep(3000);
				String str1 = driver.findElement(By.xpath(object.getProperty("Inbox"))).getText();
				System.out.println(str1);
				app_logs.debug("Right button are present");

				System.out.println("Done");
				app_logs.debug("Done");
				app_logs.debug("Tasks 10th are sucessfully complete....!");
				driver.navigate().back();
				softAssert = new SoftAssert();
			}
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_10");
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleLoginTest");
	}
}
