package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.utilities.CommonActions;
import com.Roopkala.Base.BasePage;

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
	
	@FindBy(xpath="//a[text()='Accept']")
	public WebElement ACCEPT_button;
	
	@FindBy(xpath="//div[@class='whb-column whb-col-left whb-visible-lg']//img[@alt='Roopkala Heritage']")
	public WebElement Home_button ;
	/*
	public void Login() {
		
		CommonActions C = new CommonActions();
		C.click_on_Element(Login_symbol);
		C.enters_data("pelejo9925@asoflex.com", Username_Email_FildBOX);
		C.enters_data("GpNsf7ZLBNnRDad", PASSWORD_FildBOX  );
		C.click_on_Element(checkbox_buttonloginpage);
		C.click_on_Element(Login_button);
		C.click_on_Element(Home_button);
		
		//if (ACCEPT_button.isDisplayed()) {
			//C.click_on_Element(ACCEPT_button);
		}
		
		*/
	}
	
	
	
	

