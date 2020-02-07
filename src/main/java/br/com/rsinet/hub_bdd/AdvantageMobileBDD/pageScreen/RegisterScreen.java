package br.com.rsinet.hub_bdd.AdvantageMobileBDD.pageScreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.classfile.Dependencies.ClassFileReader;

public class RegisterScreen {
	WebDriver driver;
	ClassFileReader ConfigFile;

	public RegisterScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_Username;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_Email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_Password;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_ConfPassword;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_FirstName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement bx_LastName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_PhoneNumber;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountries")
	private WebElement bx_country;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_State;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement bx_Adress;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement bx_City;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement bx_Cep;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement btn_ConfRegister;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxAgreeConditions")
	private WebElement bx_Agree;

	public void enter_Username(String user) {
		bx_Username.sendKeys(user);
	}

	public void enter_Email(String email) {
		bx_Email.sendKeys(email);
	}

	public void enter_Password(String password) {
		bx_Password.sendKeys(password);
	}

	public void enter_ConfPasswordString(String confpassword) {
		bx_ConfPassword.sendKeys(confpassword);
	}

	public void enter_FirstName(String firstname) {
		bx_FirstName.sendKeys(firstname);
	}

	public void enter_LastName(String lastname) {
		bx_LastName.sendKeys(lastname);
	}

	public void enter_PhoneNumber(String phonenumber) {
		bx_PhoneNumber.sendKeys(phonenumber);
	}

	public void select_Country(String country) {
		Select selectCountry = new Select(bx_country);
		selectCountry.selectByVisibleText(country);
	}

	public void enter_State(String state) {
		bx_State.sendKeys(state);
	}

	public void enter_Adress(String adress) {
		bx_Adress.sendKeys(adress);
	}

	public void enter_City(String city) {
		bx_City.sendKeys(city);
	}

	public void enter_Cep(String cep) {
		bx_Cep.sendKeys(cep);
	}

	public void click_ConfRegister() {
		btn_ConfRegister.click();
	}

	public void clickAgree() {
		bx_Agree.click();
	}

	public void preencher_campos_sucesso() {
		enter_Username("hannahmontana");
		enter_Email("adeborahsouza@gmail.com");
		enter_Password("68335740Bf");
		enter_ConfPasswordString("68335740Bf");
		enter_FirstName("Deborah");
		enter_LastName("Souza");
		enter_PhoneNumber("11984193082");
		select_Country("Brazil");
		enter_City("Osasco");
		enter_Adress("Rua Joaquim Rodrigues, 24");
		enter_City("São Paulo");
		enter_Cep("06240-122");
	}

	public void preencher_campos_falha() {
		enter_Username("hannahmontana");
		enter_Email("adeborahsouza@gmail.com");
		enter_Password("68335740Bf");
		enter_ConfPasswordString("68335740Bf");
		enter_FirstName("Deborah");
		enter_LastName("Souza");
		enter_PhoneNumber("11984193082");
		select_Country("Brazil");
		enter_City("Osasco");
		enter_Adress("Rua Joaquim Rodrigues, 24");
		enter_City("São Paulo");
		enter_Cep("06240-122");
	}

}