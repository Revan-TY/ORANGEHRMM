package pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	private By pim_btn = By.xpath("//span[.='PIM']");
	private By profileOptions = By.xpath("//span[@class='oxd-userdropdown-tab']");
	private By logout_btn = By.xpath("//a[.='Logout']");
	private By dashboardHeader = By.xpath("//h6[.='Dashboard']");
	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPim() {
		driver.findElement(pim_btn).click();
	}

	public void clickProfileOption() {
		driver.findElement(profileOptions).click();
	}

	public void clickLogout() {
		driver.findElement(logout_btn).click();
	}

	public boolean checkDashboardHeaderIsdisplayed()
	{
		return driver.findElement(dashboardHeader).isDisplayed();
	}
}
