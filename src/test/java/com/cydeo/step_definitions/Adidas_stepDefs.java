package com.cydeo.step_definitions;

import com.cydeo.pages.AdidasPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adidas_stepDefs {

    /*
    SHOP: https://www.demoblaze.com/index.html


	• Customer navigation through product categories: Phones, Laptops and Monitors
	• Navigate to "Laptops" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
    */
    @Given("User is on demoblaze home page")
    public void user_is_on_demoblaze_home_page() {
        Driver.getDriver().get("https://www.demoblaze.com/index.html");
    }

    AdidasPage adidasPage = new AdidasPage();

    @When("User navigate to Laptops")
    public void user_navigate_to_laptops() {
        adidasPage.laptop.click();
    }
    @When("User Navigate to Sony vaio i5 laptop")
    public void user_navigate_to_sony_vaio_i5_laptop() {
        adidasPage.sonyVaio.click();
    }
    @Then("User click Add to cart button")
    public void user_click_add_to_cart_button() {
        adidasPage.addCart.click();
    }

    @When("User navigate to {string}")
    public void user_navigate_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User Navigate to {string} laptop")
    public void user_navigate_to_laptop(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User click {string} button")
    public void user_click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("User accept pop up confirmation")
    public void user_accept_pop_up_confirmation() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
      wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = Driver.getDriver().switchTo().alert();

        alert.accept();

    }
}
