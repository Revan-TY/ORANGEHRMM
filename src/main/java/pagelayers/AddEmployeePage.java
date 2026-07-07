package pagelayers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployeePage {

	private By firstName_tf = By.name("firstName");
	private By lastName_tf = By.name("lastName");
	private By save_btn = By.xpath("//button[@type='submit' and .=' Save ']");
	private By successMsg=By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']/p[2]");
	
	private WebDriver driver;

	public AddEmployeePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public Boolean verifySuccessMessage()
	{
		return new WebDriverWait(driver,Duration.ofSeconds(10))
				.until(ExpectedConditions.textToBePresentInElement
			(driver.findElement(successMsg),"Successfully Saved"));
	}

	public void addEmployee(String firstname, String lastname) throws InterruptedException {
		driver.findElement(firstName_tf).sendKeys(firstname);
		driver.findElement(lastName_tf).sendKeys(lastname);
		Thread.sleep(2000);
		driver.findElement(save_btn).click();
	}
}
