package com.AdactinCucumber5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adctinpom3 {
	
	public static WebDriver driver;
	
	public Adctinpom3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this );
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getAccountnumber() {
		return accountnumber;
	}
	public WebElement getAcctype() {
		return acctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//*[@id=\"address\"]")
	private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement accountnumber;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement acctype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expmonth;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expyear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement ccv;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement logut;

	public WebElement getLogut() {
		return logut;
	}

}
