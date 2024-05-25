package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PopulateInstructorsTable {

    private static final String URL = "jdbc:mysql://localhost:3306/Instructor_Management_System";
    private static final String USER = "user";
    private static final String PASSWORD = "user";

    public static void main(String[] args) {
        String[] fullNames = {
            "John Doe", "Jane Smith", "Robert Brown", "Emily Davis", "Michael Johnson",
            "Linda Martinez", "William Wilson", "Elizabeth Taylor", "David Anderson", "Jennifer Thomas",
            "James Jackson", "Patricia White", "Charles Harris", "Barbara Martin", "Thomas Thompson",
            "Mary Garcia", "Christopher Clark", "Susan Rodriguez", "Daniel Lewis", "Karen Walker"
        };

        String[] expertiseAreas = {"Java Programming", "Web Development", "Data Science", "Machine Learning", "Database Management"};
        String[] bioDetails = {
            "Experienced Java developer with a passion for teaching.",
            "Front-end web developer with expertise in HTML, CSS, and JavaScript.",
            "Data scientist with a background in mathematics and statistics.",
            "Machine learning enthusiast focused on deep learning techniques.",
            "Experienced database administrator specializing in SQL and NoSQL databases."
        };

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String insertSQL = "INSERT INTO instructors (fullName, phoneNumber, email, expertise, bio) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                for (int i = 0; i < 20; i++) {
                    pstmt.setString(1, fullNames[i % fullNames.length]);
                    pstmt.setString(2, "555-010" + (i % 10)); // Example phone number
                    pstmt.setString(3, "instructor" + (i + 1) + "@example.com"); // Example email
                    pstmt.setString(4, expertiseAreas[i % expertiseAreas.length]);
                    pstmt.setString(5, bioDetails[i % bioDetails.length]);
                    pstmt.executeUpdate();
                    System.out.println("Data " + (i + 1) + " inserted successfully!");
                    // Pause execution for a random duration between 5 to 10 seconds
                    int delay = 5000 + (int) (Math.random() * 6000);
                    Thread.sleep(delay);
                }
                System.out.println("Sample data inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Error during sleep: " + e.getMessage());
        }
    }
}