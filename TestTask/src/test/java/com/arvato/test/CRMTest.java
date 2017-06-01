package com.arvato.test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import com.arvato.locators.ArvatoLocators;
import com.arvato.master.ArvatoMaster;

public class CRMTest extends ArvatoMaster{

	@Test
	public void CRMEEHeaderTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerKarjäär.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void CRMEEFooterTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerKarjäär.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void CRMENHeaderTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void CRMENFooterTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void CRMEEContentTest(){ 
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		driver.findElement(By.xpath("//a[contains(text(), '"+"Vabad töökohad"+"')]")).click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
	}
	
	@Test
	public void CRMENContentTest(){ 
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
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
