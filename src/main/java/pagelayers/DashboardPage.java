package pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	
		private By PIM =By.xpath("//span[.='PIM']");
		private By profile=By.xpath("//p[@class='oxd-userdropdown-name']");
		private By logout_btn=By.xpath("//a[.='Logout']");
		private By dashboard=By.xpath("(//span[.='Dashboard'])[2]");
		private WebDriver driver;
		
		public DashboardPage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		public void clickpim() {
			driver.findElement(PIM).click();
		}
		
		public void clickProfileOption() {
			driver.findElement(profile).click();
		}
		public void clickLogout() {
			driver.findElement(logout_btn).click();
		}
		
		public boolean verifyDashboard()
		{
			return driver.findElement(dashboard).isDisplayed();
		}

}


