package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun {
	@Test(groups = {"TFI","PanIndia"})
	public void executeScript(){
    Reporter.log("AA",true);
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com/alluarjunonliine_/?hl=en");
	 driver.quit();
	}


}
