package Rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Rahulshettyacademy.AbstractComponents.AbstractComponents;

public class CheckOutPage extends AbstractComponents{

	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//pageFactory
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement country;
	
	@FindBy(xpath="//button[@type='button")
	List<WebElement> countries;
	
	@FindBy(css=".actions a")
	WebElement ClickSubmit;
	
	@FindBy(xpath="//button[contains(@class,'ta-item')])[2]")
	WebElement Selectcountry;
	
	@FindBy(css=".hero-primary")
	WebElement Text;
	
	By productsBy = By.cssSelector(".actions a");
	
	public List<WebElement> getCountrylist()
	{
		return countries;
	}
	
	public void ClickSubmitButton()
	{
		WaitforElementToBeAppear(productsBy);
		ClickSubmit.click();
	}
	
	public String getText()
	{
		String text = Text.getText();
		return text;
	}
	public void SelectCountry(String countryName) throws InterruptedException
	{
		Actions a = new Actions(driver);
		a.sendKeys(country, countryName).build().perform();	
		WaitforElementToBeAppear(By.cssSelector(".ta-results"));
		Thread.sleep(5000);
		Selectcountry.click();
	}
}