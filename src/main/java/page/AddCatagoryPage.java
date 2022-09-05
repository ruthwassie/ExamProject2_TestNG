package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCatagoryPage {

	WebDriver driver;

	public void addCatagory(WebDriver driver) {
		this.driver = driver; 
		}
		
		@FindBy(how = How.XPATH, using = "//input[@name='categorydata']") WebElement ADD_INPUT_ELEMENT; 
		@FindBy(how = How.XPATH, using = "//input[@value='Add category']") WebElement ADD_CATAGORY_BUTTON_ELEMENT;
		
		@FindBy(how = How.XPATH, using = "//select[@name='due_month']")WebElement MONTH_DROPDOWN_ELEMENT; 
	
		


	public void addInputElement() {
		ADD_INPUT_ELEMENT.sendKeys("TF Technology");
		
	}

	public void addCatagoryButtonElement() {
		ADD_CATAGORY_BUTTON_ELEMENT.click();
		
	}
	public void dropdownElement(){
		
		Select sel = new Select (MONTH_DROPDOWN_ELEMENT); 
		List<WebElement>fullList = sel.getOptions();
		for (WebElement i : fullList) {
			//System.out.println(MONTH_DROPDOWN_ELEMENT.getText());
		}
		MONTH_DROPDOWN_ELEMENT.click();
		
	}
}


	
	
	

