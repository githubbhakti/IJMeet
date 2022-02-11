package com.ijmeet.cofig;

import com.ijmeet.util.PropUtil;

public class Config {

	
	public String getAppUrl() {
		PropUtil prop=new PropUtil();
		String dir=System.getProperty("user.dir");
		 return prop.getValue(dir+"src/main/resources/application.properties", "app.url");

	}
	
	public String getBrowserName() {
		PropUtil prop=new PropUtil();
		String dir=System.getProperty("user.dir");
		return prop.getValue(dir+"/src/main/resources/application.properties", "app.browser.name");
	
	}
	
}
