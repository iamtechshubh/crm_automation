package com.crm.utils;

import com.crm.base.TestBase;

public class TestUtils extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
}
