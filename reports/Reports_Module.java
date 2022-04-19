package com.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports_Module {

	public WebDriver driver;

	public Reports_Module(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(xpath = "(//a[normalize-space()='Reports'])[1]")
	private WebElement ClickReportmod;

	public WebElement getClickReportmod() {
		return ClickReportmod;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Patient Report'])[1]")
	private WebElement Clickpatientrep;

	public WebElement getClickpatientrep() {
		
		
		return Clickpatientrep;
	}
	
	@FindBy(xpath = "(//input[@placeholder='From'])[1]")
	private WebElement fromcalenderpr;

	public WebElement getfromcalenderpr() {
		
		
		return fromcalenderpr;
	}
	
	@FindBy(xpath = "//td[@title='2022-03-01']//div[@class='ant-picker-cell-inner'][normalize-space()='1']")
	private WebElement clfromcalenderpr;

	public WebElement getclfromcalenderpr() {
		
		
		return clfromcalenderpr;
	}
	
	@FindBy(xpath = "(//input[@placeholder='To'])[1]")
	private WebElement tocalenderpr;

	public WebElement gettocalenderpr() {
		
		
		return tocalenderpr;
	}
	
	@FindBy(linkText =   "Today")
	private WebElement cltocalenderpr;

	public WebElement getcltocalenderpr() {
		
		
		return cltocalenderpr;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Age: 25 '])[1]")
	private WebElement seleage;

	public WebElement getseleage() {
		
		
		return seleage;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='css-8mmkcg'])[1]")
	private WebElement selectsex;

	public WebElement getselectsex() {
		
		
		return selectsex;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Male')]")
	private WebElement selesex;

	public WebElement getselesex() {
		
		
		return selesex;
	}
	
	
	@FindBy(xpath = "(//*[name()='svg'][contains(@class,'css-8mmkcg')])[2]")
	private WebElement selerace;
	

	public WebElement getselerace() {
		
		
		return selerace;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'American Indian or Alaska Native')])[1]")
	private WebElement selectrace;
	

	public WebElement getselectrace() {
		
		
		return selectrace;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='css-8mmkcg'])[3]")
	private WebElement selectethn;
	

	public WebElement getselectethn() {
		
		
		return selectethn;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Hispanic or Latino')]")
	private WebElement clickethn;
	

	public WebElement getclickethn() {
		
		
		return clickethn;
	}
	
	@FindBy(xpath = "(//input[@id='searchmedication'])[1]")
	private WebElement searchmedi;
	

	public WebElement getsearchmedi() {
		
		
		return searchmedi;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Allergy'])[1]")
	private WebElement searchallergy;
	

	public WebElement getsearchallergy() {
		
		
		return searchallergy;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Problem'])[1]")
	private WebElement searchproblem;
	

	public WebElement getsearchproblem() {
		
		
		return searchproblem;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
	private WebElement clicksearch;
	

	public WebElement getclicksearch() {
		
		
		return clicksearch;
	}

}
