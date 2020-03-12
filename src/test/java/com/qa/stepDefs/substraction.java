package com.qa.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class substraction {
    int a ;
    int b ;
    int c;
    @Given("I have list")
        public void i_have_list(DataTable dataTable) {
        List<String> list = dataTable.asList();
        a= Integer.parseInt(list.get(0));
        b= Integer.parseInt(list.get(1));

    }

    @When("I substract them them")
        public void i_substract_them_them() {
        c= a-b;
    }

    @Then("should I get the correct value")
    public void should_I_get_the_correct_value() {
            if (c==5) {
                System.out.println("Yohooo! you have got it right");
            } else {
                System.out.println("Duh!");
            }

        }

}
