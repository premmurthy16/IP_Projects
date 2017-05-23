package versiononeHomeWork;

import org.testng.annotations.Test;

import week2.Homework.com.ProjectWrapper;

public class DuplicateLeadWrapper extends ProjectWrapper{

	@Test
	public void dulipcateLeads() throws Exception{
		invokeApp("chrome","http://www.leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkNoSnap("CRM/SFA");
		clickByLinkNoSnap("Create Lead");
		enterById("createLeadForm_companyName","TestLeaf");
		enterById("createLeadForm_firstName", "vasanth");
		enterById("createLeadForm_lastName", "kumar");
		clickByXpathNoSnap("(//div[@class='fieldgroup-body'])/table/tbody/tr[1]/td[4]/a");
		switchToLastWindow();
		enterByXpath("//*[@id='ext-gen25']","13246");
		clickByClassName("x-btn-text");
		Thread.sleep(2000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		selectVisibileTextById("createLeadForm_dataSourceId","Conference");
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Pay Per Click Advertising");			
		enterById("createLeadForm_firstNameLocal", "firstNameVK");
		enterById("createLeadForm_lastNameLocal", "lastNameVK");
		enterById("createLeadForm_personalTitle", "Mr.");
		enterById("createLeadForm_birthDate", "10/07/89");
		enterById("createLeadForm_generalProfTitle","Engineer");
		enterById("createLeadForm_departmentName","QA");
		enterById("createLeadForm_annualRevenue","100000");
		selectVisibileTextById("createLeadForm_currencyUomId","INR - Indian Rupee");
		selectVisibileTextById("createLeadForm_industryEnumId","Computer Software");
		enterById("createLeadForm_numberEmployees","100");
		selectVisibileTextById("createLeadForm_ownershipEnumId","Partnership");
		enterById("createLeadForm_sicCode","12243569");
		enterById("createLeadForm_tickerSymbol", "check");
		enterById("createLeadForm_description", "good company");
		enterById("createLeadForm_importantNote", "emminent employee");
		enterById("createLeadForm_primaryPhoneCountryCode", "91");
		enterById("createLeadForm_primaryPhoneNumber", "9876543210");
		enterById("createLeadForm_primaryPhoneAreaCode", "044");
		enterById("createLeadForm_primaryPhoneAskForName","9638527410");
		enterById("createLeadForm_primaryEmail", "test@testleaf.com");
		enterById("createLeadForm_primaryWebUrl", "www.test.com");
		enterById("createLeadForm_generalToName", "ramesh");
		enterById("createLeadForm_generalAttnName","tester");
		enterById("createLeadForm_generalAddress1", "5th st");
		enterById("createLeadForm_generalAddress2", "ram nagar");
		enterById("createLeadForm_generalCity", "chennai");			
		enterById("createLeadForm_generalPostalCode", "600053");
		selectVisibileTextById("createLeadForm_generalCountryGeoId", "India");
		enterById("createLeadForm_generalPostalCodeExt", "111");
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId", "TAMILNADU");
		clickByClassName("smallSubmit");
		clickByLinkNoSnap("Duplicate Lead");
		clickByXpathNoSnap("(//div[@class='fieldgroup-body'])/table/tbody/tr[1]/td[4]/a");
		switchToLastWindow();
		enterByXpath("//*[@id='ext-gen25']","13251");
		clickByClassName("x-btn-text");
		Thread.sleep(2000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		selectVisibileTextById("createLeadForm_dataSourceId","Employee");
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Car and Driver");			
		clickByClassName("smallSubmit");
		takeSnap();
		closeAllBrowsers();
	}
	
}
