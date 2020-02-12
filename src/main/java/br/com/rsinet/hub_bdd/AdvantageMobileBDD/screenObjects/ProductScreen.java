package br.com.rsinet.hub_bdd.AdvantageMobileBDD.screenObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;

public class ProductScreen {
	private AndroidDriver driver;
	static TouchAction action;

	public ProductScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "com.Advantage.aShopping:id/imageViewProduct")
	private WebElement prodNotebook;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement produtosTitle;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement noResults;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewFilter")
	private WebElement filter;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bx_compatibility;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement comp_option;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bx_conector;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement conector_option;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement bx_color;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.View[2]")
	private WebElement color_option;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement bx_apply;

	public void clickProduto() {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "BEATS" + "\").instance(0))")
				.click();
	}

	public void prodTitle() {
		produtosTitle.click();
	}

	public void clickFilter() {
		action = new TouchAction(driver);

		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).perform();
		filter.click();
	}

	public void clickCompatibility() {
		bx_compatibility.click();
	}

	public void clickCompOptions() {
		comp_option.click();
	}

	public void clickConector() {
		bx_conector.click();
	}

	public void clickConectorOptions() {
		conector_option.click();
	}

	public void clickColor() {
		bx_color.click();
	}

	public void clickColorOptions() {
		color_option.click();
	}

	public void clickApply() {
		bx_apply.click();
	}

	public WebElement noResults() {
		return noResults;
	}

	public WebElement produtosTitle() {
		return produtosTitle;
	}

}
