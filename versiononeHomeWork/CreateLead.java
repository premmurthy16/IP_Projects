package versiononeHomeWork;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "./geckodriver_32bit.exe");
		
				//FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://leaftaps.com/control/main");
		
		//maximize
		driver.manage().window().maximize();
		System.out.println("Window Maximized");
		//LoginId
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		
		
	    driver.findElementByClassName("decorativeSubmit").click();
	    
	    System.out.println("Login Sucessfully");
	    
	    driver.findElementByXPath("//*[@id='label']/a").click();
	    
	    driver.findElementByLinkText("Create Lead").click();
	    
	    System.out.println("User land to create lead page Sucessfully");
	    
	    driver.findElementById("createLeadForm_companyName").sendKeys("TestLeafCompanyOfTestCommitee" );
	    
	    driver.findElementByXPath("//INPUT[@id='createLeadForm_firstName']").sendKeys("MPrem");
	    
	    driver.findElementByXPath("//INPUT[@id='createLeadForm_lastName']").sendKeys("Murthy");
	    
	    //driver.findElementByClassName("smallSubmit").click(); 
	    
	    //System.out.println("Lead created Sucessfully");
	    
	  String parentWindow =driver.getWindowHandle();
	    
	    Thread.sleep(4000);
	    
	   driver.findElementByXPath("//input[@name='parentPartyId']/following::img").click();
	    
	  //driver.findElementById("ext-gen602").click();
	    
	    
	    Thread.sleep(10000);
	    
	    Set<String> childWindow=driver.getWindowHandles();
	    
	    for(String eachWindow:childWindow){
	    	
	    	if(!eachWindow.contentEquals(parentWindow)){
	    		
	    		driver.switchTo().window(eachWindow);
	    	    

	    		
	    		//driver.findElementByXPath("//a[@class='linktext'][1]").click();
	    		//Thread.sleep(5000);
	    		
	    		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	    		
	    		
	    	}
	    	
	    	driver.switchTo().window(parentWindow);
	    	
	    }
	    		
	    		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
	    		
	    		Select sourceValue=new Select(source);
	    		
	    		sourceValue.selectByVisibleText("Word of Mouth");
	    		
	    		
WebElement marketingCampaign=driver.findElementById("createLeadForm_marketingCampaignId");
	    		
	    		Select marketingCampaignValue=new Select(marketingCampaign);
	    		
	    		marketingCampaignValue.selectByVisibleText("eCommerce Site Internal Campaign");
	    		
	    		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("MPrem");
	    		
	    		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Murthy");
	    	
	    		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
	    		
	    		
	    		/*
	    		//String parentWindow2 =driver.getWindowHandle();
	    		driver.findElementById("createLeadForm_birthDate-button").click();
	    		
	    		 Thread.sleep(10000);
	    		    
	    		    //Set<String> childWindow2=driver.getWindowHandles();
	    		    
	    		   // for(String eachWindow2:childWindow2){
	    		    	
	    		    	//if(!eachWindow2.contentEquals(parentWindow2)){
	    		    		
	    		    		//driver.switchTo().window(eachWindow2);
	    		    		
	    		    		//Thread.sleep(2000);
	    		 
	    		 
	    		 
	    		 WebElement year=driver.findElementByXPath("//td[@class='button nav']/div[1]");
	    		    		
	    		 int i=0;
	    		 if(i<35){
	    		    		for(i=j;j<=35;j++){
	    		    			
	    		    			year.click();
	    		    			//driver.findElementByXPath("//td[@class='button nav']/div[1]").click();
	    		    			Thread.sleep(1000);
	    		    			i++;
	    		    			
	    		    		}	
	    		    		//if(i==35){
	    		    			
	    		    		WebElement month=driver.findElementByXPath("//td[@class='button nav']/following::div");
	    		    		
	    		    			
	    		    			for(int j=0;j<=1;j++){
		    		    			
	    		    				month.click();
		    		    			
		    		    			Thread.sleep(1000);
		    		    		
	    		    			
	    		    		}
	    		    			driver.findElementByXPath("//td[@class='day selected'=16]").click();

	    		    		//}
	    		    		
	    		    		Thread.sleep(5000);
	    		    		
		    		    
	    		    	for(int j=0;j<=1;j++){
	    		    			
	    		    			driver.findElementByXPath("//td[@class='button nav']/following::div").click();
	    		    			
	    		    			Thread.sleep(2000);
	    		    			j++;
	    		    			
	    		    		}
	    		    			
	    		    	
	    		    		
	    		    		
	    		    		//driver.findElementByXPath("//td[@class='day selected'=16]").click();
	    		    		
	    		    		//td[@class='button nav']/div
	    		    		
	    		
	    	//}
	    	
	    	//driver.switchTo().window(parentWindow2);
	    	
	    		//    }
	    	
	    	
	    
*/	}
	    


	}


