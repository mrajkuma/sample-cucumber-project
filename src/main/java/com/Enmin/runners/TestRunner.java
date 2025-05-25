package com.Enmin.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/com/Enmin/features",
		glue = "com/Enmin/stepDefinitions", stepNotifications = true, tags="@automationexcercisetests",
		plugin = {"html:target/cucumber.html", "json:target/cucmber.json", "junit:target/cukes.xml"}
		)

public class TestRunner {

private static String[] defaultOptions = {

		"--plugin", "pretty",
		"--plugin", "json:target/cucumber.json",
		"--plugin", "html:target/cucumber.html",
		"--plugin", "rerun:rerun.txt"



};

}