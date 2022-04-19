package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Parallel_New extends Parallel_Base {

	@Test

	public void Test1() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		new Parallel_Login(driver).getenterUser().getpasswo().getlogbtn().getclish().getcalclin()
		.getsearpat()
				.getclipat()
				.getcliprot().getclipros()
				.getclistat().getselesta().getselecan();

		// Enter Username



	}

	@Test

	public void Test2() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		new Parallel_Login(driver)

				.getenterUser().getpasswo().getlogbtn().getclish().getcalclin1()
				.getsearpat().getclipat()

				.getcliprot().getclipros()
				.getclistat().getselesta().getselecan();

		System.out.println("test complete2");

	}

}
