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

public class cartTEST extends BasePage {
	
@Test(description="To Validate the Shopping Cart  ")
	
	public void Cart (){
	

	CARTpage CA=new CARTpage(driver);
	CurrencyPage c=new CurrencyPage(driver);
	Dashboardpage D=new Dashboardpage(driver);
	LehengasDropdown L=new LehengasDropdown(driver);
	SareesDropdown S=new SareesDropdown(driver);
	LoginPage log=new LoginPage(driver);
	CommonActions C = new CommonActions();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions action = new Actions(driver);
	SoftAssert softassert = new SoftAssert();
	
	
	//********Shopping Cart **********************************
    
		
		C.click_on_Element(CA.Honey_Coloured_gharara_Set___________________P);
		C.click_on_Element(CA.Size_S_gharara_Set);
		C.click_on_Element(CA.ADD_TO_Cart);
		C.wait(2000);
		C.moveToAndClick(CA.close_cart_after_add_product_button);
		C.click_on_Element(D.Home_button);
		
		C.wait(2000);
		C.click_on_Element(CA.Honey_Coloured_gharara_Set___________________P);
		C.click_on_Element(CA.Size_M_gharara_Set);
		C.click_on_Element(CA.ADD_TO_Cart);
		C.wait(2000);
		C.moveToAndClick(CA.close_cart_after_add_product_button);
		C.click_on_Element(D.Home_button);
		
		C.wait(2000);
		C.click_on_Element(CA.Honey_Coloured_gharara_Set___________________P);
		C.click_on_Element(CA.Size_L_gharara_Set);
		C.click_on_Element(CA.ADD_TO_Cart);
		C.wait(2000);
		C.moveToAndClick(CA.close_cart_after_add_product_button);
		C.click_on_Element(D.Home_button);
		
		C.wait(2000);
		C.click_on_Element(CA.Honey_Coloured_gharara_Set___________________P);
		C.click_on_Element(CA.Size_XL_gharara_Set);
		C.click_on_Element(CA.ADD_TO_Cart);
		C.wait(2000);
		C.moveToAndClick(CA.close_cart_after_add_product_button);
		C.click_on_Element(D.Home_button);

		C.wait(2000);
		C.click_on_Element(CA.Red_Paithani___________________P);
		C.click_on_Element(CA.ADD_TO_Cart_withoutsize);
		C.wait(2000);
		C.moveToAndClick(CA.close_cart_after_add_product_button);
		C.click_on_Element(D.Home_button);
		
		C.wait(2000);
		C.click_on_Element(CA.Sequin_Embellished_Fusion_Printed_Saree___________________P);
		C.click_on_Element(CA.ADD_TO_Cart_withoutsize);
		C.wait(2000);
		C.moveToAndClick(CA.close_cart_after_add_product_button);
		C.click_on_Element(D.Home_button);
		
		C.performRefresh();
		C.click_on_Element(CA.Cart);
		C.click_on_Element(CA.VIEW_CART_button);
		C.click_on_Element(CA.Product_Delet_in_CART_button);
		C.wait(3000);
		
		C.performRefresh();
		C.click_on_Element(CA.Product_Delet_in_CART_button);
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(CA.Product_Delet_in_CART_button);
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(CA.Product_Delet_in_CART_button);
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(CA.Product_Delet_in_CART_button);
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(CA.Product_Delet_in_CART_button);
		C.wait(3000);
		C.performRefresh();

		C.click_on_Element(D.Home_button);
		C.performRefresh();

}}
