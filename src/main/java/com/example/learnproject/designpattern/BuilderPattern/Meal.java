package com.example.learnproject.designpattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 13:55
 * @description：meal
 * @modified By：
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems() {
        for (Item item : items) {
            System.out.println("Item:" + item.name());
            System.out.println("Packing:" + item.packing().pack());
            System.out.println("Price:" + item.price());
        }
    }
}