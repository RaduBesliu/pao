package models;

public class DeliveryPerson extends Person {
    private Double hourlyRate;
    private Integer totalOrders;

    public DeliveryPerson(Integer id, String name, Integer age, String userName, String phoneNumber, String address, Double hourlyRate, Integer totalOrders) {
        super(id, name, age, userName, phoneNumber, address);
        this.hourlyRate = hourlyRate;
        this.totalOrders = totalOrders;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

    @Override
    public String toString() {
        return "DeliveryPerson{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", hourlyRate=" + hourlyRate +
                ", totalOrders=" + totalOrders +
                '}';
    }
}
