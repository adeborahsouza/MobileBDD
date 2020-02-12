package br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers;

import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.HomeScreen;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.ProductScreen;
import br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects.RegisterScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PageObjectManager {
	private AndroidDriver driver;
	private HomeScreen home;
	private RegisterScreen register;
	private ProductScreen product;

	public PageObjectManager(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public HomeScreen getHomeScreen() {
		return (home == null) ? home = new HomeScreen(driver) : home;
	}

	public RegisterScreen getRegisterScreen() {
		return (register == null) ? register = new RegisterScreen(driver) : register;
	}

	public ProductScreen getProductScreen() {
		return (product == null) ? product = new ProductScreen(driver) : product;
	}

}