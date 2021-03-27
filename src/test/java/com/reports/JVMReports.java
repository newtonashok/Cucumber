package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void generateReport(String jsonFile) {
		Configuration c = new Configuration(
				new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumbermar25\\src\\test\\resources\\report1"),
				"Cucumbermar25");
		c.addClassifications("Browser", "chrome");
		c.addClassifications("Browser", "89");
		c.addClassifications("sprint", "35");
		c.addClassifications("os", "windows");
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonfiles, c);
		builder.generateReports();
	}
}
