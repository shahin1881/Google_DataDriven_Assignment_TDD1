package google_dd_tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Util.testUtil;
import google_dd_core.CoreTest;

public class googleTest_07 extends CoreTest {
	SoftAssert softAssert;

	@BeforeTest
	public void init1() {

		if (!testUtil.isExecutable("googleTest_05")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}

	}

	@Test(priority = 8)
	public void Countnameoflink() throws InterruptedException, IOException {
		try {
			softAssert = new SoftAssert();
			driver.findElement(By.xpath(object.getProperty("Searchbox"))).sendKeys("Amitabh Bachchan");
			driver.findElement(By.xpath(object.getProperty("Searchbox"))).sendKeys(Keys.ENTER);

			Thread.sleep(4000);
			List<WebElement> list = driver.findElements(By.xpath(object.getProperty("TextName")));
			System.out.println(list.size());
			// String s1 ="";
			for (int i = 0; i < list.size(); i++) {
				WebElement sp = list.get(i);
				WebElement sk = driver.findElement(By.tagName("a"));

				if (sp.equals(sk)) {
					System.out.println(sp.getSize());

				}
				System.out.println(sp.getText());
				app_logs.debug("Display Amitabh Bachchan links");

			}
			softAssert.assertAll();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_07");
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleTest_02");
	}

}
