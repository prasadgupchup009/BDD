package com.qa.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class substraction_withMapDataTable {
    int a,b,c;

    @Given("I have list below")
    public void i_have_list_below(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps();
        a = Integer.parseInt(list.get(0).get("Number1"));
        b=Integer.parseInt(list.get(0).get("Number2"));
        }


    @When("I perform substraction")
    public void i_perform_substraction() {
        c= a-b;
        }


    @Then("should I get the  value")
    public void should_I_get_the_value() {
        if (c==5) {
            System.out.println("Yohooo! you have got it right");
        } else {
            System.out.println("Duh!");
        }

        }
}
