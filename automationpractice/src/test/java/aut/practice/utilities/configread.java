package aut.practice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configread {
	Properties configprop;
	
	public configread()
	{
		try
		{
File file = new File("./configuration/Configuration.properties");
FileInputStream fis = new FileInputStream(file);
	configprop = new Properties();
	configprop.load(fis);
		}catch(Exception e)
		{
			
		}
	}
	public String BaseURLlinkpage()
{
	return configprop.getProperty("BaseURLlink");
	}
	
	public String UserName()
	{
		return configprop.getProperty("UserName");
	}
	public String PassWord()
	{
		return configprop.getProperty("PassWord");
	}
	public String ChromePath()
	{
		return configprop.getProperty("ChromePath");
	}
	public String FirefoxPath()
	{
		return configprop.getProperty("FirefoxPath");
	
	}
	
}
