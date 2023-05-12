package repository;

import config.DatabaseConnection;
import models.User;
import services.AuditService;

import java.sql.PreparedStatement;

public class UserRepository {
    AuditService auditService = new AuditService();

    public void getUsers() {
        String sql = "SELECT * FROM user";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("---------USER---------");
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Age: " + result.getInt("age"));
                System.out.println("User name: " + result.getString("user_name"));
                System.out.println("Phone number: " + result.getString("phone_number"));
                System.out.println("Address: " + result.getString("address"));
                System.out.println("Total rating: " + result.getInt("total_rating"));
                System.out.println("Total orders: " + result.getInt("total_orders"));
                System.out.println("-----------------------------");
            }
            auditService.addAction("getUsers");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get users: " + e.getMessage());
        }
    }

    public void addUser(User user) {
        String sql = "INSERT INTO user VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setString(1, user.getName());
            statement.setInt(2, user.getAge());
            statement.setString(3, user.getUserName());
            statement.setString(4, user.getPhoneNumber());
            statement.setString(5, user.getAddress());
            statement.setInt(6, user.getTotalRating());
            statement.setInt(7, user.getTotalOrders());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                auditService.addAction("addUser");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong when trying to add a user: " + e.getMessage());
        }
    }

    public void deleteUser(Integer id) {
        String sql = "DELETE FROM user WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("User was deleted successfully!");
                auditService.addAction("deleteUser");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to delete a user: " + e.getMessage());
        }
    }

    public void updateUserTotalRating(Integer id, Integer totalRating) {
        String sql = "UPDATE user SET total_rating = ? WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, totalRating);
            statement.setInt(2, id);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("User's total rating was updated successfully!");
                auditService.addAction("updateUserTotalRating");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to update user's total rating: " + e.getMessage());
        }
    }

}
