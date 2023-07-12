package com.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public WebDriver driver;
	public Properties prop;
	
	
	public void Browserlaunch() throws IOException {
		
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		
		FileInputStream  input= new FileInputStream("src/test/resources/Properties/app.properties");
	    prop = new Properties ();
		prop.load(input);
		prop.getProperty("Browser").equalsIgnoreCase("edge");
		
		driver.navigate().to(prop.getProperty("Url"));
		
		
	}
	
	
	
	
	
	
	
	
	

}
