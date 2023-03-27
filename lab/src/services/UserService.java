package services;

import models.User;

import java.util.Map;

public class UserService {
    public void getUsers(Map<Integer, User> users) {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            System.out.println("------------USERS------------");
            System.out.println(entry.getValue());
            System.out.println("-----------------------------");
        }
    }

    public User getUserById(Map<Integer, User> users, Integer id) {
        return users.get(id);
    }

    public void addUser(Map<Integer, User> users, User user) {
        users.put(user.getId(), user);
        System.out.println("User added successfully!");
    }

    public void deleteUser(Map<Integer, User> users, Integer id) {
        users.remove(id);
        System.out.println("User deleted successfully!");
    }
}
