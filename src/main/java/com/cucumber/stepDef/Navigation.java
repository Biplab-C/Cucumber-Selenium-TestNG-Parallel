package com.cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Navigation {
	
	@Given("The URL is launched")
	public void the_URL_is_launched() {
		System.out.println("Step1");
	}

	@Then("Search the {string}")
	public void search_the(String string) {
		System.out.println(string);
	}

	@Then("Verify the prices are sorted")
	public void verify_the_prices_are_sorted() {
		System.out.println("Step3");
	}

}
