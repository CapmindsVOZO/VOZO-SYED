package com.newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class TaskAppointment extends Capminds_BaseClass {

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

		// get Task

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getTaskselect().getTaskcli());

		// sele assign

		// Clickonelement(pom.getTaskselect().getTask());

		selectone(pom.getTaskselect().getseleassign(), "Tech1 Test");

		// sele assign

		// Clickonelement(pom.getTaskselect().getseleprio());

		selectone(pom.getTaskselect().getseleprio(), "Medium");

		// sele due date

		selectone(pom.getTaskselect().getduedate(), "2022-04-09");

		// sele archive

		Clickonelement(pom.getTaskselect().getarchi());

		// sele task

		selectone(pom.getTaskselect().getseletask(), "Doctor");

		// add task
		Thread.sleep(2000);

		Clickonelement(pom.getTaskselect().getaddnewtas());

		// sele temp

		selectone(pom.getTaskselect().getseletem(), "Doctor meeting");

//			// get tak ti
//			
//			Thread.sleep(4000);
		//
//			gettext(pom.getTaskselect().getgettit());
		//
//			// get ass ti
		//
//			gettext(pom.getTaskselect().getassito());
		//
//			// get ass ti
		//
//			gettext(pom.getTaskselect().getcate());
		//
//			// get ass ti
		//
//			gettext(pom.getTaskselect().getstat());

		// Note

		sendkeys(pom.getTaskselect().getseletem(), "New 123");

		// sele asso

		selectone(pom.getTaskselect().getaddass(), "Patient");

		// sele ass it

		selectone(pom.getTaskselect().getaddass(), "Appointment");

		// sele ass it
		Thread.sleep(4000);

		sendkeys(pom.getTaskselect().getpatna(), "John");

		Clickonelement(pom.getTaskselect().getselepat());

		// cli sav

		Clickonelement(pom.getTaskselect().getclisav());

//			// cli edit
		//
//			Clickonelement(pom.getTaskselect().getclied());
		//
//			// cli clo
		//
//			Clickonelement(pom.getTaskselect().getcliclo());
	}
}
