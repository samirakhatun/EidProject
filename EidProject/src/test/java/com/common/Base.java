package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
public WebDriver driver;

public WebDriver getdriver() {
	
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
return driver;

}//kkkkkk

}
