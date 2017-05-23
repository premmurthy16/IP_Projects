package versiononeHomeWork;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLeadAttributeDemo {

	@Test(invocationCount=2, threadPoolSize=2)
	public void attrib_demo()
	{
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	//System.setProperty("webdriver.firefox.driver","./drivers/geckodriver_32bit.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/control/main");
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementByXPath("//*[@id='createLeadForm_companyName']").sendKeys("Test Leaf");
	driver.findElementByXPath("//*[@id='createLeadForm_firstName']").sendKeys("Vasanth");
	driver.findElementByXPath("//*[@id='createLeadForm_lastName']").sendKeys("kumar");
	driver.findElementByName("submitButton").click();
    //driver.findElementByXPath("//img[@alt='Lookup']").click();
	
	/*Set<String> allwindows=driver.getWindowHandles();
	for(String eachwindow:allwindows)
	{
		driver.switchTo().window(eachwindow);
		break;
	}
	driver.findElementByXPath("//*[@id='ext-gen280']").click();
	driver.close();
	driver.findElementByXPath("//*[@id='createLeadForm_firstName']").sendKeys("Vasanth");
	driver.findElementByXPath("//*[@id='createLeadForm_lastName']").sendKeys("kumar");
	Select src=new Select(driver.findElementById("createLeadForm_dataSourceId"));
	src.selectByVisibleText("Employee");
	Select mktg = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
	mktg.selectByVisibleText("Road and Track");
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("vasanth");
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("kumar");
	driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
	driver.findElementById("createLeadForm_departmentName").sendKeys("Selenium");
	driver.findElementById("createLeadForm_annualRevenue").sendKeys("150,000");
	Select ind=new Select(driver.findElementById("createLeadForm_industryEnumId"));
	ind.selectByVisibleText("Finance");
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("150");
	Select own = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
	own.selectByVisibleText("Sole Proprietorship");
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("150");
	driver.findElementById("createLeadForm_sicCode").sendKeys("NA");
	driver.findElementById("createLeadForm_tickerSymbol").sendKeys("NA");
	driver.findElementById("createLeadForm_description").sendKeys("Testing done here");
	driver.findElementById("createLeadForm_importantNote").sendKeys("Testing done here");
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();;
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("45658207");
	driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("468207");
	driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("vasanth");
	driver.findElementById("createLeadForm_primaryEmail").sendKeys("vasanthkmr381@gmail.com");
	driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("NA");
	driver.findElementById("createLeadForm_generalToName").sendKeys("vas");
	driver.findElementById("createLeadForm_generalAttnName").sendKeys("kumar");
	driver.findElementById("createLeadForm_generalAddress1").sendKeys("5 th st ");
	driver.findElementById("createLeadForm_generalAddress2").sendKeys("c sector");
	driver.findElementById("createLeadForm_generalCity").sendKeys("anna nagar");
	Select prov = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
	prov.selectByVisibleText("Florida");
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600087");
	driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("NA");
	driver.findElementByName("submitButton").click();
}
*/
	}

}
