package selenium;

import static org.testng.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handling_frames {
	public static void main(String[] args) throws ParseException, InterruptedException {

	WebDriver d;
	System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
	d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.toolsqa.com/iframe-practice-page/");

			assertEquals("IFrame practice page",d.getTitle());
			/*List<WebElement> f=d.findElements(By.tagName("iframe"));
			System.out.println("No of frames:"+f.size());*/
			
			//By executing a java script
			JavascriptExecutor exe = (JavascriptExecutor) d;
			Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("Number of iframes on the page are " + numberOfFrames);

			//By finding all the web elements using iframe tag
			List<WebElement> iframeElements = d.findElements(By.tagName("iframe"));
			System.out.println("The total number of iframes are " + iframeElements.size());
			
			d.switchTo().frame(0);
			//Type text
			String frame1 = d.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[8]/ul/li[2]/a/span/span")).getText();
			System.out.println("get the text if frame1 = " + frame1);
			//Outside frame
			
			WebElement iframeElement = d.findElement(By.xpath("//*[@id=\"IF2\"]"));

			d.switchTo().frame(iframeElement);
			String frame2 = d.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/h3")).getText();
			System.out.println("get the text if frame1 = " + frame2);
			//Outside frame
			d.switchTo().defaultContent();
			System.out.println("get the text if frame1 after switch default = " + frame1);

			//d.findElement(By.linkText("Button")).click();
					
			System.out.println("completed");
		

}}
