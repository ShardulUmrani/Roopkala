package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;

public class KurtaSetsDropDown extends BasePage{
	WebDriver driver;

	public KurtaSetsDropDown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu-item-183922")
	public WebElement button_Kurta_Sets;
	
	@FindBy(id="menu-item-183905")
	public WebElement button_See_all_Kurta_Sets;
	
	@FindBy(id="menu-item-183508")
	public WebElement button_Co_ord_Sets;

	@FindBy(id="menu-item-183509")
	public WebElement button_Gharara;
	
	@FindBy(id="menu-item-183922")
	public WebElement button_Sharara_Sett;
	
	
	

}
