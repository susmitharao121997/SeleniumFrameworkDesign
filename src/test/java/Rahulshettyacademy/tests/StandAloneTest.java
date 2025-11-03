package Rahulshettyacademy.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Rahulshettyacademy.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		LandingPage landingPage = new LandingPage(driver);
	    driver.findElement(By.id("userEmail")).sendKeys("susmitharao@gmail.com");
	    driver.findElement(By.id("userPassword")).sendKeys("Rishi@123");
	    driver.findElement(By.id("login")).click();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 /*   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
	    List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	    WebElement prod = products.stream().filter(product->
	    product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	    prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	    driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	    List<WebElement> names = driver.findElements(By.cssSelector(".cartSection h3"));
	    boolean match = names.stream().anyMatch(name->name.getText().equalsIgnoreCase(productName));
	    Assert.assertTrue(match);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,10000)");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".totalRow button")));
	    driver.findElement(By.cssSelector(".totalRow button")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("Ind");
	    List<WebElement> countries = driver.findElements(By.xpath("//button[@type='button']"));
	    countries.stream().filter(country->country.getText().equals("India")).findFirst().orElse(null).click();
	    js.executeScript("window.scrollBy(0,10000)");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".actions a")));
	    driver.findElement(By.cssSelector(".actions a")).click();
	    String text = driver.findElement(By.cssSelector(".hero-primary")).getText();
	    Assert.assertTrue(text.equalsIgnoreCase("Thankyou for the order."));
	    driver.close();*/
		System.out.println("hello");
	}
}
