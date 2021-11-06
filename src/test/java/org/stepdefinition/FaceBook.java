package org.stepdefinition;

import org.junit.Assert;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;


public class FaceBook extends BaseClass {
	@Given("The user should launch the chrome Browser")
	public void the_user_should_launch_the_chrome_Browser() {
		launchChrome();
	    
	}

	@When("The user should type the url")
	public void the_user_should_type_the_url() {
		loadUrl("https://www.uread.com/");
	    
	}

	@When("The user should maximize the window")
	public void the_user_should_maximize_the_window() {
		winmax();
	    
	}

	@When("The User should type the invalid username and invalid password")
	public void the_User_should_type_the_invalid_username_and_invalid_password() {
		userLogin();
	    
	}

	@When("The User should click the login button")
	public void the_User_should_click_the_login_button() throws InterruptedException {
	    btnClick();
	    Thread.sleep(4000);
	}

	@Then("The user should navigate to incorrect credential page")
	public void the_user_should_navigate_to_incorrect_credential_page() {
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue("Verify the page",currentUrl.contains("Log"));
	    System.out.println("Success");
	}



}
