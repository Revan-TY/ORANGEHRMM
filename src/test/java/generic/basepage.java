package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagelayers.DashboardPage;
import pagelayers.Pimpage;
import pagelayers.addEmployeepage;
import pagelayers.loginpage;

public class basepage {
	public loginpage p;
	public WebDriver driver;
	public DashboardPage d;
	public Pimpage page;
	public addEmployeepage a;
	public propertyPage pp;

	@BeforeMethod
	public void setup() throws IOException
	{
		pp = new propertyPage(); 
	  driver= browserclass.Browsercall(pp.getproperty("browser"));
		driver.manage().window().maximize();
		
		
		driver.get(pp.getproperty("url"));//object created in same line
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 p=new loginpage(driver);
		
		p.enterUsername(pp.getproperty("username"));
		p.enterpassword(pp.getproperty("password"));
		p.clicks();
		
		
		d=new DashboardPage(driver);
		
		page=new Pimpage(driver);
		
		
		a=new addEmployeepage(driver);
		
		
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		d.clickProfileOption();
		d.clickLogout();
		driver.quit();
		
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

