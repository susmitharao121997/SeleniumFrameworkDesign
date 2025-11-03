package Rahulshettyacademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Rahulshettyacademy.pageobjects.CartPage;

public class AbstractComponents {

	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//pageFactory
	@FindBy(css="[routerlink*='cart']")
	WebElement cartHeader;

	public void WaitforElementToBeAppear(By findBy)
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void WaitforElementToBeDisAppear(WebElement ele)
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void ScrollDown()
	{
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,5000000)");
	}
     
	public CartPage goToCartPage()
	{
		cartHeader.click();	
		CartPage cartPage = new CartPage(driver);
		return cartPage;
	}
}	