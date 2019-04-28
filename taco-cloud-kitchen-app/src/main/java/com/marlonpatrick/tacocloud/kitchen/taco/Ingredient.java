package com.marlonpatrick.tacocloud.kitchen.taco;

import lombok.Data;

@Data
public class Ingredient {

  private final String name;
  private final IngredientTypes type;
  
  public static enum IngredientTypes {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }
  
}
