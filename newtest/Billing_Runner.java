package com.newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Billing_Runner extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

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

		// get appointment
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// click pre

		Clickonelement(pom.getAppointmentService().getclickpre());

		// click appoi

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getcliccal());
		// clic Date

		Clickonelement(pom.getAppointmentService().getclidate());

		// click appoi

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getclicapp());

		// click appoi

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().getclicserv());

		// click HCPCS Code

		sendkeys(pom.getAppointmentService().getclicfindhcpc(), "1");

		// click appoi

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclichcpcs());

		// click HCPCS Code

		// sendkeys(pom.getAppointmentService().getsendfee(), "500");

		// clci mod1

		Clickonelement(pom.getAppointmentService().getclicmod1());

		// sele mod1

		Clickonelement(pom.getAppointmentService().getselecmod1());

		// clci mod1

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclicmod2());

		// sele mod1

		Clickonelement(pom.getAppointmentService().getselemod2());

		// clci mod1

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclicmod3());

		// sele mod1

		Clickonelement(pom.getAppointmentService().getselemod3());

		// clci mod1

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclicmod4());

		// sele mod1

		Clickonelement(pom.getAppointmentService().getselemod4());

		// sele quan

		sendkeys(pom.getAppointmentService().getquant(), "2");

		// sele poin

		sendkeys(pom.getAppointmentService().getpointe(), "2");

		// sele ndc

		Clickonelement(pom.getAppointmentService().getNDCPL());

		// sele ndcq

		sendkeys(pom.getAppointmentService().getNDCPLqua(), "2");

		// sele ndcq

		sendkeys(pom.getAppointmentService().getNDCPLqua(), "2");

		// sele ndcq

		selectone(pom.getAppointmentService().getNDCPUnits(), "ML (MilliLiter)");

		// sele ndcq

		sendkeys(pom.getAppointmentService().geticd9(), "1");

		// sele icd9

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().geticd9sele());

		// get text

		Clickonelement(pom.getAppointmentService().getgetbal());

		gettext(pom.getAppointmentService().getgetbal());
		// sele Billing

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getBillingsel());

		// crea invo

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getcreatenvo());

		// clos in

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclosenvo());

	}

}
