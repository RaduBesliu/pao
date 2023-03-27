package services;

import models.Order;

import java.util.ArrayList;
import java.util.Comparator;

public class OrderService {
    public void getOrders(ArrayList<Order> orders) {
        for (Order order : orders) {
            System.out.println("------------ORDERS------------");
            System.out.println(order);
            System.out.println("------------------------------");
        }
    }

    public void getOrdersByUser(ArrayList<Order> orders, Integer userId) {
        for (Order order : orders) {
            if (order.getUser().getId().equals(userId)) {
                System.out.println("------------ORDERS ( by user id )------------");
                System.out.println(order);
                System.out.println("---------------------------------------------");
            }
        }
    }

    public void getOrdersByRestaurant(ArrayList<Order> orders, Integer restaurantId) {
        for (Order order : orders) {
            if (order.getRestaurant().getId().equals(restaurantId)) {
                System.out.println("------------ORDERS ( by restaurant id )------------");
                System.out.println(order);
                System.out.println("---------------------------------------------------");
            }
        }
    }

    public void getOrdersByDeliveryPerson(ArrayList<Order> orders, Integer deliveryPersonId) {
        for (Order order : orders) {
            if (order.getDeliveryPerson().getId().equals(deliveryPersonId)) {
                System.out.println("------------ORDERS ( by delivery person id )------------");
                System.out.println(order);
                System.out.println("--------------------------------------------------------");
            }
        }
    }

    public void addOrder(ArrayList<Order> orders, Order order) {
        orders.add(order);
        System.out.println("Order added successfully!");
    }

    public void deleteOrder(ArrayList<Order> orders, Integer id) {
        orders.removeIf(order -> order.getId().equals(id));
        System.out.println("Order deleted successfully!");
    }

    public void sortOrdersById(ArrayList<Order> orders) {
        orders.sort(Comparator.comparing(Order::getId));
    }
}
