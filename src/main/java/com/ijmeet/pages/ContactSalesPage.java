package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactSalesPage {
	
	@FindBy(xpath="//h4[contains(text(),'Mobile no.')]")
	public WebElement mobileNumber;
	@FindBy(xpath="//p[contains(text(),'info@ijtimaati.com ')]")
	public WebElement emailId;

	/**
	 * This method will return "mobile number" if join meeting loads successfully
	 */
	public String mobileNo() {
		return mobileNumber.getText();

	}
	
	/**
	 * This method will return "Email Id" if join meeting loads successfully
	 */
	public String getEmailId() {
		return emailId.getText();

	}
	

}
