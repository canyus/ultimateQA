package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignUpPage;
import utilities.Config;
import utilities.Driver;

public class SignUp {
	SignUpPage homePage = new SignUpPage();
	WebDriver driver = Driver.getInstance();
	
	public String getP(String a) {
		return Config.getProperty(a);
	}

@Given("^the user is on the defined url$")
public void the_user_is_on_the_defined_url() throws Throwable {
    homePage.open();
    
}

@When("^the user verifies the title$")
public void the_user_verifies_the_title() throws Throwable {
    String expectedTitle = "Automation Practice";
    String actualTitle =homePage.title.getText();
    if(actualTitle.equals(expectedTitle)) {
    		System.out.println("Verify title success!");
    }else 
    		System.out.println("Verify title fail!");
    
}

@When("^the user clicks on Login automation link$")
public void the_user_clicks_on_Login_automation_link() throws Throwable {
    homePage.loginLink.click();
    
}

@When("^the user clicks on create a new account link$")
public void the_user_clicks_on_create_a_new_account_link() throws Throwable {
    homePage.newAccountLink.click();
    
}

@When("^the user fills the form$")
public void the_user_fills_the_form() throws Throwable {
    homePage.firstNameBox.sendKeys(getP("firstname"));
    homePage.lastNameBox.sendKeys(getP("lastname"));
    homePage.emailBox.sendKeys(getP("email"));
    homePage.newPasswordBox.sendKeys(getP("password"));
    
    
}

@Then("^the user clicks on sign up button$")
public void the_user_clicks_on_sign_up_button() throws Throwable {
    homePage.signUpButton.getLocation();
    
}



}
