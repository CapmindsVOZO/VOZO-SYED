package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageobjectmanager.Pageobjectmanager;





public class Parallel_Base {
	
	public static WebDriver driver;
	
	//public static  Pageobjectmanager pom = new Pageobjectmanager(driver);

	// Driver Invoke

	

	@BeforeMethod
	public void preCondition() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		// driver(new ChromeDriver());

		// maxi
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

//	@AfterMethod
//	public void postCondition() {
//
//		driver.close();
//	}

	public static void geturl(String url) {

		driver.get(url);

	}
	
	public static void sendkeys(WebElement elements, String Value) {

		elements.sendKeys(Value);

	}

	public static void Clickonelement(WebElement element) {

		element.click();

	}

	public static void clear(WebElement elements1) {

		elements1.clear();

	}
	


}
