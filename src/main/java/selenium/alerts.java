package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class alerts {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		//This step will result in an alert on screen
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
		Alert simpleAlert = driver.switchTo().alert();
		 String alertText = simpleAlert.getText();
		 System.out.println("Alert text is = " + alertText);
		 simpleAlert.accept();
		 Assert.assertEquals("A simple Alert", alertText);

		//Once alert is present try to click on any button on the page
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();
		Alert simple = driver.switchTo().alert();
		 String simple_text = simple.getText();
		 System.out.println("simple_text  is = " + simple_text);
		 simpleAlert.dismiss();	
		 Assert.assertEquals("Confirm pop up with OK and Cancel button", simple_text);

	driver.close();}}
