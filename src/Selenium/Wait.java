package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {

		//		Implicit wait -When we use this wait each code statement will wait for the specified time before execution
		//		Explicit wait -When we use this wait , only the statement for which it is used will wait for specified time before execution


		// give path of base directory
		String current = System.getProperty("user.dir");
		System.out.println(current);

		System.setProperty("webdriver.gecko.driver", current + "\\Lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//Explicit wait....................
		WebDriverWait wait=new WebDriverWait(driver, 10);// two input parameter one is driver and other is time :seconds eg 5,10,8

		driver.get("https://in.yahoo.com");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// implicit wait..........

		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();

		//Explicit wait....................
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-username']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-username']")));
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kiran@gmail.com");
		
		driver.close();


	}

}
