package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import org.junit.Assert;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.HomeScreen;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.ProductScreen;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class ProductScreenSteps {

	private ProductScreen product;
	private AndroidDriver driver;
	private TestContext testContext;

	public ProductScreenSteps(TestContext context) {
		testContext = context;
		product = testContext.getPageObjectManager().getProductScreen();
	}

	@Entao("^a pesquisa e feita$")
	public void a_pesquisa_e_feita() {
		product.clickProduto();
		Assert.assertTrue(product.produtosTitle().getText().contains("BEATS"));

	}

	@Entao("^a pesquisa e realizada$")
	public void a_pesquisa_e_realizada() {
		Assert.assertTrue(product.produtosTitle().getText().contains("BEATS"));
	}

	@E("^escolher filtros invalidos$")
	public void escolher_filtros_invalidos() {
		product.clickFilter();
		product.clickCompatibility();
		product.clickCompOptions();
		product.clickCompatibility();
		product.clickConector();
		product.clickConectorOptions();
		product.clickColor();
		product.clickColorOptions();

	}

	@Entao("^a pesquisa nao e feita$")
	public void a_pesquisa_nao_e_feita() {
		Assert.assertTrue(product.noResults().getText().contains("No results"));

	}

	@Entao("^a pesquisa n e feita$")
	public void a_pesquisa_n_e_feita() {
		product.clickApply();
		Assert.assertTrue(product.noResults().getText().contains("No results"));

	}

}