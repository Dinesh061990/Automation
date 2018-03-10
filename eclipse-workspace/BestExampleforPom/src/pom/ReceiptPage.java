package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage extends PageObject {

	@FindBy(tagName = "h1")
	private WebElement header;
	
	public ReceiptPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		System.out.println("Initalized");
		return header.isDisplayed();
	}

	public String confirmationHeader(){
		System.out.println("Thank you!");
		return header.getText();
	}

}