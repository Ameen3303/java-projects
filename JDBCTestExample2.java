package java_with_DSA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTestExample2 {
    public static void main(String[] as) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/Studentdb", "root", "3303");
            String insertSQL = "REPLACE INTO students VALUES(?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);
            Object[][] students = {
                {3303, "Ameen",302},
                {3319, "teja",250},
                {3320, "haran",200},
                {3309, "chaitu",110},
                {3325, "hrudya",300},
                {3301, "afrid",280}
            };

            for (Object[] student : students) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.setInt(3, (int) student[2]);
                pstmt.executeUpdate();
            }

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
