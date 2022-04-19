package com.appointmentprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appointment_Profile {

	public WebDriver driver;


	public Appointment_Profile(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}


	@FindBy(xpath = "//a[contains(text(),'Appointment Profiles')]")

	private WebElement Appointmentprofile;
	
	public WebElement getAppointmentprofile() {
		return Appointmentprofile;
	}

	@FindBy(xpath = "//button[@class='billing_pro_frmt_table_btn2 ins-cl-ex m-r-15 mr btn btn-light']")

	private WebElement clicksort;

	public WebElement getclicksort() {
		return clicksort;
	}

	@FindBy(xpath = "//button[@class='billing_pro_frmt_table_btn1 icon-align-btn ins-cl-ex m-l-15 ml btn btn-light']")

	private WebElement clicksortrelease;

	public WebElement getclicksortrelease() {
		return clicksortrelease;
	}
	
	@FindBy(xpath =   "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")

	private WebElement clickfooter;

	public WebElement getclickfooter() {
		return clickfooter;
	}

	@FindBy(xpath =   "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]/span[1]")

	private WebElement clickdelete;

	public WebElement getclickdelete() {
		return clickdelete;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]")

	private WebElement addnewprofile;

	public WebElement getaddnewprofile() {

		return addnewprofile;
	}

	@FindBy(id = "duration")

	private WebElement addname;

	public WebElement getaddname() {

		return addname;
	}

	@FindBy(id = "resonforvisit")

	private WebElement addresonforvisit;

	public WebElement getaddresonforvisit() {

		return addresonforvisit;
	}

	@FindBy(xpath = "//input[@type='color']")

	private WebElement addcolor;

	public WebElement getaddcolor() {

		return addcolor;
	}

	@FindBy(xpath = "(//input[@name='appduration'])[2]")

	private WebElement addduration;

	public WebElement getaddduration() {

		return addduration;
	}

	@FindBy(xpath = "(//select[@name='appoint_office'])[1]")

	private WebElement billingprofile;

	public WebElement getbillingprofile() {

		return billingprofile;
	}
	
	@FindBy(xpath = "(//select[@name='appoint_office'])[2]")

	private WebElement paymentprofile;

	public WebElement getpaymentprofile() {

		return paymentprofile;
	}
	
	@FindBy(xpath = "//*[@id=\"add-allergy\"]/form/div[3]/button[2]")

	private WebElement saveap;

	public WebElement getsaveap() {

		return saveap;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")

	private WebElement Close;

	public WebElement getClose() {

		return Close;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Billing Profiles')]")

	private WebElement clcikbillingprofile;

	public WebElement getclcikbillingprofile() {

		return clcikbillingprofile;
	}
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/*[1]")

	private WebElement clicksort1;

	public WebElement getclicksort1() {

		return clicksort1;
	}
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/*[1]")

	private WebElement clicksort2;

	public WebElement getclicksort2() {

		return clicksort2;
	}
	
	@FindBy(xpath = "//*[@id=\"demographics\"]/div/div/div[1]/div[3]/div/button/div")

	private WebElement clickaddnewprofile;

	public WebElement getclickaddnewprofile() {

		return clickaddnewprofile;
	}
	
	@FindBy(id = "duration")

	private WebElement profilename;

	public WebElement getprofilename() {

		return profilename;
	}
	
	@FindBy(xpath = "//input[@placeholder='Find ICD9 Codes']")

	private WebElement sendicd9;

	public WebElement getsendicd9() {

		return sendicd9;
	}
	
	@FindBy(xpath = "//div[contains(text(),'923.20-- Contusion of hand(s)')]")

	private WebElement clickicd9;

	public WebElement getclickicd9() {

		return clickicd9;
	}
	
	@FindBy(xpath = "//input[@placeholder='Find ICD10 Codes']")

	private WebElement sendicd10;

	public WebElement getsendicd10() {

		return sendicd10;
	}
	
	@FindBy(xpath = "//div[contains(text(),'M20.099--Other deformity of finger(s), unspecified')]")

	private WebElement clickicd10;

	public WebElement getclickicd10() {

		return clickicd10;
	}
	
	@FindBy(xpath = "//input[@placeholder='Find Diagnosi Codes']")

	private WebElement sendfindda;

	public WebElement getsendfindda() {

		return sendfindda;
	}
	
	@FindBy(xpath = "//div[contains(text(),'940612--Test code')]")

	private WebElement clickda;

	public WebElement getclickda() {

		return clickda;
	}
	
	@FindBy(xpath = "//input[@placeholder='Find HCPCS Codes']")

	private WebElement sendhcpc;

	public WebElement getsendhcpc() {

		return sendhcpc;
	}
	
	@FindBy(xpath = "//div[contains(text(),'A7505--Hmes or trach valve housing')]")

	private WebElement clickhcpc;

	public WebElement getclickhcpc() {

		return clickhcpc;
	}
	
	@FindBy(xpath = "//input[@placeholder='Find Custom Codes']")

	private WebElement sendcustomcod;

	public WebElement getsendcustomcod() {

		return sendcustomcod;
	}
	
	@FindBy(xpath = "//div[contains(text(),'123--Test Invoice')]")

	private WebElement clickcustom;

	public WebElement getclickcustom() {

		return clickcustom;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")

	private WebElement clicksave;

	public WebElement getclicksave() {

		return clicksave;
	}

}
