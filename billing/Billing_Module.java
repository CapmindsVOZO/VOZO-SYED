package com.billing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_Module {

	public WebDriver driver;

	public Billing_Module(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//a[normalize-space()='Billing'])[1]")

	private WebElement billingmodule;

	public WebElement getbillingmodule() {
		return billingmodule;
	}

	@FindBy(xpath = "(//a[normalize-space()='Patient payment'])[1]")

	private WebElement patientpayment;

	public WebElement getpatientpayment() {
		return patientpayment;
	}

	@FindBy(xpath = "(//input[@class='ant-input'])[1]")

	private WebElement pateintsear1;

	public WebElement getpateintsear1() {
		return pateintsear1;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")

	private WebElement pateintpayment1;

	public WebElement getpateintpayment1() {

		return pateintpayment1;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement pateintsear2;

	public WebElement getpateintsear2() {
		return pateintsear2;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")

	private WebElement clipateintsear2;

	public WebElement getclipateintsear2() {
		return clipateintsear2;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Patient statement'])[1]")

	private WebElement patientstate;

	public WebElement getpatientstate() {
		return patientstate;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Patient'])[1]")

	private WebElement pateintsear3;

	public WebElement getpateintsear3() {
		return pateintsear3;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'John peter')])[1]")

	private WebElement clipateintsear3;

	public WebElement getclipateintsear3() {
		return clipateintsear3;
	}
	
	@FindBy(xpath = "(//input[@id='zerocheck'])[1]")

	private WebElement cliradio;

	public WebElement getcliradio() {
		return cliradio;
	}
	
	@FindBy(xpath = "(//input[@id='patstafrom'])[1]")

	private WebElement stbal;

	public WebElement getstbal() {
		
		return stbal;
	}

	@FindBy(xpath = "(//input[@id='patstato'])[1]")

	private WebElement enbal;

	public WebElement getenbal() {
		
		return enbal;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement clisear1;

	public WebElement getclisear1() {
		
		return clisear1;
	}
	
	@FindBy(xpath = "//div[contains(text(),'All Patients')]")

	private WebElement allpatcl;

	public WebElement getallpatcl() {
		
		return allpatcl;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Patient'])[2]")

	private WebElement searchpat4;

	public WebElement getsearchpat4() {
		
		return searchpat4;
	}
	

	@FindBy(xpath = "(//div[contains(text(),'John peter')])[1]")

	private WebElement selepat2;

	public WebElement getselepat2() {
		
		return selepat2;
	}
	
	@FindBy(xpath = "(//input[@id='zerocheck_1'])[1]")

	private WebElement clirad2;

	public WebElement getclirad2() {
		
		return clirad2;
	}
	
	@FindBy(xpath = "(//input[@id='patstafrom_1'])[1]")

	private WebElement stabal2;

	public WebElement getstabal2() {
		
		return stabal2;
	}
	
	@FindBy(xpath = "(//input[@id='patstato_1'])[1]")

	private WebElement enbal2;

	public WebElement getenbal2() {
		
		return enbal2;
	}
	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")

	private WebElement clisear5;

	public WebElement getclisear5() {
		
		return clisear5;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Fee schedule'])[1]")

	private WebElement fees;

	public WebElement getfees() {
		
		return fees;
	}
	
	@FindBy(xpath = "(//input[@placeholder='CPT/HCPCS/Custom Procedure'])[1]")

	private WebElement cpthcpcssear;

	public WebElement getcpthcpcssear() {
		
		return cpthcpcssear;
	}
	
	@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='940612:Test code'])[1]")

	private WebElement clicpt;

	public WebElement getclicpt() {
		
		return clicpt;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Insurance Name'])[1]")

	private WebElement insuranam;

	public WebElement getinsuranam() {
		
		return insuranam;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'UNITED HEALTHCARE')])[1]")

	private WebElement insuranamsele;

	public WebElement getinsuranamsele() {
		
		return insuranamsele;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Payer Name'])[1]")

	private WebElement paynam;

	public WebElement getpaynam() {
		
		return paynam;
	}
	
	@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='new arvind'])[1]")

	private WebElement paynamsele;

	public WebElement getpaynamsele() {
		
		return paynamsele;
	}
	
	@FindBy(xpath = "(//input[contains(@placeholder,'Picklist Category')])[1]")

	private WebElement picklis;

	public WebElement getpicklis() {
		
		return picklis;
	}
	
	@FindBy(xpath = "//div[contains(text(),'hello')]")

	private WebElement picklissele;

	public WebElement getpicklissele() {
		
		return picklissele;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")

	private WebElement updacli;

	public WebElement getupdacli() {
		
		return updacli;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[2]")

	private WebElement clied;

	public WebElement getclied() {
		
		return clied;
	}
	
	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")

	private WebElement cliedcancel;

	public WebElement getcliedcancel() {
		
		return cliedcancel;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Add New'])[1]")

	private WebElement cliaddne;

	public WebElement getcliaddne() {
		
		return cliaddne;
	}
	
	@FindBy(xpath = "(//select[@id='code_typeval'])[1]")

	private WebElement selecpt;

	public WebElement getselecpt() {
		
		return selecpt;
	}
	
	@FindBy(xpath = "(//input[@id='codescval'])[1]")

	private WebElement searco;

	public WebElement getsearco() {
		
		return searco;
	}
	@FindBy(xpath = "(//div[@class='title'][normalize-space()='940612 : Test code'])[1]")

	private WebElement selecptco;

	public WebElement getselecptco() {
		
		return selecptco;
	}
	
	@FindBy(xpath = "(//input[@id='basepval'])[1]")

	private WebElement basepri;

	public WebElement getbasepri() {
		
		return basepri;
	}
	
	@FindBy(xpath = "(//input[@id='expremival'])[1]")

	private WebElement expectrei;

	public WebElement getexpectrei() {
		
		return expectrei;
	}
	
	@FindBy(xpath = "(//input[@id='cpthpcmode1'])[1]")

	private WebElement cptmod;

	public WebElement getcptmod() {
		
		return cptmod;
	}
	
	@FindBy(xpath = "(//select[@id='scoffice'])[1]")

	private WebElement seleoff;

	public WebElement getseleoff() {
		
		return seleoff;
	}
	
	@FindBy(xpath = "(//input[@id='NDCCode'])[1]")

	private WebElement Ndcco;

	public WebElement getNdcco() {
		
		return Ndcco;
	}
	@FindBy(xpath = "(//input[@id='NDCQuantity'])[1]")

	private WebElement Ndcquan;

	public WebElement getNdcquan() {
		
		return Ndcquan;
	}
	
	@FindBy(xpath = "(//input[@id='NDCUnits'])[1]")

	private WebElement Ndcun;

	public WebElement getNdcun() {
		
		return Ndcun;
	}
	
	@FindBy(xpath = "(//select[@id='payerid'])[1]")

	private WebElement payerid;

	public WebElement getpayerid() {
		
		return payerid;
	}
	
	@FindBy(xpath = "(//input[@id='payname'])[1]")

	private WebElement paynam2;

	public WebElement getpaynam2() {
		
		return paynam2;
	}
	
	@FindBy(xpath = "(//input[@id='customdesc'])[1]")

	private WebElement cusdes;

	public WebElement getcusdes() {
		
		return cusdes;
	}
	
	@FindBy(xpath = "(//input[@id='pickcat'])[1]")

	private WebElement pickca;

	public WebElement getpickca() {
		
		return pickca;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement clisave;

	public WebElement getclisave() {
		
		return clisave;
	}
	
	@FindBy(xpath = "(//input[@id='codescval'])[1]")

	private WebElement codese2;

	public WebElement getcodese2() {
		
		return codese2;
	}
	
	@FindBy(xpath = "(//div[@class='title'][normalize-space()='1 : diphtheria, tetanus toxoids and pertussis vaccine'])[1]")

	private WebElement selecodese2;

	public WebElement getselecodese2() {
		
		return selecodese2;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='EOB'])[1]")

	private WebElement clieob;

	public WebElement getclieob() {
		
		return clieob;
	}
	
	@FindBy(xpath = "(//select[@id='EOBInsuranceNameSearch'])[1]")

	private WebElement selein;

	public WebElement getselein() {
		
		return selein;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")

	private WebElement stardat;

	public WebElement getstardat() {
		
		return stardat;
	}
	
	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")

	private WebElement endat;

	public WebElement getendat() {
		
		return endat;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement seareo;

	public WebElement getseareo() {
		
		return seareo;
	}
	
	@FindBy(xpath = "(//td[normalize-space()='ADS125685'])[1]")

	private WebElement seleeob;

	public WebElement getseleeob() {
		
		return seleeob;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Edit Payment'])[1]")

	private WebElement seleed;

	public WebElement getseleed() {
		
		return seleed;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement clican;

	public WebElement getclican() {
		
		return clican;
	}
	
}
