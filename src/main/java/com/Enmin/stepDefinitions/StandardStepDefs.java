package com.Enmin.stepDefinitions;

import com.Enmin.resources.Base;
import com.Enmin.utils.WebUtils;
import com.Enmin.functions.fieldFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class StandardStepDefs extends Base
{
    fieldFunctions ff = new fieldFunctions(driver);
    WebUtils wu = new WebUtils(driver);

    @And("I click the {string} button")
    public void iClickTheButton(String name) throws InterruptedException {
        try {
            driver.findElement(By.xpath("//button[contains(text(), '" + name + "')]")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("//a[contains(text(), '" + name + "')]")).click();
        }
    }

    @Then("I am taken to {string} page")
    public void iAmTakenToPage(String header) throws InterruptedException {

        wu.navigatepage(header);
        Thread.sleep(2000);
    }

    @And("I input value {string} for {string} field {string}")
    public void iInputValueForField(String value, String fieldType, String field) {
            ff.inputvalue(value, fieldType, field);
    }

    @And("I verify field {string} of type {string} has value {string}")
    public void iVerifyFieldOfTypeHasValue(String field, String fieldType, String value) {
        ff.verifyvalue(field, fieldType, value);
    }

    @And("I select value {string} for {string} field {string};")
    public void iSelectValueForField(String value, String fieldType, String field) {
        ff.selectvalue(value,fieldType,field);
    }

    @And("I verify hidden field {string} of type {string} has value {string}")
    public void iVerifyHiddenFieldOfTypeHasValue(String field, String fieldType, String value) {
        ff.verifyhiddenvalue(field, fieldType, value);
    }
}
