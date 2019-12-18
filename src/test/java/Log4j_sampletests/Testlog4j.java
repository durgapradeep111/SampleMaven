package log4j_sampletests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testlog4j {
	Logger log = Logger.getLogger(Testlog4j.class);
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\11563257\\workspace\\SampleMaven\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		log.info("Browser lounched");
		 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	@Test
	public void testCase1(){
		
		driver.get("https://www.google.com");
		log.info("######################################## lounched URL #################");
		String q = driver.getTitle();
		System.out.println(q);
		log.info("########################################   tile is : "+q+"   #############################");
		//driver.findElement(By.xpath("//input[@id='edit-zipcode']")).sendKeys("99501");
		//driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
