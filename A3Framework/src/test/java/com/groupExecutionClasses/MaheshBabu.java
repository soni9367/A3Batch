package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MaheshBabu {
	@Test(groups= {"TFI"})
	public void executionScript(){
	Reporter.log("Allu",true);
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/alluarjunonline/");
	driver.quit();
	}

}
