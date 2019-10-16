package selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handling_frames {
		WebDriver d;

		@Test
		public void handling_frames() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Nisum/Desktop/jahangir/Softwares/geckodriver.exe");
		d = new FirefoxDriver();
		d.manage().window().maximize();

		d.get("https://seleniumhq.github.io/selenium/docs/api/java/");

		//assertEquals("Generated Documentation (Untitled)",d.getTitle());
		List<WebElement> f=d.findElements(By.tagName("frame"));
		System.out.println("No of frames:"+f.size());

		WebElement frame1 = d.findElement(By.xpath("//frameset/frameset/frame[1]"));
		d.switchTo().frame(frame1);
		//Type text
		String pack = d.findElement(By.xpath("//div[@class='indexContainer']/h2[1]")).getText();
		System.out.println("get the text if frame1 = " + pack);
		//Outside frame
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement frame2 = d.findElement(By.xpath("//frameset/frameset/frame[2]"));
		//WebElement frame2 = d.findElement(By.xpath("/html/frameset/frame")); 

		d.switchTo().frame(frame2);
		//Type text
		String pack1 = d.findElement(By.xpath("/html/body/div/ul/li[101]/a")).getText();
		System.out.println("get the text if frame2 = " + pack1);
				
		/*
			d.get("http://jqueryui.com/autocomplete/");
			assertEquals("Autocomplete | jQuery UI",d.getTitle());
			List<WebElement> f=d.findElements(By.tagName("iframe"));
			System.out.println("No of frames:"+f.size());
			//Switch driver focus to frame
			//d.switchTo().frame(d.findElement(By.className("demo-frame")));
			d.switchTo().frame(0);
			//Type text
			d.findElement(By.id("tags")).sendKeys("Selenium");
			//Outside frame
			d.switchTo().defaultContent();
			String text = d.findElement(By.xpath("//div[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).getText();
			System.out.println("print the text of element = " + text);
			Thread.sleep(4000);*/

		System.out.println("completed");
d.close();

	}}
