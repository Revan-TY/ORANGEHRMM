package pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	private By usn_tf =By.name("username");
	private By password_tf =By.name("password");
	private By sub_btn =By.xpath("//button[@type='submit' and .= ' Login ']");
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void enterUsername(String usn) {
		driver.findElement(usn_tf).sendKeys(usn);
	}
	
	public void enterpassword(String pass) {
		driver.findElement(password_tf).sendKeys(pass);
	}
	
	public void clicks() {
		driver.findElement(sub_btn).click();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	private By addEmployee=By.xpath("//a[.='Add Employee']");
	WebDriver driver;
	
	loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void clickAddEmployee() 
	{
		driver.findElement(addEmployee).click();

	}
}*/