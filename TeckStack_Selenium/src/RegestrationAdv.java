import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegestrationAdv extends DriverSetup {

	static WebDriver driver;
	static String baseUrl="http://webapps.tekstac.com/Shopify/";
	//String fName;

	public WebDriver setupDriver() {
		driver = getWebDriver();
		driver.get(baseUrl);
		return driver;
	}

	public void setElements() {
		/*
		 * Using the driver, Find the elements by id Set the values to the elements
		 * Register the form
		 */
		By Fname= By.id("firstname");
		By Lname= By.id("lastname");
		By userName = By.id("username");
		By password = By.id("pass");
		By regBttn =By.id("reg");
		WebElement selectCity =driver.findElement(By.id("selectcity"));
		By gender = By.xpath("//input[@value='female']");
		
		driver.findElement(Fname).sendKeys("Mithali");
		driver.findElement(Lname).sendKeys("Raj");
		driver.findElement(userName).sendKeys("Mithali Raj");
		Select sel =new Select(selectCity);
		sel.selectByIndex(2);
		driver.findElement(gender).click();
		driver.findElement(password).sendKeys("MR@123");		
		driver.findElement(regBttn).click();
	}

	public static void main(String[] args) {
		RegestrationAdv reg = new RegestrationAdv();
		reg.setupDriver();
		reg.setElements();
	}

}
