package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_properties {

	public static void main(String[] args) throws IOException {

		//Pull data from a property file and use it for testing

		String current = System.getProperty("user.dir");
		System.out.println(current);

		Properties prob = new Properties();//useing a property class we will fetch data

		//creating object of fileinputstream class to tell java that this is a file present at below mentioned path
		/*
		 * A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment. 
         FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader
		 */
		FileInputStream fs = new FileInputStream(current + "\\Resources\\Data.properties");

		prob.load(fs);// enter the file location and used to read data from property file
		System.out.println(prob.get("Name"));//read data using a key 
		System.out.println(prob.get("Class"));//read data using a key
		System.out.println(prob.get("Rollno"));//read data using a key
		System.out.println(prob.get("browser"));//read data using a key

	}

}
