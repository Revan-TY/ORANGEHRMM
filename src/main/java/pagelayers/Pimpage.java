package pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pimpage {
	
	private By addEmployee=By.xpath("//a[.='Add Employee']");
	private WebDriver driver;
	
	 public Pimpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void clickAddEmployee() 
	{
		driver.findElement(addEmployee).click();

	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

