package com.arvato.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.arvato.locators.ArvatoLocators;
import com.arvato.master.ArvatoMaster;

public class MainPageTest extends ArvatoMaster{	
	
	@Test
	public void MainPageEEHeaderTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void MainPageEEFooterTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void MainPageENHeaderTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void MainPageENFooterTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@After
	public void postConditions(){
		driver.findElement(By.xpath(ArvatoLocators.EE_SWITCH)).click();
	}
	
}
