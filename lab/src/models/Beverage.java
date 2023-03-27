package models;

public class Beverage extends Item {
    private Boolean isAlcoholic;
    private Integer milliliters;

    public Beverage(Integer id, String name, Double price, Integer quantity, String description, Boolean isAlcoholic, Integer milliliters) {
        super(id, name, price, quantity, description);
        this.isAlcoholic = isAlcoholic;
        this.milliliters = milliliters;
    }

    public Boolean getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(Boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public Integer getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(Integer milliliters) {
        this.milliliters = milliliters;
    }

    @Override
    public String toString() {
        return '\'' + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", isAlcoholic=" + isAlcoholic +
                ", milliliters=" + milliliters +
                '}';
    }
}
