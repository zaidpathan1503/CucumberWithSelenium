package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;	

public class Steps {
	
	WebDriver driver;		
	@Given("^Open the Chrome and launch the application$")
	public void openTheChromeAndLaunchTheApplication() throws Throwable {
	       System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://demo.guru99.com/v4");	
	}	
	
/*    @Given("^Open the chrome and launch the application$")					
    public void open_the_chrome_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }	*/	

    @When("^Enter the Username (.+) and Password (.+)$")
	//@When("^Enter the Username \\\"User1\\\" and Password \\\"password1\\\"$")
    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
    {		
        System.out.println(username + " " + password);
    	driver.findElement(By.name("uid")).sendKeys(username);					
        driver.findElement(By.name("password")).sendKeys(password);						
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();	
       driver.quit();
    }
}