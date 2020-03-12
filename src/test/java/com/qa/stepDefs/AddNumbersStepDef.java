package com.qa.stepDefs;

import com.qa.transform.Numbers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddNumbersStepDef {

    private List<Integer> numbers;
    private int sum;
    private Map<String, Numbers> no;

    @Given("^a list of numbers$")
    public void a_list_of_numbers(List<Integer> numbers) throws Throwable {
            this.numbers = numbers;
    }

    @When("^I summarize them$")
    public void i_summarize_them() throws Throwable {
        for (Integer number : numbers) {
            sum += number;
        }
    }

    @Then("^should I get (\\d+)$")
    public void should_I_get(int expectedSum) throws Throwable {
        Assert.assertEquals(expectedSum,sum);
    }

    @Given("A data table of numbers")
    public void a_data_table_of_numbers(List<Numbers> nums) {
        no = new HashMap<>();

        for (Numbers nos : nums) {

            System.out.println("*****************" +nos.getNumber1());
            System.out.println("*****************" +nos.getNumber2());
        }
        }


    @When("I Add them")
    public void i_Add_them() {
        System.out.println("**********Here1**************" );
        }

    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
        System.out.println("**********Here2**************" );

        }

}
