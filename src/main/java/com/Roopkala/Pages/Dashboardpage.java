package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;
import com.Roopkala.utilities.CommonActions;

public class Dashboardpage extends BasePage {
WebDriver driver;

public Dashboardpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//a[@class='wd-inited']")
	public WebElement Search ;
	
	@FindBy(xpath="//a[text()='Accept']")
	public WebElement ACCEPT_button;
	
	@FindBy(xpath="//div[@class='whb-column whb-col-left whb-visible-lg']//img[@alt='Roopkala Heritage']")
	public WebElement Home_button ;
	
	@FindBy(xpath="//a[@aria-label='Search']//img[@class='wd-custom-icon wd-lazy-load wd-lazy-fade wd-loaded']")
	public WebElement Searchbox_Symbol ;
	
	@FindBy(xpath="//input[@class='s wd-search-inited']")
	public WebElement Searchbox_INPUT ;

	@FindBy(xpath="//button[@aria-label='Next']")
	public WebElement Home_IMG_Next_button ;
	
	@FindBy(xpath="//button[@aria-label='Previous']")
	public WebElement Home_IMG_Back_button ;
	
	
	 
	 
	
}
