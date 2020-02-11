package br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductScreen {
	WebDriver driver;

	public ProductScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]")
	private WebElement prodFone;

	@FindBy(how = How.XPATH, using = "com.Advantage.aShopping:id/imageViewProduct")
	private WebElement prodNotebook;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement produtosTitle;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement noResults;

	public void Fone() {
		prodFone.click();
	}

	public void prodTitle() {
		produtosTitle.click();
	}

	public void noResults() {
		noResults.click();
	}
}
