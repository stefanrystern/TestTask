package com.arvato.master;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.arvato.browser.BrowserHandler;
import com.arvato.locators.ArvatoLocators;

public class ArvatoMaster {

	protected static WebDriver driver;
	
	protected WebElement headerAvaleht = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_AVALEHT));
	protected WebElement headerITKeskus = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_ITINNOVATSIOONIKESKUS));
	protected WebElement headerKlienditugi = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_KLIENDITOEKESKUS));
	protected WebElement headerKarjäär = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_KARJÄÄRARVATOS));
	protected WebElement headerKontakt = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_KONTAKT));
	
	protected WebElement headerHome;
	protected WebElement headerITDevCentre;
	protected WebElement headerCRDANDCS;
	protected WebElement headerOpenPos;
	protected WebElement headerContact;
	
	protected WebElement footerAvaleht = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_AVALEHT));
	protected WebElement footerITKeskus = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_ITINNOVATSIOONIKESKUS));
	protected WebElement footerKlienditugi = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_KLIENDITOEKESKUS));
	protected WebElement footerKarjäär = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_KARJÄÄRARVATOS));
	protected WebElement footerKontakt = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_KONTAKT));
	
	protected WebElement footerHome;
	protected WebElement footerITDevCentre;
	protected WebElement footerCRDANDCS;
	protected WebElement footerOpenPos;
	protected WebElement footerContact;
	
    @BeforeClass 
    public static void setUpTest() throws MalformedURLException {
    	driver = new BrowserHandler().setUpBrowser();  
		driver.get("http://arvato.ee/ee/avaleht/");
    }
    
	@AfterClass
    public static void tearDownTest() throws MalformedURLException {
		driver.quit();
    }
	
	protected void recalculateEEButtons(){
		headerAvaleht = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_AVALEHT));
		headerITKeskus = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_ITINNOVATSIOONIKESKUS));
		headerKlienditugi = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_KLIENDITOEKESKUS));
		headerKarjäär = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_KARJÄÄRARVATOS));
		headerKontakt = driver.findElement(By.xpath(ArvatoLocators.EE_HEADER_KONTAKT));
		
		footerAvaleht = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_AVALEHT));
		footerITKeskus = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_ITINNOVATSIOONIKESKUS));
		footerKlienditugi = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_KLIENDITOEKESKUS));
		footerKarjäär = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_KARJÄÄRARVATOS));
		footerKontakt = driver.findElement(By.xpath(ArvatoLocators.EE_FOOTER_KONTAKT));
	}
	
	private void recalculateENButtons(){
		headerHome = driver.findElement(By.xpath(ArvatoLocators.EN_HEADER_HOME));
		headerITDevCentre = driver.findElement(By.xpath(ArvatoLocators.EN_HEADER_ITDEVCENTRE));
		headerCRDANDCS = driver.findElement(By.xpath(ArvatoLocators.EN_HEADER_CRMANDCS));
		headerOpenPos = driver.findElement(By.xpath(ArvatoLocators.EN_HEADER_OPENPOSITIONS));
		headerContact = driver.findElement(By.xpath(ArvatoLocators.EN_HEADER_CONTACT));
		
		footerHome = driver.findElement(By.xpath(ArvatoLocators.EN_FOOTER_HOME));
		footerITDevCentre = driver.findElement(By.xpath(ArvatoLocators.EN_FOOTER_ITDEVCENTRE));
		footerCRDANDCS = driver.findElement(By.xpath(ArvatoLocators.EN_FOOTER_CRMANDCS));
		footerOpenPos = driver.findElement(By.xpath(ArvatoLocators.EN_FOOTER_OPENPOSITIONS));
		footerContact = driver.findElement(By.xpath(ArvatoLocators.EN_FOOTER_CONTACT));
	}
	
	protected void assertEEButtons(){
		recalculateEEButtons();
		assertEquals("Avaleht",headerAvaleht.getText());
		assertEquals("IT innovatsiooni- ja arenduskeskus",headerITKeskus.getText());
		assertEquals("Klienditoekeskus",headerKlienditugi.getText());
		assertEquals("Karjäär Arvatos",headerKarjäär.getText());
		assertEquals("Kontakt",headerKontakt.getText());
		assertEquals("Avaleht",footerAvaleht.getText());
		assertEquals("IT innovatsiooni- ja arenduskeskus",footerITKeskus.getText());
		assertEquals("Klienditoekeskus",footerKlienditugi.getText());
		assertEquals("Karjäär Arvatos",footerKarjäär.getText());
		assertEquals("Kontakt",footerKontakt.getText());		
	}
	
	protected void assertENButtons(){
		recalculateENButtons();
		assertEquals("Home",headerHome.getText());
		assertEquals("IT Development Centre",headerITDevCentre.getText());
		assertEquals("CRM & Customer Services",headerCRDANDCS.getText());
		assertEquals("Open positions",headerOpenPos.getText());
		assertEquals("Contact",headerContact.getText());
		
		assertEquals("Home",footerHome.getText());
		assertEquals("IT Development Centre",footerITDevCentre.getText());
		assertEquals("CRM & Customer Services",footerCRDANDCS.getText());
		assertEquals("Open positions",footerOpenPos.getText());
		assertEquals("Contact",footerContact.getText());		
	}
	
	protected void assertUrl(String url){
		assertEquals(url,driver.getCurrentUrl());
	}
}
