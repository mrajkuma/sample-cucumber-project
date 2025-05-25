package com.Enmin.stepDefinitions;

import com.Enmin.resources.Base;
import io.cucumber.java.After;

public class Hooks extends Base{
	
	@After()
	public void AfterEveryScenario() {
		driver.close();
	}

}
