package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/29 9:36
 * @description：
 * @modified By：
 */
public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total price:" + vegMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareChickenMeal();

        System.out.println("\n\nchickenMeal");
        chickenMeal.showItems();
        System.out.println("Total price:" + chickenMeal.getCost());
    }
}