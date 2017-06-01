package com.arvato.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;

import com.arvato.locators.ArvatoLocators;
import com.arvato.master.ArvatoMaster;

public class ContactTest extends ArvatoMaster{

	@Test
	public void ContactEEHeaderTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void ContactEEFooterTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void ContactENHeaderTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();;
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
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void ContactENFooterTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
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
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@After
	public void preConditions(){
		driver.findElement(By.xpath(ArvatoLocators.EE_SWITCH)).click();
	}

}
