package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;

public class GownsDropdown extends BasePage {
	WebDriver driver;

	public GownsDropdown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	

	 @FindBy(id="menu-item-183920")
	   public WebElement button_Gowns;

	 @FindBy(id="menu-item-183899")
	   public WebElement button_See_all_Gowns;
	 
	 @FindBy(id="menu-item-183493")
	   public WebElement button_Bridal_Trousseau;
	
	 @FindBy(id="menu-item-183494")
	   public WebElement button_Cocktail;
	
	 @FindBy(id="menu-item-183495")
	   public WebElement button_Indo_Western;
	
	 @FindBy(id="menu-item-183496")
	   public WebElement button_Sangeet_Mehendi;
	
}
