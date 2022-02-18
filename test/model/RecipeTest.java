package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {

	private Recipe recipe;
	
	public void setUpStage1() {
		recipe = new Recipe(); 
	}
	public void setUpStage2() {
		recipe = new Recipe(); 
		recipe.addIngredient ("Arroz ", 520.0);
		recipe.addIngredient ("Ajo", 58);
		recipe.addIngredient ("Cebolla",315);
		
	}
	
	@Test
	void test1() {
		setUpStage1();
		
		recipe.addIngredient("Sal", 12);
		
		assertEquals(1, recipe.getIngredients().size());
	}
	@Test
	void test2() {
		setUpStage2();
		recipe.addIngredient("Pimienta", 6);
		assertEquals(4, recipe.getIngredients().size());
		
	}
	@Test
	void test3() {
		setUpStage2();
	}
	@Test
	void test4() {
		setUpStage2();
	}

}
