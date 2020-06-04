package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Argos;

public class ArgosSteps {
    Argos argos = new Argos();

    @Given("^user is on argos homepage$")
    public void user_is_on_argos_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user types nike in the searchbox$")
    public void user_types_nike_in_the_searchbox() throws Throwable {
        argos.searchBoxFunction();
    }

    @When("^user clicks searchbutton$")
    public void user_clicks_searchbutton() throws Throwable {
        argos.searchButton();
    }

    @Then("^user should see all results from NIKE$")
    public void user_should_see_all_results_from_NIKE() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
