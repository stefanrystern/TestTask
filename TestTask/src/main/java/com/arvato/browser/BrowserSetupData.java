package com.arvato.browser;

public class BrowserSetupData {

	//GOOGLE CHROME SETUP
	public String GC_DRIVER_PROPERTY;
	public String GC_DRIVER_PATH;
	public String GCS_DISABLE_EXTENSIONS;
	public String GCS_DISABLE_TRANSLATE;
	public String GCS_START_MAXIMIZED;
	
	public BrowserSetupData(){
		
		//GOOGLE CHROME SETUP
		GC_DRIVER_PROPERTY = "webdriver.chrome.driver";
		GC_DRIVER_PATH = "src\\main\\resources\\chromedriver.exe";
		GCS_DISABLE_EXTENSIONS = "--disable-extensions";
		GCS_DISABLE_TRANSLATE = "--disable-translate";
		GCS_START_MAXIMIZED = "--start-maximized";
		
	}
	
}
