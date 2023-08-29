package com.Roopkala.AUTOTEST;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Roopkala.Base.BasePage;
import com.Roopkala.Pages.CollectionsDropdown;
import com.Roopkala.Pages.Dashboardpage;
import com.Roopkala.Pages.SalwarKameezDropdown;
import com.Roopkala.utilities.CommonActions;

public class CollectionsDropdownTEST extends BasePage{


	@Test(description="To Validate the CollectionsDropdown" )
	public void SalwarKameezDropdown() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		CommonActions C = new CommonActions();
		CollectionsDropdown c = new CollectionsDropdown(driver);
		Dashboardpage D=new Dashboardpage(driver);
		
	
		action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_Vāsovāya);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    
	  

	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_The_Black_Edition_Roopkala_Heritage);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_The_Bridal_Collection_by_Roopkala_Heritage);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_The_Heritage_Exclusive_by_Roopkala_Heritage);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null); 
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_Festive_Wear);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_FIndi_Parties);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_Bandhani_Edit);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_Bridesmaids);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_Fresh_Arrivals);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(c.button_Collections).perform();
	    C.click_on_Element(c.button_Sassy_in_Saree);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	     
}}
