package versiononeHomeWork;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrapper{

	RemoteWebDriver driver;
	String parentWindow;

	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver(); // launch browser	
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver(); // launch browser	
		}		
		driver.get(url); // enter url 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		parentWindow = driver.getWindowHandle();
		System.out.println("The Browser "+browser+" launched successfully");
	}

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The Text field "+idValue+ " is entered with text data");
		} catch (NoSuchElementException e) {
		   System.err.println("element"+idValue+" is not found");
			e.printStackTrace();
		}

	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(nameValue).sendKeys(data);
			System.out.println("The Text field with ClassName"+nameValue+ " is entered with text data");
		} catch (NoSuchElementException e) {
			   System.err.println("element"+nameValue+" is not found");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The Text field with xpath"+xpathValue+ " is entered with text data");
		} catch (NoSuchElementException e) {
			System.err.println("xpath"+xpathValue+" is not found");
			e.printStackTrace();
		}

	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			if(driver.getTitle().equals(title))
				System.out.println("verified the title "+title+"successfully" );
			else
				System.out.println("The title "+ driver.getTitle()+"does not present" );
		} catch (NoSuchElementException e) {
			System.err.println("xpath"+title+" is not found");
			e.printStackTrace();
		}
	}

	public void verifyTextById(String id, String text) {
		
		try {
			if(driver.findElementById(id).getText().equals(text))
				System.out.println("verified the text "+ text+"successfully" );
			else
				System.out.println("The text "+ text+"is not present" );
		} catch (NoSuchElementException e) {
			System.err.println("xpath"+ text+" is not found");
			e.printStackTrace();
		}

	}

	public void verifyTextByXpath(String xpath, String text) {
		
		try {
			if(driver.findElementByXPath(xpath).getText().equals(text))
				System.out.println("verified the text "+ text+"successfully" );
			else
				System.out.println("The text "+ text+"is not present" );
		} catch (NoSuchElementException e) {
			System.err.println("xpath"+ text+" is not found");
			e.printStackTrace();
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {		
		// TODO Auto-generated method stub
		try {
			if(driver.findElementByXPath(xpath).getText().equals(text))
				System.out.println("verified the text "+ text+"successfully" );
			else
				System.out.println("The text "+ text+"is not present" );
		} catch (NoSuchElementException e) {
			System.err.println("xpath"+ text+" is not found");
			e.printStackTrace();
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		driver.findElementById(id).click();
		System.out.println("The Buttton with ID  "+id+ " is clicked");
	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The Buttton with class Name "+classVal+ " is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub		
		try {
			driver.findElementByName(name).click();
			System.out.println("The Buttton with Name "+name+ " is clicked");
		} catch (NoSuchElementException e) {
			   System.err.println("element"+name+" is not found");
			e.printStackTrace();
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		driver.findElementByLinkText(name).click();
		System.out.println("The Link "+name+ " is clicked");
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The Link "+name+ " is clicked");
		} catch (NoSuchElementException e) {
			   System.err.println("element"+name+" is not found");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The Link/button with XPath "+xpathVal+ " is clicked");
		} catch (NoSuchElementException e) {
			   System.err.println("element"+xpathVal+" is not found");
			e.printStackTrace();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The Link/button with XPath "+xpathVal+ " is clicked");
		} catch (NoSuchElementException e) {
			   System.err.println("element"+xpathVal+" is not found");
			e.printStackTrace();
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		System.out.println("The Text of "+idVal +" is " + driver.findElementById(idVal).getText() );
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String value = driver.findElementByXPath(xpathVal).getText();
		System.out.println("The Text of "+xpathVal +" is " + value );
		return value;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		Select dropDowns = new Select(driver.findElementById(id));
		dropDowns.selectByVisibleText(value);
		System.out.println("Selected "+value +"from dropdown " + id );
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		Select dropDowns = new Select(driver.findElementById(id));
		dropDowns.selectByIndex(value);
		System.out.println("Selected "+value +"from dropdown " + id );
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		driver.switchTo().window(parentWindow);
		System.out.println("Switched to Parent Window "+driver.getCurrentUrl());
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		for ( String eachwindow : allWindows) {
			driver.switchTo().window(eachwindow);
		}
			System.out.println("Switched to "+driver.getCurrentUrl()+ " window");
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		String alertText=  driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(" The alert " + alertText + " is accepted ");

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		String alertText=  driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(" The alert "+ alertText+ " is dismissed ");
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		System.out.println(" The alert is  " + driver.switchTo().alert().getText() );
		return null;
	}

	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	public void takeSnapshot() throws IOException {
		// TODO Auto-generated method stub
		File tmp=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snapshot/snap1.jpeg");
		FileUtils.copyFile(tmp, dest);
	}
public void verifyTextIdContains(String id, String text) {
		
		try {
			if(driver.findElementById(id).getText().contains(text))
				System.out.println("verified the text "+ text+"successfully" );
			else
				System.out.println("The text "+ text+"is not present" );
		} catch (NoSuchElementException e) {
			System.err.println("xpath"+ text+" is not found");
			e.printStackTrace();
		}

	}
public void enterByIdphone(String idValue, String data,String idValue2, String data2 ) {
	try {
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		driver.findElementById(idValue2).clear();
		driver.findElementById(idValue2).sendKeys(data2);
		System.out.println("area code field "+idValue+ " is entered with text data");
		System.out.println("phone number field "+idValue2+ " is entered with text data");
	} catch (NoSuchElementException e) {
	   System.err.println("element"+idValue+" is not found");
	   System.err.println("element"+idValue2+" is not found");
		e.printStackTrace();
	}

}
	
	

}
