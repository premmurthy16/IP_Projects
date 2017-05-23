package versiononeHomeWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MergeLead extends ProjectWrapper {



		/**
		 * @param args
		 * @throws InterruptedException 
		 */
		RemoteWebDriver driver;
		//static String parentWin;
		
		
		@Test(invocationCount=5)
		public void launchBrowser() throws InterruptedException{
			
			/*invokeApp("chrome", "http://leaftaps.com/control/main");
	   
			
			enterById("username", "DemoSalesManager");
			
			
			enterById("password", "crmsfa");
		
			clickByClassName("decorativeSubmit");
		*/ 
			clickByLink("CRM/SFA");
		   
			clickByLink("Leads");
		  
			clickByLink("Merge Leads");
		 
		   
		   
			 getParentWindow();
			  Thread.sleep(3000);
			clickByXpath("(//img[@alt='Lookup'])[1]");
		
		   Thread.sleep(3000);
		   switchToLastWindow();
		  
		   clickByXpathSendKey("//label[contains(text(),'Lead ID:')]/following::input", "12190");
		   
		   System.out.println("First Lead Id Entered");
		  
		   clickByXpath("//button[contains(text(),'Find Leads')]");
		  
				   Thread.sleep(3000);
				   clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			
				   
				   switchbackParentWindow();
				  
		   
				   
	 		  
	clickByXpath("(//img[@alt='Lookup'])[2]");  		
		
		 
		   Thread.sleep(3000);
		   getParentWindow();
		
		   
		 
		   Thread.sleep(3000);
		   switchToLastWindow();
		   clickByXpathSendKey("//label[contains(text(),'Lead ID:')]/following::input", "12194");
		   System.out.println("2nd  Lead Id Entered");
					
		   clickByXpath("//button[contains(text(),'Find Leads')]");  
					   
					
					   
					   Thread.sleep(5000);
					   clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");  
				
					   switchbackParentWindow();
			
				 
					   clickByLink("Merge");
					   System.out.println("Merge button clicked");
		
					   Thread.sleep(3000);
					   acceptAlert();
					   
					   System.out.println("Alert accept popup is clicked");
				
				  Thread.sleep(3000);
				  clickByLink("Find Leads");
				  System.out.println("Find Leads is clicked");
				
				  
				  clickByXpathSendKey("//label[contains(text(),'Lead ID:')]/following::input", "12190");
				  System.out.println("Lead Id is Passed");
				
				  Thread.sleep(3000);
				  System.out.println("Find Leads is clicked Again");
				  clickByXpath("//button[contains(text(),'Find Leads')]");
				
				  
				  Thread.sleep(5000);
				  
				  String textDisplay=getTextByXpath("//div[contains(text(),'No records to display')]");
				
				 Thread.sleep(5000);
			
			
		   }
		   
		   
		}




	