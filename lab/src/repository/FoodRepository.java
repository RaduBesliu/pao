package repository;

import config.DatabaseConnection;
import models.Food;
import services.AuditService;

import java.sql.PreparedStatement;

public class FoodRepository {
    AuditService auditService = new AuditService();

    public void getFoods() {
        String sql = "SELECT * FROM food";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("---------FOOD---------");
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Price: " + result.getDouble("price"));
                System.out.println("Quantity: " + result.getInt("quantity"));
                System.out.println("Description: " + result.getString("description"));
                System.out.println("Is vegan: " + result.getBoolean("is_vegan"));
                System.out.println("Calories: " + result.getInt("calories"));
                System.out.println("-----------------------------");
            }

            auditService.addAction("getFoods");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get foods: " + e.getMessage());
        }
    }

    public void addFood(Food food) {
        String sql = "INSERT INTO food VALUES (null, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setString(1, food.getName());
            statement.setDouble(2, food.getPrice());
            statement.setInt(3, food.getQuantity());
            statement.setString(4, food.getDescription());
            statement.setBoolean(5, food.getIsVegan());
            statement.setInt(6, food.getCalories());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new food was inserted successfully!");
                auditService.addAction("addFood");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong when trying to add a food: " + e.getMessage());
        }
    }

    public void deleteFood(Integer id) {
        String sql = "DELETE FROM food WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The food was deleted successfully!");
                auditService.addAction("deleteFood");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to delete a food: " + e.getMessage());
        }
    }

    public void updateFoodCalories(Integer id, Integer calories) {
        String sql = "UPDATE food SET calories = ? WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, calories);
            statement.setInt(2, id);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("The food was updated successfully!");
                auditService.addAction("updateFoodCalories");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to update a food: " + e.getMessage());
        }
    }
}
