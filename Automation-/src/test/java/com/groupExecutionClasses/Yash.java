package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash {
	@Test(groups = "Bollywood")
	public void executeScript(){
    WebDriver driver = new ChromeDriver();
	 Reporter.log("Yash",true);
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com/thenameisyash/?hl=en");
	}

}
