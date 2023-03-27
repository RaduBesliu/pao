package main;

import models.*;
import services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FoodService foodService = new FoodService();
        BeverageService beverageService = new BeverageService();
        DeliveryPersonService deliveryPersonService = new DeliveryPersonService();
        UserService userService = new UserService();
        RestaurantService restaurantService = new RestaurantService();
        OrderService orderService = new OrderService();

        Map<Integer, Food> foods = new HashMap<>();
        Map<Integer, Beverage> beverages = new HashMap<>();
        Map<Integer, DeliveryPerson> deliveryPersons = new HashMap<>();
        Map<Integer, User> users = new HashMap<>();
        Map<Integer, Restaurant> restaurants = new HashMap<>();

        ArrayList<Order> orders = new ArrayList<>();

        while (true) {
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1. Display all foods");
            System.out.println("2. Add a food");
            System.out.println("3. Delete a food");
            System.out.println("4. Display all beverages");
            System.out.println("5. Add a beverage");
            System.out.println("6. Delete a beverage");
            System.out.println("7. Display all delivery persons");
            System.out.println("8. Add a delivery person");
            System.out.println("9. Delete a delivery person");
            System.out.println("10. Display all users");
            System.out.println("11. Add a user");
            System.out.println("12. Delete a user");
            System.out.println("13. Display all orders");
            System.out.println("14. Display all orders by user id");
            System.out.println("15. Display all orders by restaurant id");
            System.out.println("16. Display all orders by delivery person id");
            System.out.println("17. Add an order");
            System.out.println("18. Delete an order");
            System.out.println("19. Display all restaurants");
            System.out.println("20. Add a restaurant");
            System.out.println("21. Delete a restaurant");
            System.out.println("22. Exit");

            System.out.println("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1" -> foodService.getFoods(foods);
                case "2" -> {
                    System.out.println("Enter the food id: ");
                    Integer foodId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the food name: ");
                    String foodName = scanner.nextLine();
                    System.out.println("Enter the food price: ");
                    Double foodPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the food quantity: ");
                    Integer foodQuantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the food description: ");
                    String foodDescription = scanner.nextLine();
                    System.out.println("Enter if the food is vegan (true / false): ");
                    Boolean foodIsVegan = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Enter the food calories: ");
                    Integer foodCalories = Integer.parseInt(scanner.nextLine());
                    Food food = new Food(foodId, foodName, foodPrice, foodQuantity, foodDescription, foodIsVegan, foodCalories);
                    foodService.addFood(foods, food);
                }
                case "3" -> {
                    System.out.println("Enter the food id: ");
                    Integer foodIdToDelete = Integer.parseInt(scanner.nextLine());
                    foodService.deleteFood(foods, foodIdToDelete);
                }
                case "4" -> beverageService.getBeverages(beverages);
                case "5" -> {
                    System.out.println("Enter the beverage id: ");
                    Integer beverageId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the beverage name: ");
                    String beverageName = scanner.nextLine();
                    System.out.println("Enter the beverage price: ");
                    Double beveragePrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the beverage quantity: ");
                    Integer beverageQuantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the beverage description: ");
                    String beverageDescription = scanner.nextLine();
                    System.out.println("Enter if the beverage is alcoholic (true / false): ");
                    Boolean beverageIsAlcoholic = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Enter the beverage milliliters: ");
                    Integer beverageMilliliters = Integer.parseInt(scanner.nextLine());
                    Beverage beverage = new Beverage(beverageId, beverageName, beveragePrice, beverageQuantity, beverageDescription, beverageIsAlcoholic, beverageMilliliters);
                    beverageService.addBeverage(beverages, beverage);
                }
                case "6" -> {
                    System.out.println("Enter the beverage id: ");
                    Integer beverageIdToDelete = Integer.parseInt(scanner.nextLine());
                    beverageService.deleteBeverage(beverages, beverageIdToDelete);
                }
                case "7" -> deliveryPersonService.getDeliveryPersons(deliveryPersons);
                case "8" -> {
                    System.out.println("Enter the delivery person id: ");
                    Integer deliveryPersonId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the delivery person name: ");
                    String deliveryPersonName = scanner.nextLine();
                    System.out.println("Enter the delivery person age: ");
                    Integer deliveryPersonAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the delivery person username: ");
                    String deliveryPersonUsername = scanner.nextLine();
                    System.out.println("Enter the delivery person phone number: ");
                    String deliveryPersonPhoneNumber = scanner.nextLine();
                    System.out.println("Enter the delivery person address: ");
                    String deliveryPersonAddress = scanner.nextLine();
                    System.out.println("Enter the delivery person hourly rate: ");
                    Double deliveryPersonHourlyRate = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the delivery person total orders: ");
                    Integer deliveryPersonTotalOrders = Integer.parseInt(scanner.nextLine());
                    DeliveryPerson deliveryPerson = new DeliveryPerson(deliveryPersonId, deliveryPersonName, deliveryPersonAge, deliveryPersonUsername, deliveryPersonPhoneNumber, deliveryPersonAddress, deliveryPersonHourlyRate, deliveryPersonTotalOrders);
                    deliveryPersonService.addDeliveryPerson(deliveryPersons, deliveryPerson);
                }
                case "9" -> {
                    System.out.println("Enter the delivery person id: ");
                    Integer deliveryPersonIdToDelete = Integer.parseInt(scanner.nextLine());
                    deliveryPersonService.deleteDeliveryPerson(deliveryPersons, deliveryPersonIdToDelete);
                }
                case "10" -> userService.getUsers(users);
                case "11" -> {
                    System.out.println("Enter the user id: ");
                    Integer userId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the user name: ");
                    String userName = scanner.nextLine();
                    System.out.println("Enter the user age: ");
                    Integer userAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the user username: ");
                    String userUsername = scanner.nextLine();
                    System.out.println("Enter the user phone number: ");
                    String userPhoneNumber = scanner.nextLine();
                    System.out.println("Enter the user address: ");
                    String userAddress = scanner.nextLine();
                    System.out.println("Enter the user total rating: ");
                    Integer userTotalRating = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the user total orders: ");
                    Integer userTotalOrders = Integer.parseInt(scanner.nextLine());
                    User user = new User(userId, userName, userAge, userUsername, userPhoneNumber, userAddress, userTotalRating, userTotalOrders);
                    userService.addUser(users, user);
                }
                case "12" -> {
                    System.out.println("Enter the user id: ");
                    Integer userIdToDelete = Integer.parseInt(scanner.nextLine());
                    userService.deleteUser(users, userIdToDelete);
                }
                case "13" -> orderService.getOrders(orders);
                case "14" -> {
                    System.out.println("Enter the user id: ");
                    Integer userIdToOrder = Integer.parseInt(scanner.nextLine());
                    orderService.getOrdersByUser(orders, userIdToOrder);
                }
                case "15" -> {
                    System.out.println("Enter the restaurant id: ");
                    Integer restaurantIdToOrder = Integer.parseInt(scanner.nextLine());
                    orderService.getOrdersByRestaurant(orders, restaurantIdToOrder);
                }
                case "16" -> {
                    System.out.println("Enter the delivery person id: ");
                    Integer deliveryPersonIdToOrder = Integer.parseInt(scanner.nextLine());
                    orderService.getOrdersByDeliveryPerson(orders, deliveryPersonIdToOrder);
                }
                case "17" -> {
                    System.out.println("Enter the order id: ");
                    Integer orderId = Integer.parseInt(scanner.nextLine());
                    userService.getUsers(users);
                    System.out.println("Enter the user id: ");
                    Integer userId = Integer.parseInt(scanner.nextLine());
                    User user = userService.getUserById(users, userId);

                    deliveryPersonService.getDeliveryPersons(deliveryPersons);
                    System.out.println("Enter the delivery person id: ");
                    Integer deliveryPersonId = Integer.parseInt(scanner.nextLine());
                    DeliveryPerson deliveryPerson = deliveryPersonService.getDeliveryPersonById(deliveryPersons, deliveryPersonId);

                    restaurantService.getRestaurants(restaurants);
                    System.out.println("Enter the restaurant id: ");
                    Integer restaurantId = Integer.parseInt(scanner.nextLine());
                    Restaurant restaurant = restaurantService.getRestaurantById(restaurants, restaurantId);

                    foodService.getFoods(foods);
                    System.out.println("Enter the food id: ");
                    Integer foodId = Integer.parseInt(scanner.nextLine());
                    Food food = foodService.getFoodById(foods, foodId);

                    beverageService.getBeverages(beverages);
                    System.out.println("Enter the beverage id: ");
                    Integer beverageId = Integer.parseInt(scanner.nextLine());
                    Beverage beverage = beverageService.getBeverageById(beverages, beverageId);

                    Double totalPrice = food.getPrice() + beverage.getPrice();

                    Order order = new Order(orderId, user, deliveryPerson, restaurant, food, beverage, totalPrice);
                    orderService.addOrder(orders, order);

                    orderService.sortOrdersById(orders);
                }
                case "18" -> {
                    System.out.println("Enter the order id: ");
                    Integer orderIdToDelete = Integer.parseInt(scanner.nextLine());
                    orderService.deleteOrder(orders, orderIdToDelete);
                }
                case "19" -> restaurantService.getRestaurants(restaurants);
                case "20" -> {
                    System.out.println("Enter the restaurant id: ");
                    Integer restaurantId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the restaurant name: ");
                    String restaurantName = scanner.nextLine();
                    System.out.println("Enter the restaurant address: ");
                    String restaurantAddress = scanner.nextLine();
                    System.out.println("Enter the restaurant rating: ");
                    Double restaurantRating = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the restaurant total rating: ");
                    Integer restaurantTotalRating = Integer.parseInt(scanner.nextLine());
                    Restaurant restaurant = new Restaurant(restaurantId, restaurantName, restaurantAddress, restaurantRating, restaurantTotalRating);
                    restaurantService.addRestaurant(restaurants, restaurant);
                }
                case "21" -> {
                    System.out.println("Enter the restaurant id: ");
                    Integer restaurantIdToDelete = Integer.parseInt(scanner.nextLine());
                    restaurantService.deleteRestaurant(restaurants, restaurantIdToDelete);
                }
                case "22" -> {
                    System.out.println("Bye");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
