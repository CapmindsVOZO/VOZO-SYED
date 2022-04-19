package com.capminds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.Pageobjectmanager;

public class Runner_Class extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("edge");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// Click On Month Option

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Clickonelement(pom.getCalender().getMonth());

		// Click On Month Calender option
		Thread.sleep(4000);

		Clickonelement(pom.getCalender().getMonthcalender());

		// Appointment Open Click Cancel

		Clickonelement(pom.getCalender().getCancel1());

		// Center Text Will Visible

		Thread.sleep(3000);

		gettext(pom.getCalender().getVisibletext1());

		// Move To Workweek

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Clickonelement(pom.getCalender().getWorkweek());

		// Click On Calender

		Clickonelement(pom.getCalender().getWwcalender());

		// Click Cancel Button

		Clickonelement(pom.getCalender().getCancel2());

		// Get Work Week Text

		Thread.sleep(2000);

		gettext(pom.getCalender().getVisibletext2());

		// get week Option

		Clickonelement(pom.getCalender().getweek());

		// get week text

		gettext(pom.getCalender().getVisibletext3());

		// Clicl Calender

		Clickonelement(pom.getCalender().getwcalender());

		// click Cancel

		Clickonelement(pom.getCalender().getCancel3());

		// click on Day option

		Clickonelement(pom.getCalender().getDay());

		// Clcik On Day Calender

		Clickonelement(pom.getCalender().getDaycalender());

		// Clcik On Cancel

		Clickonelement(pom.getCalender().getCancel4());

		// Visible Text Day

		gettext(pom.getCalender().getVisibletext4());

		// Clcik On Center Calender

		Clickonelement(pom.getCalender().getCenterCalender());

		// Click On Right

		Clickonelement(pom.getCalender().getRight());

		// Clcik on Left

		Clickonelement(pom.getCalender().getLeft());

		// Click Provider Select

		Clickonelement(pom.getCalender().getProviderselect());

		// Select Provider

		Clickonelement(pom.getCalender().getselectProvider());

		// close Select

		Clickonelement(pom.getCalender().getProviderselect());

		// Click Facility

		Clickonelement(pom.getCalender().getFacilitySelect());

		// select facility

		Clickonelement(pom.getCalender().getSelectFacility());

		// Close Facility

		Clickonelement(pom.getCalender().getFacilitySelect());

		// Visible Today

		gettext(pom.getCalender().getTodayoption());

		// Get Appointment Option

		Clickonelement(pom.getCalender().getAppointmentoption());

		// get Appointment Text
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Clickonelement(pom.getnewappointment().getAppointmentclick());

		// Clcik Patient

		Clickonelement(pom.getnewappointment().getClcikpatient());

		// Select Patient

		Clickonelement(pom.getnewappointment().getSelectpatient());

		// Select Date

		Clickonelement(pom.getnewappointment().getSelectdate());

		// Click Time

		Clickonelement(pom.getnewappointment().getSelecttime());

		// Select Time

		// Clickonelement(na.getClickok());

		// Send Min

		sendkeys(pom.getnewappointment().getSendmin(), "40");

		// Repeats Button

		Clickonelement(pom.getnewappointment().getRepeat());

		// Select Every

		Clickonelement(pom.getnewappointment().getSelectevery());

		// Select Day

		Clickonelement(pom.getnewappointment().getSelectday());

		// Select Day Wise

		Clickonelement(pom.getnewappointment().getDaywise());

		// Select calender

		Clickonelement(pom.getnewappointment().getSelectcalender1());

		// Select Weeks option

		Clickonelement(pom.getnewappointment().getSelectweek());

		// Close Day Wise

		Clickonelement(pom.getnewappointment().getSelectDaywise2());

		// Select calender

		Clickonelement(pom.getnewappointment().getSelectcalender1());

		// close repeats

		Clickonelement(pom.getnewappointment().getRepeat());

		// Click Search Provider

		Clickonelement(pom.getnewappointment().getSearchProvider());

		// Select Provider

		Clickonelement(pom.getnewappointment().getSelectprovider());

		// Click Profile

		Clickonelement(pom.getnewappointment().getClickprofile());

		// Select Profile

		Clickonelement(pom.getnewappointment().getSelectprofile());

		// Click Location

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getLocation());

		// Select Loction

		Clickonelement(pom.getnewappointment().getSelectLocation());

		// Clcik Status

		Clickonelement(pom.getnewappointment().getClickstatus());

		// select status

		Clickonelement(pom.getnewappointment().getSelectstatus());

		// Click Save

		// Clickonelement(pom.getnewappointment().getClicksave());

		// Save Or Close

		Clickonelement(pom.getnewappointment().getClickclose());

		// Click Appointmentdashboard

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Clickonelement(pom.getappointmentdashboard().getClcikAppointmentdashboard());

		// Click Search Office

		Clickonelement(pom.getappointmentdashboard().getSearchoffice());

		// Select Test Facility

		Clickonelement(pom.getappointmentdashboard().getSelecttestfac2());

		// Close Search Office

		Clickonelement(pom.getappointmentdashboard().getSearchoffice());

		// Click Calender

		sendkeys(pom.getappointmentdashboard().getClickcalender(), "2022-2-25");

		// Clickonelement(pom.getappointmentdashboard().getClickcalender());

		// Click on Update Filter

		Clickonelement(pom.getappointmentdashboard().getClickupdate());

		// Click Select none
		Thread.sleep(2000);

		Clickonelement(pom.getappointmentdashboard().getSelectnone());

		// Click Select all

		Clickonelement(pom.getappointmentdashboard().getSelectall());

		// Click Select none

		Thread.sleep(2000);

		Clickonelement(pom.getappointmentdashboard().getSelectnone());

		// Click Search Office

		Clickonelement(pom.getappointmentdashboard().getSearchoffice());

		// Select Test Facility

		Clickonelement(pom.getappointmentdashboard().getSelecttestfac2());

		// Click on Update Filter

		Clickonelement(pom.getappointmentdashboard().getClickupdate());

		// Patient name

		// gettext(pom.getappointmentdashboard().getgetpatientname());

		// get status

		// gettext(pom.getappointmentdashboard().getgetstatustext());

		// clcik show status

		// Click Provider

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Clickonelement(pom.getprovideravailability().getClickProvideravailability());

		// Click On office Search

		Clickonelement(pom.getprovideravailability().getClickofficesearch());

		// Select provider

		Clickonelement(pom.getprovideravailability().getSelectprovider());

		// Click Edit Optiom

		Clickonelement(pom.getprovideravailability().getClickedit());

		// Search Provider

		Clickonelement(pom.getprovideravailability().getClickProvideravailability1());

		// Select provider

		Clickonelement(pom.getprovideravailability().geteditselectprovider());

		// Appointment category

		Clickonelement(pom.getprovideravailability().geteditappointment());

		// select appointment

		Clickonelement(pom.getprovideravailability().geteditselectappointment());

		// appointment status

		Clickonelement(pom.getprovideravailability().geteditappstatus());

		// appintment select

		Clickonelement(pom.getprovideravailability().geteditappselect());

		// date select

		sendkeys(pom.getprovideravailability().geteditappdate(), "2020-05-15");

		// save

		Clickonelement(pom.getprovideravailability().geteditappsave());

		// Close edit Custom Template

		// Clickonelement(pom.getprovideravailability().getClosecustomedit());

		// Create Provider

		Thread.sleep(4000);

		Clickonelement(pom.getprovideravailability().getclickaddprovider());

		// Search Provider

		Clickonelement(pom.getprovideravailability().getSearchprovider());

		// Select Provider

		Clickonelement(pom.getprovideravailability().getSelectprovider1());

		// Click Office

		Clickonelement(pom.getprovideravailability().getSelectOffice());

		// Select provider

		Clickonelement(pom.getprovideravailability().getSelectoffice1());

		// click appointment

		Clickonelement(pom.getprovideravailability().getSelectappointmentcategory());

		// select category

		Clickonelement(pom.getprovideravailability().getSelectcategory());

		// click appointment status

		Clickonelement(pom.getprovideravailability().getAppointmentstatus());

		// select appointment status

		Clickonelement(pom.getprovideravailability().getAppointmentstatusselect());

		// Select Date

		// Clickonelement(pom.getprovideravailability().getappcalender());

		sendkeys(pom.getprovideravailability().getappcalender(), "2022-02-27");

		// select time

		// Clickonelement(pom.getprovideravailability().getapptimer());

		// send time

		sendkeys(pom.getprovideravailability().getapptimer(), "15:56");

		// duration

		sendkeys(pom.getprovideravailability().getduration(), "40");

		// Click repeat

		Clickonelement(pom.getprovideravailability().getapprepeat());

		// click every

		Clickonelement(pom.getprovideravailability().getappevery());

		// clcik day

		Clickonelement(pom.getprovideravailability().getappday());

		// click calender

		Clickonelement(pom.getprovideravailability().getappcal());

		// click daywise

		Clickonelement(pom.getprovideravailability().getappdaywise());

		// click on calender

		Clickonelement(pom.getprovideravailability().getappcal());

		// click deselect

		Clickonelement(pom.getprovideravailability().getappdaywisedesele());

		// click on calender

		Clickonelement(pom.getprovideravailability().getappcal());

		// repeat deselect

		Clickonelement(pom.getprovideravailability().getapprepeat());

		// Select Date

		// sendkeys(pom.getprovideravailability().getappcal(), "2022-02-25");

		// Save or Close

		Thread.sleep(4000);

		Clickonelement(pom.getprovideravailability().getAppsave());

		// Close

		// Clickonelement(pom.getprovideravailability().getAppclose());

		// Click Appointment profile

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Clickonelement(pom.getappoAppointment_Profile().getAppointmentprofile());

		// click sort button

		Thread.sleep(2000);

		Clickonelement(pom.getappoAppointment_Profile().getclicksort());

		// click sort release
		Clickonelement(pom.getappoAppointment_Profile().getclicksortrelease());

		// click footer
		Thread.sleep(3000);

		// Clickonelement(pom.getappoAppointment_Profile().getclickfooter());

		// Click delete
		// Thread.sleep(3000);

		// Clickonelement(pom.getappoAppointment_Profile().getclickdelete());

		// click dismiss

		// alertdismiss(driver);

		// Click new add new profile
		Thread.sleep(2000);

		Clickonelement(pom.getappoAppointment_Profile().getaddnewprofile());

		// Send names
		Thread.sleep(2000);

		sendkeys(pom.getappoAppointment_Profile().getaddname(), "xyz");

		// send resean for visit

		sendkeys(pom.getappoAppointment_Profile().getaddresonforvisit(), "coldfever");

		// send color

		sendkeys(pom.getappoAppointment_Profile().getaddcolor(), "#A51718");

		// send duration

		sendkeys(pom.getappoAppointment_Profile().getaddduration(), "40");

		// send billing profile

		sendkeys(pom.getappoAppointment_Profile().getbillingprofile(), "black funges");

		// payment profile

		sendkeys(pom.getappoAppointment_Profile().getpaymentprofile(), "Cash");

		// click save

		// Clickonelement(pom.getappoAppointment_Profile().getsaveap());

		// click close

		Clickonelement(pom.getappoAppointment_Profile().getClose());

		// Click Billing Profile

		Clickonelement(pom.getappoAppointment_Profile().getclcikbillingprofile());

		// click sort

		Clickonelement(pom.getappoAppointment_Profile().getclicksort1());

		// Click Sort

		Clickonelement(pom.getappoAppointment_Profile().getclicksort2());

		// click add new profile

		Clickonelement(pom.getappoAppointment_Profile().getclickaddnewprofile());

		// send profile name

		sendkeys(pom.getappoAppointment_Profile().getprofilename(), "xyz");

		// sendicd9

		sendkeys(pom.getappoAppointment_Profile().getsendicd9(), "923.20-- Contusion of hand(s");

		// click icd

		Thread.sleep(2000);

		Clickonelement(pom.getappoAppointment_Profile().getclickicd9());

		// sendicd10

		sendkeys(pom.getappoAppointment_Profile().getsendicd10(),
				"M20.099--Other deformity of finger(s), unspecified finger(s)");

		// click icd

		Thread.sleep(2000);

		Clickonelement(pom.getappoAppointment_Profile().getclickicd10());

		// senddia

		sendkeys(pom.getappoAppointment_Profile().getsendfindda(), "940612--Test code");

		// click icd

		Thread.sleep(2000);

		Clickonelement(pom.getappoAppointment_Profile().getclickda());

		// senddia

		sendkeys(pom.getappoAppointment_Profile().getsendhcpc(), "A7505");

		// click icd

		Thread.sleep(3000);

		Clickonelement(pom.getappoAppointment_Profile().getclickhcpc());

		// senddia

		sendkeys(pom.getappoAppointment_Profile().getsendcustomcod(), "123--Test Invoice");

		// click icd

		Thread.sleep(2000);

		Clickonelement(pom.getappoAppointment_Profile().getclickcustom());

		// click save

		Thread.sleep(2000);

		Clickonelement(pom.getappoAppointment_Profile().getclicksave());

		// Click patient

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Clickonelement(pom.getPatient_Module().getclickpatient());

		// search patient

		sendkeys(pom.getPatient_Module().getsearch1(), "new");

		// getpatient

		Thread.sleep(3000);

		Clickonelement(pom.getPatient_Module().getnewpateint());

		// click edit

		Thread.sleep(5000);

		Clickonelement(pom.getPatient_Module().getclickedit());

//				// click flags
		//
//				Thread.sleep(5000);
		//
//				Clickonelement(pom.getPatient_Module().getclickflags());
		//
//				// click flags
		//
//				Thread.sleep(2000);
//				
//				
//				Clickonelement(pom.getPatient_Module().getclickaddpatientflag());
		//
//				// click flags
		//
//				Thread.sleep(2000);
//				
//				
//				Clickonelement(pom.getPatient_Module().getselectflag());
		//
//				// search patient
		//
//				sendkeys(pom.getPatient_Module().getsendmsg(), "Hello Covid ");
		//
//				// click save
//				Thread.sleep(3000);
		//
//				Clickonelement(pom.getPatient_Module().getclciksave());

		// click edit

		// Clickonelement(pom.getPatient_Module().getclickedit());

		// click close

		// Clickonelement(pom.getPatient_Module().getclickclose());

		// click appointment
		Thread.sleep(6000);

		Clickonelement(pom.getPatient_Module().getclcikappointment());

		// click future app

		Thread.sleep(4000);

		Clickonelement(pom.getPatient_Module().getclickpast());

		// click past app

		Clickonelement(pom.getPatient_Module().getclickfuture());

		// clcik doument

		Clickonelement(pom.getPatient_Module().getdocu());

		// clcik lab
		Thread.sleep(2000);

		Clickonelement(pom.getPatient_Module().getclicklab());

		// clcik uploaddoc

		Clickonelement(pom.getPatient_Module().getclickproblems());

		// clcik uploaddoc

		Clickonelement(pom.getPatient_Module().getclickaddproblems());

		// send problem

		sendkeys(pom.getPatient_Module().getsendproblems(), "724.9--Back pain");

		// send icd

		sendkeys(pom.getPatient_Module().getsendicd(), "ICD9");

		// send icd

		sendkeys(pom.getPatient_Module().getsendcode(), "1234");

		// send icd

		sendkeys(pom.getPatient_Module().getsendstatus(), "Active ");

		// click calender

		// Clickonelement(pom.getPatient_Module().getcalenderstart());

		// start calender

//				new  Patient_Module(driver)
//				.Calendersele();

		sendkeys(pom.getPatient_Module().getcalenderstart(), "2022-03-04");

		// end calender
		Thread.sleep(2000);

		// selectone( "2022-03-11");

		// sendkeys(pom.getPatient_Module().getcalenderend(), "2022-03-11");

		// select(, );

		// end calender

		sendkeys(pom.getPatient_Module().getsendct(), "1234");

		// start calender

		sendkeys(pom.getPatient_Module().getsendcomment(), "Hello 123");

		// save button

		// Clickonelement(pom.getPatient_Module().getsaveprob());

		// clcik close

		Clickonelement(pom.getPatient_Module().getclickclose1());

		// click aler
		Thread.sleep(2000);

		Clickonelement(pom.getPatient_Module().getclickaler());

		// clcik add

		Thread.sleep(2000);

		Clickonelement(pom.getPatient_Module().getclickaddaler());

		// select aler

		sendkeys(pom.getPatient_Module().getselectaler(), "Specific Drug allergy");

		// specific drug

		sendkeys(pom.getPatient_Module().getspeficdrug(), "BETOPTIC S (Ophthalmic)");

		// Click Reaction

		sendkeys(pom.getPatient_Module().getspeficreaction(), "Chills");

		// Click Reaction

		sendkeys(pom.getPatient_Module().getseverity(), "Severe");

		// Click Reaction

		sendkeys(pom.getPatient_Module().getselestatus(), "Active");

		// Click notes

		sendkeys(pom.getPatient_Module().getNotesaler(), "abc");

		// Save alergy

		Clickonelement(pom.getPatient_Module().getSavealer());

		// click medication

		Thread.sleep(3000);

		Clickonelement(pom.getPatient_Module().getclickmedi());

		// add medi

		Clickonelement(pom.getPatient_Module().getclickaddmedi());

		// add medi

		sendkeys(pom.getPatient_Module().getfinddrug(), "BETOPTIC S (Ophthalmic)");

		// add medi

		sendkeys(pom.getPatient_Module().getsignote(), "12344");

		// add status

		sendkeys(pom.getPatient_Module().getStatusmedi(), "Active");

		// add status

		sendkeys(pom.getPatient_Module().getappointmedi(), "Thu Jan 01, 1970 12:00 AM ");

		// pres date

		sendkeys(pom.getPatient_Module().getpescribedate(), "03/14/2022");

		// start pres date

		sendkeys(pom.getPatient_Module().getstartpescribedate(), "03/16/2022");

		// stop pres date

		sendkeys(pom.getPatient_Module().getstoppescribedate(), "03/22/2022");

		// dispense quan

		sendkeys(pom.getPatient_Module().getdispensequan(), "1234");

		// n rfills quan

		sendkeys(pom.getPatient_Module().getnrefills(), "1234");

		// dispense quan

		sendkeys(pom.getPatient_Module().getorderstat(), " Phoned into Pharmacy ");

		// dispense quan

		sendkeys(pom.getPatient_Module().getNotes(), "abcd");

		// save medi

		Clickonelement(pom.getPatient_Module().getclicksavemedi());

		// click family
		Thread.sleep(4000);

		Clickonelement(pom.getPatient_Module().getclickfamilyhis());

		// clcik add family

		Clickonelement(pom.getPatient_Module().getaddfamily());

		// relation quan

		sendkeys(pom.getPatient_Module().getrelataion(), "Employee");

		// clcik name

		sendkeys(pom.getPatient_Module().getclciname(), "abc");

		// clcik family

		sendkeys(pom.getPatient_Module().getclcifamily(), "xyz");

		// age

		sendkeys(pom.getPatient_Module().getaddage(), "23");

		// dob

		sendkeys(pom.getPatient_Module().getdobsele(), "05/10/1999");

		// Race

		Thread.sleep(2000);

		// new Patient_Module(driver).selecthracee();

		// selectone(pom.getPatient_Module().getselerace(), "Abenaki");

		sendkeys(pom.getPatient_Module().getselerace(), "Abenaki");

		// Clickonelement(pom.getPatient_Module().getclickrace());

		// ethe

		Thread.sleep(2000);

		// new Patient_Module(driver).selecthethen();

		// selectone(pom.getPatient_Module().getseleeth(), "Hispanic or Latino");

		sendkeys(pom.getPatient_Module().getseleeth(), "Hispanic or Latino");

		// Clickonelement(pom.getPatient_Module().getclicketh());

		// gender

		sendkeys(pom.getPatient_Module().getselegender(), "Male");

		// save

		// Clickonelement(pom.getPatient_Module().getfmsave());

		Clickonelement(pom.getPatient_Module().getcancelgh());

		// click reports

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Clickonelement(pom.getReports_Module().getClickReportmod());

		// clcik patient report
		Thread.sleep(6000);

		Clickonelement(pom.getReports_Module().getClickpatientrep());

		// select from date

		sendkeys(pom.getReports_Module().getfromcalenderpr(), "2022-03-01");

		Clickonelement(pom.getReports_Module().getclfromcalenderpr());

		// select from date

		// sendkeys(pom.getReports_Module().gettocalenderpr(), "2022-03-24");

		Clickonelement(pom.getReports_Module().gettocalenderpr());

		Thread.sleep(4000);

		Clickonelement(pom.getReports_Module().getcltocalenderpr());
		// select age

		sendkeys(pom.getReports_Module().getseleage(), "20");

		// select sex
		Thread.sleep(2000);

		// sendkeys(pom.getReports_Module().getselectsex(), "Male");

		Clickonelement(pom.getReports_Module().getselectsex());

		// select sex

		Thread.sleep(2000);

		Clickonelement(pom.getReports_Module().getselesex());

		// click race

		Thread.sleep(2000);

		Clickonelement(pom.getReports_Module().getselerace());

		// sendkeys(pom.getReports_Module().getselerace(), "American Indian or Alaska
		// Native");

		// Clickonelement(pom.getReports_Module().getselerace());

		// select race
		Thread.sleep(2000);

		Clickonelement(pom.getReports_Module().getselectrace());

		// click ethn
		Thread.sleep(2000);

		Clickonelement(pom.getReports_Module().getselectethn());

		// sendkeys(pom.getReports_Module().getselectethn(), "");

		Clickonelement(pom.getReports_Module().getclickethn());

		// search medi

		// sendkeys(pom.getReports_Module().getselectethn(), "");

		// search allergy

		// sendkeys(pom.getReports_Module().getsearchallergy(), "");

		// search problem

		// sendkeys(pom.getReports_Module().getsearchproblem(), "");

		// click search

		Clickonelement(pom.getReports_Module().getclicksearch());

//settings

		// click Settings

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getSettings_Module().getclciksettings());

		// click account settings

		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getclickaccountsettings());

		// send first name

		sendkeys(pom.getSettings_Module().getsendfirst(), "ABCD");

		// send last

		sendkeys(pom.getSettings_Module().getsendlastname(), "xyz");

		// middle name

		sendkeys(pom.getSettings_Module().getsendmiddlename(), "PRR");

		// clcik suffix

		Clickonelement(pom.getSettings_Module().getselectsuffix());

		// select suffix

		Clickonelement(pom.getSettings_Module().getselectmrsuffix());

		// email name

		clear(pom.getSettings_Module().getsendmail());

		sendkeys(pom.getSettings_Module().getsendmail(), "xyz@gmail.com");

		// phone

		clear(pom.getSettings_Module().getsendphone());

		sendkeys(pom.getSettings_Module().getsendphone(), "123456789");

		// send new pass

		sendkeys(pom.getSettings_Module().getsendnewpass(), "abc@123");

		// send confirm pass

		sendkeys(pom.getSettings_Module().getsendconpass(), "abc@123");

		// send confirm pass

		sendkeys(pom.getSettings_Module().getsendcurrennpass(), "abc@123");

		// get text

		gettext(pom.getSettings_Module().getgetprofile());

		// click clinical

		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getclickclini());

		// license

		// clear(pom.getSettings_Module().getcfirstname());

		Clickonelement(pom.getSettings_Module().getlicensety());

		// select license

		Clickonelement(pom.getSettings_Module().getselelicensety());

		// license#

		sendkeys(pom.getSettings_Module().getselelicenseno(), "12345");

		// calender sele

		sendkeys(pom.getSettings_Module().getcalendercl(), "03/16/2022");

		// license state

		Clickonelement(pom.getSettings_Module().getlicensestate());

		// license state

		Thread.sleep(3000);
		sendkeys(pom.getSettings_Module().getNpinumber(), "1234");

		// specality

		Thread.sleep(3000);

		selectone(pom.getSettings_Module().getSpecality(), "Lactation consulting");

//				Select se = new Select(driver.findElement(By.xpath("(//select[@name='specialty'])[1]")));
//				
//				se.selectByVisibleText("Lactation consulting");

//				Clickonelement(pom.getSettings_Module().getSpecality());
		//
//				Clickonelement(pom.getSettings_Module().getseleSpecality());

		// sele tc

		clear(pom.getSettings_Module().getseleTC());

		sendkeys(pom.getSettings_Module().getseleTC(), "123456789");

		// facility info

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselefac());

		// add faci

		Clickonelement(pom.getSettings_Module().getaddselefac());

		// facename

		sendkeys(pom.getSettings_Module().getaddselefacname(), "xyz");

		// facename

		sendkeys(pom.getSettings_Module().getaddselefaccountry(), "abc");

		// facename

		sendkeys(pom.getSettings_Module().getaddselefacadd(), "abc street");

		// facename

		sendkeys(pom.getSettings_Module().getaddselefaczip(), "55555");

		// State

		sendkeys(pom.getSettings_Module().getaddselefacstate(), "abc state");

		// City

		sendkeys(pom.getSettings_Module().getaddselefaccity(), "abc City");

		// phone

		sendkeys(pom.getSettings_Module().getaddseleofficephone(), "123456");

		// phone

		sendkeys(pom.getSettings_Module().getaddseleofficephone(), "123456");

		// fax

		sendkeys(pom.getSettings_Module().getaddfax(), "54321");

		// radio button

		Clickonelement(pom.getSettings_Module().getradiobtntele());

		// Billing add fac
		Clickonelement(pom.getSettings_Module().getclickbill());

		// pos code

		selectone(pom.getSettings_Module().getseleposco(), "Telehealth");

		// Facility Npi

		sendkeys(pom.getSettings_Module().getfacnpi(), "54321");

		// Facility Npi

		sendkeys(pom.getSettings_Module().getfacnpi(), "54321");

		// Facility fac num

		sendkeys(pom.getSettings_Module().getfacprovnum(), "456789");

		// billing tax no

		sendkeys(pom.getSettings_Module().getbillingtaxid(), "456789");

		// billing npi no

		sendkeys(pom.getSettings_Module().getbillingnpino(), "456789");

		// clia npi no

		sendkeys(pom.getSettings_Module().getbillingclia(), "03/18/2022");

		// billing npi no

		sendkeys(pom.getSettings_Module().getbillingcliano(), "456789");

		// radio bill fac

		Clickonelement(pom.getSettings_Module().getradiobilfa());

		// close fac

		Clickonelement(pom.getSettings_Module().getclosefac());

		// click user

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getUsersele());

		// click user

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getaddprovsele());

		// firstname p

		sendkeys(pom.getSettings_Module().getpfirstname(), "hello");

		// last p

		sendkeys(pom.getSettings_Module().getplastname(), "123");

		// select prime

		selectone(pom.getSettings_Module().getprimpro(), "Select Provider");

		// select prime

		selectone(pom.getSettings_Module().getprimpro(), "Select Provider");

		// select role

		sendkeys(pom.getSettings_Module().getemailadd(), "xyz@gmail.com");

		// select usernam

		sendkeys(pom.getSettings_Module().getusernam(), "admin");

		// select pass

		sendkeys(pom.getSettings_Module().getpasspro(), "admin@123");

		// select pass

		sendkeys(pom.getSettings_Module().getcpasspro(), "admin@123");

		// select phon

		sendkeys(pom.getSettings_Module().getcphon(), "123456");

		// select phon

		selectone(pom.getSettings_Module().getseledfac(), "Test Facility2");

		// radio

		Clickonelement(pom.getSettings_Module().getchepror());

		// Federal Tax ID:

		Clickonelement(pom.getSettings_Module().getfedrata());

		// select dea

		sendkeys(pom.getSettings_Module().getdeanu(), "12343");

		// select dea

		sendkeys(pom.getSettings_Module().getjobdes(), "welcome");

		// select dea

		sendkeys(pom.getSettings_Module().gettaxom(), "Hello");

		// select upi

		sendkeys(pom.getSettings_Module().getupinp(), "123");

		// select npi

		sendkeys(pom.getSettings_Module().getNPIP(), "123");
		// select spe

		selectone(pom.getSettings_Module().getSpecp(), "Acupuncture");

		// select lic

		selectone(pom.getSettings_Module().getlicty(), "LCSW");

		// select lic

		sendkeys(pom.getSettings_Module().getlicsen(), "123456");

		// select lic

		sendkeys(pom.getSettings_Module().getcalep(), "03/17/2022");

		// select spe

		selectone(pom.getSettings_Module().getlicsta(), "AK");

		// add lice

		// Clickonelement(pom.getSettings_Module().getaddlic());

		// dele lice

		// Clickonelement(pom.getSettings_Module().getaddlic());

		// close

		Clickonelement(pom.getSettings_Module().getcloseus());

		// click edit

		Clickonelement(pom.getSettings_Module().getclickedit());

		// close edit

		Clickonelement(pom.getSettings_Module().getcloseclickedit());

		//// // staff

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclistaff());

		// addstaff

		Clickonelement(pom.getSettings_Module().getcliaddstaff());

		// first name

		sendkeys(pom.getSettings_Module().getfisrtnames(), "abcd");

		// last name

		sendkeys(pom.getSettings_Module().getlastnames(), "efgh");

		// select pp

		selectone(pom.getSettings_Module().getselepripro(), "Tech1 Test");

		// select role

		selectone(pom.getSettings_Module().getselerole(), "Administrators");

		// select pass

		sendkeys(pom.getSettings_Module().getseleemaiadd(), "admin@gmail.com");

		// select pass

		sendkeys(pom.getSettings_Module().getseleuserna(), "admin123");

		// select pass

		sendkeys(pom.getSettings_Module().getselepass(), "admin123");

		// select pass

		sendkeys(pom.getSettings_Module().getselecpass(), "admin123");

		// select pass

		sendkeys(pom.getSettings_Module().getselehoph(), "123456");

		// select pass

		sendkeys(pom.getSettings_Module().getselecelph(), "123456");

		// select pass

		selectone(pom.getSettings_Module().getseleDF(), "Test Facility Phar");

		// check for provider

		Clickonelement(pom.getSettings_Module().getradiopro());

		// select pass

		sendkeys(pom.getSettings_Module().getfedtaxid(), "123456");

		// select deanum

		sendkeys(pom.getSettings_Module().getdeanump(), "654321");

		// job des

		sendkeys(pom.getSettings_Module().getjobdesp(), "welcome");

		// taxmp

		sendkeys(pom.getSettings_Module().gettaxmp(), "hello");

		// upi

		sendkeys(pom.getSettings_Module().getupinpro(), "123456");

		// npi

		sendkeys(pom.getSettings_Module().getnpipro(), "65432");

		// select spec

		selectone(pom.getSettings_Module().getspesele(), "Counseling");

		// select spec

		selectone(pom.getSettings_Module().getlicetyp(), "LICSW");

		// upi

		sendkeys(pom.getSettings_Module().getlicetp(), "123456");

		// upi

		sendkeys(pom.getSettings_Module().getliceexpp(), "03/19/2022");

		// licsta

		selectone(pom.getSettings_Module().getlicestat(), "AZ");

		// close

		Clickonelement(pom.getSettings_Module().getcloseus());

		// click Settings

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getSettings_Module().getclciksettings());

		// clcik feat
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getfeaturcli());

		// click schedul
		Thread.sleep(4000);
		Clickonelement(pom.getSettings_Module().getclischedul());

		// clic cal
		Clickonelement(pom.getSettings_Module().getclical());

		// calender from

		Thread.sleep(2000);

		selectone(pom.getSettings_Module().getcalfrom(), "02 AM");

		// cal to

		selectone(pom.getSettings_Module().getcalto(), "08 AM");

		// cal to

		selectone(pom.getSettings_Module().getseledayw(), "Week");

		// cal to

		selectone(pom.getSettings_Module().getfulwe(), "Don't show Sundays");

		// app remail

		Clickonelement(pom.getSettings_Module().getapprem());

		// app remail
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getemairad());

		// remail edit

		Clickonelement(pom.getSettings_Module().getemailedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().getemailcli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclprae());

		// client

		Clickonelement(pom.getSettings_Module().getclclie());

		// client

		Clickonelement(pom.getSettings_Module().getclcappe());

		// client

		Clickonelement(pom.getSettings_Module().getclclinke());

		// remai

		clear(pom.getSettings_Module().getremsenem());

		sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgema());

		sendkeys(pom.getSettings_Module().getmsgema(), "appiontment  ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcancelema());

		//////////

		// remail edit

		Clickonelement(pom.getSettings_Module().getteleedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().gettelecli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclpraT());

		// client

		Clickonelement(pom.getSettings_Module().getclcliT());

		// client

		Clickonelement(pom.getSettings_Module().getclcappT());

		// client

		Clickonelement(pom.getSettings_Module().getclclinkT());

		// remai

		clear(pom.getSettings_Module().getremsentel());

		sendkeys(pom.getSettings_Module().getremsentel(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgtele());

		sendkeys(pom.getSettings_Module().getmsgtele(), "Tele appiontment  ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcanceltele());

		////////

		// clc voice ar
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getvoicear());

		// app remail
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getvoicerad());

		// remail edit

		Clickonelement(pom.getSettings_Module().getvoiceedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().getvoicecli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclpravoice());

		// client

		Clickonelement(pom.getSettings_Module().getclclievoice());

		// client

		Clickonelement(pom.getSettings_Module().getclcappvoice());

		// client

		Clickonelement(pom.getSettings_Module().getclclinkvoice());

//				// remai
		//
//				clear(pom.getSettings_Module().getremsenem());
		//
//				sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgvoice());

		sendkeys(pom.getSettings_Module().getmsgvoice(), "Voice  appiontment   ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcancelvoice());

		////////

		// clc voice ar
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().gettextar());

		// app remail
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().gettextrad());

		// remail edit

		Clickonelement(pom.getSettings_Module().gettextedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().gettextcli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclpratext());

		// client

		Clickonelement(pom.getSettings_Module().getclclietext());

		// client

		Clickonelement(pom.getSettings_Module().getclcapptext());

		// client

		Clickonelement(pom.getSettings_Module().getclclinktext());

//					// remai
		//
//					clear(pom.getSettings_Module().getremsenem());
		//
//					sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgtext());

		sendkeys(pom.getSettings_Module().getmsgtext(), "text   appiontment   ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcanceltext());

		// get Billing
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getBillingmodule().getbillingmodule());

		// patient payment
		Thread.sleep(3000);

		Clickonelement(pom.getBillingmodule().getpatientpayment());

		// patient search

		sendkeys(pom.getBillingmodule().getpateintsear1(), "John peter");

		// click patientpayment1

		Clickonelement(pom.getBillingmodule().getpateintpayment1());

		// search pat

		sendkeys(pom.getBillingmodule().getpateintsear2(), "John");

		// click patientpayment1

		Clickonelement(pom.getBillingmodule().getclipateintsear2());

		// patient statemen

		Clickonelement(pom.getBillingmodule().getpatientstate());

		// patient state se

		sendkeys(pom.getBillingmodule().getpateintsear3(), "John");

		// click patientpayment1

		Clickonelement(pom.getBillingmodule().getclipateintsear3());

		// click radi

		Clickonelement(pom.getBillingmodule().getcliradio());

		// stat bal

		sendkeys(pom.getBillingmodule().getstbal(), "10");

		// end bal

		sendkeys(pom.getBillingmodule().getenbal(), "50000");

		// clic sear

		Clickonelement(pom.getBillingmodule().getclisear1());

		// cli all pat

		Thread.sleep(3000);

		Clickonelement(pom.getBillingmodule().getallpatcl());

		// patient state se

		sendkeys(pom.getBillingmodule().getsearchpat4(), "John");

		// click patientpayment1

		Clickonelement(pom.getBillingmodule().getselepat2());

		// click radi

		Clickonelement(pom.getBillingmodule().getclirad2());

		// stat bal

		sendkeys(pom.getBillingmodule().getstabal2(), "10");

		// end bal

		sendkeys(pom.getBillingmodule().getenbal2(), "50000");

		// click sera

		Clickonelement(pom.getBillingmodule().getclisear5());

		// fee sch
		Clickonelement(pom.getBillingmodule().getfees());

		// cpt sear
		Thread.sleep(2000);

		sendkeys(pom.getBillingmodule().getcpthcpcssear(), "940612");

		// clic cpt

		Clickonelement(pom.getBillingmodule().getclicpt());

		// insu name

		sendkeys(pom.getBillingmodule().getinsuranam(), "UNITED HEALTHCARE");

		// sele insu

		Clickonelement(pom.getBillingmodule().getinsuranamsele());

		// pay name

		sendkeys(pom.getBillingmodule().getpaynam(), "new arvind");

		// sele payer

		Clickonelement(pom.getBillingmodule().getpaynamsele());

		// pick name

		sendkeys(pom.getBillingmodule().getpicklis(), "hello");

		// sele pick

		Thread.sleep(2000);

		Clickonelement(pom.getBillingmodule().getpicklissele());

		// updat cl

		Clickonelement(pom.getBillingmodule().getupdacli());

		// cl

		Clickonelement(pom.getBillingmodule().getclied());

		// cl

		Clickonelement(pom.getBillingmodule().getcliedcancel());

		// cli ad

		Clickonelement(pom.getBillingmodule().getcliaddne());

		// sele cpt

		selectone(pom.getBillingmodule().getselecpt(), "CPT4");

		// sele cpt

		sendkeys(pom.getBillingmodule().getsearco(), "1");

		// cli cod

		Clickonelement(pom.getBillingmodule().getselecptco());

		// base pri

		sendkeys(pom.getBillingmodule().getbasepri(), "5000");

		// base pri

		sendkeys(pom.getBillingmodule().getexpectrei(), "200");

		// cpt pri

		sendkeys(pom.getBillingmodule().getcptmod(), "cpt code");

		// office sel

		selectone(pom.getBillingmodule().getseleoff(), "Test Facility Phar");

		// sele ndc

		sendkeys(pom.getBillingmodule().getNdcco(), "10");

		// send ndc qu

		sendkeys(pom.getBillingmodule().getNdcquan(), "10");

		// send ndc un

		sendkeys(pom.getBillingmodule().getNdcun(), "10");

		// payer id

		selectone(pom.getBillingmodule().getpayerid(), "UNITED HEALTHCARE");

		// pay name

		sendkeys(pom.getBillingmodule().getpaynam2(), "arvind swamy");

		// cus des

		sendkeys(pom.getBillingmodule().getcusdes(), "new cpt code ");

		// cus des

		sendkeys(pom.getBillingmodule().getpickca(), "Yellow");

		// clic save

		Clickonelement(pom.getBillingmodule().getclisave());

		// cli ad

		Clickonelement(pom.getBillingmodule().getcliaddne());

		// sele hcpcs

		selectone(pom.getBillingmodule().getselecpt(), "HCPCS");

		// search code

		sendkeys(pom.getBillingmodule().getcodese2(), "1");

		// sele cod

		Clickonelement(pom.getBillingmodule().getselecodese2());

		// base pri hcpcs

		sendkeys(pom.getBillingmodule().getbasepri(), "5000");

		// base pri hcpcs

		sendkeys(pom.getBillingmodule().getexpectrei(), "200");

		// hcpcs mod

		sendkeys(pom.getBillingmodule().getcptmod(), "HCPCS CODE");

		// office sel

		selectone(pom.getBillingmodule().getseleoff(), "Test Facility Phar");

		// sele ndc

		sendkeys(pom.getBillingmodule().getNdcco(), "10");

		// send ndc qu

		sendkeys(pom.getBillingmodule().getNdcquan(), "10");

		// send ndc un

		sendkeys(pom.getBillingmodule().getNdcun(), "10");

		// payer id

		selectone(pom.getBillingmodule().getpayerid(), "UNITED HEALTHCARE");

		// pay name

		sendkeys(pom.getBillingmodule().getpaynam2(), "Shanker");

		// cus des

		sendkeys(pom.getBillingmodule().getcusdes(), "new hcpcs code ");

		// pickca des

		sendkeys(pom.getBillingmodule().getpickca(), "Yellow");

		// clic save hcpcs

		Clickonelement(pom.getBillingmodule().getclisave());

		// cli ad

		Clickonelement(pom.getBillingmodule().getcliaddne());

		// sele hcpcs

		selectone(pom.getBillingmodule().getselecpt(), "CUSTOMS");

		// search code

		sendkeys(pom.getBillingmodule().getcodese2(), "22125");

		// base pri hcpcs

		sendkeys(pom.getBillingmodule().getbasepri(), "2000");

		// base pri hcpcs

		sendkeys(pom.getBillingmodule().getexpectrei(), "100");

		// office sel

		selectone(pom.getBillingmodule().getseleoff(), "Test Facility Phar");

		// cus des

		sendkeys(pom.getBillingmodule().getcusdes(), "new customs code ");

		// pickca des

		sendkeys(pom.getBillingmodule().getpickca(), "Blue");

		// clic save cusom

		Clickonelement(pom.getBillingmodule().getclisave());

		// click eob
		Thread.sleep(2000);

		Clickonelement(pom.getBillingmodule().getclieob());

		// sel insu

		selectone(pom.getBillingmodule().getselein(), "UNITED HEALTHCARE");

		// star date

		sendkeys(pom.getBillingmodule().getstardat(), "2022-04-01");

		// end date

		sendkeys(pom.getBillingmodule().getendat(), "2022-04-07");

		// sear eo

		Clickonelement(pom.getBillingmodule().getseareo());

		// sele eob

		Clickonelement(pom.getBillingmodule().getseleeob());

		// sele edit eob

		Clickonelement(pom.getBillingmodule().getseleed());

		// sele edit eob

		Thread.sleep(2000);

		Clickonelement(pom.getBillingmodule().getclican());

		// Close The Chrome

	}

}
