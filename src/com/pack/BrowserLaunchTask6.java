package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunchTask6 {
	//Perform Drag and Drop usinf Actions class
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		WebElement stringsrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement stringdest = driver.findElement(By.id("java-class"));
		Actions action = new Actions(driver);
		action.dragAndDrop(stringsrc, stringdest).perform();
		WebElement listsrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement listdest = driver.findElement(By.id("java-interface"));
		Actions action1 = new Actions(driver);
		action1.dragAndDrop(listsrc, listdest).perform();
		WebElement actionsrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement actiondest = driver.findElement(By.id("selenium-class"));
		Actions action2 = new Actions(driver);
		action2.dragAndDrop(actionsrc, actiondest).perform();
		WebElement webdriversrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement webdriverdest = driver.findElement(By.id("selenium-interface"));
		Actions action3 = new Actions(driver);
		action3.dragAndDrop(webdriversrc, webdriverdest).perform();
WebElement txt = driver.findElement(By.xpath("//a[@class='button button-green']"));
String string = txt.getText();
	System.out.println(string);
	}

}
