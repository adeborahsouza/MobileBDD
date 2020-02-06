package br.com.rsinet.hub_bdd.AdvantageMobileBDD.managers;

public class PageObjectManager {
	private WebDriver driver;
	private HomeScreen home;

	public PageObjectManager(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public HomeScreen getHomeScreen() {
		return (home == null) ? home = new HomeScreen(driver) : home;
	}

}