package week5.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
 public ChromeDriver driver;
  @BeforeMethod
  @Parameters({"url","username","password"})
  public void beforeMethod(String url,String uName,String password) {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
