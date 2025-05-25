package com.Enmin.functions;

import com.Enmin.utils.WebUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class fieldFunctions {
    WebDriver driver;
    WebUtils wu = new WebUtils(driver);
    public fieldFunctions(WebDriver driver) {
        this.driver = driver;
    }


    public void inputvalue(String value, String fieldType, String field) {
        if (Objects.equals(fieldType, "radio")) {
            WebElement el = driver.findElement(By.xpath("//label[text()='" + field + "']/following-sibling::div/descendant::input[@type='" + fieldType + "' and @value='" + value + "']"));
            el.click();
        }
        else if (Objects.equals(fieldType, "checkbox")){
            WebElement el = driver.findElement(By.xpath("//div[@class='"+fieldType+"']//descendant::label[text()='"+field+"']//preceding::input[1]"));
            el.click();
        }
            else {
                WebElement el = driver.findElement(By.xpath("//label[text()='" + field + "']/following-sibling::input[@type='" + fieldType + "']"));
                el.sendKeys(value);

        }
    }

    public void verifyvalue(String field, String fieldType, String value1) {
        WebElement el = driver.findElement(By.xpath("//label[text()='"+field+"']/following-sibling::input[@type='"+fieldType+"' and @value='"+value1+"']"));
        String actual_value = el.getAttribute("value");
        Assert.assertEquals(actual_value,value1);
    }

    public void selectvalue(String value, String fieldType, String field) {
        WebElement el = driver.findElement(By.xpath("//select/option[text()='"+field+"']//parent::select"));
        Select dropdown = new Select(el);
        dropdown.selectByValue(value);
    }

    public void verifyhiddenvalue(String field, String fieldType, String value1) {
        WebElement el = driver.findElement(By.xpath("//label[text()='"+field+"']/following-sibling::input[@type='"+fieldType+"' and @value='"+value1+"']/following-sibling::input[@type='hidden']"));
        String actual_value = el.getAttribute("value");
        Assert.assertEquals(actual_value,value1);
    }
}
