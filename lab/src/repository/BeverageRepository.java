package repository;

import config.DatabaseConnection;
import models.Beverage;
import services.AuditService;

import java.sql.PreparedStatement;

public class BeverageRepository {
    AuditService auditService = new AuditService();

    public void getBeverages() {
        String sql = "SELECT * FROM beverage";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("---------BEVERAGE---------");
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Price: " + result.getDouble("price"));
                System.out.println("Quantity: " + result.getInt("quantity"));
                System.out.println("Description: " + result.getString("description"));
                System.out.println("Is alcoholic: " + result.getBoolean("is_alcoholic"));
                System.out.println("Milliliters: " + result.getInt("milliliters"));
                System.out.println("-----------------------------");
            }

            auditService.addAction("getBeverages");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get beverages: " + e.getMessage());
        }
    }

    public void addBeverage(Beverage beverage) {
        String sql = "INSERT INTO beverage VALUES (null, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setString(1, beverage.getName());
            statement.setDouble(2, beverage.getPrice());
            statement.setInt(3, beverage.getQuantity());
            statement.setString(4, beverage.getDescription());
            statement.setBoolean(5, beverage.getIsAlcoholic());
            statement.setInt(6, beverage.getMilliliters());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new beverage was inserted successfully!");
                auditService.addAction("addBeverage");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong when trying to add a beverage: " + e.getMessage());
        }
    }

    public void deleteBeverage(Integer id) {
        String sql = "DELETE FROM beverage WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Beverage deleted successfully!");
                auditService.addAction("deleteBeverage");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong when trying to delete a beverage: " + e.getMessage());
        }
    }


    public void updateBeveragePrice(Integer id, Double price) {
        String sql = "UPDATE beverage SET price = ? WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setDouble(1, price);
            statement.setInt(2, id);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Beverage updated successfully!");
                auditService.addAction("updateBeveragePrice");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to update a beverage: " + e.getMessage());
        }
    }
}
