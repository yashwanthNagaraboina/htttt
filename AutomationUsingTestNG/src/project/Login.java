package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	WebDriver webdriver = null;
	String URL = "http://automationpractice.com/index.php";

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();

		// Click on Sign in
		webdriver.findElement(By.linkText("Sign in")).click();
		// Login
		webdriver.findElement(By.id("email")).sendKeys("modi@gmail.com");
		webdriver.findElement(By.id("passwd")).sendKeys("modi123@");
		webdriver.findElement(By.id("SubmitLogin")).click();
	}
}