package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import org.apache.commons.math3.stat.descriptive.summary.Product;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.HomeScreen;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.ProductScreen;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class ProductScreenSteps {

	private HomeScreen home;
	private ProductScreen product;
	private AndroidDriver driver;
	private TestContext testContext;

	public ProductScreenSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomeScreen();
	}

	@Quando("^clicar em uma categoria valida$")
	public void clicar_em_uma_categoria_valida() {
		home.clickCategoriaFone();

	}

	@Entao("^a pesquisa e feita$")
	public void a_pesquisa_e_feita() {
		product.Fone();

	}

	@Quando("^clicar em uma categoria invalida$")
	public void clicar_em_uma_categoria_invalida() {

	}

	@Entao("^a pesquisa n e feita$")
	public void a_pesquisa_n_e_feita() {

	}

}
