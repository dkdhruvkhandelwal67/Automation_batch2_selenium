package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_open_bowser_FF {

	public static void main(String[] args) {

		// give path of base directory
		String current = System.getProperty("user.dir");
		System.out.println(current);

		System.setProperty("webdriver.gecko.driver", current + "\\Lib\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver(); //open browser
		driver.get("https://www.google.com"); //open URL
		try {
			Thread.sleep(5000); //wait for 5 second
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close(); //close browser 
	}

}
