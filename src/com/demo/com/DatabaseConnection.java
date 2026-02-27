package com.demo.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DatabaseConnection 
{
	public static void main(String[] args) {
        // Standard JDBC URL for MySQL
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root"; // Your MySQL username
        String password = "admin"; // Your MySQL password

        try {
            // Load the driver (Optional in newer JDBC versions, but recommended for clarity)
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");
            
            String sql = " INSERT INTO students (sid, sname) VALUES (5, 'Tom')";
            PreparedStatement st = conn.prepareStatement(sql);
            st.executeUpdate();
            
            
            String sql1 = "SELECT * FROM students";
            ResultSet rs = conn.createStatement().executeQuery(sql1);
            while (rs.next()) {
                System.out.println(rs.getString("sname"));
            }
            
            
            String sql2 = "UPDATE students SET sname = ? WHERE sid = ?";
            PreparedStatement st1 = conn.prepareStatement(sql2);
            st1.setString(1, "newemail@example.com");
            st1.setInt(2, 1);
            st1.executeUpdate();

            
            
            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }

}
