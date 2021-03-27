package com.AdactinBaseStepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal {
	@Before
	public void beforeScenario() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
	}

	@After
	public void afterScenario(Scenario scenario) {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		byte[] b = screenShot.getScreenshotAs(OutputType.BYTES);
		scenario.embed(b, "img/pass");
		closeAllwindows();
	}
}
