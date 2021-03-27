package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.JVMReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {
		"com.AdactinBaseStepdefinition" }, monochrome = true, dryRun = false, plugin = {
				"json:C:\\Users\\Admin\\eclipse-workspace\\Cucumbermar25\\src\\test\\resources\\report1\\srep.json" })

public class RunnerClassAdactinBase {
	@AfterClass
	public static void getReport() {
		JVMReports.generateReport(
				"C:\\Users\\Admin\\eclipse-workspace\\Cucumbermar25\\src\\test\\resources\\report1\\srep.json");

	}
}
