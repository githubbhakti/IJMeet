package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class SignInPage extends PageBase {
	@FindBy(css = "a.nav-right-cutom-bg")
	public WebElement SignIn;

	@FindBy(css = "input#email")
	public WebElement EmailAddress;
	
	@FindBy(css="input#password")
	public WebElement Password;
	
	@FindBy(css="input.form-check-input")
	public WebElement RememberMe;
	
	@FindBy(css="button.font-weight-medium")
	public WebElement FinalSignIn;

	public void clickOnSignIn() {
		SignIn.click();

	}

	//@DataProvider(name="Email",dataProviderClass=DataProviderIjMeet.class)
	public void enterEmailAddress(String Email) {
		EmailAddress.sendKeys(Email);

	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickOnRememberMe() {
		RememberMe.click();

	}
	
	public void clickOnFinalSignInButton() {
		FinalSignIn.click();

	}
	
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

}
