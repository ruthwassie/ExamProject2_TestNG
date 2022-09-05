package test;


//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
//import pages.BasePage;
//import pages.ToggleAllPage;
import util.BrowserFactory;

public class TestPage1 {
	WebDriver driver;
	
	@Test
	public void validateAddCatagoryPage() {
		driver = BrowserFactory.init();  
		
		AddCatagoryPage addCatagoryPage = PageFactory.initElements(driver, AddCatagoryPage.class);
		addCatagoryPage.addInputElement();
		addCatagoryPage.addCatagoryButtonElement();
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

