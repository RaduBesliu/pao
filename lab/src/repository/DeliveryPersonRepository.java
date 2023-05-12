package repository;

import config.DatabaseConnection;
import models.DeliveryPerson;
import services.AuditService;

import java.sql.PreparedStatement;

public class DeliveryPersonRepository {
    AuditService auditService = new AuditService();

    public void getDeliveryPeople() {
        String sql = "SELECT * FROM delivery_person";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("---------DELIVERY PERSON---------");
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Age: " + result.getInt("age"));
                System.out.println("Username: " + result.getString("user_name"));
                System.out.println("Phone number: " + result.getString("phone_number"));
                System.out.println("Address: " + result.getString("address"));
                System.out.println("Hourly rate: " + result.getDouble("hourly_rate"));
                System.out.println("Total orders: " + result.getInt("total_orders"));
                System.out.println("---------------------------------");
            }

            auditService.addAction("getDeliveryPeople");
        } catch (Exception e) {
            System.out.println("Something went wrong when trying to get delivery people: " + e.getMessage());
        }
    }

    public void addDeliveryPerson(DeliveryPerson deliveryPerson) {
        String sql = "INSERT INTO delivery_person VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setString(1, deliveryPerson.getName());
            statement.setInt(2, deliveryPerson.getAge());
            statement.setString(3, deliveryPerson.getUserName());
            statement.setString(4, deliveryPerson.getPhoneNumber());
            statement.setString(5, deliveryPerson.getAddress());
            statement.setDouble(6, deliveryPerson.getHourlyRate());
            statement.setInt(7, deliveryPerson.getTotalOrders());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new delivery person was inserted successfully!");
                auditService.addAction("addDeliveryPerson");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong when trying to add a delivery person: " + e.getMessage());
        }
    }

    public void deleteDeliveryPerson(Integer id) {
        String sql = "DELETE FROM delivery_person WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Delivery person was deleted successfully!");
                auditService.addAction("deleteDeliveryPerson");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong when trying to delete a delivery person: " + e.getMessage());
        }
    }

    public void updateDeliveryPersonHourlyRate(Integer id, Double hourlyRate) {
        String sql = "UPDATE delivery_person SET hourly_rate = ? WHERE id = ?";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setDouble(1, hourlyRate);
            statement.setInt(2, id);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Delivery person was updated successfully!");
                auditService.addAction("updateDeliveryPersonHourlyRate");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong when trying to update a delivery person: " + e.getMessage());
        }
    }
}
