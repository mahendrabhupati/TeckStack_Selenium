import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Registration extends DriverSetup  //DO NOT Change the class Name
{
	
	static String baseUrl ="http://webapps.tekstac.com/InvoiceUpdates/";
	public static WebDriver driver;
	public static WebDriver createDriver()       //DO NOT change the method signature
	{
		driver = getWebDriver();
		return driver;
	}
	
	public static void navigate(WebDriver driver)   //DO NOT change the method signature
	{
	    // set the url to baseUrl and navigate ("http://webapps.tekstac.com/InvoiceUpdates/") 
	    driver.get(baseUrl);
	}
	
	public static Select getCategoryElement(WebDriver driver)  //DO NOT change the method signature
	{	
	   /*Replace this comment by the code statement to get the driver*/   
	   /* Select Value "Utility Invoice" from 'Category' (drop-down) and return the select element  
             * Declare the drop-down element as an instance of the Select class. 
             * Return select object    */
       WebElement dropDown = driver.findElement(By.xpath("//form[@name='myform']//table//tbody//tr//td//select"));
       //dropDown.click();
       Select sel = new Select(dropDown);
       sel.selectByIndex(2);
       return sel;
	}
	public static void setFormValues(WebDriver driver)  //DO NOT change the method signature
	{
	    /*Using the driver, Find the elements by id and send the values to the elements */
      
      /*  Send 'Rakesh' for 'name'  
               '123' for 'number'
                'new user' for user type 
                'Utility Invoice' for select 
                '1000' for 'amount'
                '9876543210' for phone 
                'New User Invoice' for 'comments'
      */ 
			By name =By.id("name");
			By number =By.id("number");
			By amount = By.name("amount");
			By phone = By.name("num");
			By comments = By.xpath("//textarea[@name='comments']");
			driver.findElement(name).sendKeys("rakesh");
			driver.findElement(number).sendKeys("123");
			driver.findElement(amount).sendKeys("1000");
			driver.findElement(phone).sendKeys("9876543210");
			driver.findElement(comments).sendKeys("New User Invoice");
	}
	
	public static WebElement getSuccessMessageElement(WebDriver driver) //DO NOT change the method signature
	{
		
	    //Get the message element and return it
		By submit = By.id("submit");
		driver.findElement(submit).click();
		
		By result =By.id("result");
	    //After registration a success message is displayed. Identify and return the WebElement of the same. 
		return driver.findElement(result);
	}

	public static String getSuccessMessage()  //DO NOT change the method signature
	{
		
	    //Get the attribute value from the WebElement of success message displayed and return it. 
		By result =By.id("result");
		return driver.findElement(result).getText();
	}

    public static void main(String[] args){
	    Registration reg =new Registration();
	    createDriver();
	    navigate(driver);
	    getCategoryElement(driver);
	    setFormValues(driver);
	    getSuccessMessageElement(driver);
	    String msg= getSuccessMessage();
	    System.out.println(msg);
	    //driver.close();
	}
}

