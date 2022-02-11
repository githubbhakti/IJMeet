package com.SignIn;

import static com.ijmeet.util.KeywordIjmeet.*;

import org.testng.annotations.Test;

import com.ijmeet.cofig.BaseFrame;
import com.ijmeet.pages.SignInPage;


@Test(dataProvider="excel-data", dataProviderClass=DataProvideIjmeet.class)
public class SignInTest extends BaseFrame{
	@Test(enabled=false)
	public void verifyClickOnSignInButton() {

			SignInPage s=new SignInPage();
			s.clickOnSignIn();
			s.enterEmailAddress("bhaktizurunge@gmail.com");
			waitForElement(2000);
			s.enterPassword("Ijmeetbhakti@02");
			s.clickOnRememberMe();
			s.clickOnFinalSignInButton();

	}
	//@Test(dataProvider="excel-data", dataProviderClass=DataProvideIjmeet.class)
	@Test
	public void VerifyEnterEmailIdIsValid(String email,String Password) {
		SignInPage s=new SignInPage();
		s.clickOnSignIn();
		s.enterEmailAddress(email);
		waitForElement(2000);
		//s.enterPassword("Ijmeetbhakti@02");
		s.enterPassword(Password);
		s.clickOnRememberMe();
		s.clickOnFinalSignInButton();

	}
	/*@Test(dataProvider="excel-data1", dataProviderClass=DataProvideIjmeet.class)
	public void VerifyEnterPasswordIsVaild(String Password) {
		
		SignInPage s=new SignInPage();
		s.clickOnSignIn();
		s.enterEmailAddress("bhaktizurunge@gmail.com");
		s.enterPassword(Password);
		waitForElement(2000);
		s.clickOnRememberMe();
		s.clickOnFinalSignInButton();

	}*/
	
	
	

}
