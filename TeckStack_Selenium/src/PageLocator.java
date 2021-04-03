import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Add required imports

public class PageLocator extends DriverSetup // DO NOT Change the class Name
{
	static WebDriver driver;

	public static WebDriver createDriver() // DO NOT change the method signature
	{
		driver = getWebDriver();
		return driver;
	}

	public static WebElement getPageLocator(WebDriver driver) // DO NOT change the method signature
	{
		/*
		 * Replace this comment by the code statement to get the WebElement of
		 * 'Lastname'
		 */
		/* Find the element by id */		
		By lastName = By.id("lastname");
		return driver.findElement(lastName);
	}

	public static String getName(WebElement element) // DO NOT change the method signature
	{
		
		String name = getPageLocator(driver).getAttribute("placeholder");
		return name;
	}

	public static void main(String[] args) {
		PageLocator pl = new PageLocator();
		createDriver();
		String name= getName(null);
		System.out.println(name);
	}

}
