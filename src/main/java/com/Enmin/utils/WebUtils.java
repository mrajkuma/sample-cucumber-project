package com.Enmin.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebUtils {
    WebDriver driver;
    public WebUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void robustClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

            }

    public void navigatepage(String header) {
        try {
           driver.findElement(By.xpath("//h2/*[text()='"+ header +"']"));
        }
        catch(Exception e) {
            driver.findElement(By.xpath("//h2[text()='"+ header +"']"));
        }
    }
}
