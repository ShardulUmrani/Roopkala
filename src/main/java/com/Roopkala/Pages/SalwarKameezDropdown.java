package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;

public class SalwarKameezDropdown  extends BasePage {
	WebDriver driver;

	public SalwarKameezDropdown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	

	@FindBy(id="menu-item-183919")
	   public WebElement button_Salwar_Kameez;
	
	@FindBy(id="menu-item-183897")
	   public WebElement button_See_all_Salwar_Kameez;

	@FindBy(id="menu-item-183486")
	   public WebElement button_Festive;

	@FindBy(id="menu-item-183487")
	   public WebElement button_Ghararas;
	
	@FindBy(id="menu-item-183488")
	   public WebElement button_Indo_Western;
	
	@FindBy(id="menu-item-183489")
	   public WebElement button_Jumpsuits;
	
	@FindBy(id="menu-item-183490")
	   public WebElement button_Palazzo;
	
	
	@FindBy(id="menu-item-183491")
	   public WebElement button_Sangeet;
	
	@FindBy(id="menu-item-183485")
	   public WebElement button_Anarkalis;
	
}
