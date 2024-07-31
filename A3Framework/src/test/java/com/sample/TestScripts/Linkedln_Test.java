package com.sample.TestScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Linkedln_Test {
	 public void executeScript() {
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.linkedin.com/in/");
		 driver.close();
	 }

}
