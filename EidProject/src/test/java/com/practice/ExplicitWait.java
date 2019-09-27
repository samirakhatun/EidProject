package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("")));     
		
	}

}
