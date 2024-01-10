package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement frstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		frstname.click();
		frstname.sendKeys("vignesh Kumar");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.click();
		lastname.sendKeys("Kumar");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.click();
		address.sendKeys("Rajan Street , Tirupattur");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.click();
		email.sendKeys("vignesh.kumar1494@gmail.com");

		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.click();
		phone.sendKeys("952841235");
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@type='radio'][1]"));
		radiobtn.click();
		
		WebElement chkbox = driver.findElement(By.id("checkbox1"));
		chkbox.click();
	
		WebElement password1 = driver.findElement(By.id("firstpassword"));
		password1.sendKeys("vicky");
		WebElement password2 = driver.findElement(By.id("secondpassword"));
		password2.sendKeys("vicky");
		
		
		
		
	}
}