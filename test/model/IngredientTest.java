package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.NegativeWeightException;

class IngredientTest {

	private Ingredient ingredient; 
	
	public void setUpStage1() {
		ingredient= new Ingredient("Tomate", 245);
	}
	
	@Test
	void test1() {
		setUpStage1();
		try {
			ingredient.addWeight(54);
		} catch (NegativeWeightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(299, ingredient.getWeight());	
	}
	@Test
	void test2() {
		setUpStage1();
		boolean exception = false;
		try {
			ingredient.addWeight(-100);
		} catch (NegativeWeightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			exception = true;
		}
		assertTrue(exception);
		assertEquals(245, ingredient.getWeight());	
	}
	@Test
	void test3() {
		setUpStage1();
		try {
			ingredient.removeWeight(45);
		} catch (NegativeWeightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(200, ingredient.getWeight());	
	}
	@Test
	void test4() {
		setUpStage1();
		try {
			ingredient.removeWeight(-100);
		} catch (NegativeWeightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(245, ingredient.getWeight());	
	}

}
