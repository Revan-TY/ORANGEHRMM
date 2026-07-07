package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;

public class AddEmployeeTest extends BasePage {

	@Test
	public void addEmployee() throws InterruptedException {
		dp.clickPim();
		pim.clickAddEmployeeBtn();
		aep.addEmployee("admin", "admin123");
		Assert.assertTrue(aep.verifySuccessMessage());
		Reporter.log("Successfully Saved", true);
	}

}
