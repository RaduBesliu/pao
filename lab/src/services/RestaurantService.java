package services;

import models.Restaurant;

import java.util.Map;

public class RestaurantService {
    public void getRestaurants(Map<Integer, Restaurant> restaurants) {
        for (Map.Entry<Integer, Restaurant> entry : restaurants.entrySet()) {
            System.out.println("---------RESTAURANTS---------");
            System.out.println(entry.getValue());
            System.out.println("-----------------------------");
        }
    }

    public Restaurant getRestaurantById(Map<Integer, Restaurant> restaurants, Integer id) {
        return restaurants.get(id);
    }

    public void addRestaurant(Map<Integer, Restaurant> restaurants, Restaurant restaurant) {
        restaurants.put(restaurant.getId(), restaurant);
        System.out.println("Restaurant added successfully!");
    }

    public void deleteRestaurant(Map<Integer, Restaurant> restaurants, Integer id) {
        restaurants.remove(id);
        System.out.println("Restaurant deleted successfully!");
    }
}
