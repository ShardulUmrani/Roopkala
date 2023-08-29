package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;

public class CurrencyPage extends BasePage {
	WebDriver driver;

	public CurrencyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	    @FindBy(xpath="//div[contains(@class,'wd-inline')]")
	    public WebElement currency ;
	
		@FindBy(xpath="//span[text()='USD'][1]")
		public WebElement USD_button;
		
		@FindBy(xpath="//span[text()='INR'][1]")
		public WebElement INR_button;
		
		@FindBy(xpath="//span[text()='GBP'][1]")
		public WebElement GBP_button;
		
		@FindBy(xpath="//span[text()='SGD'][1]")
		public WebElement SGD_button;
		
		@FindBy(xpath="//span[text()='EUR'][1]")
		public WebElement EUR_button;
		
		@FindBy(xpath="//span[text()='AED'][1]")
		public WebElement AED_button;
		
		
		
		
		
		
		
		
	}


