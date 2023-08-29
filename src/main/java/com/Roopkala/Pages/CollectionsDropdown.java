package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.utilities.CommonActions;
import com.Roopkala.Base.BasePage;

public class CollectionsDropdown extends BasePage {
	WebDriver driver;

	public CollectionsDropdown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	

	 @FindBy(id="menu-item-183503")
	   public WebElement button_Collections;
	

	 @FindBy(id="menu-item-185087")
	   public WebElement button_Vāsovāya;
	
	

	 @FindBy(id="menu-item-183504")
	   public WebElement button_The_Black_Edition_Roopkala_Heritage;
	
	

	 @FindBy(id="menu-item-183505")
	   public WebElement button_The_Bridal_Collection_by_Roopkala_Heritage;
	
	

	 @FindBy(id="menu-item-183506")
	   public WebElement button_The_Heritage_Exclusive_by_Roopkala_Heritage;

	

	 @FindBy(id="menu-item-183906")
	   public WebElement button_Festive_Wear;

	

	 @FindBy(id="menu-item-183907")
	   public WebElement button_FIndi_Parties;

	
	 @FindBy(id="menu-item-183908")
	   public WebElement button_Bandhani_Edit;
	
	 @FindBy(id="menu-item-183909")
	   public WebElement button_Bridesmaids;
	
	 @FindBy(id="menu-item-183910")
	   public WebElement button_Fresh_Arrivals;
	
	 @FindBy(id="menu-item-183911")
	   public WebElement button_Sassy_in_Saree;
	 
	 
	 
	
	 
	 
	
}
