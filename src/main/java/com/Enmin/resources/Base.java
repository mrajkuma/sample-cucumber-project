package com.Enmin.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base  {

    public static WebDriver driver;
    public Properties pro;
    public WebDriver invokeBrowser() throws IOException {

        this.loadDataPropertiesFile();
        String browserName = pro.getProperty("browser");
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Automation_Softwares\\Chromedrivers\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {
            System.getProperty("webdriver.gecko.driver",
                    "C:\\path to geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return driver;

    }
    public void loadDataPropertiesFile() throws IOException {
        pro = new Properties();
        FileInputStream fis = new FileInputStream(
                "data.properties");
        pro.load(fis);
    }
    public String getWebsiteName() throws IOException {
        this.loadDataPropertiesFile();
        String websiteName = pro.getProperty("url");
        return websiteName;
    }


}

