package Git_Project._Maven;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium DR\\chromedriver.exe");
		 driver=new ChromeDriver();
	}

	@Test
	public void dologin(){
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com");
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pradeeprj07@gmail.com");
		  
		  driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abcd");
		  
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		}
	
	@AfterTest
	public void QuitDriver(){
		if (driver!=null)
			driver.close();
	}

	}

	


