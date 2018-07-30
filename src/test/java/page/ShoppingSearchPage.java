package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ShoppingSearchPage {
	
	private WebDriver driver;
	
	public ShoppingSearchPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	public WebElement foundMsg;
	
	@FindBy(id = "selectProductSort")
	public WebElement sortBy;
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li//div[@class='right-block']//span[@class='price product-price']")
	public List<WebElement> resultPrices;
	
}
