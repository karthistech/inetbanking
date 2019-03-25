package com.inetbankingV1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig1 {
	Properties prop;
	public ReadConfig1()
	{
		try
		{
			File fis = new File("./Configuration/configuration.properties");
		
		FileInputStream FI = new FileInputStream(fis);
		prop = new Properties();
		prop.load(FI);
	}catch (Exception e)
	{
		System.out.println(e);
	}
	}
	
	public String BaseURL() {
		return prop.getProperty("BaseURL");
	}
	public String UserName() {
		return prop.getProperty("UserName");
	}
	public String PassWord() {
		return prop.getProperty("PassWord");
	}
	public String chromepath() {
		return prop.getProperty("chromepath");
		
		
		
	}
	
	
	
}
