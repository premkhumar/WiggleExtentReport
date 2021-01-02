package org.pages;

import java.io.File;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends LibGlobal {
	public static ExtentReports report;
	public static ExtentTest test;
	@BeforeSuite
	private void browserLaunch() {
		
		report = new ExtentReports("C:\\Users\\SAM\\Desktop\\Java\\Wiggle\\Reprots\\results.html");
		test = report.startTest("report generation");
		browserLaunchChrome();
		maxWindows();
		enterUrl("https://www.wiggle.co.uk/");
		implicitWait(10);
	}
	
	
	@Test
	private void testcase() {

		WebElement lnkAccessories = driver.findElement(By.xpath("//a[text()='Accessories']"));
		lnkAccessories.click();
		if (driver.getCurrentUrl().equals("https://www.wiggle.co.uk/accessories")) {
			
			test.log(LogStatus.PASS, "Links Works");
			
		}
		else {
			test.log(LogStatus.FAIL, "Link Not working");
		}
	}
	
	@AfterClass
	private void endTest() {

		report.endTest(test);
		report.flush();
	}

}
