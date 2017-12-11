package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Config;
import utilities.Driver;

public class SignUpPage {
	
	public SignUpPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath=".//*[@id='post-507']/div/div[1]/section/div[1]/div/div/h1")
	public WebElement title;
	
	@FindBy(xpath=".//*[@id='post-507']/div/div[2]/div/div[1]/div/div/div/ul/li[1]/a")
	public WebElement loginLink;
	
	@FindBy(xpath=".//*[@id='content-push']/div/div/div[2]/div/div/a")
	public WebElement newAccountLink;
	
	@FindBy(xpath=".//*[@id='user_first_name']")
	public WebElement firstNameBox;
	
	@FindBy(xpath=".//*[@id='user_last_name']")
	public WebElement lastNameBox;
	
	@FindBy(xpath=".//*[@id='user_email']")
	public WebElement emailBox;
	
	@FindBy(xpath=".//*[@id='user_password']")
	public WebElement newPasswordBox;
	
	@FindBy(xpath=".//*[@id='btn-signup']")
	public WebElement signUpButton;
	
	public void open() {
		Driver.getInstance().get(Config.getProperty("url"));
		
	}

}
