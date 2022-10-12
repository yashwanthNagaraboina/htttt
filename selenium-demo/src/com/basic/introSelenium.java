package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class introSelenium {
	
	public static void main(String[] args) {
		
		WebDriver webdriver=null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		webdriver = new FirefoxDriver();
//		
//		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
//		webdriver = new EdgeDriver();
		
//		clickonlink(webdriver);

		clickontforms(webdriver,"modi","modi");

	}

	private static void clickontforms(WebDriver webdriver, String string1, String string2) {
		webdriver.get("http://localhost:4200");
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		
		webdriver.findElement(By.id("username")).sendKeys(string1);
		webdriver.findElement(By.id("email")).sendKeys(string2);
		 webdriver.findElement(By.id("cont")).click();
		 webdriver.findElement(By.id("invalidalert")).toString();
	}

	private static void clickonlink(WebDriver webdriver) {
		webdriver.get("https://www.simplilearn.com");
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		webdriver.quit();
	}
	
}
