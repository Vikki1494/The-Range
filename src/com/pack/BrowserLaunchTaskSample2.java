package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunchTaskSample2 {
//Perform Right click
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		WebElement element = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}
}
