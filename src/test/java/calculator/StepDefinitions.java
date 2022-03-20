package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	int a;
	int b;

	private Calculadora calculadora;
	private double actualMult;
	private double actualSum;
	private int actualFact;
	private double actualDivision;
	private double actualSubtraction;
	private boolean esPrimo;

	@Given("The calculator is running")
	public void the_calculator_is_running() {
		calculadora = new Calculadora();
	}

	@When("I have entered {double} * {double} in the calculator to multiply them")
	public void i_have_entered_in_the_calculator_to_multiply_them(Double double1, Double double2) {
		actualMult = calculadora.mult(double1, double2);
	}

	@Then("output of the multiplication should be {double}")
	public void output_of_the_multiplication_should_be(Double expectedvalue) {
		assertEquals(expectedvalue, actualMult);
	}

	@When("I have entered {double} and {double} in the calculator to sum them")
	public void i_have_entered_and_in_the_calculator_to_sum_them(Double double1, Double double2) {
		actualSum = calculadora.suma(double1, double2);
	}

	@Then("output of the sum should be {double}")
	public void output_of_the_sum_should_be(Double expectedValue) {
		assertEquals(expectedValue, actualSum);
	}

	@When("I have entered {int} in the calculator to calculate his factorial")
	public void i_have_entered_in_the_calculator_to_calculate_his_factorial(Integer int1) {
		actualFact = calculadora.fact(int1);
	}

	@Then("output of the factorial should be {int}")
	public void output_of_the_factorial_should_be(Integer expectedValue) {
		assertEquals(expectedValue, actualFact);
	}

	@When("I have entered {double} and {double} in the calculator to divide them")
	public void i_have_entered_and_in_the_calculator_to_divide_them(Double double1, Double double2) {
		actualDivision = calculadora.divide(double1, double2);
	}

	@Then("output of the division should be {double}")
	public void output_of_the_division_should_be(Double expectedValue) {
		assertEquals(expectedValue,actualDivision);

	}
	
	@When("I have entered {double} and {double} in the calculator to subtraction them")
	public void i_have_entered_and_in_the_calculator_to_subtraction_them(Double double1, Double double2) {
	    actualSubtraction=calculadora.resta(double1, double2);
	}
	@Then("output of the subtraction should be {double}")
	public void output_of_the_subtraction_should_be(Double expectedValue) {
	    assertEquals(expectedValue,actualSubtraction);
	}
	
	@When("I have entered {int} in the calculator to see if it is prime")
	public void i_have_entered_in_the_calculator_to_see_if_it_is_prime(Integer int1) {
	 
		esPrimo=calculadora.esPrimo(int1);
	    
	}
	@Then("output should be {string}")
	public void output_should_be(String expectedValue) {
		
		boolean expValue= Boolean.parseBoolean(expectedValue);
	    assertEquals(expValue,esPrimo);
	}


}
