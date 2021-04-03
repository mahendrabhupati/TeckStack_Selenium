import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class NameLocator extends DriverSetup
{
	static String fName;  
	static WebDriver driver;  
	
	public static WebDriver setupDriver()
	{
	    /*Invoke the getWebDriver method from the DriverSetup File*/
	    driver = getWebDriver();
	    return driver;
	}
	public  String getNameLocator()
	{
       /*Identify the Firstname
	     Get the placeholder value
         Store the placeholder value in the static variable fName.*/
         driver.findElement(By.name("fname"));
         fName=driver.findElement(By.xpath("//input[@placeholder='Firstname']")).getAttribute("placeholder");
       return fName;
	}
	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    setupDriver();
	    String name=namLocator.getNameLocator();
	    System.out.println("The name is "+name);
	}

}

