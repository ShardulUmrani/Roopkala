package com.Roopkala.AUTOTEST;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Roopkala.Base.BasePage;
import com.Roopkala.Pages.CARTpage;
import com.Roopkala.Pages.CurrencyPage;
import com.Roopkala.Pages.Dashboardpage;
import com.Roopkala.Pages.LehengasDropdown;
import com.Roopkala.Pages.LoginPage;
import com.Roopkala.Pages.SareesDropdown;
import com.Roopkala.utilities.CommonActions;

public class LehengasDropdownTEST extends BasePage{
	
	@Test(description="To Validate the LehengasDropdown" )
	public void Lehengas() {
	
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
	
	
	C.click_on_Element(L.button_LEHENGAS);
	C.click_on_Element(D.Home_button);
	C.wait(2000);
	
	
	action.moveToElement(L.button_LEHENGAS).perform();
    C.click_on_Element(L.button_See_all_Lehengas);
    C.wait(2000);
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
   
    
    
    action.moveToElement(L.button_LEHENGAS).perform();
    C.click_on_Element(L.button_Bridal_Lehengas);
    C.wait(2000);
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
    
    action.moveToElement(L.button_LEHENGAS).perform();
    C.click_on_Element(L.button_Cocktail_Lehengas);
    C.wait(2000);
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
    
    action.moveToElement(L.button_LEHENGAS).perform();
    C.click_on_Element(L.button_Indo_Western);
    C.wait(2000);
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
    
    action.moveToElement(L.button_LEHENGAS).perform();
    C.click_on_Element(L.button_Mehendi_Lehengas);
    C.wait(2000);
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
    
    action.moveToElement(L.button_LEHENGAS).perform();
    C.click_on_Element(L.button_Reception_Lehengas);
    C.wait(2000);
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
    
    action.moveToElement(L.button_LEHENGAS).perform();
    C.click_on_Element(L.button_Sangeet_Lehengas);
    C.wait(2000);
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
    
    C.click_on_Element(D.Home_button);
    C.performRefresh();
    
    C.scrolldown(null); 
    C.wait(2000);
    C.scrollup(null);
    
    
	}
	
}
