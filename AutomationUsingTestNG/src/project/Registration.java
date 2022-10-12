package project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {

	WebDriver webdriver = null;

	String URL = "http://automationpractice.com/index.php";

	@Test
	public void registration() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		webdriver.findElement(By.name("email_create")).sendKeys("modipm@gmail.com");
		webdriver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();

		webdriver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Modi");
		webdriver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("PM");
		webdriver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("modi123@");

		webdriver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("modi");
		webdriver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("pm");

		webdriver.findElement(By.xpath("//*[@id='address1']")).sendKeys("5-14,Main Street");

		webdriver.findElement(By.xpath("//*[@id='city']")).sendKeys("pak");

		Select sState = new Select(webdriver.findElement(By.xpath("//*[@id='id_state']")));
		sState.selectByVisibleText("zodio");

		webdriver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("651211");

		Select sCountry = new Select(webdriver.findElement(By.xpath("//*[@id='id_country']")));
		sCountry.selectByVisibleText("pakistan");

		webdriver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("9889889889");
		webdriver.findElement(By.xpath("//*[@id='alias']")).sendKeys("Home");
		webdriver.findElement(By.xpath("//*[@id='submitAccount']")).click();
	}
}