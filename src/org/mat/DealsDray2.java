package org.mat;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealsDray2 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRTHIGA\\eclipse-workspace\\AutomationTest2\\driver\\chrome.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.dealsdray.com/");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.name("username"));
	user.sendKeys("prexo.mis@dealsdray.com");
	
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("prexo.mis@dealsdray.com");
	
	WebElement icon = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[1]"));
	icon.click();
	
	WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	button.click();
	
	WebElement ord = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	ord.click();
	
	WebElement bulk = driver.findElement(By.xpath("//button[@align='right']"));
	bulk.click();
	
	WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
	file.click();
	
	WebElement imp = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	imp.click();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File img = ts.getScreenshotAs(OutputType.FILE);
	
	File f = new File("C:\\Users\\KIRTHIGA\\eclipse-workspace\\AutomationTest2\\websitescreenshot\\dealsdray.png");
	FileUtils.copyFile(img, f);
}
}
