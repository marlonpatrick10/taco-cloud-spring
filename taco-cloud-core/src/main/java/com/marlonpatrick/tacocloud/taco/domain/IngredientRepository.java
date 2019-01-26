package com.marlonpatrick.tacocloud.taco.domain;

public interface IngredientRepository {
	
	Iterable<Ingredient> findAll();

	Ingredient findById(String id);
	
	Ingredient save(Ingredient ingredient);

}
