package com.Roopkala.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Roopkala.Base.BasePage;



public class ScreenshotUtil extends BasePage{
	
	static WebDriver driver;
	
	public static String getBase64img(WebDriver driver) {
		ScreenshotUtil.driver = driver;
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}
