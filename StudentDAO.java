
import java.sql.*;
import java.util.*;

public class StudentDAO {

    public void insertStudent(String name, String dept, int marks) {
        String sql = "INSERT INTO students (name, department, marks) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, dept);
            pst.setInt(3, marks);

            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Student inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error inserting student: " + e.getMessage());
        }
    }

    public void viewStudents() {
        String sql = "SELECT * FROM students";
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n📋 Student List:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                int marks = rs.getInt("marks");
                System.out.println(id + " | " + name + " | " + dept + " | " + marks);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error reading students: " + e.getMessage());
        }
    }
}
