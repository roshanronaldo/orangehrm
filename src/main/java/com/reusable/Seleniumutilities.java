package com.reusable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.library.Baseclass;



public class Seleniumutilities extends Baseclass {

	public Seleniumutilities(WebDriver driver) {
		this.driver = driver;

	}

	public void Entervalue(WebElement Element, String value) {

		Element.sendKeys(value);

	}

	public void toclick(WebElement Element) {

		Element.click();

	}

	public void Screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(path);
		FileUtils.copyFile(source, target);

	}

	public void movetoelement(WebElement Element) {
		Actions act = new Actions(driver);
		act.moveToElement(Element).click().build().perform();

	}

	public void scrolldown(WebElement Element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Element);

	}

	public void dropdown(WebElement Element, String value) {
		Select s = new Select(Element);
		s.selectByValue(value);
	}

}
