package com.adactin.helper;



public class FileReaderManager {
	
	
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
 public ConfigurationReader getInstanceCR()throws Throwable{
	ConfigurationReader cr= new ConfigurationReader();
	
	return cr;
	}
	
	
	
	
	
	
	

}
