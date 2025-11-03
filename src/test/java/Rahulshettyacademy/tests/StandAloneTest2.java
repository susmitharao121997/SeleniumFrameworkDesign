package Rahulshettyacademy.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Rahulshettyacademy.TestComponents.BaseTest;
import Rahulshettyacademy.pageobjects.CartPage;
import Rahulshettyacademy.pageobjects.CheckOutPage;
import Rahulshettyacademy.pageobjects.LandingPage;
import Rahulshettyacademy.pageobjects.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class StandAloneTest2 extends BaseTest{

	@Test(dataProvider="getData")
	public void SubmitOrderTest(HashMap<String,String> input) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		String productName = "ZARA COAT 3";
	    ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));
	    productCatalogue.getproductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.VerifyCartProducts(productName);     
	    Assert.assertTrue(match);
	    cartPage.ScrollDown();
	    CheckOutPage checkOutPage = cartPage.goToCheckOut();
	    checkOutPage.SelectCountry("India");
	    checkOutPage.ScrollDown();
	    checkOutPage.ClickSubmitButton();
	    String text = checkOutPage.getText();
	    Assert.assertTrue(text.equalsIgnoreCase("Thankyou for the order."));
	}
	
	@Test(dependsOnMethods = {"SubmitOrderTest"})
	public void OrderHistoryTest()
	{
		
	}
	
	public String getScreenShot(String testCaseName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png"); 
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	}
	
	//Extend Reports
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		List<HashMap<String,String>> data = getJsonDataToMap();
		////return new Object[][] {{"sus@gmail.com","sus12","ZARA COAT 3"},{"rishi@gmail.com","rishi12","adidas"}};
		return new Object[][] {{data.get(0)},{data.get(1)}};
	
	}
}