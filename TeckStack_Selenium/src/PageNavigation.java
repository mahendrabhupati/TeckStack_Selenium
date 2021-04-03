import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class PageNavigation extends DriverSetup
{
	static String page1, page2,page3,page4,page5;
	static WebDriver driver;
	static String baseUrl= "https://www.selenium.dev/";
	public static WebDriver setupDriver()
	{
		driver = getWebDriver();
		return driver;	    
	}
	public static void navigate1() 
	{
	    /*Replace this comment by the code statement to navigate to baseUrl */
		driver.navigate().to(baseUrl);
	    
	}
	public static void getPageTitle1()
	{
	    /*Replace this comment by the code statement to get page title of  "https://selenium.dev/"*/
	    /* Assign the page title to variable 'page1' */
		page1= driver.getTitle();
	    
	}
	public static void navigate2()
	{
	    /*Replace this comment by the code statement to navigate to https://www.google.co.in/ */
		driver.navigate().to("https://www.google.co.in/");
        
	}
	public static void getPageTitle2()
	{
	    /*Replace this comment by the code statement to get page title of  https://www.google.co.in/ */
	    /* Assign the page title to variable 'page2' */
		page2=driver.getTitle();
        
	}
	public static void navigateBack()
	{
	    /*Replace this comment by the code statement to navigate back */
		driver.navigate().back();
       
	}
	public static void getPageTitle3()
	{
	    /*Replace this comment by the code statement to get page title of backed page */
	    /* Assign the page title to variable 'page3' */
		page3 = driver.getTitle();
        
	}
	public static void navigateForward()
	{
	    /*Replace this comment by the code statement to navigate forward */
		driver.navigate().forward();
        
	}
	public static void getPageTitle4()
	{
	    /*Replace this comment by the code statement to get page title of the forwarded page */
	    /* Assign the page title to variable 'page4' */
		page4 = driver.getTitle();
        
	}
	public static void refreshPage()
	{
	    /*Replace this comment by the code statement to refresh the page */
		driver.navigate().refresh();
       
	}
	public static void getPageTitle5()
	{
	    /*Replace this comment by the code statement to get page title of refreshed page */
	    /* Assign the page title to variable 'page5' */
		page5 = driver.getTitle();
        
	}

	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    setupDriver();
	    navigate1();
	    getPageTitle1();
	    navigate2();
	    getPageTitle2();
	    navigateBack();
	    getPageTitle3();
	    navigateForward();
	    getPageTitle4();
	    refreshPage();
	    getPageTitle5();
	}

}

