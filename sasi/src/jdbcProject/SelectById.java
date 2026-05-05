package jdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectById {
	public static void selectById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an id:");
		int id = sc.nextInt();
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("SELECT * FROM students WHERE id = ?");
			pst.setInt(1, id);
			ResultSet res = pst.executeQuery();
			if (res.next()) {
				int sid = res.getInt("id");
				String name = res.getString("name");
				String branch = res.getString("branch");
				System.out.println(sid + " " + name + " " + branch);
			} else {
				System.out.println("No student found with ID: " + id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
