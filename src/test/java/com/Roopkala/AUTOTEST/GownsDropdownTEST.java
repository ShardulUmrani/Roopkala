package com.Roopkala.AUTOTEST;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Roopkala.Base.BasePage;
import com.Roopkala.Pages.CollectionsDropdown;
import com.Roopkala.Pages.Dashboardpage;
import com.Roopkala.Pages.GownsDropdown;
import com.Roopkala.utilities.CommonActions;

public class GownsDropdownTEST extends BasePage{


	@Test(description="To Validate the GownsDropdown" )
	public void Gowns() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		CommonActions C = new CommonActions();
		CollectionsDropdown c = new CollectionsDropdown(driver);
		Dashboardpage D=new Dashboardpage(driver);
		GownsDropdown G=new GownsDropdown(driver);
	
	
	
	
	 action.moveToElement(G.button_Gowns).perform();
	    C.click_on_Element(G.button_See_all_Gowns);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);

	    action.moveToElement(G.button_Gowns).perform();
	    C.click_on_Element(G.button_Bridal_Trousseau);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(G.button_Gowns).perform();
	    C.click_on_Element(G.button_Cocktail);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(G.button_Gowns).perform();
	    C.click_on_Element(G.button_Indo_Western);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(G.button_Gowns).perform();
	    C.click_on_Element(G.button_Sangeet_Mehendi);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
}}
