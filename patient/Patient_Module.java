package com.patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Patient_Module {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Patient_Module(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/nav[1]/div[1]/a[2]")
	private WebElement clickpatient;

	public WebElement getclickpatient() {
		return clickpatient;

	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement search1;

	public WebElement getsearch1() {
		return search1;

	}

	@FindBy(xpath = "//tbody/tr[3]/th[1]/div[1]")
	private WebElement newpateint;

	public WebElement getnewpateint() {
		return newpateint;

	}

	@FindBy(xpath = "//a[normalize-space()='Edit Profile']")
	private WebElement clickedit;

	public WebElement getclickedit() {
		return clickedit;

	}

	@FindBy(xpath = "//div[@class='ad-tk-close']//*[name()='svg']")
	private WebElement clickclose;

	public WebElement getclickclose() {
		return clickclose;

	}

	@FindBy(xpath = "(//div[@id='rc-tabs-2-tab-4'])[1]")
	private WebElement clickflags;

	public WebElement getclickflags() {
		return clickflags;

	}

	@FindBy(xpath = "//div[@class='edit-btm--65']//button[1]")
	private WebElement clickaddpatientflag;

	public WebElement getclickaddpatientflag() {
		return clickaddpatientflag;

	}

	@FindBy(xpath = "(//select[@class='arrow-adj'])[1]")
	private WebElement selectflag;

	public WebElement getselectflag() {

		return selectflag;

	}

	@FindBy(xpath = "//div[@class='form-row']//textarea")
	private WebElement sendmsg;

	public WebElement getsendmsg() {

		return sendmsg;

	}

	@FindBy(xpath = "//div[contains(@role,'dialog')]//button[2]")
	private WebElement clciksave;

	public WebElement getclciksave() {

		return clciksave;

	}

	@FindBy(xpath = "//button[contains(text(),'EDIT')]")
	private WebElement clcikedit;

	public WebElement getclcikedit() {

		return clcikedit;

	}

	@FindBy(xpath = "//a[contains(text(),'Appointment')]")
	private WebElement clcikappointment;

	public WebElement getclcikappointment() {

		return clcikappointment;

	}

	@FindBy(xpath = "//div[contains(text(),'Future Appointments')]")
	private WebElement clickfuture;

	public WebElement getclickfuture() {

		return clickfuture;

	}

	@FindBy(xpath = "//div[contains(text(),'Past Appointments')]")
	private WebElement clickpast;

	public WebElement getclickpast() {

		return clickpast;

	}

	@FindBy(linkText = "Documents")
	private WebElement docu;

	public WebElement getdocu() {

		return docu;

	}

	@FindBy(xpath = "(//div[contains(text(),'Lab Results')])[1]")
	private WebElement clicklab;

	public WebElement getclicklab() {

		return clicklab;

	}

	@FindBy(xpath = "(//div[contains(text(),'Uploaded Documents')])[1]")
	private WebElement clickuploaddoc;

	public WebElement getclickuploaddoc() {

		return clickuploaddoc;

	}

	@FindBy(xpath = "//a[normalize-space()='Problems']")
	private WebElement clickproblems;

	public WebElement getclickproblems() {

		return clickproblems;

	}

	@FindBy(xpath = "//button[normalize-space()='Add Problem']")
	private WebElement clickaddproblems;

	public WebElement getclickaddproblems() {

		return clickaddproblems;

	}

	@FindBy(xpath = "//input[@placeholder='Find Problem']")
	private WebElement sendproblems;

	public WebElement getsendproblems() {

		return sendproblems;

	}

	@FindBy(xpath = "(//select[@name='icd_version'])[1]")
	private WebElement sendicd;

	public WebElement getsendicd() {

		return sendicd;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Codes'])[1]")
	private WebElement sendcode;

	public WebElement getsendcode() {

		return sendcode;

	}

	@FindBy(xpath = "(//select[@name='status'])[1]")
	private WebElement sendstatus;

	public WebElement getsendstatus() {

		return sendstatus;

	}

	@FindBy(xpath = "(//input[@name='start_diagnosis_date'])[1]")
	private WebElement calenderstart;

	public WebElement getcalenderstart() {

		return calenderstart;

	}

	@FindBy(how = How.XPATH, using = "(//input[@name='start_diagnosis_date'])[1]")
	WebElement calendersele;

	public Patient_Module Calendersele() {

		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Select se = new Select(calendersele);

		se.selectByValue("14");

		// eleusername.sendKeys("demosalesmanager");

		return this;
	}

	@FindBy(xpath = "//input[@value='2022-03-14']")
	private WebElement calenderstartsele;

	public WebElement getcalenderstartsele() {

		return calenderstartsele;

	}

	@FindBy(name = "end_diagnosis_date")
	private WebElement calenderend;

	public WebElement getcalenderend() {

		return calenderend;

	}

	@FindBy(xpath = "(//input[@name='snoomed'])[1]")
	private WebElement sendct;

	public WebElement getsendct() {

		return sendct;

	}

	@FindBy(xpath = "(//textarea[@name='comments'])[1]")
	private WebElement sendcomment;

	public WebElement getsendcomment() {

		return sendcomment;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement saveprob;

	public WebElement getsaveprob() {

		return saveprob;

	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	private WebElement clickclose1;

	public WebElement getclickclose1() {

		return clickclose1;

	}

	@FindBy(xpath = "//a[normalize-space()='Allergies']")
	private WebElement clickaler;

	public WebElement getclickaler() {

		return clickaler;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Allergies'])[1]")
	private WebElement clickaddaler;

	public WebElement getclickaddaler() {

		return clickaddaler;

	}

	@FindBy(xpath = "(//select[@name='allergy_type'])[1]")

	private WebElement selectaler;

	public WebElement getselectaler() {

		return selectaler;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Drug'])[1]")

	private WebElement speficdrug;

	public WebElement getspeficdrug() {

		return speficdrug;

	}

	@FindBy(xpath = "(//select[@name='reaction'])[1]")

	private WebElement speficreaction;

	public WebElement getspeficreaction() {

		return speficreaction;

	}

	@FindBy(xpath = "(//select[@name='severity'])[1]")

	private WebElement severity;

	public WebElement getseverity() {

		return severity;

	}

	@FindBy(xpath = "(//select[@name='status'])[1]")

	private WebElement selestatus;

	public WebElement getselestatus() {

		return selestatus;

	}

	@FindBy(xpath = "(//textarea[@name='note'])[1]")

	private WebElement Notesaler;

	public WebElement getNotesaler() {

		return Notesaler;

	}

	@FindBy(xpath = "//button[normalize-space()='Save']")

	private WebElement Savealer;

	public WebElement getSavealer() {

		return Savealer;

	}

	@FindBy(xpath = "(//a[normalize-space()='Medication'])[1]")

	private WebElement clickmedi;

	public WebElement getclickmedi() {

		return clickmedi;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Medication'])[1]")

	private WebElement clickaddmedi;

	public WebElement getclickaddmedi() {

		return clickaddmedi;

	}

	@FindBy(xpath = "(//input[@placeholder='Find Drug'])[1]")

	private WebElement finddrug;

	public WebElement getfinddrug() {

		return finddrug;

	}

	@FindBy(xpath = "(//input[@name='sig_note'])[1]")

	private WebElement signote;

	public WebElement getsignote() {

		return signote;

	}

	@FindBy(xpath = "(//select[@name='status'])[1]")

	private WebElement Statusmedi;

	public WebElement getStatusmedi() {

		return Statusmedi;

	}

	@FindBy(xpath = "(//select[@name='Appointment'])[1]")

	private WebElement appointmedi;

	public WebElement getappointmedi() {

		return appointmedi;

	}

	@FindBy(xpath = "(//input[@name='prescribed'])[1]")

	private WebElement pescribedate;

	public WebElement getpescribedate() {

		return pescribedate;

	}

	@FindBy(xpath = "(//input[@name='begdate'])[1]")

	private WebElement startpescribedate;

	public WebElement getstartpescribedate() {

		return startpescribedate;

	}

	@FindBy(xpath = "(//input[@name='enddate'])[1]")

	private WebElement stoppescribedate;

	public WebElement getstoppescribedate() {

		return stoppescribedate;

	}

	@FindBy(xpath = "(//input[@name='dquantity'])[1]")

	private WebElement dispensequan;

	public WebElement getdispensequan() {

		return dispensequan;

	}

	@FindBy(xpath = "(//input[@name='refills'])[1]")

	private WebElement nrefills;

	public WebElement getnrefills() {

		return nrefills;

	}

	@FindBy(xpath = "(//select[@name='outcome'])[1]")

	private WebElement orderstat;

	public WebElement getorderstat() {

		return orderstat;

	}

	@FindBy(xpath = "(//input[@name='notes'])[1]")

	private WebElement Notes;

	public WebElement getNotes() {

		return Notes;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement clicksavemedi;

	public WebElement getclicksavemedi() {

		return clicksavemedi;

	}

	@FindBy(xpath = "(//a[normalize-space()='Family History'])[1]")

	private WebElement clickfamilyhis;

	public WebElement getclickfamilyhis() {

		return clickfamilyhis;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Family Member'])[1]")

	private WebElement addfamily;

	public WebElement getaddfamily() {

		return addfamily;

	}

	@FindBy(xpath = "//div[@class='form-group col']//select[@id='formGridEmail']")

	private WebElement relataion;

	public WebElement getrelataion() {

		return relataion;

	}

	@FindBy(xpath = "(//input[@id='formGridEmail'])[1]")

	private WebElement clciname;

	public WebElement getclciname() {

		return clciname;

	}

	@FindBy(xpath = "//div[@class='modal_body modal-body']//div[2]//div[2]//input[1]")

	private WebElement clcifamily;

	public WebElement getclcifamily() {

		return clcifamily;

	}

	@FindBy(xpath = "//div[@role='dialog']//div[3]//div[1]//input[1]")

	private WebElement addage;

	public WebElement getaddage() {

		return addage;

	}

	@FindBy(xpath = "//input[@name='dob']")

	private WebElement dobsele;

	public WebElement getdobsele() {

		return dobsele;

	}

	@FindBy(xpath = "//div[@class='add-fam']//div[1]//div[1]//div[1]//input[1]")

	private WebElement selerace;

	public WebElement getselerace() {

		return selerace;

	}

	@FindBy(how = How.XPATH, using = "//div[@class='add-fam']//div[1]//div[1]//div[1]//input[1]")
	WebElement selecthracee;

	public Patient_Module selecthracee() {

		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Select se = new Select(selecthracee);

		se.selectByVisibleText("Abenaki");

		// eleusername.sendKeys("demosalesmanager");

		return this;
	}

	@FindBy(xpath = "(//span[normalize-space()='Abenaki'])[1]")

	private WebElement clickrace;

	public WebElement getclickrace() {

		return clickrace;

	}

	@FindBy(xpath = "//div[@class='modal_body modal-body']//div[2]//div[1]//div[1]//input[1]")

	private WebElement seleeth;

	public WebElement getseleeth() {

		return seleeth;

	}

	@FindBy(how = How.XPATH, using = "//div[@class='modal_body modal-body']//div[2]//div[1]//div[1]//input[1]")
	WebElement selecthethen;

	public Patient_Module selecthethen() {

		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Select se1 = new Select(selecthethen);

		se1.selectByVisibleText("Hispanic or Latino");

		// eleusername.sendKeys("demosalesmanager");

		return this;
	}

	@FindBy(xpath = "(//span[normalize-space()='Hispanic or Latino'])[1]")

	private WebElement clicketh;

	public WebElement getclicketh() {

		return clicketh;

	}

	@FindBy(xpath = "(//select[@id='formGridEmail'])[2]")

	private WebElement selegender;

	public WebElement getselegender() {

		return selegender;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement fmsave;

	public WebElement getfmsave() {

		return fmsave;

	}
	
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cancelgh;

	public WebElement getcancelgh() {

		return cancelgh;

	}
}
