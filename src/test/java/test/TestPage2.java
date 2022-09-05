package test;

import java.util.List;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
//import pages.BasePage;
//import pages.ToggleAllPage;
import util.BrowserFactory;

public class TestPage2 {
	WebDriver driver;

	@Test
	public void validateAddCatagoryPage() {
		driver = BrowserFactory.init();   

		AddCatagoryPage addCatagoryPage = PageFactory.initElements(driver, AddCatagoryPage.class);
		addCatagoryPage.addInputElement();
		addCatagoryPage.addCatagoryButtonElement();
		
		String bodyText = driver.findElement(By.tagName("body")).getText(); 
		String [] text = bodyText.split(":"); 
		String expected = text[0].trim();
		Assert.assertEquals(expected, "The category you want to add already exists", "not found");
		
		
		
		

	}

}