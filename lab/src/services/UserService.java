package services;

import models.User;
import repository.UserRepository;

public class UserService {
    UserRepository userRepository = new UserRepository();

    public void getUsers() {
        userRepository.getUsers();
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }

    public void updateUserTotalRating(Integer id, Integer totalRating) {
        userRepository.updateUserTotalRating(id, totalRating);
    }
}
