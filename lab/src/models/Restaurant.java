package models;

public class Restaurant {
    private Integer id;
    private String name;
    private String address;
    private Double rating;
    private Integer totalRating;

    public Restaurant(Integer id, String name, String address, Double rating, Integer totalRating) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.totalRating = totalRating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Integer totalRating) {
        this.totalRating = totalRating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", address=" + address +
                ", rating=" + rating +
                ", totalRating=" + totalRating +
                '}';
    }
}
