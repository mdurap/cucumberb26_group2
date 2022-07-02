package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
    @Before
    public void setup(Scenario scenario){
        System.out.println("Running before the scenario");
        System.out.println(scenario.getName());

    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Running after the scenario");
        System.out.println(scenario.getName());
        System.out.println(scenario.isFailed());
    }

}
