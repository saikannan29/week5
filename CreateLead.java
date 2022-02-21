package week5.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
  @Test(dataProvider="CreateLead")
		public void createLead(String lName,String company,String id) {
			// TODO Auto-generated method stub
		
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Kannan3");
			driver.findElement(By.id("lastNameField")).sendKeys(lName);
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(id);
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(lName);
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys(company);
			driver.findElement(By.id("createContactForm_description"))
			.sendKeys("Software Quality Assurance. Manual and Automation");
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kannan29@gmail.com");
			WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select obj1 = new Select(state);
			obj1.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();

			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium Automation");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			String str = driver.getTitle();
			System.out.println(str);

		}

@DataProvider(name="CreateLead")
  public String[][] sendData() throws IOException{
		/*
		 * String [][] data = new String[2][2]; data [0][0]= "TestLeaf"; data [0][1]=
		 * "Loganathan";
		 * 
		 * data [1][0]= "Hcl"; data [1][1]= "Lakshu"; return data;
		 */
	return ReadExcel.readData("CreateLead");
	  
	 
	  
  }
	

  }

