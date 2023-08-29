package com.Roopkala.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;
import com.Roopkala.utilities.CommonActions;

public class LoginPage extends BasePage{
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='My account']")
	public WebElement Login_symbol;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement Username_Email_FildBOX ;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement PASSWORD_FildBOX ;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	public WebElement Login_button ;
	
	@FindBy(xpath="//input[@title='Remember me']")
	public WebElement checkbox_buttonloginpage ;
	
	
	 public void login() {
				
		   
			Dashboardpage D=new Dashboardpage(driver);
			LoginPage log=new LoginPage(driver);
			CommonActions C = new CommonActions();	
			Actions action = new Actions(driver);
			
			C.wait(5000);
		 
		 
		 
				C.moveToAndClick(log.Login_symbol);
				C.enters_data("pelejo9925@asoflex.com", log.Username_Email_FildBOX);
				C.enters_data("GpNsf7ZLBNnRDad", log.PASSWORD_FildBOX);
				C.click_on_Element(log.checkbox_buttonloginpage);
				C.click_on_Element(log.Login_button);	
				C.click_on_Element(D.Home_button); 
	 }
	
	
	
	
}
