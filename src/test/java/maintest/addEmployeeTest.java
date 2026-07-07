package maintest;

import org.testng.annotations.Test;

import generic.basepage;

public class addEmployeeTest extends basepage{
	@Test	
	public void test() {
		d.clickpim();
		page.clickAddEmployee();
		a.enterEverything("shreyas", "devadiga");
		
		
		System.out.println("tc1");
		
	}
	

}
