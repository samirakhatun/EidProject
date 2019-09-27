package com.practice;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDowm {
	
	public static void main(String[]args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",".Driver/chromedrive");
	
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Select slt=new Select (driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
	slt.deselectByVisibleText("Amazon Fresh");
	WebElement fresh=slt.getFirstSelectedOption();
	System.out.println(fresh);
	
	List<WebElement>list=slt.getOptions();
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		//jjjjj
	}
		

	}

}
