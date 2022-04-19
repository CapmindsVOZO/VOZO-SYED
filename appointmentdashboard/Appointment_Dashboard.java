package com.appointmentdashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appointment_Dashboard {
	
	
	public WebDriver driver;

	
	public Appointment_Dashboard(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}
	public WebDriver getDriver() {
		return driver;

	}
	@FindBy(xpath = "//a[contains(text(),'Appointment Dashboard')]")
	private WebElement ClcikAppointmentdashboard;


	public WebElement getClcikAppointmentdashboard() {
		return ClcikAppointmentdashboard;
	}

	@FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
	private WebElement Searchoffice;


	public WebElement getSearchoffice() {
		return Searchoffice;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Test Facility Phar')]")
	private WebElement Selecttestfac2;


	public WebElement getSelecttestfac2() {
		return Selecttestfac2;
	}
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement Clickcalender;


	public WebElement getClickcalender() {
		return Clickcalender;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Update Filter')]")
	private WebElement Clickupdate;


	public WebElement getClickupdate() {
		return Clickupdate;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Select None')]")
	private WebElement Selectnone;


	public WebElement getSelectnone() {
		return Selectnone;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Select All')]")
	private WebElement Selectall;


	public WebElement getSelectall() {
		return Selectall;
	}
	
	@FindBy(xpath = "(//tbody[@class='MuiTableBody-root'])[1]")
	private WebElement getpatientname;


	public WebElement getgetpatientname() {
		return getpatientname;
	}
	
	@FindBy(xpath = "(//select[@name='office_1'])[1]")
	private WebElement getstatustext;


	public WebElement getgetstatustext() {
		return getstatustext;
	}
	
	@FindBy(xpath = "(//label[@class='for-dash-t-h-8'])[1]")
	private WebElement clickshowstatus;


	public WebElement getclickshowstatus() {
		
		
		return clickshowstatus;
	}


}
