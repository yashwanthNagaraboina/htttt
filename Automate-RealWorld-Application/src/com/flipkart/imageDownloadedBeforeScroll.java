package com.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class imageDownloadedBeforeScroll {

	WebDriver webdriver = null;
	String URL = "http://www.flipkart.com/";

	@Test
	public void imageDownloadedBeforeScroll() {
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

		webdriver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();

		
		webdriver.findElement(By.xpath("(//img[@alt='Moto Edge 30'])[2]")).click();
		webdriver.findElement(By.xpath("//div[@class='_2LR_KO']")).click();
		webdriver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("SAMSUNG");
		webdriver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='_24_Dny']")).click();
//	TO VERIFY image is downloaded just before the user scrolls to its position and gets displayed in time

		boolean image2 = webdriver
				.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)']"))
				.isDisplayed();

		// verify if status is true
		if (image2) {
			System.out.println("Image2 Loaded ");
		} else {
			System.out.println("Image2 not Loaded");
		}

		boolean image3 = webdriver
				.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']"))
				.isDisplayed();

		// verify if status is true
		if (image3) {
			System.out.println("Image3 Loaded ");
		} else {
			System.out.println("Image3 not Loaded");
		}

		WebElement Element = webdriver.findElement(By.xpath(
				"//div[normalize-space()='SAMSUNG Galaxy A23 (Black, 128 GB)']"));
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
		System.out.println("Scrolled Down Successfully");
	}
}
