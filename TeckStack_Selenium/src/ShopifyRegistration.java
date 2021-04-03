import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopifyRegistration extends DriverSetup {

	static WebDriver driver;
	static String baseUrl="http://webapps.tekstac.com/Shopify/";
	//String fName;

	public WebDriver setupDriver() {
		driver = getWebDriver();
		driver.get(baseUrl);
		return driver;
	}

	public static void setElements() {
		/*
		 * Using the driver, Find the elements by id Set the values to the elements
		 * Register the form
		 */
		By Fname= By.id("firstname");
		By Lname= By.id("lastname");
		By userName = By.id("username");
		By password = By.id("pass");
		By regBttn =By.id("reg");
		
		driver.findElement(Fname).sendKeys("Rahul");
		driver.findElement(Lname).sendKeys("Dravid");
		driver.findElement(userName).sendKeys("Rahul Dravid");
		driver.findElement(password).sendKeys("Rahul//Dravid");
		driver.findElement(regBttn).click();
	}

	public static void main(String[] args) {
		ShopifyRegistration reg = new ShopifyRegistration();
		reg.setupDriver();
		setElements();
	}

}
