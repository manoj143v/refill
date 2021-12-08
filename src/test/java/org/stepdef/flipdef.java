package org.stepdef;

import java.util.List;
import java.util.Map;

import org.pojo.flip;
import org.test2.base;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class flipdef extends base{

	 flip f;
	 
	@Given("To launch the firfox browser and max window")
	public void to_launch_the_firfox_browser_and_max_window() {
	launchbro();
	max();
	}

	@When("To launch url of the Flipkart application")
	public void to_launch_url_of_the_flipkart_application() {
	launchurl("https://www.flipkart.com/");   
	}

	@When("To pass the vaild phonenumber in phno field")
	public void to_pass_the_vaild_phonenumber_in_phno_field(DataTable d) {
	  f=new flip();
       Map<Object, Object> m = d.asMap(String.class,String.class);
       sendkeys((String) m.get("phonenumber2"), f.getPhno());
       
	}

	@When("To pass the invalid pswd in pswd field")
	public void to_pass_the_invalid_pswd_in_pswd_field(DataTable d) {
		f=new flip();
		List<Map<String, String>> a = d.asMaps();
         sendkeys(a.get(1).get("pswd2"), f.getPswd());      
         }
	@When("To pass the vaild phone in phno field")
	public void to_pass_the_vaild_phone_in_phno_field() {
	  f=new flip();
	  sendkeys("9866986266", f.getPhno());
	}

	@When("To pass the invalid passwd in pswd field")
	public void to_pass_the_invalid_passwd_in_pswd_field() {
	  f=new flip();
	  sendkeys("smk143@nmV", f.getPswd());
	}

	@When("To click the lgn button")
	public void to_click_the_lgn_button() {
		f=new flip();
	    clickbtn(f.getLgntbn());
	}

	@When("To check whether navigates to the home page or not")
	public void to_check_whether_navigates_to_the_home_page_or_not() throws InterruptedException {

	   System.out.println("sucess");
	   Thread.sleep(3000);
	}

	@Then("To quite the browser")
	public void to_quite_the_browser() {
	quit();
	}

}
