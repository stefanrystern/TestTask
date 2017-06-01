package com.arvato.test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import com.arvato.locators.ArvatoLocators;
import com.arvato.master.ArvatoMaster;

public class ITCentreTest extends ArvatoMaster{

	@Test
	public void ITCentreEEHeaderTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerKarjäär.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void ITCentreEEFooterTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerKarjäär.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void ITCentreENHeaderTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void ITCentreENFooterTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void ITCentreEEContentTest(){ 
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		driver.findElement(By.xpath("//a[contains(text(), '"+"Vabad töökohad"+"')]")).click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
	}
	
	@Test
	public void ITCentreENContentTest(){ 
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();;
		driver.findElement(By.xpath("//a[contains(text(), '"+"Open positions"+"')]")).click();
		assertUrl("http://arvato.ee/en/open-positions/");
	}
	
	@After
	public void preConditions(){
		driver.findElement(By.xpath(ArvatoLocators.EE_SWITCH)).click();
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
	}

}
