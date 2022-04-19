
package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Testng_Test extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test

	public void Test1() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// get Appointment Text
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Click day

		Clickonelement(pom.getnewappointment().getClickdayn());

//			// Click calender
		//
//			Clickonelement(pom.getnewappointment().getClickcaln());

		// Click crea app

		// Clickonelement(pom.getnewappointment().getClickcreateappn());

		// click cal

		Clickonelement(pom.getnewappointment().getcal1());

		// ser pat6
		Thread.sleep(3000);

		Clickonelement(pom.getnewappointment().getserachpatn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendpatn());

		// send time
		// Clickonelement(pom.getnewappointment().getsendtimen());

		// clear(pom.getnewappointment().getsendtimen());

		Thread.sleep(2000);

		// sendkeys(pom.getnewappointment().getsendtimen(), "01:00PM");

		// ser provi
		Thread.sleep(2000);

//		Clickonelement(pom.getnewappointment().getsearprovin());
//
//		Clickonelement(pom.getnewappointment().getsendprovn());

		// ser pro
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearprofn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendprofn());

		// ser pro
		Thread.sleep(2000);

//		Clickonelement(pom.getnewappointment().getsearoffn());
//
//		Clickonelement(pom.getnewappointment().getsendoffn());

		// ser stat
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearchstan());

		Clickonelement(pom.getnewappointment().getsendstatn());
		
		Clickonelement(pom.getnewappointment().getcanceln());
		

	}
	
	

	@Test

	public void Test2() throws InterruptedException {

		// Driver Maximize and Url Launch

		//geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// get Appointment Text
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Click day

		Clickonelement(pom.getnewappointment().getClickdayn());

//		// Click calender
//
//		Clickonelement(pom.getnewappointment().getClickcaln());
//		// Click crea app
//
//		Clickonelement(pom.getnewappointment().getClickcreateappn());

		// click cal

		Clickonelement(pom.getnewappointment().getcal2());

		// ser pat6
		Thread.sleep(3000);

		Clickonelement(pom.getnewappointment().getserachpatn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendpatn());

		// send time
		// Clickonelement(pom.getnewappointment().getsendtimen());

		// clear(pom.getnewappointment().getsendtimen());

		Thread.sleep(2000);

		// sendkeys(pom.getnewappointment().getsendtimen(), "01:00PM");

		// ser provi
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearprovin());

		Clickonelement(pom.getnewappointment().getsendprovn());

		// ser pro
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearprofn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendprofn());

		// ser pro
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearoffn());

		Clickonelement(pom.getnewappointment().getsendoffn());

		// ser stat
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearchstan());

		Clickonelement(pom.getnewappointment().getsendstatn());
		
		Clickonelement(pom.getnewappointment().getcanceln());

		// save

		// Clickonelement(pom.getnewappointment().getsaven());

	}

	@Test

	public void Test3() throws InterruptedException {
		// Driver Maximize and Url Launch

		//geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// get Appointment Text
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Click day

		Clickonelement(pom.getnewappointment().getClickdayn());

//		// Click calender
//
//		Clickonelement(pom.getnewappointment().getClickcaln());
//		// Click crea app
//
//		Clickonelement(pom.getnewappointment().getClickcreateappn());

		// click cal

		Clickonelement(pom.getnewappointment().getcal3());

		// ser pat6
		Thread.sleep(3000);

		Clickonelement(pom.getnewappointment().getserachpatn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendpatn());

		// send time
		// Clickonelement(pom.getnewappointment().getsendtimen());

		// clear(pom.getnewappointment().getsendtimen());

		Thread.sleep(2000);

		// sendkeys(pom.getnewappointment().getsendtimen(), "01:00PM");

		// ser provi
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearprovin());

		Clickonelement(pom.getnewappointment().getsendprovn());

		// ser pro
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearprofn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendprofn());

		// ser pro
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearoffn());

		Clickonelement(pom.getnewappointment().getsendoffn());

		// ser stat
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearchstan());

		Clickonelement(pom.getnewappointment().getsendstatn());
		
		Clickonelement(pom.getnewappointment().getcanceln());

		// save

		// Clickonelement(pom.getnewappointment().getsaven());

	}

}
