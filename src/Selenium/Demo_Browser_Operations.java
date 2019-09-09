package Selenium;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hey guys this code is for initial testing of selenium
 * testing basic selenium operation of driver 
 * Dhruv
 */

public class Demo_Browser_Operations {

	public static void main(String[] args) {

			// give path of base directory
			String current = System.getProperty("user.dir");
			System.out.println(current);

			System.setProperty("webdriver.chrome.driver", current + "\\Lib\\chromedriver.exe");

			WebDriver driver = new ChromeDriver(); //open browser
			driver.get("https://www.google.com"); //open URL
			
			//maximise window size....
			driver.manage().window().maximize();
		    driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//(implicitwait)wait for 5 seconds after each line

			String URL = driver.getCurrentUrl(); //Get page current URL
			System.out.println("URL of page is --->"+ URL);
			
			String page_title = driver.getTitle();// get page title
			System.out.println("Page title is --->" + page_title);
			
			//Enter data in a textbox
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Automation testing");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);//press enter a keyboard operation

			
			//Making list of all elements with similar xpath 
			List<WebElement> Ls = driver.findElements(By.xpath("//input[@class='gNO89b']"));
			//WebElement is another interface that represents elements
			//Ls.get(1).click();
			
			//Browser basic operations.............................
			driver.navigate().refresh();//refresh the browser
		    driver.navigate().back();
		    driver.navigate().forward();
		    driver.navigate().to("https://accounts.google.com/signin");
		    
			driver.close(); //close current browser only (only 1 browser)
			
			/**
			driver.quit();// close all the opened browser related to code at the same time used in parallel testing
			**/
		}

	}
