package com.newappointment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Appointment {

	public WebDriver driver;

	@FindBy(xpath = "//div[contains(text(),'Search Patient')]")
	private WebElement Clcikpatient;

	public WebElement getClcikpatient() {
		return Clcikpatient;
	}

	public New_Appointment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}
	
	@FindBy(xpath = "//span[contains(text(),'Appointment')]")
	private WebElement Appointmentclick;

	public WebElement getAppointmentclick() {
		return Appointmentclick;

	}

	@FindBy(xpath = "//span[contains(text(),'DhilipKumar')]")
	private WebElement Selectpatient;

	public WebElement getSelectpatient() {
		return Selectpatient;

	}

	@FindBy(xpath = "//input[@size='12']")
	private WebElement Selectdate;

	public WebElement getSelectdate() {
		return Selectdate;

	}

	@FindBy(xpath = "//input[@size='10']")
	private WebElement Selecttime;

	public WebElement getSelecttime() {
		return Selecttime;

	}

//	@FindBy(xpath = "//span[contains(text(),'Ok')]")
//	private WebElement Clickok;
//
//	public WebElement getClickok() {
//		return Clickok;
//
//	}

	@FindBy(id =   "new-app-duration")
	private WebElement Sendmin;

	public WebElement getSendmin() {
		return Sendmin;

	}
	
	@FindBy(id =    "new-app-repeats-check1")
	private WebElement Repeat;

	public WebElement getRepeat() {
		return Repeat;

	}
	
	@FindBy(id =    "new-app-select1")
	private WebElement Selectevery;

	public WebElement getSelectevery() {
		return Selectevery;

	}
	
	@FindBy(id =    "new-app-select2")
	private WebElement Selectday;

	public WebElement getSelectday() {
		return Selectday;

	}
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Days wise')]")
	private WebElement Daywise;

	public WebElement getDaywise() {
		return Daywise;

	}
	
	@FindBy(id =    "new-app-days-wise")
	private WebElement Daywise2;

	public WebElement getSelectDaywise2() {
		return Daywise2;

	}
	
	
	@FindBy(id =    "new-app-untildate")
	private WebElement Selectcalender1;

	public WebElement getSelectcalender1() {
		return Selectcalender1;

	}
	
	
	@FindBy(id =    "tbg-btn-1")
	private WebElement Selectweek;

	public WebElement getSelectweek() {
		return Selectweek;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement SearchProvider;

	public WebElement getSearchProvider() {
		return SearchProvider;

	}

	@FindBy(xpath = "(//span[contains(text(),'Tech1')])[2]")
	private WebElement Selectprovider;

	public WebElement getSelectprovider() {
		return Selectprovider;

	}

	@FindBy(xpath = "//div[contains(text(),'Profile')]")
	private WebElement Clickprofile;

	public WebElement getClickprofile() {
		return Clickprofile;

	}

	@FindBy(xpath = "//span[contains(text(),'Vacation')]")
	private WebElement Selectprofile;

	public WebElement getSelectprofile() {
		return Selectprofile;

	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[4]")
	private WebElement Location;

	public WebElement getLocation() {
		return Location;

	}

	@FindBy(xpath = "(//span[contains(text(),'Test Facility Phar')])[2]")
	private WebElement SelectLocation;

	public WebElement getSelectLocation() {
		return SelectLocation;

	}

	@FindBy(xpath = "//div[contains(text(),'Status')]")
	private WebElement Clickstatus;

	public WebElement getClickstatus() {
		return Clickstatus;

	}

	@FindBy(xpath = "//span[contains(text(),'In Lobby')]")
	private WebElement Selectstatus;

	public WebElement getSelectstatus() {
		return Selectstatus;

	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Clicksave;

	public WebElement getClicksave() {
		return Clicksave;

	}
	
	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Clickclose;

	public WebElement getClickclose() {
		return Clickclose;

	}
	
	//////////////new  appoin
	
	@FindBy(xpath = "//span[@class='e-tbar-btn-text'][normalize-space()='Day']")
	private WebElement Clickdayn;

	public WebElement getClickdayn() {
		return Clickdayn;

	}
	
	@FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
	private WebElement Clickcaln;

	public WebElement getClickcaln() {
		return Clickcaln;

	}
	
	
	@FindBy(xpath = "(//a[normalize-space()='Create Appoiment'])[1]")
	private WebElement Clickcreateappn;

	public WebElement getClickcreateappn() {
		return Clickcreateappn;

	}
	@FindBy(xpath = "//div[contains(text(),'Search Patient')]")
	private WebElement serachpatn;

	public WebElement getserachpatn() {
		return serachpatn;

	}
	
	@FindBy(xpath = "(//span[normalize-space()='DhilipKumar'])[1]")
	private WebElement sendpatn;

	public WebElement getsendpatn() {
		return sendpatn;

	}
	
	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
	private WebElement sendtimen;

	public WebElement getsendtimen() {
		return sendtimen;

	}
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement searprovin;

	public WebElement getsearprovin() {
		return searprovin;

	}
	
	@FindBy(xpath = "(//span[@class='text'][normalize-space()='Tech1'])[1]")
	private WebElement sendprovn;

	public WebElement getsendprovn() {
		return sendprovn;

	}

	@FindBy(xpath = "(//div[normalize-space()='Profile'])[1]")
	private WebElement searprofn;

	public WebElement getsearprofn() {
		return searprofn;

	}
	
	@FindBy(xpath = "//span[contains(text(),'In Office')]")
	private WebElement sendprofn;

	public WebElement getsendprofn() {
		return sendprofn;

	}
	@FindBy(xpath = "(//div[@class='divider default text'])[1]")
	private WebElement searoffn;

	public WebElement getsearoffn() {
		return searoffn;

	}
	
	@FindBy(xpath = "(//span[contains(text(),'Test Facility Phar')])[2]")
	private WebElement sendoffn;

	public WebElement getsendoffn() {
		return sendoffn;

	}
	
	
	@FindBy(xpath = "(//div[normalize-space()='Status'])[1]")
	private WebElement searchstan;

	public WebElement getsearchstan() {
		return searchstan;

	}
	
	@FindBy(xpath = "(//span[normalize-space()='In Lobby'])[1]")
	private WebElement sendstatn;

	public WebElement getsendstatn() {
		return sendstatn;

	}
	
	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	private WebElement saven;

	public WebElement getsaven() {
		return saven;

	}
	
	@FindBy(xpath = "(//td[@role='gridcell'])[3]")
	private WebElement cal1;

	public WebElement getcal1() {
		return cal1;

	}
	
	@FindBy(xpath = "(//td[@role='gridcell'])[4]")
	private WebElement cal2;

	public WebElement getcal2() {
		return cal2;

	}

	
	@FindBy(xpath = "(//td[@role='gridcell'])[5]")
	private WebElement cal3;

	public WebElement getcal3() {
		return cal3;

	}
	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[2]")
	private WebElement canceln;

	public WebElement getcanceln() {
		return canceln;

	}

}
