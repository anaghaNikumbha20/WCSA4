package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	
	@FindBy(xpath="//div[@class='label' and (.='Users')]") private WebElement usersTab; 
	@FindBy(xpath="//input[@type='button' and (@value='Clean Up Demo Data')]") private WebElement createButton;
	@FindBy(name="username") private WebElement usnTextbox;
	@FindBy(name="passwordText") private WebElement passTextbox;
	@FindBy(name="passwordTextRetype") private WebElement retypePassTesxtBox;
	@FindBy(name="firstName") private WebElement firstNameTextbox;
	@FindBy(name="lastName") private WebElement lastNameTextbox;
	@FindBy(xpath ="//input[@type='submit' and (.='')]") private WebElement createUserButton;
	@FindBy(xpath="//input[@type='button' and (@value='      Cancel      ')]") private WebElement cancleButton;
	
	
	
	
	
	public UsersPage(WebDriver driver) {	
	PageFactory.initElements(driver,this);
		
	}


	public WebElement getUsersTab() {
		return usersTab;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getUsnTextbox() {
		return usnTextbox;
	}

	public WebElement getPassTextbox() {
		return passTextbox;
	}
	
	public WebElement getRetypePassTesxtBox() {
		return retypePassTesxtBox;
	}

	public WebElement getFirstNameTextbox() {
		return firstNameTextbox;
	}

	public WebElement getLastNameTextbox() {
		return lastNameTextbox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	public WebElement getCancleButton() {
		return cancleButton;
	}
	
	
	
	//operational methods
	public void validUsn(String validUser)
	{
		getUsnTextbox().sendKeys(validUser);
	}


	public void clickOnTab() {
		
		
	}
	
	
	

}
