package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact {
@Test
	public void createcon() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize(); // to maximize window
		driver.findElementById("username").sendKeys("Demosalesmanager"); // to locate element and enter value
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click(); // to locate link and click on it
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Janani");
		driver.findElementById("lastNameField").sendKeys("Shann");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("localone");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("localtwo");
		driver.findElementByName("departmentName").sendKeys("Price");
		driver.findElementByName("description").sendKeys("Some random text");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("jane12@cactus.com");
		WebElement elementById = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dropd=new Select(elementById);
		dropd.selectByVisibleText("New York");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementByXPath("//textarea[@name='description']").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("notes");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		String title = driver.getTitle();
		System.out.println(title);	
		
	}

}
