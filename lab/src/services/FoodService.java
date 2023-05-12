package services;

import models.Food;
import repository.FoodRepository;

public class FoodService {
    FoodRepository foodRepository = new FoodRepository();

    public void getFoods() {
        foodRepository.getFoods();
    }

    public void addFood(Food food) {
        foodRepository.addFood(food);
    }

    public void deleteFood(Integer id) {
        foodRepository.deleteFood(id);
    }

    public void updateFoodCalories(Integer id, Integer calories) {
        foodRepository.updateFoodCalories(id, calories);
    }
}
