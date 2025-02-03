package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.*;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Sally Hiajney 206189805
 * Hiba Akla 324006147
 */

public class SelleninumTesting_2 {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\sally\\Downloads\\geckodriver-v0.35.0-win32\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		
	  }
		
	@Test
	public void Tests1() {
   	
		
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("Sally");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Aboalhija");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("29");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("Israel");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
   }


@Test
public void testPasswordValidation() {
    // מקרה חיובי: סיסמה באורך 7 תוים או יותר
    WebElement passwordField = browser.findElement(By.id("password"));
    passwordField.sendKeys("Sally123"); // סיסמה חיובית (7 תוים)

    WebElement submitButton = browser.findElement(By.cssSelector("input[type='submit']"));
    String currentPage = browser.getCurrentUrl();
    submitButton.click();  // שליחת הטופס

    // בדיקת שינוי דף
    String newPage = browser.getCurrentUrl();
    assertNotEquals(currentPage, newPage); // עמוד השתנה אם הסיסמה חוקית

    // מקרה שלילי: סיסמה באורך פחות מ-7 תוים
    passwordField = browser.findElement(By.id("password"));
    passwordField.clear();
    passwordField.sendKeys("sally5"); // סיסמה שלילית (פחות מ-7 תוים)

    currentPage = browser.getCurrentUrl();
    submitButton.click();

    // בדיקה שהעמוד לא השתנה
    newPage = browser.getCurrentUrl();
    assertEquals(currentPage, newPage); // עמוד לא השתנה אם הסיסמה לא חוקית
}}
