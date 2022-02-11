package com.ijmeet.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.ijmeet.cofig.BaseFrame;

public class PageBase {

	
	public RemoteWebDriver driver;
	
	 public PageBase() {
	   this.driver=	new BaseFrame().driver;
	   
	}
}
