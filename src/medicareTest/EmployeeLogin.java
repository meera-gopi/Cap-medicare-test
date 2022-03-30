package medicareTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmployeeLogin {
	WebDriver driver;
	
	@Test(groups="LoginCrud")
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver","/Users/user/Documents/testing/medicareTest/artifacts/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://localhost:4200");
		try {
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	
	@Test(groups="LoginCrud",dependsOnMethods="setDriver")
	public void login() {
		driver.findElement(By.id("empL")).click();
		try {
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		driver.findElement(By.id("exampleInputUserName1")).sendKeys("admin1");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("hello");
		driver.findElement(By.id("empS")).click();
		
		
	}
	
	@Test(groups="LoginCrud",dependsOnMethods="login")
	public void empDashBoard() {
		
	}

public static void main(String[] args) {
	
	
	
	
}


}
