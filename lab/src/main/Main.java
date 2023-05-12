package main;

import models.*;
import services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Restaurant> restaurants = new HashMap<>();

        FoodService foodService = new FoodService();
        BeverageService beverageService = new BeverageService();
        DeliveryPersonService deliveryPersonService = new DeliveryPersonService();
        UserService userService = new UserService();
        RestaurantService restaurantService = new RestaurantService();
        OrderService orderService = new OrderService();

        ArrayList<Order> orders = new ArrayList<>();

        while (true) {
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1. Display all foods");
            System.out.println("2. Add a food");
            System.out.println("3. Delete a food");
            System.out.println("4. Update food calories");

            System.out.println("5. Display all beverages");
            System.out.println("6. Add a beverage");
            System.out.println("7. Delete a beverage");
            System.out.println("8. Update beverage price");

            System.out.println("9. Display all delivery persons");
            System.out.println("10. Add a delivery person");
            System.out.println("11. Delete a delivery person");
            System.out.println("12. Update delivery person hourly rate");

            System.out.println("13. Display all users");
            System.out.println("14. Add a user");
            System.out.println("15. Delete a user");
            System.out.println("16. Update user total rating");

            System.out.println("17. Display all orders");
            System.out.println("18. Display all orders by user id");
            System.out.println("19. Display all orders by restaurant id");
            System.out.println("20. Display all orders by delivery person id");
            System.out.println("21. Add an order");
            System.out.println("22. Delete an order");

            System.out.println("23. Display all restaurants");
            System.out.println("24. Add a restaurant");
            System.out.println("25. Delete a restaurant");
            System.out.println("26. Exit");

            System.out.println("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1" -> foodService.getFoods();
                case "2" -> {
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
                    Food food = new Food(null, foodName, foodPrice, foodQuantity, foodDescription, foodIsVegan, foodCalories);
                    foodService.addFood(food);
                }
                case "3" -> {
                    System.out.println("Enter the food id: ");
                    Integer foodIdToDelete = Integer.parseInt(scanner.nextLine());
                    foodService.deleteFood(foodIdToDelete);
                }
                case "4" -> {
                    System.out.println("Enter the food id: ");
                    Integer foodIdToUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the food calories: ");
                    Integer foodCalories = Integer.parseInt(scanner.nextLine());
                    foodService.updateFoodCalories(foodIdToUpdate, foodCalories);
                }

                case "5" -> beverageService.getBeverages();
                case "6" -> {
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
                    Beverage beverage = new Beverage(null, beverageName, beveragePrice, beverageQuantity, beverageDescription, beverageIsAlcoholic, beverageMilliliters);
                    beverageService.addBeverage(beverage);
                }
                case "7" -> {
                    System.out.println("Enter the beverage id: ");
                    Integer beverageIdToDelete = Integer.parseInt(scanner.nextLine());
                    beverageService.deleteBeverage(beverageIdToDelete);
                }
                case "8" -> {
                    System.out.println("Enter the beverage id: ");
                    Integer beverageIdToUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the beverage price: ");
                    Double beveragePrice = Double.parseDouble(scanner.nextLine());
                    beverageService.updateBeveragePrice(beverageIdToUpdate, beveragePrice);
                }

                case "9" -> deliveryPersonService.getDeliveryPersons();
                case "10" -> {
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
                    DeliveryPerson deliveryPerson = new DeliveryPerson(null, deliveryPersonName, deliveryPersonAge, deliveryPersonUsername, deliveryPersonPhoneNumber, deliveryPersonAddress, deliveryPersonHourlyRate, deliveryPersonTotalOrders);
                    deliveryPersonService.addDeliveryPerson(deliveryPerson);
                }
                case "11" -> {
                    System.out.println("Enter the delivery person id: ");
                    Integer deliveryPersonIdToDelete = Integer.parseInt(scanner.nextLine());
                    deliveryPersonService.deleteDeliveryPerson(deliveryPersonIdToDelete);
                }
                case "12" -> {
                    System.out.println("Enter the delivery person id: ");
                    Integer deliveryPersonIdToUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the delivery person hourly rate: ");
                    Double deliveryPersonHourlyRate = Double.parseDouble(scanner.nextLine());
                    deliveryPersonService.updateDeliveryPersonHourlyRate(deliveryPersonIdToUpdate, deliveryPersonHourlyRate);
                }

                case "13" -> userService.getUsers();
                case "14" -> {
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
                    User user = new User(null, userName, userAge, userUsername, userPhoneNumber, userAddress, userTotalRating, userTotalOrders);
                    userService.addUser(user);
                }
                case "15" -> {
                    System.out.println("Enter the user id: ");
                    Integer userIdToDelete = Integer.parseInt(scanner.nextLine());
                    userService.deleteUser(userIdToDelete);
                }
                case "16" -> {
                    System.out.println("Enter the user id: ");
                    Integer userIdToUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the user total rating: ");
                    Integer userTotalRating = Integer.parseInt(scanner.nextLine());
                    userService.updateUserTotalRating(userIdToUpdate, userTotalRating);
                }

                case "17" -> orderService.getOrders(orders);
                case "18" -> {
                    System.out.println("Enter the user id: ");
                    Integer userIdToOrder = Integer.parseInt(scanner.nextLine());
                    orderService.getOrdersByUser(orders, userIdToOrder);
                }
                case "19" -> {
                    System.out.println("Enter the restaurant id: ");
                    Integer restaurantIdToOrder = Integer.parseInt(scanner.nextLine());
                    orderService.getOrdersByRestaurant(orders, restaurantIdToOrder);
                }
                case "20" -> {
                    System.out.println("Enter the delivery person id: ");
                    Integer deliveryPersonIdToOrder = Integer.parseInt(scanner.nextLine());
                    orderService.getOrdersByDeliveryPerson(orders, deliveryPersonIdToOrder);
                }
                case "21" -> {
                    System.out.println("Enter the order id: ");
                    Integer orderId = Integer.parseInt(scanner.nextLine());
                    userService.getUsers();
                    System.out.println("Enter the user id: ");

                    restaurantService.getRestaurants(restaurants);
                    System.out.println("Enter the restaurant id: ");
                    Integer restaurantId = Integer.parseInt(scanner.nextLine());
                    Restaurant restaurant = restaurantService.getRestaurantById(restaurants, restaurantId);

                    Order order = new Order(orderId, null, null, restaurant, null, null, null);
                    orderService.addOrder(orders, order);

                    orderService.sortOrdersById(orders);
                }
                case "22" -> {
                    System.out.println("Enter the order id: ");
                    Integer orderIdToDelete = Integer.parseInt(scanner.nextLine());
                    orderService.deleteOrder(orders, orderIdToDelete);
                }
                case "23" -> restaurantService.getRestaurants(restaurants);
                case "24" -> {
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
                case "25" -> {
                    System.out.println("Enter the restaurant id: ");
                    Integer restaurantIdToDelete = Integer.parseInt(scanner.nextLine());
                    restaurantService.deleteRestaurant(restaurants, restaurantIdToDelete);
                }
                case "26" -> {
                    System.out.println("Bye");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
