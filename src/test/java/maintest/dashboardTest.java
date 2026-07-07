package maintest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.basepage;

public class dashboardTest extends basepage {
	@Test
	public void checkDashboard()
	{
		
		Assert.assertTrue(d.verifyDashboard());
		Reporter.log("verified",true);
	}
	

}
