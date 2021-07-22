package com.qa.testScripts;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase1 {
	
	@Test
	public void setup() throws InterruptedException
	{
		// Start chrome browser
		System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		// open the addressboo app on the chrome browser
		
		driver.get("http://172.31.19.242:8081/");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		

	
	//	Thread.sleep(2000);
		//String test = driver.findElement(By.xpath("/html/body/p//*[@id="PID-ab2-pg"]")).click();
		driver.findElement(By.id("About Us")).click();
		
		String test = driver.findElement(By.id("PID-ab2-pg")).getText();
		System.out.println(test);
		assertEquals(test, "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		System.out.println("Test Succeeded!!");
	
	
	//System.out.println(driver.getTitle());
		System.out.println("Working!");
	
 driver.close();	
		
	
		
	}

}

