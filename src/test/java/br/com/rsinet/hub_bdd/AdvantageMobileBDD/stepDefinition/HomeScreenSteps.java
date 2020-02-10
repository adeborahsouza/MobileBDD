package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.HomeScreen;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreenSteps {

	private HomeScreen home;
	private AndroidDriver driver;
	private TestContext testContext;

	public HomeScreenSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomeScreen();
	}

	@Dado("^home$")
	public void home() {

	}

	@Quando("^ir para a pagina de cadastro$")
	public void ir_para_a_pagina_de_cadastro() {
		home.clickLoginIcon();
		home.clickRegisterIcon();
	}

}
