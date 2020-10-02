package google_dd_tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Util.testUtil;
import google_dd_core.CoreTest;

public class googleTest_06 extends CoreTest {
	public SoftAssert softAssert;

	@BeforeTest
	public void init1() {

		if (!testUtil.isExecutable("googleTest_02")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}

	}

	@Test(priority = 6)
	public void OpenBrowser() throws IOException {
		try {
			softAssert = new SoftAssert();
			System.out.println("Open Browser");
			app_logs.debug("Open Browser");
			softAssert.assertAll();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_06");
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@Test(priority = 7)
	public void closeBrowser() throws IOException {
		try {
			System.out.println("close Browser");
			app_logs.debug("close Browser");
			softAssert.assertAll();
		} catch (Throwable t) {
			testUtil.captureScreenshot("googleTest_06");
			Assert.assertTrue(false, t.getMessage());
		}

	}

	@DataProvider
	public static Object[][] getData() {

		return testUtil.getData("googleTest_06");
	}
}
