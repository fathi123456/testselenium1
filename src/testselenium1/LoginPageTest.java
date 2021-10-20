package testselenium1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
 @Test
	public void testlogin()
	{
	 WebDriver driver = new ChromeDriver();
	 
	driver.get("http://automationpractice.com");
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.id("email")).sendKeys("iyyadilef123456789@gmail.com");
	driver.findElement(By.name("SubmitLogin")).click();
	String testloginError = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	
  assertEquals("testloginError","Password is required.");

	
	}
	
	
}
