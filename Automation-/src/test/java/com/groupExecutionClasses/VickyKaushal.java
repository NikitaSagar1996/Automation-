package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VickyKaushal {
	@Test(groups = "Bollywood")
	public void executeScript(){
    WebDriver driver = new ChromeDriver();
	 Reporter.log("VK",true);
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com/vickykaushal09/?hl=en");
	}

}
