package com.newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Setting_Module extends Capminds_BaseClass {
	
	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

	
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

//					Select se = new Select(driver.findElement(By.xpath("(//select[@name='specialty'])[1]")));
//					
//					se.selectByVisibleText("Lactation consulting");

//					Clickonelement(pom.getSettings_Module().getSpecality());
			//
//					Clickonelement(pom.getSettings_Module().getseleSpecality());

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

//					// remai
			//
//					clear(pom.getSettings_Module().getremsenem());
			//
//					sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

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

//						// remai
			//
//						clear(pom.getSettings_Module().getremsenem());
			//
//						sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

			// msgem

			clear(pom.getSettings_Module().getmsgtext());

			sendkeys(pom.getSettings_Module().getmsgtext(), "text   appiontment   ");

			// cancel

			Clickonelement(pom.getSettings_Module().getcanceltext());
	}
}
