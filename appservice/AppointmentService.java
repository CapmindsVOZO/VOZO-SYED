package com.appservice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentService {

	public WebDriver driver;

	public AppointmentService(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(xpath = "(//span[@class='e-btn-icon e-icon-prev e-icons'])[1]")
	private WebElement clickpre;

	public WebElement getclickpre() {
		return clickpre;

	}

	@FindBy(xpath = "(//button[@id='e-tbr-btn_2'])[1]")
	private WebElement cliccal;

	public WebElement getcliccal() {
		return cliccal;

	}

	@FindBy(xpath = "(//span[@title='Monday, March 21, 2022'])[1]")
	private WebElement clidate;

	public WebElement getclidate() {
		return clidate;

	}

	@FindBy(xpath = "//div[@class='e-appointment-details']")
	private WebElement clicapp;

	public WebElement getclicapp() {
		return clicapp;

	}

	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
	private WebElement clicserv;

	public WebElement getclicserv() {
		return clicserv;

	}

	@FindBy(xpath = "(//input[@placeholder='Find HCPCS Codes'])[1]")
	private WebElement clicfindhcpc;

	public WebElement getclicfindhcpc() {
		return clicfindhcpc;

	}

	@FindBy(xpath = "(//div[contains(text(),'V2782--Lens, 1.54-1.65 p/1.60-1.79g')])[1]")
	private WebElement clichcpcs;

	public WebElement getclichcpcs() {
		return clichcpcs;

	}

	@FindBy(xpath = "(//input[@id='totalbill'])[10]")
	private WebElement sendfee;

	public WebElement getsendfee() {
		return sendfee;

	}

	@FindBy(xpath = "(//select[@id='MA_HCPCS8'])[1]")
	private WebElement clicmod1;

	public WebElement getclicmod1() {
		return clicmod1;

	}

	@FindBy(xpath = "(//option[@value='26'][contains(text(),'26')])[33]")
	private WebElement selecmod1;

	public WebElement getselecmod1() {
		return selecmod1;

	}

	@FindBy(xpath = "(//select[@id='MB_HCPCS8'])[1]")
	private WebElement clicmod2;

	public WebElement getclicmod2() {
		return clicmod2;

	}

	@FindBy(xpath = "(//option[@value='25'][contains(text(),'25')])[34]")
	private WebElement selemod2;

	public WebElement getselemod2() {
		return selemod2;

	}

	@FindBy(xpath = "(//select[@id='MC_HCPCS8'])[1]")
	private WebElement clicmod3;

	public WebElement getclicmod3() {
		return clicmod3;

	}

	@FindBy(xpath = "(//option[@value='23'][contains(text(),'23')])[35]")
	private WebElement selemod3;

	public WebElement getselemod3() {
		return selemod3;

	}
	
	@FindBy(xpath = "(//select[@id='MD_HCPCS8'])[1]")
	private WebElement clicmod4;

	public WebElement getclicmod4() {
		return clicmod4;

	}

	@FindBy(xpath = "(//option[@value='24'][contains(text(),'24')])[36]")
	private WebElement selemod4;

	public WebElement getselemod4() {
		return selemod3;

	}

	@FindBy(xpath = "(//input[@id='HCPCS_units8'])[1]")
	private WebElement quant;

	public WebElement getquant() {
		return quant;

	}
	
	@FindBy(xpath = "(//input[@id='HCPCS_pointer8'])[1]")
	private WebElement pointe;

	public WebElement getpointe() {
		return pointe;

	}
	
	@FindBy(xpath = "(//button[@id='CPT_4NDAdd8'])[1]")
	private WebElement NDCPL;

	public WebElement getNDCPL() {
		return NDCPL;

	}
	
	@FindBy(xpath = "(//input[@id='HSPSC_NDCQty0'])[1]")
	private WebElement NDCPLqua;

	public WebElement getNDCPLqua() {
		return NDCPLqua;

	}
	
	@FindBy(xpath = "(//select[@id='HSPSC_NDCUnit0'])[1]")
	private WebElement NDCPUnits;

	public WebElement getNDCPUnits() {
		return NDCPUnits;

	}
	
	@FindBy(xpath = "(//input[@placeholder='Find ICD9 Codes'])[1]")
	private WebElement icd9;

	public WebElement geticd9() {
		return icd9;

	}
	
	@FindBy(xpath = "(//div[contains(text(),'765.04-- Extreme immaturity, 1,000-1,249 grams')])[1]")
	private WebElement icd9sele;

	public WebElement geticd9sele() {
		return icd9sele;

	}
	@FindBy(xpath = "(//span[@class='blue-color'])[1]")
	private WebElement getbal;

	public WebElement getgetbal() {
		return getbal;

	}
	
	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[2]")
	private WebElement Billingsel;

	public WebElement getBillingsel() {
		return Billingsel;

	}
	
	@FindBy(xpath = "(//span[normalize-space()='Create Invoice'])[1]")
	private WebElement createnvo;

	public WebElement getcreatenvo() {
		return createnvo;

	}
	
	
	@FindBy(xpath = "(//span[@aria-hidden='true'][normalize-space()='×'])[2]")
	private WebElement closenvo;

	public WebElement getclosenvo() {
		return closenvo;

	}
}
