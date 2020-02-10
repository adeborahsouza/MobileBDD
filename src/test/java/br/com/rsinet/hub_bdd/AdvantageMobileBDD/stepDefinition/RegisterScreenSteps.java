package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.HomeScreen;
import io.appium.java_client.android.AndroidDriver;

public class RegisterScreenSteps {

	private HomeScreen home;
	private AndroidDriver driver;
	private TestContext testContext;

	public RegisterScreenSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomeScreen();
	}

}
