package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_Select {
	
	public WebDriver driver;

	public Task_Select(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[7]")

	private WebElement Taskcli;

	public WebElement getTaskcli() {
		return Taskcli;
	}
	
	
	@FindBy(xpath = "(//select[@class='tk-sel-box form-control'])[1]")

	private WebElement seleassign;

	public WebElement getseleassign() {
		
		return seleassign;
	}
	
	
	@FindBy(xpath = "(//select[@class='tk-sel-box form-control'])[2]")

	private WebElement seleprio;

	public WebElement getseleprio() {
		
		return seleprio;
	}
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")

	private WebElement duedate;

	public WebElement getduedate() {
		
		return duedate;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Archive'])[1]")

	private WebElement archi;

	public WebElement getarchi() {
		
		return archi;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[2]")

	private WebElement seletask;

	public WebElement getseletask() {
		
		return seletask;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Add New Tasks'])[1]")

	private WebElement addnewtas;

	public WebElement getaddnewtas() {
		
		return addnewtas;
	}
	
	@FindBy(xpath = "(//select[@class='form-control'])[3]")

	private WebElement seletem;

	public WebElement getseletem() {
		
		return seletem;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Enter Title'])[1]")

	private WebElement gettit;

	public WebElement getgettit() {
		
		return gettit;
	}
	
	@FindBy(xpath = "(//select[@placeholder='select one'])[1]")

	private WebElement assito;

	public WebElement getassito() {
		
		return assito;
	}
	
	@FindBy(xpath = "(//select[@class='form-control'])[5]")

	private WebElement cate;

	public WebElement getcate() {
		
		return cate;
	}
	
	@FindBy(xpath = "(//select[@class='form-control'])[6]")

	private WebElement stat;

	public WebElement getstat() {
		
		return stat;
	}
	
	@FindBy(xpath = "(//select[@class='form-control'])[10]")

	private WebElement addass;

	public WebElement getaddass() {
		
		return addass;
	}
	
	@FindBy(xpath = "(//input[@class='search'])[1]")

	private WebElement patna;

	public WebElement getpatna() {
		
		return patna;
	}

	@FindBy(xpath = "(//span[@class='text'])[1]")

	private WebElement selepat;

	public WebElement getselepat() {
		
		return selepat;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement clisav;

	public WebElement getclisav() {
		
		return clisav;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[6]")

	private WebElement clied;

	public WebElement getclied() {
		
		return clied;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[51]")

	private WebElement cliclo;

	public WebElement getcliclo() {
		
		return cliclo;
	}
	
}
