package br.com.rsinet.hub_bdd.AdvantageMobileBDD.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.dataProviders.TimeDescription;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

public class TestRunner {

	public static String folderPath = System.getProperty("user.dir") + "/target/" + TimeDescription.horas();

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

	@BeforeClass
	public static void createPrintFolder() {
		File folderScreenshot = new File(folderPath);
		folderScreenshot.mkdir();
	}
}