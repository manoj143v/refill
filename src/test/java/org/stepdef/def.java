package org.stepdef;


import org.pojo.sampojo;
import org.test2.base;

import io.cucumber.java.en.*;

public class def extends base{

	sampojo f;
	
	@Given("To launch the edge browser and max window")
	public void to_launch_the_edge_browser_and_max_window() {
		
		launchbro();
		max();
	}

	@When("To launch url of the Facebook application")
	public void to_launch_url_of_the_facebook_application() {
		
		launchurl("https://en-gb.facebook.com/");
	}

	@When("To pass the vaild username in email field")
	public void to_pass_the_vaild_username_in_email_field() {

		 f=new sampojo();
		 
		sendkeys("mano#yahoo.com",f.getLogin());
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
		
		 f=new sampojo();
		sendkeys("smk143@nmV",f.getPass());
	}
	@When("User has To pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
	   f=new sampojo();
	   sendkeys(em, f.getLogin());
	}

	@When("User has To pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String ps) {
	  f=new sampojo();
	  sendkeys(ps, f.getPass());
	}
	@When("To click the login button")
	public void to_click_the_login_button() {

		f=new sampojo();
		clickbtn(f.getLogin());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
	System.out.println("to check the cerdentials");
}

	@Then("To close the browser")
	public void to_close_the_browser() {
	  quit();
	}

	

	
}
