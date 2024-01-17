package com.alaqahtml5.qa.base;

public class TestUtilities extends BaseTest{

	
	// Static sleep
	protected void sleep(long millis) {
	try {
		Thread.sleep(millis);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
}
}