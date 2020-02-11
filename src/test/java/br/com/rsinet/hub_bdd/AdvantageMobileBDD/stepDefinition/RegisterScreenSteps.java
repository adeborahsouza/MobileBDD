package br.com.rsinet.hub_bdd.AdvantageMobileBDD.stepDefinition;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers.TestContext;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.RegisterScreen;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class RegisterScreenSteps {

	private RegisterScreen register;
	private AndroidDriver driver;
	private TestContext testContext;

	public RegisterScreenSteps(TestContext context) {
		testContext = context;
		register = testContext.getPageObjectManager().getRegisterScreen();
	}

	@Quando("^preencher os dados corretamente$")
	public void preencher_os_dados_corretamente() {
		register.enter_Username(user);
		register.enter_Email(email);
		register.enter_Password(password);
		register.enter_ConfPassword(confPassword);
		register.enter_FirstName(firstname);
		register.enter_LastName(lastname);
		register.enter_PhoneNumber(phonenumber);
		register.scrollDown();
		register.select_Country(country);
		register.enter_State(state);
		register.enter_Adress(adress);
		register.enter_City(city);
		register.enter_Cep(cep);
		register.click_ConfRegister();
	}

	@Entao("^o registro e feito$")
	public void o_registro_e_feito() {
		register.click_ConfRegister();

	}

	@Entao("^o registro nao e feito$")
	public void o_registro_nao_e_feito() {
		register.clickAgree();
		register.click_ConfRegister();

	}

	@Quando("^preencher os dados incorretamente$")
	public void preencher_os_dados_incorretamente() {
		register.enter_Username(user);
		register.enter_Email(email);
		register.enter_Password(password);
		register.enter_ConfPassword(confPassword);
		register.enter_FirstName(firstname);
		register.enter_LastName(lastname);
		register.select_Country(country);
		register.enter_State(state);
		register.enter_Adress(adress);
		register.enter_City(city);
		register.enter_Cep(cep);

	}

	String user = "adeborahsouza";
	String email = "adeborahsouza@gmail.com";
	String password = "68335740Bf";
	String confPassword = "68335740Bf";
	String firstname = "deborah";
	String lastname = " souza";
	String phonenumber = "11984193082";
	String country = "Brazil";
	String state = "São Paulo";
	String adress = "Rua Joaquim Rodrigues";
	String city = "Osasco";
	String cep = "06240-122";
}
