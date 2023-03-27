package models;

public class Person {
    protected Integer id;
    protected String name;
    protected Integer age;
    protected String userName;
    protected String phoneNumber;
    protected String address;

    public Person(Integer id, String name, Integer age, String userName, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", userName=" + userName +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address +
                '}';
    }
}
