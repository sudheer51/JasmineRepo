package org.toolsqa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	
	@BeforeClass
	public void login()
	{
		System.out.println("Adding changes for bug 1234");
	}
	@AfterClass
	public void logout()
	{
		
	}
	@Test
	public void search()
	{

	}
	@Test
	public void validateSearchDetails()
	{


	}
	@Test
	public void searchPageTitle()
	{

	}
}
