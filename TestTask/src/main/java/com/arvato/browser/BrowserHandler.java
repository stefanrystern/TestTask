package com.arvato.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserHandler {
	
	private WebDriver driver;
	
	public WebDriver setUpBrowser() throws MalformedURLException{
		String webDriverParameter = System.getProperty("seleniumHub");
		if(webDriverParameter!=null){
			driver = new RemoteWebDriver(new URL(webDriverParameter), DesiredCapabilities.chrome());
		}
		else{
	        driver = new GoogleChrome().setUpBrowser();
		}
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().maximize();
        return driver;
	}

}
