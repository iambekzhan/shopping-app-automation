package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ShoppingHomePage {
	
	private WebDriver driver;
	
	public ShoppingHomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "DRESSES")
	public WebElement dressesLink;
	
	@FindBy(linkText = "CASUAL DRESSES")
	public WebElement casualDressesLink;
	
	@FindBy(linkText = "EVENING DRESSES")
	public WebElement eveningDressesLink;
	
	@FindBy(xpath = "//span[@class='cat-name']")
	public WebElement headerText;
	
	@FindBy(linkText = "Sign in")
	public WebElement signInBtn;
	
	@FindBy(id = "email_create")
	public WebElement emailField;
	
	@FindBy(id = "SubmitCreate")
	public WebElement createAccountBtn;
	
	@FindBy(id = "email")
	public WebElement emailBox;
	
	@FindBy(id = "passwd")
	public WebElement passwordBox;
	
	@FindBy(id = "search_query_top")
	public WebElement searchBox;
	
	@FindBy(name = "submit_search")
	public WebElement searchBtn;
}
