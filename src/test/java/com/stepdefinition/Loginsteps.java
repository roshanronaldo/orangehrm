package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.library.Baseclass;
import com.pages.Orangehrm;
import com.reusable.Seleniumutilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends Baseclass {

	public Orangehrm or;

	@Given("the user has launched the application")
	public void the_user_has_launched_the_application() throws IOException {
		Browserlaunch();

	}

	@When("The user enter the username")
	public void the_user_enter_the_username() throws InterruptedException {
	 or = new Orangehrm(driver);
		Thread.sleep(3000);
		or.userbox("Admin");

	}

	@When("The user enter the password")
	public void the_user_enter_the_password() throws InterruptedException {
		Thread.sleep(3000);
		or.passwordbox("admin123");
	}

	@When("The user to click the loginbutton")
	public void the_user_to_click_the_loginbutton() {

		or.loginbox();

	}

	@Then("it  should displayed home screen")
	public void it_should_displayed_home_screen() {

	}

}
