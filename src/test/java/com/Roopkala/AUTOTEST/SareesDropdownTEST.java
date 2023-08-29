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
import com.Roopkala.Pages.SareesDropdown;
import com.Roopkala.utilities.CommonActions;

public class SareesDropdownTEST extends BasePage {
	
	@Test(description="To Validate the SareesDropdown" )
	public void Saree() {
		
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
		
		
		C.click_on_Element(S.button_Sarees);
		C.click_on_Element(D.Home_button);
		C.wait(2000);
		
		
		action.moveToElement(S.button_Sarees).perform();
	    C.click_on_Element(S.button_See_all_Sarees);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
		
	    action.moveToElement(S.button_Sarees).perform();
	    C.click_on_Element(S.button_Bhandhani_Sarees);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
		
	    action.moveToElement(S.button_Sarees).perform();
	    C.click_on_Element(S.button_Designer_Sarees);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
		
	    action.moveToElement(S.button_Sarees).perform();
	    C.click_on_Element(S.button_Kanchipuram_Silk);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
	    
	    action.moveToElement(S.button_Sarees).perform();
	    C.click_on_Element(S.button_Pre_Stitched);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
		
	    action.moveToElement(S.button_Sarees).perform();
	    C.click_on_Element(S.button_Silk);
	    C.wait(2000);
	    C.scrolldown(null); 
	    C.wait(2000);
	    C.scrollup(null);
		
		C.click_on_Element(D.Home_button);
		C.performRefresh();
		
		
	}

}
