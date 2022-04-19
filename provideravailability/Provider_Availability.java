package com.provideravailability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Provider_Availability {

	public WebDriver driver;

	public Provider_Availability(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(xpath = "//a[contains(text(),'Provider Availability')]")
	private WebElement ClickProvideravailability;

	public WebElement getClickProvideravailability() {
		
		return ClickProvideravailability;
	}
	
	@FindBy(xpath = "(//i[@class='dropdown icon'])[1]")
	private WebElement ClickProvideravailability1;

	public WebElement getClickProvideravailability1() {
		
		return ClickProvideravailability1;
	}
	
	@FindBy(id = "7")
	
	private WebElement editselectprovider;

	public WebElement geteditselectprovider() {
		
		return editselectprovider;
	}
	
	@FindBy(xpath = "(//i[@class='dropdown icon'])[3]")
	private WebElement editclcikoffice;

	public WebElement geteditclcikoffice() {
		
		return editclcikoffice;
	}
	
	
	@FindBy(xpath  = "//span[contains(text(),'Test Facility2')]")
	private WebElement editselectoffice;

	public WebElement geteditselectoffice2() {
		
		return editselectoffice;
	}
	
	
	@FindBy(xpath = "(//i[@class='dropdown icon'])[4]")
	private WebElement editappointment;

	public WebElement geteditappointment() {
		
		return editappointment;
		
		
	}
	
	
	
	@FindBy(xpath = "//div[@title='In Lobby']")
	private WebElement editselectappointment;

	public WebElement geteditselectappointment() {
		
		return editselectappointment;
		
		
	}
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[5]")
	private WebElement editappstatus;

	public WebElement geteditappstatus() {
		
		return editappstatus;
		
		
	}
	
	@FindBy(xpath = "//span[contains(text(),'In Lobby')]")
	private WebElement editappselect;

	public WebElement geteditappselect() {
		
		return editappselect;
		
		
	}
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement editappdate;

	public WebElement geteditappdate() {
		
		return editappdate;
		
		
	}
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement editappsave;

	public WebElement geteditappsave() {
		
		return editappsave;
		
		
	}
	

	@FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
	private WebElement Clickofficesearch;

	public WebElement getClickofficesearch() {
		return Clickofficesearch;
	}

	@FindBy(xpath = "//div[contains(text(),'Test Facility Phar')]")
	private WebElement Selectprovider;

	public WebElement getSelectprovider() {
		return Selectprovider;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/*[1]")
	private WebElement Clickedit;

	public WebElement getClickedit() {
		return Clickedit;

	}
	
	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement editprovider;

	public WebElement geteditprovider() {
		return editprovider;

	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Closecustomedit;

	public WebElement getClosecustomedit() {
		return Closecustomedit;

	}

	@FindBy(xpath = "//button[contains(text(),'+ Add Provider Availability')]")

	private WebElement clickaddprovider;

	public WebElement getclickaddprovider() {
		return clickaddprovider;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")

	private WebElement Searchprovider;

	public WebElement getSearchprovider() {
		return Searchprovider;

	}

	@FindBy(xpath = "//span[contains(text(),'Tech1')]")

	private WebElement Selectprovider1;

	public WebElement getSelectprovider1() {

		return Selectprovider1;

	}

	@FindBy(xpath = "(//div[@aria-atomic='true'])[2]")

	private WebElement SelectOffice;

	public WebElement getSelectOffice() {

		return SelectOffice;

	}

	@FindBy(xpath = "(//span[@class='text'])[37]")

	private WebElement Selectoffice1;

	public WebElement getSelectoffice1() {

		return Selectoffice1;

	}

	@FindBy(xpath = "(//div[@aria-atomic='true'])[3]")

	private WebElement Selectappointmentcategory;

	public WebElement getSelectappointmentcategory() {

		return Selectappointmentcategory;

	}

	@FindBy(xpath = "//span[contains(text(),'In Office')]")

	private WebElement Selectcategory;

	public WebElement getSelectcategory() {

		return Selectcategory;

	}

	@FindBy(xpath = "(//div[@aria-atomic='true'])[4]")

	private WebElement Appointmentstatus;

	public WebElement getAppointmentstatus() {

		return Appointmentstatus;

	}

	@FindBy(xpath = "//span[contains(text(),'In Lobby')]")

	private WebElement Appointmentstatusselect;

	public WebElement getAppointmentstatusselect() {

		return Appointmentstatusselect;

	}
	

	

	@FindBy(xpath = "(//input[@class='form-control'])[1]")

	private WebElement appcalender;

	public WebElement getappcalender() {

		return appcalender;

	}

	@FindBy(xpath = "//input[@type='time']")

	private WebElement apptimer;

	public WebElement getapptimer() {

		return apptimer;

	}

	@FindBy(id = "duration")

	private WebElement duration;

	public WebElement getduration() {

		return duration;

	}

	@FindBy(id = "new-app-repeats-check1")

	private WebElement apprepeat;

	public WebElement getapprepeat() {

		return apprepeat;

	}

	@FindBy(id = "new-app-select1")

	private WebElement appevery;

	public WebElement getappevery() {

		return appevery;

	}

	@FindBy(id = "new-app-select2")

	private WebElement appday;

	public WebElement getappday() {

		return appday;

	}

	@FindBy(id = "new-app-untildate")

	private WebElement appcal;

	public WebElement getappcal() {

		return appcal;

	}

	@FindBy(xpath = "//span[contains(text(),'Days wise')]")

	private WebElement appdaywise;

	public WebElement getappdaywise() {

		return appdaywise;

	}
	
	@FindBy(id = "new-app-days-wise")

	private WebElement appdaywisedesele;

	public WebElement getappdaywisedesele() {

		return appdaywisedesele;

	}

	@FindBy(xpath  = "//button[@type='submit']")

	private WebElement Appsave;

	public WebElement getAppsave() {

		return Appsave;

	}

	@FindBy(id = "//span[contains(text(),'×')]")

	private WebElement Appclose;

	public WebElement getAppclose() {

		return Appclose;

	}

}
