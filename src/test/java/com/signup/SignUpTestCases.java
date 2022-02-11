package com.signup;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.SignIn.DataProvideIjmeet;
import com.ijmeet.cofig.BaseFrame;
import com.ijmeet.constants.Locators;


import static com.ijmeet.util.KeywordIjmeet.*;

import java.io.File;
import java.io.FileInputStream;
public class SignUpTestCases extends BaseFrame {

	private static final Logger log=Logger.getLogger(SignUpTestCases.class);
	/**
	 * @param name
	 * @param companyName
	 */
	@Test(enabled=false)
	public void fullName(String name) {
		click(Locators.signUpButton);
		enterText(Locators.fullName, name);
		

	}
	
	
	@Test(dataProvider="excel-data", dataProviderClass=DataProvideIjmeet.class)
      public void companyName(String companyName) {
		click(Locators.signUpButton);
		enterText(Locators.companyName,companyName);

	}
	

	
}
