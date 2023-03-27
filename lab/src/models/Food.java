package models;

public class Food extends Item {
    private Boolean isVegan;
    private Integer calories;

    public Food(Integer id, String name, Double price, Integer quantity, String description, Boolean isVegan, Integer calories) {
        super(id, name, price, quantity, description);
        this.isVegan = isVegan;
        this.calories = calories;
    }

    public Boolean getIsVegan() {
        return isVegan;
    }

    public void setIsVegan(Boolean isVegan) {
        this.isVegan = isVegan;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return '\'' + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", isVegan=" + isVegan +
                ", calories=" + calories +
                '}';
    }
}
