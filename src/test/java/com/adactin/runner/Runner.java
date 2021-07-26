package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseWebelements;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",
                         glue="com\\adaction\\stepdefinition",

                         plugin = { "pretty","html:report",
                        		 "com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"},
                           monochrome = true,
                            dryRun = false,
                            strict = true)




public class Runner {

	public static WebDriver driver;
		
	@BeforeClass
	public static void setup()throws Throwable{
		String browser =FileReaderManager.getInstanceFR().getInstanceCR().getbrowser();
		driver=BaseWebelements.browserlaunch("chrome");
	}
	
	
	
}
