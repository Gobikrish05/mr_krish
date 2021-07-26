package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Return;

public class BaseWebelements {
//webElements
//click
	
public static WebDriver	driver;
	
	
	
public static WebDriver browserlaunch(String browser) {
	if (browser.equalsIgnoreCase("CHROME")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\krish\\Desktop\\impojava\\Seleniumproject\\Driver\\chromedriver v91.exe");

		driver = new ChromeDriver();

	} else if (browser.equalsIgnoreCase("Firefox")) {

	} else {
		System.out.println("invalid");
	}

	driver.manage().window().maximize();

	return driver; // without retrun program will be work

}

// get
public static void openurl(String url) {
	driver.get(url);
}

// close
public static void closeMethod() {
	driver.close();
}
// quit

public static void quitMethod() {
	driver.quit();
}

public static void methodforclick(WebElement elements) {
	elements.click();
}

public static void inputValues(WebElement elements, String str) {
	elements.sendKeys(str);

}

// gettext

public static void getTextValue(WebElement elements) {

	String text = elements.getText();
	System.out.println(text);
}

// navigate
public static void navigateMethod() {
	driver.navigate();
}

// navigate back
public static void navigateback() {
	driver.navigate().back();
}

// navigate forward
public static void navigateforward() {
	driver.navigate().forward();
}

// navigate back
public static void navigaterefresh() {
	driver.navigate().refresh();
}

public static void AlertMethod() {
	driver.switchTo().alert();
}

public static void actionsmethods(String str, WebElement elements) {
	Actions a = new Actions(driver);
	if (str.equals("click")) {
		a.click(elements).build().perform();
	} else if (str.equalsIgnoreCase("movetoelements")) {     
		a.moveToElement(elements).build().perform();
	} else if (str.equalsIgnoreCase("rightclick")) {
		a.contextClick(elements).build().perform();
	}

}

public static void frameMethod(String str) {
	driver.switchTo().frame(str);
}
//mani bro base  class
public static void dropdownMethod(WebElement element, String str,int index, String value, String text) {
	Select s = new Select(element);
	if (str.equals("index")) {
		s.selectByIndex(index);
	} else if (str.equals("value")) {
		s.selectByValue(value);
	} else if (str.equals("text")) {
		s.selectByVisibleText(text);
	}

}

public static void checkboxMethod(WebElement element) {
	element.click();

}

public static void isenableMethod(WebElement element) {
	element.isEnabled();

}

public static void isdisplayedMethod(WebElement element) {

	element.isDisplayed();

}

public static void isselectedMethod(WebElement element) {

	element.isSelected();
}

public static void getoptionsMethod(WebElement element) {
	Select s = new Select(element);
	s.getAllSelectedOptions();

}

public static void gettitleMethod() {
	driver.getTitle();

}

public static void getcurrenturlMethod() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

}

public static void getattributeMethod(WebElement element, String str) {
	element.getAttribute(str);
}

public static void ImplicitWaitMethod() {

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}

public static void ExplicitWaitMethod(WebDriver driver, WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.invisibilityOfElementLocated((By) element));

}

public static void FluentWaitMethod() {
	@SuppressWarnings("deprecation")
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

}

public static void ScrollupMethod() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");

}

public static void ScrolldownMethod() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}

public static void Getfirstselectedoptions(WebElement element) {
	Select s = new Select(element);
	s.getFirstSelectedOption();

}

public static void Getallselectedoptions(WebElement element) {
	Select s = new Select(element);
	s.getAllSelectedOptions();

}

public static void IsmultipleMethod(WebElement element) {
	Select s = new Select(element);
	s.isMultiple();

}

public static void gettextMethod(WebElement element, String str) {

	System.out.println(element.getText());

}

public static void methodofscreenshot(String path) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File(path);
	FileUtils.copyFile(source, destination);
}

public static void robot(WebElement element) throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}

public void dragdrop(WebElement drag, WebElement drop) {
	Actions ac = new Actions(driver);
	ac.dragAndDrop(drag, drop);
}

public static void Frames(WebElement iframe) {
	// iframe.click();
	driver.switchTo().frame(0);
}

public static void simplealert() {
	Alert simplealert = driver.switchTo().alert();
	simplealert.accept();
}

public static void comfirmalert() {
	Alert confrimalert = driver.switchTo().alert();
	confrimalert.accept();
}

public static void promptalert() {
	Alert promptalert = driver.switchTo().alert();
	promptalert.accept();
}
public static void dropdowntext() {
	
}
		
		
		
		
}
