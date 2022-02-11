package com.ijmeet.cofig;

import static com.ijmeet.util.KeywordIjmeet.close;
import static com.ijmeet.util.KeywordIjmeet.launchURL;
import static com.ijmeet.util.KeywordIjmeet.verifyBrowser;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseFrame {
	
	public static RemoteWebDriver driver;
	@BeforeMethod
	public static void loginURL() {
		verifyBrowser("chrome");
		//Config con=new Config();
		//con.getAppUrl();
		launchURL("https://www.ijmeet.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public static void tearDown() {
		close();

	}
	

}
