package models;

public class Order {
    private Integer id;
    private User user;
    private DeliveryPerson deliveryPerson;
    private Restaurant restaurant;
    private Food food;
    private Beverage beverage;
    private Double totalPrice;

    public Order(Integer id, User user, DeliveryPerson deliveryPerson, Restaurant restaurant, Food food, Beverage beverage, Double totalPrice) {
        this.id = id;
        this.user = user;
        this.deliveryPerson = deliveryPerson;
        this.restaurant = restaurant;
        this.food = food;
        this.beverage = beverage;
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DeliveryPerson getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addFood(Food food) {
        this.food = food;
    }

    public void addBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public void removeFood(Food food) {
        this.food = null;
    }

    public void removeBeverage(Beverage beverage) {
        this.beverage = null;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", deliveryPerson=" + deliveryPerson +
                ", restaurant=" + restaurant +
                ", food=" + food +
                ", beverage=" + beverage +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
