package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	 
	@FindBy(id = "Email")
	private WebElement emailTexBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "Remember me")
	private WebElement remembermecheckbox;
	
	@FindBy(id = "forgot-password")
	private WebElement forgotpasswordLink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	
	public WebElement getEmailTexBox() {
		return emailTexBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getRemembermecheckbox() {
		return remembermecheckbox;
	}

	public WebElement getForgotpasswordLink() {
		return forgotpasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}


}
