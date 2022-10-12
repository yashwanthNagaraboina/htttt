package com.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// FACEBOOK NEW REGISTRATION
public class facebook {

	private static String path = "C:\\chromedriver_win32\\chromedriver.exe";
	
	public static void main(String[] args) {

		String url = "https://www.facebook.com/r.php?locale=en_GB&display=page";
		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("modi");
		System.out.println(fname.getAttribute("name"));

		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("PM");
		System.out.println(lname.getAttribute("name"));

		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("7478420912");
		System.out.println(mobile.getAttribute("name"));

		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("Modi@pm");
		System.out.println(pass.getAttribute("name"));

		WebElement day = driver.findElement(By.id("day"));
		day.sendKeys("28");
		System.out.println(day.getAttribute("name"));

		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("june");
		System.out.println(month.getAttribute("name"));

		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("2000");
		System.out.println(year.getAttribute("name"));

		WebElement gender = driver.findElement(By.className("_8esa"));
		gender.click();
		System.out.println(gender.getAttribute("name"));

		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();
		System.out.println(signUp.getAttribute("name"));

		System.out.println("registered successfully");

	}

}