package com.Roopkala.utilities;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.Roopkala.Base.BasePage;

public class PropertiesReader extends BasePage{
	
	
	public static String getValue(String key) throws IOException {
		String path = System.getProperty("user.dir") + "\\application.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	

}
