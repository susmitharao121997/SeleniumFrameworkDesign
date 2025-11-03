package Rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Rahulshettyacademy.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents {

	WebDriver driver;
	
	//pageFactory
	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(css=".totalRow button")
	WebElement checkOutElement;
	
	By CheckOutBy = By.cssSelector(".totalRow button");
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean VerifyCartProducts(String productName)
	{
		boolean match = cartProducts.stream().anyMatch(name->name.getText().equalsIgnoreCase(productName));
		return match;	
	}
	
	public CheckOutPage goToCheckOut() throws InterruptedException
	{
		Thread.sleep(3000);
		WaitforElementToBeAppear(CheckOutBy);
		checkOutElement.click();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		return checkOutPage;
	}
}