package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
 //WebDriver driver;
 public static final ThreadLocal<WebDriver> threadlocal=new ThreadLocal<>();
 public WebDriver getDriver() {
	 return threadlocal.get();
 }
 @BeforeMethod
 public void setUp() {
	 //driver=new ChromeDriver();
	 threadlocal.set(new ChromeDriver());
	 getDriver().get("https://www.saucedemo.com/");
	 getDriver().manage().window().maximize();
	 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 }
 @AfterMethod
 public void tearDown() {
	 getDriver().quit();
	 threadlocal.remove();
 }
}
