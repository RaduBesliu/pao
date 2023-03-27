package services;

import models.DeliveryPerson;

import java.util.Map;

public class DeliveryPersonService {
    public void getDeliveryPersons(Map<Integer, DeliveryPerson> deliveryPersons) {
        for (Map.Entry<Integer, DeliveryPerson> entry : deliveryPersons.entrySet()) {
            System.out.println("---------DELIVERY PERSONS---------");
            System.out.println(entry.getValue());
            System.out.println("----------------------------------");
        }
    }

    public DeliveryPerson getDeliveryPersonById(Map<Integer, DeliveryPerson> deliveryPersons, Integer id) {
        return deliveryPersons.get(id);
    }

    public void addDeliveryPerson(Map<Integer, DeliveryPerson> deliveryPersons, DeliveryPerson deliveryPerson) {
        deliveryPersons.put(deliveryPerson.getId(), deliveryPerson);
        System.out.println("Delivery person added successfully!");
    }

    public void deleteDeliveryPerson(Map<Integer, DeliveryPerson> deliveryPersons, Integer id) {
        deliveryPersons.remove(id);
        System.out.println("Delivery person deleted successfully!");
    }
}
