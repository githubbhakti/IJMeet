package com.ijmeet.util;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ijmeet.cofig.BaseFrame;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeywordIjmeet extends BaseFrame {

	
	public static void verifyBrowser(String url) {
		if(url.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(url.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browser name");
		}
	}
	public static WebElement getWebElement(String locator,String locatorValue)
	{
		if(locator.equalsIgnoreCase("xpath"))
		{
			return driver.findElement(By.xpath(locatorValue));
		}
		else if(locator.equalsIgnoreCase("css"))
		{
			return driver.findElement(By.cssSelector(locatorValue));
		}
		else
		{
			System.out.println("invalid path");
		}
		return null;
		
	}
	@Deprecated
	public static void click(String locatorType,String locatorValue2) {
		getWebElement(locatorType, locatorValue2).click();
		
	}
	public static void click(String locator)
	{
		String[] parts=locator.split("##");
		getWebElement(parts[0], parts[1]).click();
	}
	
	@Deprecated
	public static void enterText(String locatorType,String locatorValue2,String text)
	{
		getWebElement(locatorType, locatorValue2).sendKeys(text);
	}
	
	public static void enterText(String locator,String text)
	{
		String[] parts=locator.split("##");
		getWebElement(parts[0], parts[1]).sendKeys(text);
	}
	public static void waitForElement(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
	public static void scrollWindow(int a,int b) {
		driver.executeScript("window.scrollBy(a,b)", " ");

	}
	public static void launchURL(String url) {
		driver.get(url);

	}
	public static void close() {
		driver.quit();

	}
}
