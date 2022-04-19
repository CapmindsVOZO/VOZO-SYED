package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;
import com.patient.Patient_Module;

public class Test_class extends Capminds_BaseClass {

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

		Clickonelement(pom.getSettings_Module().getclciksettings());

		// ac se cli
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliacse());

		// sch cli
		Thread.sleep(3000);

		Clickonelement(pom.getSettings_Module().getclished2());

		// admi cli
		Thread.sleep(3000);

		Clickonelement(pom.getSettings_Module().getAdmcli());

		// erx set

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().geterxset());

		// clic fav

		Clickonelement(pom.getSettings_Module().getfavpres());

		// fin med

		sendkeys(pom.getSettings_Module().getfinmed(), "a");

		// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselmed());

		// sel sig

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselsig());

		// sel dos

		Clickonelement(pom.getSettings_Module().getseldos());

		// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclidos());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getseluni());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliuni());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselrou());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclirou());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselfre());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclifre());

		// sel dir
		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getseldir());

		// cli dir

		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getclidir());

		// sel dir
		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getseldur());

		// cli dir

		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getclidur());

		// cli updat

		Clickonelement(pom.getSettings_Module().getcliupd());

		// eff date

		Clickonelement(pom.getSettings_Module().geteffdat());

		// sele eff da

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().geteffdatsel());

		// sen di

		sendkeys(pom.getSettings_Module().getsendi(), "10");

		// dis un

		Clickonelement(pom.getSettings_Module().getdiun());

		// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getdiunsel());
		// sele dis

		sendkeys(pom.getSettings_Module().getrefi(), "10");

		// cli up

		sendkeys(pom.getSettings_Module().getnotopha(), "Hello 123 ");

		// cli sav

		Clickonelement(pom.getSettings_Module().getclisav());

		// clic fav

		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getfavpres());

		// cli comp

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclicom());

		// fin med

		sendkeys(pom.getSettings_Module().getfincomp(), "a");

		// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselcom());

		// sel sig

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselsig());

		// sel dos

		Clickonelement(pom.getSettings_Module().getseldos());

		// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclidos());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getseluni());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliuni());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselrou());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclirou());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselfre());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclifre());

		// sel dir
		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getseldir());

		// cli dir

		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getclidir());

		// sel dir
		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getseldur());

		// cli dir

		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getclidur());

		// cli updat

		Clickonelement(pom.getSettings_Module().getcliupd());

		// eff date

		Clickonelement(pom.getSettings_Module().geteffdat());

		// sele eff da

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().geteffdatsel());

		// sen di

		sendkeys(pom.getSettings_Module().getsendi(), "10");

		// dis un

		Clickonelement(pom.getSettings_Module().getdiun());

		// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getdiunsel());
		// sele dis

		sendkeys(pom.getSettings_Module().getrefi(), "10");

		// cli up

		sendkeys(pom.getSettings_Module().getnotopha(), "Hello 123 ");

		// cli sav

		Clickonelement(pom.getSettings_Module().getclisav());

		// clic fav

		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getfavpres());

		// cli sup

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclisup());

		// fin med

		sendkeys(pom.getSettings_Module().getfinsup(), "a");

		// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselcom());

		// sel sig

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselsig());

		// sel dos

		Clickonelement(pom.getSettings_Module().getseldos());

		// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclidos());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getseluni());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliuni());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselrou());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclirou());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselfre());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclifre());

		// sel dir
		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getseldir());

		// cli dir

		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getclidir());

		// sel dir
		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getseldur());

		// cli dir

		Thread.sleep(1000);

		Clickonelement(pom.getSettings_Module().getclidur());

		// cli updat

		Clickonelement(pom.getSettings_Module().getcliupd());

		// eff date

		Clickonelement(pom.getSettings_Module().geteffdat());

		// sele eff da

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().geteffdatsel());

		// sen di

		sendkeys(pom.getSettings_Module().getsendi(), "10");

		// dis un

		Clickonelement(pom.getSettings_Module().getdiun());

		// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getdiunsel());
		// sele dis

		sendkeys(pom.getSettings_Module().getrefi(), "10");

		// cli up

		sendkeys(pom.getSettings_Module().getnotopha(), "Hello 123 ");

		// cli sav

		Clickonelement(pom.getSettings_Module().getclisav());

	}

}
