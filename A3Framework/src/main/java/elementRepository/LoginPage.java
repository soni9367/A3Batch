package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
    }
	@FindBy(id="Email")
	private WebElement emailTextBox;
	
	@FindBy(id="Password")
	private WebElement PaswordTextBox;
	
	
	@FindBy(id="RememberMe")
	private WebElement rememberTextBox;
	
	@FindBy(id="Forgot password?")
	private WebElement forgetTextBox;
	

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;

	private WebElement logoutButton;

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPaswordTextBox() {
		return PaswordTextBox;
	}

	public WebElement getRememberTextBox() {
		return rememberTextBox;
	}

	public WebElement getForgetTextBox() {
		return forgetTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getLogoutButton() {
		return logoutButton;

	}
	

}
