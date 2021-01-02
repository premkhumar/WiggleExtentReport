package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions ac;
	public static Robot r; 
	public static Select select;
	
	public void browserLaunchChrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAM\\Desktop\\Java\\HotelAdactin\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public void browserLaunchFirefox() {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\SAM\\Desktop\\Java\\HotelAdactin\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	public void browserLaunchEdge() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SAM\\Desktop\\Java\\HotelAdactin\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
	}

	public void maxWindows() {
		
		driver.manage().window().maximize();
		
	}
	
	public void getTitle(String title) {
		
		 title = driver.getTitle();
		
	}
	
	public static void getCurrentUrl() {

		String currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
	
	}
	public static void closetab() {

		driver.close();
		
	}
	public static void closewindow() {

		driver.quit();
	}
	public static void pageForward() {

		driver.navigate().forward();
	}
	public static void pageBackward() {
		
		driver.navigate().back();
	}
	public static void pageRefresh() {
		
		driver.navigate().refresh();
	}
	
	public static void enterUrl(String data) {

		driver.get(data);
		
	}
	
	public static void sendValue(WebElement element ,String value) {

		element.sendKeys(value);
		
	}
	
	public static void click(WebElement element) {
		
		element.click();
		
	}
	
	public static void clear(WebElement element) {
		
		element.clear();
		
	}
	
	public static String getAttribute(WebElement element,String value) {
		
		return element.getAttribute(value);
		
		
	}
	public static String gettext(WebElement element) {

		return element.getText();
	}
	
	public static void submit(WebElement element) {

		element.submit();
	}
	
	public static void actions() {

		ac =new Actions(driver);
		
	}
	
	public static void movetoElement(WebElement element) {
		actions();
		ac.moveToElement(element).perform();
	}
	
	public static void rightClick(WebElement element) {
		actions();
		ac.contextClick(element).perform();
	}
	
	public static void doubleClick(WebElement element) {
		actions();
		ac.doubleClick(element).perform();
	}
	
	public static void clickAt(WebElement element) {
		actions();
		ac.click(element).perform();
	}
	
	public static void sendValues(WebElement element,String value) {
		actions();
		ac.sendKeys(element, value).perform();
	}
	
	public static void dragDrop(WebElement element) {
		actions();
		ac.dragAndDrop(element, element).perform();
	}
	
	public static void robot() throws AWTException {

		r = new Robot();
	}
	
	public static void keyPressRelease(int key) throws AWTException {
		robot();
		r.keyPress(key);
		r.keyRelease(key);
	}
	
	public static void keyPress(int key) throws AWTException {

		robot();
		r.keyPress(key);
		
	}
	
	public static void  keyRelease(int key) throws AWTException {

		robot();
		r.keyRelease(key);
		
	}
	
	public static void  mousePressRelease(int btn) throws AWTException {

		robot();
		r.mousePress(btn);
		r.mouseRelease(btn);
	}
	
	public static void mousePress(int btn) throws AWTException {

		robot();
		r.mousePress(btn);
	}
	
	public static void mouseRelease(int btn) throws AWTException {

		robot();
		r.mouseRelease(btn);
	}
	
	public static void dropDown(WebElement element) {

		select =  new Select(element);
	}
	
	public static void selectbyval(WebElement element,String value) {

		dropDown(element);
		select.selectByValue(value);
		
		
	}
	
	
	public static void selectbyIndex(WebElement element,int index) {

		dropDown(element);
		select.selectByIndex(index);
		
	}
	
	
	public static void selectbyVisibleText(WebElement element,String text) {

		dropDown(element);
		select.selectByVisibleText(text);
		
	}
	
	public static void getOptions(WebElement element,List<WebElement> textOptns) {

		dropDown(element);
		textOptns = select.getOptions();
		System.out.println(textOptns);
		
	}
	
	
	public static void getAllSelectedOptions(WebElement element,List<WebElement> textOptns) {

		dropDown(element);
		textOptns = select.getAllSelectedOptions();
		System.out.println(textOptns);
	}
	
	public static void getFirstSelectedOption(WebElement element,WebElement textOptns) {

		dropDown(element);
		textOptns = select.getFirstSelectedOption();
		System.out.println(textOptns);
	}
	
	
	public static void deselectbyIndex(WebElement element,int index) {

		dropDown(element);
		select.deselectByIndex(index);
		
	}
		
	public static void deselectbyValue(WebElement element,String value) {

		dropDown(element);
		select.deselectByValue(value);
		
	}
	
	public static void deselectbyVisibleText(WebElement element,String text) {

		dropDown(element);
		select.deselectByVisibleText(text);
		
	}
	
	public static void deselectAll(WebElement element) {

		dropDown(element);
		select.deselectAll();
	}
	
	public static void frame(WebElement element) {

		driver.switchTo().frame(element);
	}
	
	public static void frameIndex(int index) {
		
		driver.switchTo().frame(index);
	}

	public static void frameName(String frameName) {
		
		driver.switchTo().frame(frameName);
	}
	
	public static void parentFrame() {

		driver.switchTo().parentFrame();
	}

	public static void getWindowHandle() {

		String window = driver.getWindowHandle();
		System.out.println(window);
	}
	
	public static void getwindowHandles() {

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);		
	}
	
	public static void switchToWindow(String Windowid) {

		driver.switchTo().window(Windowid);
	}
	
	public static void implicitWait(long secondsTime) {

		driver.manage().timeouts().implicitlyWait(secondsTime, TimeUnit.SECONDS);
	}
	
	public static void getAttributeText(WebElement element,String text,String value ) {

		
		String txt = element.getAttribute(value);
		System.out.println(text+txt);
		
		
	}
	public static void displ(String txt) {

		System.out.println(txt);
	}
	public static void screenShot(String imgName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File scrFile = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SAM\\Desktop\\"+imgName+".png");
		FileUtils.copyFile(scrFile, dest);
		
	}

	
	
	
}
