package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.Baseclass;
import com.reusable.Seleniumutilities;

public class Orangehrm extends Baseclass {

	public Seleniumutilities se;

	public Orangehrm(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement passsword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;

	public void userbox(String Value) {

	 se = new Seleniumutilities(driver);
		se.Entervalue(username, Value);
		
		

	}

	public void passwordbox(String Value) {
		se.Entervalue(passsword, Value);
		
	}
	
	public void loginbox() {
		se.toclick(loginbutton);

	}
	
}
