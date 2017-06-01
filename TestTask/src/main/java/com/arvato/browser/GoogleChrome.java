package com.arvato.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleChrome extends Browser{
	
	private WebDriver driver;
	private BrowserSetupData bsd = new BrowserSetupData();
	
	@Override
	public WebDriver setUpBrowser() {

		System.setProperty(bsd.GC_DRIVER_PROPERTY, bsd.GC_DRIVER_PATH);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments(bsd.GCS_DISABLE_EXTENSIONS, bsd.GCS_DISABLE_TRANSLATE, bsd.GCS_START_MAXIMIZED);
		driver = new ChromeDriver(opt);
		
		return driver;
		
	}

}
