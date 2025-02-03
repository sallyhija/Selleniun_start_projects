package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import java.lang.Thread;
import org.openqa.selenium.support.ui.Select;

/**
 * Sally Hiajney 206189805
 * Hiba Akla 324006147
 */
public class AppTest {
	 
	
	 static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\sally\\Downloads\\geckodriver-v0.35.0-win32\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	  }
		
	@Test
	public void Tests1() {
    	
		
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("8.0");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("8.0");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("8.0");

		String currentPage = browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertEquals(currentPage, newPage);
	}

	@Test
	public void Tests2() {

		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("3.0");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("4.0");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5.0");

		String currentPage = browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertEquals(currentPage, newPage);
	}

	@Test
	public void Tests3() {

		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("4.0");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("3.0");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("3.0");

		String currentPage = browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertEquals(currentPage, newPage);
	}

	@Test
	public void Tests4() {

		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("9");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("2");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("6");

		String currentPage = browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertEquals(currentPage, newPage);
	}
	@Test
	public void Tests5() {

		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("7.0");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5.0");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("7.0");

		String currentPage = browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertEquals(currentPage, newPage);
	}
	@Test
	public void Tests6() {

		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("5.0");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5.0");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("6.0");

		String currentPage = browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertEquals(currentPage, newPage);
	}
	
}