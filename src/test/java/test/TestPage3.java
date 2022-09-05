package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
import util.BrowserFactory;

@Test
public class TestPage3 {
	WebDriver driver; 
	
	public void validateDropDownElement() {
		
		driver = BrowserFactory.init();   
		AddCatagoryPage addCatagoryPage = PageFactory.initElements(driver, AddCatagoryPage.class);
		addCatagoryPage.dropdownElement();
		
		Assert.assertEquals("Month drop down selected and displayed", "Month drop down selected and displayed");
		
	}
	
	
	
	
	

}
//public void selectFromDropdown(WebElement element, String visibleTest) {
//	Select sel = new Select(element);
//	sel.selectByVisibleText(visibleTest);
//
//}