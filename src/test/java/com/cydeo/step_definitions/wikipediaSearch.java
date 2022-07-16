package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class wikipediaSearch {
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page()  {
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        WebElement searchBox=Driver.getDriver().findElement(By.cssSelector(".vector-search-box-input"));
        searchBox.sendKeys("Steve Jobs"+ Keys.ENTER);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));
    }
}
