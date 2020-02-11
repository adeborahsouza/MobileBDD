package br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {
	WebDriver driver;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement btn_menuIcon;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement btn_loginIcon;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement btn_registerIcon;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")
	private WebElement btn_categoriaFone;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement bxPesquisa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement bxLupa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement usuario_Cad;

	public void clickMenuIcon() {
		btn_menuIcon.click();
	}

	public void clickLoginIcon() {
		btn_loginIcon.click();
	}

	public void clickRegisterIcon() {
		btn_registerIcon.click();
	}

	public void clickCategoriaFone() {
		btn_categoriaFone.click();
	}

	public void PesquisaValida() {
		bxPesquisa.click();
		bxPesquisa.sendKeys("Headphones");
	}

	public void PesquisaInvalida() {
		bxPesquisa.click();
		bxPesquisa.sendKeys("televisao");
	}

	public void clickLupa() {
		bxLupa.click();
	}

	public void clickUsuarioCad() {
		usuario_Cad.click();
	}
}
