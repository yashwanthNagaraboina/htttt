package com.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ImageLoaded {
	WebDriver webdriver = null;
	String URL = "http://www.flipkart.com/";

	@Test
	public void imageLoaded() {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\hp-p\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		webdriver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		webdriver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

//		Actions act = new Actions(webdriver);

		webdriver.findElement(By.xpath("//img[@alt='Electronics']")).click();

		
		webdriver.findElement(By.xpath("(//img[@alt='Moto Edge 30'])[2]")).click();
		webdriver.findElement(By.xpath("//div[@class='_2LR_KO']")).click();
		webdriver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("SAMSUNG");
		webdriver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='_24_Dny']")).click();
		boolean eleSelected = webdriver
				.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']"))
				.isDisplayed();

		// verify if status is true
		if (eleSelected) {
			System.out.println("Image Loaded ");
		} else {
			System.out.println("Image not Loaded");
		}
	}

}
