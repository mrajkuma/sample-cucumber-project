package com.Enmin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
	// Not used in this project. But is a placeholder in case POM based implementation is required.
	public By companyName;
	WebDriver driver;
	//common base path
	String buyingItemInfoHomePageBasePath = "//div[@class=\"cart-info\"]";
	String cartAreaBasePath = "//div[@class=\"cart-preview active\"]";
	String productQuantityManageBasePath = "//div[@class=\"stepper-input\"]";
	//page header elements
	public By HomePageLink = By.xpath("//a[text()=\" Home\"]']");
	public By searchBox = By.xpath("//input[@type='search']");
	public By searchButton = By.className("search-button");

	
	//constructor method
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	//common method
	public WebElement getPageElement(By element) {
		return driver.findElement(element);
	}
	//multiple elements method
	public List<WebElement> getMultiplePageElement(By element) {
		return driver.findElements(element);
	}
}
