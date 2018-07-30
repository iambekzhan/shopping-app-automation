package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ShoppingAccountCreationPage {

	private WebDriver driver;

	public ShoppingAccountCreationPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_gender1")
	public WebElement mrRadioBtn;
	
	@FindBy(id = "id_gender2")
	public WebElement mrsRadioBtn;

	@FindBy(id = "customer_firstname")
	public WebElement firstName;

	@FindBy(id = "customer_lastname")
	public WebElement lastName;

	@FindBy(id = "passwd")
	public WebElement password;

	@FindBy(id = "address1")
	public WebElement address;

	@FindBy(id = "city")
	public WebElement city;

	@FindBy(id = "id_state")
	public WebElement state;

	@FindBy(id = "postcode")
	public WebElement zip;

	@FindBy(id = "phone_mobile")
	public WebElement mobileNumber;

	@FindBy(xpath = "//button[@id='submitAccount']/span")
	public WebElement registerBtn;
	
	@FindBy(xpath = "//p[@class='info-account']")
	public WebElement accountCreationMessage;

}
