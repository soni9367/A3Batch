package com.sample.TestScripts;

import org.testng.annotations.Test;

public class Monster_Test {

	@Test
	 public void executeScript() {
		 System.out.println("hello");
		 String browsername = System.getProperty("bname");
		 System.out.println(browsername);
		 
		 String username = System.getProperty("user");
		 System.out.println(username);
		 
		 
}
}
