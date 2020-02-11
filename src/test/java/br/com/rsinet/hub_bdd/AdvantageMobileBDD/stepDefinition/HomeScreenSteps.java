package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.HomeScreen;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.ProductScreen;
import cucumber.api.PendingException;
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
	}

	@Quando("^procurar por um produto valido$")
	public void procurar_por_um_produto_valido() {
		home.PesquisaValida();
		home.clickLupa();

	}

	@Entao("^a pesquisa e feita$")
	public void a_pesquisa_e_feita() {
		product.Notebook();

	}

	@Quando("^procurar por um produto invalido$")
	public void procurar_por_um_produto_invalido() {
		home.PesquisaInvalida();
		home.clickLupa();

	}

	@Entao("^a pesquisa nao e feita$")
	public void a_pesquisa_nao_e_feita() {
		product.noResults();

	}

}
