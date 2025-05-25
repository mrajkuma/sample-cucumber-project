package com.Enmin.stepDefinitions;

import com.Enmin.pages.HomePage;
import com.Enmin.pages.LoginPage;
import com.Enmin.resources.Base;
import com.Enmin.utils.WebUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginStepdefs extends Base {
    LoginPage   lp;
    HomePage    hp;
    WebUtils    wu;

    @Given("I launch the browser")
    public void iLaunchTheBrowser() throws Throwable {
        this.invokeBrowser();
        lp = new LoginPage(driver);
        hp = new HomePage(driver);
        wu = new WebUtils(driver);

    }

    @And("Navigate to provided url")
    public void navigateToProvidedUrl() throws IOException {
        driver.get(getWebsiteName());

    }

    @Then("I load the url successfully")
    public void iLoadTheUrlSuccessfully() throws InterruptedException {
        //driver.findElement(By.xpath("//title[contains(text(),'Automation Exercise')]"));
        driver.getTitle().contains("Automation Exercise");
        driver.findElement(By.xpath("//p[contains(text(),'Consent')]")).click();
        Thread.sleep(3000);
    }

    @Given("I click on {string} link in header section")
    public void iClickOnLinkInHeaderSection(String arg0) {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(), '"+ arg0 +"')]"));
        wu.robustClick(element);

    }

    @Then("I am taken to the signup page")
    public void iAmTakenToTheSignupPage() {
        lp.getPageElement(lp.signupPage).isDisplayed();
    }


    @When("I enter name as {string} and email address as {string}")
    public void iEnterNameAsAndEmailAddressAs(String name, String email) {
        driver.findElement(lp.signupName).sendKeys(name);
        driver.findElement(lp.signupEmail).sendKeys(email);
    }
}
