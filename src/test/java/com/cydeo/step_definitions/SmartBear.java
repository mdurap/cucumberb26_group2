package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SmartBear {
    @Given("User is on Smartbear home page")
    public void user_is_on_smartbear_home_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @When("User enter username")
    public void user_enter_username() {
        WebElement userName=Driver.getDriver().findElement(By.name("ctl00$MainContent$username"));
        userName.sendKeys("Tester");
    }
    @When("User enter password")
    public void user_enter_password() {
        WebElement password = Driver.getDriver().findElement(By.cssSelector("input[name='ctl00$MainContent$password']"));
        password.sendKeys("test");
    }
    @When("User click login button")
    public void user_click_login_button() {
        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']")).click();
    }
    @Then("User count all the links on landing page")
    public void user_count_all_the_links_on_landing_page() {
        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//a"));
        int numberOfLinks= links.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
    }
    @Then("User print out each link text on this page")
    public void user_print_out_each_link_text_on_this_page() {
        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//a"));
        for(WebElement each : links){
            System.out.println(each.getText());
        }
    }

}
