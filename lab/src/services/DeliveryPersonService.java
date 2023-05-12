package services;

import models.DeliveryPerson;
import repository.DeliveryPersonRepository;

public class DeliveryPersonService {
    DeliveryPersonRepository deliveryPersonRepository = new DeliveryPersonRepository();

    public void getDeliveryPersons() {
        deliveryPersonRepository.getDeliveryPeople();
    }

    public void addDeliveryPerson(DeliveryPerson deliveryPerson) {
        deliveryPersonRepository.addDeliveryPerson(deliveryPerson);
    }

    public void deleteDeliveryPerson(Integer id) {
        deliveryPersonRepository.deleteDeliveryPerson(id);
    }

    public void updateDeliveryPersonHourlyRate(Integer id, Double hourlyRate) {
        deliveryPersonRepository.updateDeliveryPersonHourlyRate(id, hourlyRate);
    }
}
