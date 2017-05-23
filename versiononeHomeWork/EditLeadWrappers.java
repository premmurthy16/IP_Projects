package versiononeHomeWork;

import org.testng.annotations.Test;

import week2.Homework.com.ProjectWrapper;

public class EditLeadWrappers extends ProjectWrapper{

	@Test(groups={"sanity"},dependsOnMethods="Testcases.HwLeafTaps.CreateLeads",alwaysRun=true)
	public void edit()
	{
		//login();
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]","vasanth");
		clickByXpath("(//button[@class='x-btn-text'])[7]");
		clickByXpath("//div[@classx-grid3-cell-inner x-grid3-col-partyId]/a)[1]");
		verifyTitle("View Lead | opentaps CRM");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName","Test");
		clickByLink("Update");
		verifyTextIdContains("viewLead_companyName_sp", "Test");
		//verifyTextIdContains("viewLead_companyName_sp", "Test");
		closeBrowser();

}

	private void verifyTextIdContains(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	
}
