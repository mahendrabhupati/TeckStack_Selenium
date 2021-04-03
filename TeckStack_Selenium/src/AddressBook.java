import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBook extends DriverSetup{           //DO NOT change the class name
	
    static WebDriver driver;
    String nickName;
	public WebDriver createDriver()
	{	
	   //Create driver, store in in static variable 'driver' and return it
		driver = getWebDriver();
		driver.get("http://webapps.tekstac.com/AddressBook/");
		return driver;
	}
	
	public void setNewFormValues(String nickname,String contact,String company,String city,String country,String type)
	{
	    //Find the form elements and set values by passing those values from 'main' method. 
	    //Submit form to add the details
		driver.findElement(By.id("nickname")).sendKeys(nickname);
		driver.findElement(By.id("contact")).sendKeys(contact);
		driver.findElement(By.id("company")).sendKeys(company);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("country")).sendKeys(country);
		driver.findElement(By.id("type")).sendKeys(type);
		By add = By.id("add");
		driver.findElement(add).click();
	}
	
	public  WebElement getNewNickName() {
		//Find and return the 'nickname' web element of the row displayed after first submit
		By nickname = By.id("nickname");
		return driver.findElement(nickname);
	}
	public WebElement getNewContact() {
		//Find and return the 'contact' web element of the row displayed after first submit
		By contact = By.id("contact");
		return driver.findElement(contact);
		 
	}
	public WebElement getNewCompany() {
		By company = By.id("company");
		return driver.findElement(company);
		//Find and return the 'company' web element of the row displayed after first submit
	}
	public WebElement getNewCity() {
		//Find and return the 'city' web element of the row displayed after first submit
		By city = By.id("city");
		return driver.findElement(city);
	}
	public WebElement getNewCountry() {
		//Find and return the 'country' web element of the row displayed after first submit
		By country = By.id("country");
		return driver.findElement(country);
	}
	public WebElement getNewType() {
		//Find and return the 'type' web element of the row displayed after first submit
		By type = By.id("type");
		return driver.findElement(type);
	}
	public void editDetails() {
	    //Find the first radio button and click 
	    //Find edit button and click
		//By radioBtn = By.id("radio0");
		driver.findElement(By.xpath("//input[@id='radio0']")).click();
		By editBtn = By.id("edit");
		driver.findElement(editBtn).click();		
	}		
	public String getEditNickName() {
	    //Find and return the 'nickname' value in the edit box in the form after cicking edit
		//nickName = driver.findElement(By.xpath("//input[@id='nickname']")).getAttribute("nickname");
		return getNewNickName().getAttribute("nickName");
	}
	public String getEditContact() {
		return getNewContact().getAttribute("contact");
		//Find and return the 'contact' value in the edit box in the form after cicking edit
		
	}
	public String EditNewCompany() {
		return getNewCompany().getAttribute("company");
		//Find and return the 'company' value in the edit box in the form after cicking edit
		
	}
	public String getEditCity() {
		return getNewCity().getAttribute("city");
		//Find and return the 'city' value in the edit box in the form after cicking edit
	}
	public String getEditCountry() {
		return getNewCountry().getAttribute("country");
		//Find and return the 'country' value in the edit box in the form after cicking edit
	}
	public String getEditType() {
		return getNewType().getAttribute("type");
		//Find and return the 'type' value in the edit box in the form after cicking edit
	}	
	public void setUpdateFormValues(String nickname,String contact,String company,String city,String country,String type)
	{
		//Set form values to update and submit (by passing those values from 'main' method). 
		driver.findElement(By.id("add")).click();
		getNewNickName().sendKeys(nickname);
		getNewContact().sendKeys(contact);
		getNewCompany().sendKeys(company);
		getNewCity().sendKeys(city);
		getNewCountry().sendKeys(country);
		getNewType().sendKeys(type);
		driver.findElement(By.id("add")).click();
	}	
	public void deleteDetails() {
		//Find the SECOND row of address displayed and click the radio button
		//Find delete button and click to delete SECOND row
		driver.findElement(By.id("radio1")).click();
		driver.findElement(By.id("delete")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		AddressBook ab=new AddressBook();
		ab.createDriver();
		ab.setNewFormValues(" "," ", " "," ", " ", " ");
		Thread.sleep(2000);
		ab.getNewNickName();
		ab.getNewContact();
		ab.getNewCompany();
		ab.getNewCity();
		ab.getNewCountry();
		ab.getNewType();
		ab.editDetails();
		ab.getEditNickName();
		ab.getEditContact();
		ab.EditNewCompany();
		ab.getEditCity();
		ab.getEditCountry();
		ab.getEditType();
		ab.setUpdateFormValues("raj","raj", "tcs","chennai", "india", "self");
		Thread.sleep(2000);
		ab.deleteDetails();
	}
}
