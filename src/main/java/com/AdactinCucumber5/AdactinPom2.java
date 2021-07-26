package com.AdactinCucumber5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom2 {

	
	
	public static WebDriver driver;
	
	public AdactinPom2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this );
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLoaction() {
		return loaction;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNos() {
		return nos;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinous() {
		return continous;
	}
	@FindBy(xpath = "//select[@name='location']")
	private WebElement loaction;
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement nos;
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult;
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio;
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continous;
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	
	
	
	
	
}
