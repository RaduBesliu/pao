package services;

import models.Beverage;
import repository.BeverageRepository;

public class BeverageService {
    BeverageRepository beverageRepository = new BeverageRepository();

    public void getBeverages() {
        beverageRepository.getBeverages();
    }

    public void addBeverage(Beverage beverage) {
        beverageRepository.addBeverage(beverage);
    }

    public void deleteBeverage(Integer id) {
        beverageRepository.deleteBeverage(id);
    }

    public void updateBeveragePrice(Integer id, Double price) {
        beverageRepository.updateBeveragePrice(id, price);
    }
}
