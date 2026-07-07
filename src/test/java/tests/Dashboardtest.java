package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;

public class Dashboardtest extends BasePage {

	@Test
	public void verifyDashboard() {
		Assert.assertTrue(dp.checkDashboardHeaderIsdisplayed());
		Reporter.log("verified dashboard", true);
		

	}
}
