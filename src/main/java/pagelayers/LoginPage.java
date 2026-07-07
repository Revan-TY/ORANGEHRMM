package pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private By username_Tf = By.name("username");
	private By password_Tf = By.name("password");
	private By login_btn = By.xpath("//button[.=' Login ']");
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String username, String password) {
		driver.findElement(username_Tf).sendKeys(username);
		driver.findElement(password_Tf).sendKeys(password);
		driver.findElement(login_btn).click();
	}

}
