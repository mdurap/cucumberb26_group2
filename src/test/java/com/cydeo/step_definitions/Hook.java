package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    @Before
    public void setup(){
        System.out.println("Running before the scenario");
    }
    @After
    public void tearDown(){
        System.out.println("Running after the scenario");
    }

}
