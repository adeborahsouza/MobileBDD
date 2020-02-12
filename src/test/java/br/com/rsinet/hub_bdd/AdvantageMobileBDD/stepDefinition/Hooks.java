package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.dataProviders.TimeDescription;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.DriverManager;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
	AndroidDriver driver;
	TestContext testContext;
	DriverManager manager;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getDriverManager();
		driver = manager.getDriver();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {

		File screenshot = ((TakesScreenshot) manager.getDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + scenario.getName()
				+ "-" + TimeDescription.horas() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
			Reporter.addScreenCaptureFromPath(caminho.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getDriverManager().closeDriver();
	}

}