package jdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudents {

	public static void deleteStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id");
		int id = sc.nextInt();
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("delete from students where id =?");
			pst.setInt(1, id);
			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + ":rows deleted");
			} else {
				System.err.println("Something went wrong");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
