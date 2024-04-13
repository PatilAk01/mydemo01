package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.firefox.driver","C:\\Users\\MAHI COM\\Desktop\\today\\geckodriver\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.amazon.in/");
      driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("ap_email")).sendKeys("7709972113");
      Thread.sleep(1000);
      driver.findElement(By.id("continue")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("ap_password")).sendKeys("Patil@01");
      Thread.sleep(1000);
      driver.findElement(By.id("signInSubmit")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
      driver.findElement(By.id("nav-search-submit-button")).click();
      
      
      
	}

}

