package com.training.bdd.steps;

import com.training.bdd.classes.LikeToTimeDishes;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Value;

public class MySteps {

	LikeToTimeDishes context = new LikeToTimeDishes();

	@Given("I used as array '$array' of dishes")
	public void tetingGiven(@Value("array") int[] array) {

		System.out.println(context.calculateSolution(array).toString());

	}

	@Given("I am still pending step")
	public void testingAnd() { System.out.println("And nuiernierceurcni"); }

	@When("a good soul will implement me")
	public void testingWhen() {
		System.out.print("When enwjdken");
	}
	
	@Then("I shall be happy")
	public void testingThen() {
		System.out.println("Then nerkcne");
	}
    
}
