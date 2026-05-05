package jdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {
	static void insertStudents() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id");
		int id = sc.nextInt();
		System.out.println("Enter user name");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter user Branch");
		String branch = sc.nextLine();

		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into students values (?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, branch);
		int n = pst.executeUpdate();
		if (n > 0) {
			System.out.println(n + ":Rows inserted");
		} else {
			System.out.println("somthing went wrong");
		}

	}
}
