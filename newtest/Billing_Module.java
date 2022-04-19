package com.newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Billing_Module extends Capminds_BaseClass {

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

	}

}
