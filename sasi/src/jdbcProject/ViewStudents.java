package jdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewStudents {

	public static void viewStudents() {
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("select * from  students");
			ResultSet res = pst.executeQuery();
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
