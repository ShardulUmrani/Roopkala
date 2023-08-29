package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;

public class GownsDropdown extends BasePage{
	WebDriver driver;

	public GownsDropdown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(id="menu-item-183920")
		public WebElement Button_Gowns ;
		
		@FindBy(id="menu-item-183899")
		public WebElement Button_See_all_Gowns ;
		
		@FindBy(id="menu-item-183920")
		public WebElement Button_ ;
		//li[@id='menu-item-183493']//a[@class='woodmart-nav-link'][normalize-space()='Bridal Trousseau']
		
		@FindBy(id="menu-item-183494")
		public WebElement Button_Cocktail ;
		
		@FindBy(id="menu-item-183495")
		public WebElement Button_Indo_Western ;
	
		@FindBy(id="menu-item-183496")
		public WebElement Button_Sangeet_Mehendi ;

}
