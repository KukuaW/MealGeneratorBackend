package com.epkw.mealgenerator.models;

import java.util.List;

public class Meals {

    private long id;
    private Diet diet;
    private String name;
    private List<String> ingredients;
    private int calories;
    private String menu;

    public Meals (long id, Diet diet, String name, List<String> ingredients, int calories, String menu){
        this.diet = diet;
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.menu = menu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    //allows you to pass other attributes when one is passed through
    @Override
    public String toString() {
        return "Meals{" +
                "id=" + id +
                ", diet=" + diet +
                ", name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", calories=" + calories +
                ", menu='" + menu + '\'' +
                '}';
    }
}
