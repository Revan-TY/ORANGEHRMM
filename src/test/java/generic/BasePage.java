package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagelayers.AddEmployeePage;
import pagelayers.DashboardPage;
import pagelayers.LoginPage;
import pagelayers.PimPage;

public class BasePage {
	public WebDriver driver;
	public DashboardPage dp;
	public PimPage pim;
	public AddEmployeePage aep;

	@BeforeMethod
	public void setUp() throws IOException {
		driver = BrowserConfig.launchBrowser(ReadProperty.getProperty("browser"));
		driver.manage().window().maximize();
		driver.get(ReadProperty.getProperty("testUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
		pim = new PimPage(driver);
		aep = new AddEmployeePage(driver);
	lp.login(ReadProperty.getProperty("testUsn"), ReadProperty.getProperty("testPsw"));

	}

	@AfterMethod
	public void tearDown() {
		dp.clickProfileOption();
		dp.clickLogout();
		driver.quit();
	}

}
