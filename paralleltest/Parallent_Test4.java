package com.paralleltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallent_Test4 {

	WebDriver driver;

	@Test
	public void Test4() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://ehr.vozo.xyz:444/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@id='normal_login_username'])[1]")).sendKeys("tech1");

		driver.findElement(By.xpath("(//input[@id='pass_show'])[1]")).sendKeys("capminds@03");

		driver.findElement(By.xpath("(//span[normalize-space()='Sign In'])[1]")).click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[normalize-space()='Schedule'])[1]")).click();

		// cli cal
		
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//td[@role='gridcell'])[7]")).click();

		// sear pat

		driver.findElement(By.xpath("(//div[normalize-space()='Search Patient'])[1]")).click();

		// clic pat

		driver.findElement(By.xpath("(//span[normalize-space()='testpatient1'])[1]")).click();

		// clic prof

		driver.findElement(By.xpath("(//div[normalize-space()='Profile'])[1]")).click();

		// sele prof

		driver.findElement(By.xpath("(//span[normalize-space()='In Office'])[1]")).click();

		// clic stat

		driver.findElement(By.xpath("(//div[normalize-space()='Status'])[1]")).click();
		// sele stat

		driver.findElement(By.xpath("(//span[normalize-space()='In Lobby'])[1]")).click();

		// clci canc

		//driver.findElement(By.xpath("(//button[contains(@class,'close-btn btn btn-light')])[1]")).click();

		System.out.println("test4 complete");

	}

}
