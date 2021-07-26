package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws Throwable{
		File f =new File("C:\\Users\\krish\\Desktop\\impojava\\AdactinCucumber5\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		
		FileInputStream fis= new FileInputStream(f);
		
		p=new Properties();
		p.load(fis);
		
	}
	
	
	public String getbrowser() {
	 String browser = p.getProperty("browser");
      return browser;
	}
	
	public String url() {
		 String url = p.getProperty("url");
         return url;
		}
		
	public String username() {
		 String username = p.getProperty("Username");
         return username;
		}
		
	
	public String password() {
		 String password = p.getProperty("password");
         return password;
		}
	public String cerdit() {
		 String cerdit = p.getProperty("cerdit");
         return cerdit;
		}
			
	public String cvv() {
		 String cvv = p.getProperty("cvv");
       return cvv;
		}
			
}
