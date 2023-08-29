package com.Roopkala.AUTOTEST;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Roopkala.Base.BasePage;
import com.Roopkala.Pages.CollectionsDropdown;
import com.Roopkala.Pages.Dashboardpage;
import com.Roopkala.Pages.GownsDropdown;
import com.Roopkala.Pages.KurtaSetsDropDown;
import com.Roopkala.utilities.CommonActions;

public class KurtaSetsDropDownTEST extends BasePage{


	@Test(description="To Validate the KurtaSetsDropDown" )
	public void KurtaSets() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		CommonActions C = new CommonActions();
		CollectionsDropdown c = new CollectionsDropdown(driver);
		Dashboardpage D=new Dashboardpage(driver);
		GownsDropdown G=new GownsDropdown(driver);
		KurtaSetsDropDown K= new KurtaSetsDropDown(driver);
	
	
	
	    action.moveToElement(K.button_Kurta_Sets).perform();
	    C.click_on_Element(K.button_See_all_Kurta_Sets);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(K.button_Kurta_Sets).perform();
	    C.click_on_Element(K.button_Co_ord_Sets);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(K.button_Kurta_Sets).perform();
	    C.click_on_Element(K.button_Gharara);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(K.button_Kurta_Sets).perform();
	    C.click_on_Element(K.button_Sharara_Set);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	   

}}
