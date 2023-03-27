package models;

public class User extends Person {
    private Integer totalRating;
    private Integer totalOrders;

    public User(Integer id, String name, Integer age, String userName, String phoneNumber, String address, Integer totalRating, Integer totalOrders) {
        super(id, name, age, userName, phoneNumber, address);
        this.totalRating = totalRating;
        this.totalOrders = totalOrders;
    }

    public Integer getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Integer totalRating) {
        this.totalRating = totalRating;
    }

    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", totalRating=" + totalRating +
                ", totalOrders=" + totalOrders +
                '}';
    }
}
