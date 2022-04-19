package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




public class Parallel_Login extends Parallel_Base {

	public WebDriver driver;
	
	public  Parallel_Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}
	
	
	
	

	@FindBy(how = How.XPATH, using = "(//input[@id='normal_login_username'])[1]")
	WebElement enterusername;

	public Parallel_Login getenterUser() {

		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		enterusername.sendKeys("tech1");
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//input[@id='pass_show'])[1]")
	WebElement passw;

	public Parallel_Login getpasswo() {

		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		passw.sendKeys("capminds@03");
		return this;
	}
	
	
	
	@FindBy(how = How.XPATH, using = "(//span[normalize-space()='Sign In'])[1]")
	WebElement logbtn;

	public Parallel_Login getlogbtn() throws InterruptedException {

		
		Thread.sleep(2000);

		logbtn.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//a[normalize-space()='Schedule'])[1]")
	WebElement clishe;

	public Parallel_Login getclish() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		clishe.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//td[@role='gridcell'])[7]")
	WebElement calcli;

	public Parallel_Login getcalclin() throws InterruptedException {

		
		Thread.sleep(5000);

		calcli.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//td[contains(@role,'gridcell')])[4]")
	WebElement calcli1;

	public Parallel_Login getcalclin1() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		calcli1.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//div[normalize-space()='Search Patient'])[1]")
	WebElement searpat;

	public Parallel_Login getsearpat() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		searpat.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//span[normalize-space()='DhilipKumar'])[1]")
	WebElement clipat;

	public Parallel_Login getclipat() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		clipat.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//div[normalize-space()='Profile'])[1]")
	WebElement clipro;

	public Parallel_Login getcliprot() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		clipro.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//span[normalize-space()='In Office'])[1]")
	WebElement clipros;

	public Parallel_Login getclipros() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		clipros.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//div[normalize-space()='Status'])[1]")
	WebElement clistat;

	public Parallel_Login getclistat() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		clistat.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//span[normalize-space()='In Lobby'])[1]")
	WebElement selesta;

	public Parallel_Login getselesta() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		selesta.click();
		return this;
	
	}
	
	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'close-btn btn btn-light')])[1]")
	WebElement selecan;

	public Parallel_Login getselecan() throws InterruptedException {

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		selecan.click();
		return this;
	
	}
	
	
}

