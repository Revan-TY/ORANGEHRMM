package pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PimPage {
 private By addEmployee_Btn =By.xpath("//a[.='Add Employee']");
 private WebDriver driver;
 
 public PimPage(WebDriver driver) {
	 this.driver=driver;
}
 public void clickAddEmployeeBtn()
 {
	 driver.findElement(addEmployee_Btn).click();
 }
}
