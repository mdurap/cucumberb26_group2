package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class NetflixStepDef {
    @Given("I like {string}")
    public void i_like(String movieGenre) {
        System.out.println("step Given I like "+ movieGenre);
    }

    @Given("I like")
    public void i_like(List<String> movieTypes) {
        System.out.println(movieTypes);
    }
    @Given("I like below favorite movie with certain type")
    public void i_like_below_favorite_movie_with_certain_type(Map<String,String> favMovieMap) {
        System.out.println(favMovieMap);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(favMovieMap.get("action"));
        System.out.println(favMovieMap.get("drama"));
        System.out.println(favMovieMap.get("cartoon"));
        System.out.println(favMovieMap.get("adventure"));
    }
    @Given("I like below favorite movie with ratings")
    public void i_like_below_favorite_movie_with_ratings(List<List<String>> moviesList) {
        System.out.println(moviesList);
        System.out.println("moviesList.get(0) = " + moviesList.get(0));
        System.out.println("moviesList.get(1) = " + moviesList.get(1));
        System.out.println("moviesList.get(2) = " + moviesList.get(2));
        System.out.println("moviesList.get(3) = " + moviesList.get(3));
        System.out.println("moviesList.get(3).get(1) = " + moviesList.get(3).get(1));

    }

    @Given("I like below movie table with ratings")
    public void i_like_below_movie_table_with_ratings(
            List<Map<String,String>> movieMapList
    ) {
        System.out.println("movieMapList = " + movieMapList);
        System.out.println("movieMapList.get(0) = " + movieMapList.get(0));
        System.out.println("movieMapList.get(2) = " + movieMapList.get(2));
        // forth row Name column
        System.out.println("movieMapList.get(3).get(\"Name\") = " + movieMapList.get(3).get("Name"));
        // first row Genre column
        System.out.println("movieMapList.get(0).get(\"Genre\") = " + movieMapList.get(0).get("Genre"));

    }

    @When("I go to home page")
    public void i_go_to_home_page() {
        System.out.println("Step When I go to home page");
    }
    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {
        System.out.println("Then I should get right recommendation");
    }
}
