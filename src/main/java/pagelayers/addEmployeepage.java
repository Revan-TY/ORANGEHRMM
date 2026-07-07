package pagelayers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addEmployeepage {
	
	
	private By Fn_tf =By.name("firstName");
	private By ln_tf =By.name("lastName");
	private By save_btn =By.xpath("//button[@type='submit' and .=' Save ']");
	private WebDriver driver;
	
	public addEmployeepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void enterEverything (String F_name, String l_name) {
		driver.findElement(Fn_tf).sendKeys(F_name);
		driver.findElement(ln_tf).sendKeys(l_name);
		driver.findElement(save_btn).click();
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	private By usn_tf =By.name("username");
	private By password_tf =By.name("password");
	private By sub_btn =By.xpath("//button[@type='submit' and .= ' Login ']");
	WebDriver driver;
	
	addEmployeepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void enterUsername(String usn) {
		driver.findElement(usn_tf).sendKeys(usn);
	}
	
	public void enterpassword(String pass) {
		driver.findElement(password_tf).sendKeys(pass);
	}
	
	public void click() {
		driver.findElement(sub_btn).click();
	}
	
}
*/