package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Test;


public class GroupTest1 {
	WebDriver d;

	@Test(groups="G1")
	public void meth1()
	{
		System.out.println("Meth1 in GT1");
		System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
		d = new FirefoxDriver();	
	}
	@Test(groups="G2")
	public void meth2() throws InterruptedException
	{
		System.out.println("Meth2 in GT2");
		d.get("https://www.amazon.in");
		Thread.sleep(3000);
	}
	@Test(groups="G1")
	public void meth3()
	{
		System.out.println("Meth3 in GT3");
		d.findElement(By.id("a-autoid-0-announce")).click();

		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
	}
	@Test(groups="G2")
	public void meth4() throws InterruptedException
	{
		System.out.println("Meth4 in GT4");
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
		d = new FirefoxDriver();
		d.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		d.get("https://www.amazon.in");
		Thread.sleep(3000);
		d.findElement(By.id("a-autoid-0-announce")).click();

		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));

		WebDriverWait waitforbutton = new WebDriverWait(d,30);
		waitforbutton.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
		waitforbutton.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'  Enter your email or mobile phone number')]")));
		waitforbutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Need help?')]")));
d.close();
	}

}
