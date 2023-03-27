package services;

import models.Beverage;

import java.util.Map;

public class BeverageService {
    public void getBeverages(Map<Integer, Beverage> beverages) {
        for (Map.Entry<Integer, Beverage> entry : beverages.entrySet()) {
            System.out.println("---------BEVERAGES---------");
            System.out.println(entry.getValue());
            System.out.println("-----------------------------");
        }
    }

    public Beverage getBeverageById(Map<Integer, Beverage> beverages, Integer id) {
        return beverages.get(id);
    }

    public void addBeverage(Map<Integer, Beverage> beverages, Beverage beverage) {
        beverages.put(beverage.getId(), beverage);
        System.out.println("Beverage added successfully!");
    }

    public void deleteBeverage(Map<Integer, Beverage> beverages, Integer id) {
        beverages.remove(id);
        System.out.println("Beverage deleted successfully!");
    }
}
