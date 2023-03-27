package services;

import models.Food;

import java.util.Map;

public class FoodService {
    public void getFoods(Map<Integer, Food> foods) {
        for (Map.Entry<Integer, Food> entry : foods.entrySet()) {
            System.out.println("------------FOODS------------");
            System.out.println(entry.getValue());
            System.out.println("-----------------------------");
        }
    }

    public Food getFoodById(Map<Integer, Food> foods, Integer id) {
        return foods.get(id);
    }

    public void addFood(Map<Integer, Food> foods, Food food) {
        foods.put(food.getId(), food);
        System.out.println("Food added successfully!");
    }

    public void deleteFood(Map<Integer, Food> foods, Integer id) {
        foods.remove(id);
        System.out.println("Food deleted successfully!");
    }
}
