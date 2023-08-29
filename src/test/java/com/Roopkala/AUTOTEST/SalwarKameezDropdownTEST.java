package com.Roopkala.AUTOTEST;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Roopkala.Base.BasePage;
import com.Roopkala.Pages.CARTpage;
import com.Roopkala.Pages.CurrencyPage;
import com.Roopkala.Pages.Dashboardpage;
import com.Roopkala.Pages.LehengasDropdown;
import com.Roopkala.Pages.LoginPage;
import com.Roopkala.Pages.SalwarKameezDropdown;
import com.Roopkala.utilities.CommonActions;

public class SalwarKameezDropdownTEST extends BasePage{


	@Test(description="To Validate the SalwarKameezDropdown" )
	public void SalwarKameezDropdown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		CommonActions C = new CommonActions();
		SalwarKameezDropdown S=new SalwarKameezDropdown(driver);
	
		 action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_See_all_Salwar_Kameez);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);
		    
		    action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_Festive);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);

		    action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_Ghararas);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);
		    
		    action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_Indo_Western);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);
		
		    action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_Jumpsuits);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);
		    
		    action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_Palazzo);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);

		    action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_Sangeet);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);
		    
		    action.moveToElement(S.button_Salwar_Kameez).perform();
		    C.click_on_Element(S.button_Anarkalis);
		    C.wait(2000);
		    C.scrolldown(null); 
		    C.wait(2000);
		    C.scrollup(null);
		
		
		
		
		
}}
