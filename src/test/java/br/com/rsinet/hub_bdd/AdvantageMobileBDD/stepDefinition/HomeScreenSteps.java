package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import org.junit.Assert;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.HomeScreen;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.ProductScreen;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.RegisterScreen;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreenSteps {

	private HomeScreen home;
	private ProductScreen product;
	private AndroidDriver driver;
	private TestContext testContext;

	public HomeScreenSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomeScreen();
	}

	@Dado("^que o usuario esteja na homepage$")
	public void que_o_usuario_esteja_na_homepage() {
//		home.clickLupa();
	}

	@Quando("^clicar em uma categoria$")
	public void clicar_em_uma_categoria() {
		home.clickCategoriaFone();

	}

	@Dado("^que o usuario esteja na pagina de cadastro$")
	public void que_o_usuario_esteja_na_pagina_cadastro() {
		home.clickMenuIcon();
		home.clickLoginIcon();
		home.clickRegisterIcon();
	}

	@Quando("^procurar por um produto valido$")
	public void procurar_por_um_produto_valido() {
		home.PesquisaValida();
		home.clickLupa();

	}

	@Quando("^procurar por um produto invalido$")
	public void procurar_por_um_produto_invalido() {
		home.PesquisaInvalida();
		home.clickLupa();

	}

	@Entao("^o registro e feito$")
	public void o_registro_e_feito() {
		home.clickMenuIcon();

		Assert.assertTrue(home.usuarioCad().isDisplayed());

	}

//	@Entao("^a pesquisa nao e feita$")
//	public void a_pesquisa_nao_e_feita() {

//
//	}

}
