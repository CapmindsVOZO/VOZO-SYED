package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.appointmentdashboard.Appointment_Dashboard;
import com.appointmentprofile.Appointment_Profile;
import com.appservice.AppointmentService;
import com.billing.Billing_Module;
import com.calender.Calender_Page;
import com.newappointment.New_Appointment;
import com.patient.Patient_Module;
import com.provideravailability.Provider_Availability;
import com.reports.Reports_Module;
import com.settings.Settings_Module;
import com.signin.Signin_Page;
import com.task.Task_Select;

public class Pageobjectmanager {

	public static WebDriver driver;

	private Signin_Page sp;

	private Calender_Page cp;

	private New_Appointment na;

	private Appointment_Dashboard ad;

	private Provider_Availability pa;

	private Appointment_Profile ap;

	private Patient_Module pat;

	private Reports_Module rep;

	private Settings_Module set;

	private AppointmentService as;

	private Billing_Module bm;
	
	private Task_Select ts;

	public Pageobjectmanager(WebDriver driver2) {
		this.driver = driver2;

	}

	public Signin_Page getinstance() {

		if (sp == null) {

			sp = new Signin_Page(driver);

		}
		return sp;

	}

	public Calender_Page getCalender() {

		if (cp == null) {

			cp = new Calender_Page(driver);

		}
		return cp;

	}

	public New_Appointment getnewappointment() {

		if (na == null) {

			na = new New_Appointment(driver);

		}
		return na;

	}

	public Appointment_Dashboard getappointmentdashboard() {

		if (ad == null) {

			ad = new Appointment_Dashboard(driver);

		}
		return ad;

	}

	public Provider_Availability getprovideravailability() {

		if (pa == null) {

			pa = new Provider_Availability(driver);

		}
		return pa;

	}

	public Appointment_Profile getappoAppointment_Profile() {

		if (ap == null) {

			ap = new Appointment_Profile(driver);

		}
		return ap;

	}

	public Patient_Module getPatient_Module() {

		if (pat == null) {

			pat = new Patient_Module(driver);

		}
		return pat;

	}

	public Reports_Module getReports_Module() {

		if (rep == null) {

			rep = new Reports_Module(driver);

		}
		return rep;

	}

	public Settings_Module getSettings_Module() {

		if (set == null) {

			set = new Settings_Module(driver);

		}
		return set;

	}

	public AppointmentService getAppointmentService() {

		if (as == null) {

			as = new AppointmentService(driver);
		}
		return as;
	}
	
	public Billing_Module  getBillingmodule() {

		if (bm == null) {

			bm = new Billing_Module(driver);
		}
		return bm;
	}
	
	public Task_Select  getTaskselect() {

		if (ts == null) {

			ts = new Task_Select(driver);
		}
		return ts;
	}

}
