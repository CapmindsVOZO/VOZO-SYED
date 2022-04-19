package com.capminds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pageobjectmanager.Pageobjectmanager;

public class RunnerClass_testng extends Capminds_BaseClass {
	
	
	
	
	

	public static WebDriver driver = getbrowser("edge");
	

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	//public static void main(String[] args) throws InterruptedException {
		
		@Test(priority = 0)
		
		public void login() {
		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());
		
		}

		@Test(priority = 1)
		public void calender () throws InterruptedException {
			
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
		
		}
		@Test(priority = 2)
		public void newappointment () throws InterruptedException {

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
		
		}
		
		@Test(priority = 3)
		
		public void  getappointmentdashboard() throws InterruptedException{

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
		}
		
		@Test(priority = 4)
		public void getprovideravailability() throws InterruptedException {

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

		Clickonelement(pom.getappoAppointment_Profile().getclicksort());

		// click sort release
		Clickonelement(pom.getappoAppointment_Profile().getclicksortrelease());

		// Click delete

		Clickonelement(pom.getappoAppointment_Profile().getclickdelete());

		// click dismiss

		alertdismiss(driver);
		
		
		}

		

		

	

}