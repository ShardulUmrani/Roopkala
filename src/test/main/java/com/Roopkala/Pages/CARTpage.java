package com.Roopkala.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roopkala.Base.BasePage;

public class CARTpage extends BasePage {
	WebDriver driver;

	public CARTpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//div[@class='whb-column whb-col-right whb-visible-lg']//a[@title='Shopping cart']")
	public WebElement Cart;
	
	@FindBy(xpath="//a[normalize-space()='close']")
	public WebElement CloseCart_button;
	
	@FindBy(xpath="//button[normalize-space()='Add to cart']")
	public WebElement  ADD_TO_Cart;
	
	@FindBy(xpath="//button[@name='add-to-cart']")
	public WebElement  ADD_TO_Cart_withoutsize;
	
	@FindBy(xpath="//a[normalize-space()='close']")
	public WebElement close_cart_after_add_product_button ;
	
	@FindBy(xpath="//a[@class='button btn-cart wc-forward']")
	public WebElement VIEW_CART_button ;
	
	@FindBy(xpath="//a[@class='button checkout wc-forward wp-element-button']")
	public WebElement CHECKOUT_button ;
	
	@FindBy(xpath="//a[@aria-label='Remove this item']")
	public WebElement Product_Delet_in_CART_button ;
	
	@FindBy(xpath="//a[normalize-space()='Honey Coloured Printed & Embellished gharara Set']")
	public WebElement Honey_Coloured_gharara_Set___________________P ;
	
	@FindBy(xpath="//a[normalize-space()='Sequin Embellished Fusion Printed Saree']")
	public WebElement Sequin_Embellished_Fusion_Printed_Saree___________________P ;
	
	@FindBy(xpath="//a[contains(text(),'The Royal, The Flamboyant, The Graceful Red Paitha')]")
	public WebElement Red_Paithani___________________P ;
	
	@FindBy(xpath="//span[normalize-space()='S']")
	public WebElement Size_S_gharara_Set ;
	
	@FindBy(xpath="//span[normalize-space()='M']")
	public WebElement Size_M_gharara_Set ;
	
	@FindBy(xpath="//span[normalize-space()='L']")
	public WebElement Size_L_gharara_Set ;
	
	@FindBy(xpath="//span[normalize-space()='XL']")
	public WebElement Size_XL_gharara_Set ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
