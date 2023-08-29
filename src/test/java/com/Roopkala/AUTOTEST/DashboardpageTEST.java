package com.Roopkala.AUTOTEST;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Roopkala.Base.BasePage;
import com.Roopkala.Pages.CARTpage;
import com.Roopkala.Pages.CurrencyPage;
import com.Roopkala.Pages.Dashboardpage;
import com.Roopkala.Pages.LehengasDropdown;
import com.Roopkala.Pages.LoginPage;
import com.Roopkala.Pages.SareesDropdown;
import com.Roopkala.utilities.CommonActions;

public class DashboardpageTEST extends BasePage {
	
@Test(description="To Validate the search   ")
	
	public void Dashboard (){
	

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
	
//********SrarchBox**********************************
	
	C.click_on_Element(D.Searchbox_Symbol);
	C.wait(5000);
    C.enters_data("Salwar Kameez", D.Searchbox_INPUT);
    C.wait(3000);
    C.click_on_Element(D.Home_button);
	
  
    C.click_on_Element(D.Searchbox_Symbol);
	C.wait(5000);
    C.enters_data("Jumpsuits", D.Searchbox_INPUT);
    C.wait(3000);
    C.click_on_Element(D.Home_button);
    
    C.click_on_Element(D.Searchbox_Symbol);
	C.wait(5000);
    C.enters_data("Indo-Western", D.Searchbox_INPUT);
    C.wait(3000);
    C.click_on_Element(D.Home_button);
	
    C.click_on_Element(D.Searchbox_Symbol);
	C.wait(5000);
    C.enters_data("Reception Lehengas", D.Searchbox_INPUT);
    C.wait(3000);
    C.click_on_Element(D.Home_button);
    
    C.click_on_Element(D.Searchbox_Symbol);
	C.wait(5000);
    C.enters_data("Gharara", D.Searchbox_INPUT);
    C.wait(3000);
    C.click_on_Element(D.Home_button);
    
    C.click_on_Element(D.Searchbox_Symbol);
	C.wait(5000);
    C.enters_data("Festive Wear", D.Searchbox_INPUT);
    C.wait(3000);
    C.click_on_Element(D.Home_button);
    	 

	

	
}
}

