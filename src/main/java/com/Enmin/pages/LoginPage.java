package com.Enmin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {
    WebDriver driver;
    public By signupPage = By.xpath("//h2[contains(text(), 'New User Signup!')]");
    public By signupName = By.xpath("//input[@type='text' and @data-qa='signup-name']");
    public By signupEmail = By.xpath("//input[@type='email' and @data-qa='signup-email']");
    public By titleMr   = By.xpath("//input[@type='radio' and @value = 'Mr']");
    public By titleMrs   = By.xpath("//input[@type='radio' and @value = 'Mrs']");
    public By eaiName = By.xpath("//input[@type='text' and @data-qa='name']");
    public By eaiEmail = By.xpath("//input[@type='text' and @data-qa='email']");
    public By eaiPassword = By.xpath("//input[@type='password' and @data-qa='password']");
    public By eaiDays = By.xpath("//select[@data-qa='days']");
    public By eaiMonths = By.xpath("//select[@data-qa='months']");
    public By eaiYears = By.xpath("//select[@data-qa='years']");
    public By eaiNews = By.xpath("//input[@type='checkbox' and @id='newsletter']");
    public By eaiOptin = By.xpath("//input[@type='checkbox' and @id='optin']");
    public By eaiFirstName = By.xpath("//input[@type='text' and @data-qa='first_name']");
    public By eaiLastName = By.xpath("//input[@type='text' and @data-qa='last_name']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getPageElement(By element) {
        return driver.findElement(element);
    }
    //multiple elements method
    public List<WebElement> getMultiplePageElement(By element) {
        return driver.findElements(element);
    }

}
