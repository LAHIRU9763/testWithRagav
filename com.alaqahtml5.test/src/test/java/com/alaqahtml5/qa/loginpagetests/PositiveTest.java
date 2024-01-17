 package com.alaqahtml5.qa.loginpagetests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {
	
	@Test
	private void loginTest() {
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		//C:\Users\lahiruh\eclipse-workspace\SeleniumForBiginers\src\main
		WebDriver driver=new ChromeDriver();
		
		sleep(3000);
		
		
		driver.manage().window().maximize();
		driver.get("http://alawwal-qa-trade-universal.directfn.net/");
		
		
		WebElement Username = driver.findElement(By.id("txtUsername"));
		Username.sendKeys("KusalUA");
		
		sleep(3000);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("123");
		
		sleep(3000);
		
		WebElement lgnbtn = driver.findElement(By.id("btnLogin"));
		lgnbtn.click();
		 
		String expectedUrl = "http://alawwal-qa-jsdjfjtrade-universal.directfn.net/";
		String atualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl,atualUrl , "actual page URL is not same as expected");
		
		Assert.assertTrue(lgnbtn.isDisplayed() , "lgnbtn is disabled");
		
		}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// //input[@id='txtUsername']
// //input[@id='txtPassword']
// //button[@id='btnLogin']
// //input[@id='chkRemember']
// //input[@id='checkboxKeyboard']
// //a[@id='registerLink']

// //a[@id='registerLink']
// //a[@id='lnkOnlineAcc']

// //a[@id='lnkFAQ']
// //a[@id='lnkContactUs']
// //a[@id='linkTermsAndConditions']
// //a[@id='linkDemoText']
