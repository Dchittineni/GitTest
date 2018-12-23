package com.test.gurubank;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver = null;

	@BeforeSuite
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/dchittineni/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");

	}

	@AfterSuite
	public void afterTest() {
		BaseTest.driver.quit();
	}

}
