package com.capminds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjectmanager.Pageobjectmanager;

public class Capminds_Testng extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("edge");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@BeforeTest

	public void login() {

		
		
		
		
	}

	
}
