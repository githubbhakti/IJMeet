package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;



public class Homepage extends PageBase {
	
	private static final Logger log=Logger.getLogger(Homepage.class);
	@FindBy(css="a.nav-link.font-weight-bold")
	public WebElement joinMeet;
	
	@FindBy(xpath="//a[contains(text(),'Contact sales')]")
	public WebElement contactSales;
	
	@FindBy(css="a.nav-link.nav-right-cutom-bg-1.font-weight-bold")
	public WebElement signUp;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void cilckOnJoinMeeting()
	{
		joinMeet.click();
		log.info("Clikced on Join Meeting");
		
	}
	public void clickOnContactSales() {
		contactSales.click();
		log.info("mobile Number");

	}
	public void clickOnSignUpButtton()
	{
		signUp.click();
		log.info("Clicked on signUp");
	}

}
