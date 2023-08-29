package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SareesDropdown {

	
	WebDriver driver;
	
	public SareesDropdown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="//li[@id='menu-item-183921']//span[@class='nav-link-text'][normalize-space()='Sarees']")
	   public WebElement button_Sarees;
	
	 @FindBy(id="menu-item-183903")
	   public WebElement button_See_all_Sarees;
	    
	    @FindBy(xpath="//li[@id='menu-item-183498']//a[@class='woodmart-nav-link'][normalize-space()='Bhandhani Sarees']")
	    public WebElement button_Bhandhani_Sarees;
	    
	     @FindBy(xpath="//li[@id='menu-item-183499']//a[@class='woodmart-nav-link'][normalize-space()='Designer Sarees']")
	     public WebElement button_Designer_Sarees;
		   
	     @FindBy(xpath="//li[@id='menu-item-183500']//a[@class='woodmart-nav-link'][normalize-space()='Kanchipuram Silk']")
		  public WebElement button_Kanchipuram_Silk;

		 @FindBy(xpath="//li[@id='menu-item-183501']//a[@class='woodmart-nav-link'][normalize-space()='Pre-Stitched']")
		   public WebElement button_Pre_Stitched;
		    
		   @FindBy(xpath="//li[@id='menu-item-183502']//a[@class='woodmart-nav-link'][normalize-space()='Silk']")
		   public WebElement button_Silk;
	    
}
