package com.Roopkala.AUTOTEST;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Roopkala.Base.BasePage;
import com.Roopkala.Pages.CARTpage;
import com.Roopkala.Pages.CurrencyPage;
import com.Roopkala.Pages.Dashboardpage;
import com.Roopkala.Pages.LehengasDropdown;
import com.Roopkala.Pages.LoginPage;
import com.Roopkala.Pages.SareesDropdown;
import com.Roopkala.utilities.CommonActions;

public class LoginTEST extends BasePage {
	
@Test(description="To Validate the login page ")
	
	public void Accept (){
	

	CARTpage CA=new CARTpage(driver);
	CurrencyPage c=new CurrencyPage(driver);
	Dashboardpage D=new Dashboardpage(driver);
	LehengasDropdown L=new LehengasDropdown(driver);
	SareesDropdown S=new SareesDropdown(driver);
	LoginPage log=new LoginPage(driver);
	CommonActions C = new CommonActions();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions action = new Actions(driver);
	
	C.wait(5000);
	C.click_on_Element(D.ACCEPT_button); 
	
	//********Login**************************************

	
	
		C.moveToAndClick(log.Login_symbol);
		C.enters_data("pelejo9925@asoflex.com", log.Username_Email_FildBOX);
		C.enters_data("GpNsf7ZLBNnRDad", log.PASSWORD_FildBOX);
		C.click_on_Element(log.checkbox_buttonloginpage);
		C.click_on_Element(log.Login_button);	
		C.click_on_Element(D.Home_button); 

}}
