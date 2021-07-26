package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AdactinCucumber5.AdactinPom1;
import com.AdactinCucumber5.AdactinPom2;
import com.AdactinCucumber5.Adctinpom3;

public class PageObjectManager {
	
	public WebDriver driver; //null
	
	private AdactinPom1 ap ;
		
    private AdactinPom2 ak ;
	
	private Adctinpom3 al  ;

	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public AdactinPom1 getInstancepom1() {
		ap =new AdactinPom1(driver);
		return ap;
	}
	public AdactinPom2 getInstancepom2() {
		ak =new AdactinPom2(driver);
		return ak;
	}
	public Adctinpom3 getInstancepom3() {
		al =new Adctinpom3(driver);
		return al;
	}
	
}
