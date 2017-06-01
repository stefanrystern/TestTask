package com.arvato.test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import com.arvato.locators.ArvatoLocators;
import com.arvato.master.ArvatoMaster;

public class OpenPositionsTest extends ArvatoMaster{

	@Test
	public void OpenPositionsEEHeaderTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		headerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void OpenPositionsEEFooterTest(){
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
		footerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerKlienditugi.click();
		assertUrl("http://arvato.ee/ee/klienditoekeskus/");
		assertEEButtons();
		footerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerITKeskus.click();
		assertUrl("http://arvato.ee/ee/it-innovatsiooni-ja-arenduskeskus/");
		assertEEButtons();
		footerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerKontakt.click();
		assertUrl("http://arvato.ee/ee/kontakt/");
		assertEEButtons();
		footerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		footerAvaleht.click();
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();
	}
	
	@Test
	public void OpenPositionsENHeaderTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		headerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		headerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void OpenPositionsENFooterTest(){
		driver.findElement(By.xpath(ArvatoLocators.EN_SWITCH)).click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerCRDANDCS.click();
		assertUrl("http://arvato.ee/en/crm-customer-services/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerITDevCentre.click();
		assertUrl("http://arvato.ee/en/it-development-centre/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerContact.click();
		assertUrl("http://arvato.ee/en/contact/");
		assertENButtons();
		footerOpenPos.click();
		assertUrl("http://arvato.ee/en/open-positions/");
		assertENButtons();
		footerHome.click();
		assertUrl("http://arvato.ee/en/frontpage/");
		assertENButtons();
	}
	
	@Test
	public void OpenPositionsEEContentTest(){ 
		assertUrl("http://arvato.ee/ee/avaleht/");
		assertEEButtons();;
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"IT Centre Coordinator"+"')]")).click();
		assertUrl("http://arvato.ee/job/it-centre-coordinator/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"Testing/Automation Specialist"+"')]")).click();
		assertUrl("http://arvato.ee/job/testingautomation-specialist/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"Full Stack JavaScript Developer"+"')]")).click();
		assertUrl("http://arvato.ee/job/full-stack-javascript-developer/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+".NET Developer"+"')]")).click();
		assertUrl("http://arvato.ee/job/node-js-developer/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"German speaking Java Developer"+"')]")).click();
		assertUrl("http://arvato.ee/job/german-speaking-java-developer/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"HR Intern"+"')]")).click();
		assertUrl("http://arvato.ee/job/personalitoo-praktikant/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"Danish speaking Customer Service Specialist"+"')]")).click();
		assertUrl("http://arvato.ee/job/crm-2/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"Swedish speaking Back Office Agent"+"')]")).click();
		assertUrl("http://arvato.ee/job/java-developer-2/");
		assertEEButtons();
		
		headerKarj‰‰r.click();
		assertUrl("http://arvato.ee/ee/karjaar-arvatos/");
		assertEEButtons();
		driver.findElement(By.xpath("//h3[contains(text(), '"+"Dutch speaking Customer Service Specialist"+"')]")).click();
		assertUrl("http://arvato.ee/job/french-speaking-customer-support-agent/");
		assertEEButtons();
		
	}
	
	@After
	public void preConditions(){
		driver.findElement(By.xpath(ArvatoLocators.EE_SWITCH)).click();
	}

}
