package jdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UpdateStudents {
	public static void updateStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter a Branch");
		String Branch = sc.nextLine();
		System.out.println("Enter id");
		int id = sc.nextInt();
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("update students set name =? , branch =? where id =?");
			pst.setString(1, name);
			pst.setString(2,Branch);
			pst.setInt(3, id);
			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println(n + ":rows updated");
			} else {
				System.out.println("Something went wrong");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
