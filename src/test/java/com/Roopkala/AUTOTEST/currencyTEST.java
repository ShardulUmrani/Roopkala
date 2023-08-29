package com.Roopkala.AUTOTEST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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


public class currencyTEST extends BasePage {
	@Test	(description="To Validate the currency  ")
public void Currency (){
	
	
	
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
	
	
	//********Currency & Produt price countrywise**********************************
	
		C.wait(3000);
		C.click_on_Element(c.currency);
		C.click_on_Element(c.USD_button);
		WebElement a = driver.findElement(By.xpath("//div[contains(@class,'product-grid-item product product-no-swatches wd-hover-base wd-hover-with-fade wd-fade-off type-product post-185420 status-publish instock product_cat-anarkalis product_cat-collections product_cat-fresh-arrivals product_cat-pant-set product_cat-ready-to-ship-collections product_cat-salwar-kameez product_tag-bestseller has-post-thumbnail shipping-taxable purchasable product-type-variable')]//div[contains(@class,'product-element-bottom product-information')]"));
		 C.scrolldown(a); 
		 C.wait(2000);
		 C.scrollup(null);
		
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(c.currency);
		C.click_on_Element(c.INR_button);
		
		WebElement b = driver.findElement(By.xpath("//div[contains(@class,'product-grid-item product product-no-swatches wd-hover-base wd-hover-with-fade wd-fade-off type-product post-185420 status-publish instock product_cat-anarkalis product_cat-collections product_cat-fresh-arrivals product_cat-pant-set product_cat-ready-to-ship-collections product_cat-salwar-kameez product_tag-bestseller has-post-thumbnail shipping-taxable purchasable product-type-variable')]//div[contains(@class,'product-element-bottom product-information')]"));
		C.scrolldown( b); 
		 C.wait(2000);
		 C.scrollup(null);
		
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(c.currency);
		C.click_on_Element(c.GBP_button);
		WebElement z = driver.findElement(By.xpath("//div[contains(@class,'product-grid-item product product-no-swatches wd-hover-base wd-hover-with-fade wd-fade-off type-product post-185420 status-publish instock product_cat-anarkalis product_cat-collections product_cat-fresh-arrivals product_cat-pant-set product_cat-ready-to-ship-collections product_cat-salwar-kameez product_tag-bestseller has-post-thumbnail shipping-taxable purchasable product-type-variable')]//div[contains(@class,'product-element-bottom product-information')]"));
		C.scrolldown(z); 
		 C.wait(2000);
		 C.scrollup(null);
		
		
	
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(c.currency);
		C.click_on_Element(c.SGD_button);
		WebElement d = driver.findElement(By.xpath("//div[contains(@class,'product-grid-item product product-no-swatches wd-hover-base wd-hover-with-fade wd-fade-off type-product post-185420 status-publish instock product_cat-anarkalis product_cat-collections product_cat-fresh-arrivals product_cat-pant-set product_cat-ready-to-ship-collections product_cat-salwar-kameez product_tag-bestseller has-post-thumbnail shipping-taxable purchasable product-type-variable')]//div[contains(@class,'product-element-bottom product-information')]"));
		C.scrolldown(d); 
		 C.wait(2000);
		 C.scrollup(null);
		
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(c.currency);
		C.click_on_Element(c.EUR_button);
		WebElement e = driver.findElement(By.xpath("//div[contains(@class,'product-grid-item product product-no-swatches wd-hover-base wd-hover-with-fade wd-fade-off type-product post-185420 status-publish instock product_cat-anarkalis product_cat-collections product_cat-fresh-arrivals product_cat-pant-set product_cat-ready-to-ship-collections product_cat-salwar-kameez product_tag-bestseller has-post-thumbnail shipping-taxable purchasable product-type-variable')]//div[contains(@class,'product-element-bottom product-information')]"));
		C.scrolldown(e); 
		 C.wait(2000);
		 C.scrollup(null);
		
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(c.currency);
		C.click_on_Element(c.AED_button);
		WebElement f = driver.findElement(By.xpath("//div[contains(@class,'product-grid-item product product-no-swatches wd-hover-base wd-hover-with-fade wd-fade-off type-product post-185420 status-publish instock product_cat-anarkalis product_cat-collections product_cat-fresh-arrivals product_cat-pant-set product_cat-ready-to-ship-collections product_cat-salwar-kameez product_tag-bestseller has-post-thumbnail shipping-taxable purchasable product-type-variable')]//div[contains(@class,'product-element-bottom product-information')]"));
		C.scrolldown(f); 
		 C.wait(2000);
		 C.scrollup(null);
		
		C.wait(3000);
		C.performRefresh();
		C.click_on_Element(c.currency);
		C.click_on_Element(c.INR_button);
		WebElement g = driver.findElement(By.xpath("//div[contains(@class,'product-grid-item product product-no-swatches wd-hover-base wd-hover-with-fade wd-fade-off type-product post-185420 status-publish instock product_cat-anarkalis product_cat-collections product_cat-fresh-arrivals product_cat-pant-set product_cat-ready-to-ship-collections product_cat-salwar-kameez product_tag-bestseller has-post-thumbnail shipping-taxable purchasable product-type-variable')]//div[contains(@class,'product-element-bottom product-information')]"));
		C.scrolldown(g);
		C.wait(3000);
		C.performRefresh();
		C.wait(3000);
		 C.scrollup(null);


}}
