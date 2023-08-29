package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;

public class LehengasDropdown extends BasePage{
	
	WebDriver driver;
			
	public LehengasDropdown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
		
	@FindBy(id="menu-main-menu")
	public WebElement LEHENGAS_button;
	
	@FindBy(id="menu-main-menu")
	public WebElement button_LEHENGAS;
			
    @FindBy(xpath="//li[@id='menu-item-183901']//a[contains(@class,'woodmart-nav-link')][normalize-space()='See all Lehengas']")
    public WebElement button_See_all_Lehengas;
    
    
    @FindBy(xpath="//li[@id='menu-item-183478']//a[contains(@class,'woodmart-nav-link')][normalize-space()='Bridal Lehengas']")
    public WebElement button_Bridal_Lehengas;
    
    
    @FindBy(xpath="//li[@id='menu-item-183479']//a[contains(@class,'woodmart-nav-link')][normalize-space()='Cocktail Lehengas']")
    public WebElement button_Cocktail_Lehengas;
    
    
    @FindBy(xpath="//li[@id='menu-item-183480']//a[contains(@class,'woodmart-nav-link')][normalize-space()='Indo-Western']")
    public WebElement button_Indo_Western;
    
    
    @FindBy(xpath="//li[@id='menu-item-183481']//a[contains(@class,'woodmart-nav-link')][normalize-space()='Mehendi Lehengas']")
    public WebElement button_Mehendi_Lehengas;
    
    
    @FindBy(xpath="//li[@id='menu-item-183482']//a[contains(@class,'woodmart-nav-link')][normalize-space()='Reception Lehengas']")
    public WebElement button_Reception_Lehengas ;
    
    @FindBy(xpath="//li[@id='menu-item-183483']//a[contains(@class,'woodmart-nav-link')][normalize-space()='Sangeet Lehengas']")
    public WebElement button_Sangeet_Lehengas;
    
   
    
}
