package com.homepage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ijmeet.cofig.BaseFrame;
import com.ijmeet.pages.ContactSalesPage;
import com.ijmeet.pages.Homepage;

import junit.framework.Assert;

import static com.ijmeet.util.KeywordIjmeet.*;
public class ContactSales extends BaseFrame {
	
	@Test(enabled=false)
	public void verifyOnMobileNumberIsGetting() {
		Homepage home=new Homepage();
		waitForElement(3000);
		home.clickOnContactSales();
		waitForElement(3000);
		ContactSalesPage sales=PageFactory.initElements(driver,ContactSalesPage.class);
		

	}
	
	@Test
	public void verfiyEmailIdIsGetting() {
		Homepage home=new Homepage();
		waitForElement(3000);
		home.clickOnContactSales();
		waitForElement(3000);
		ContactSalesPage page=PageFactory.initElements(driver, ContactSalesPage.class);
		String actual=page.getEmailId();
		Assert.assertEquals(page, "info@ijtimaati.com");

	}
	

}
