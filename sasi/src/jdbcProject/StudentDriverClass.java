package jdbcProject;

import java.sql.SQLException;

public class StudentDriverClass {

	public static void main(String[] args) throws SQLException {
		InsertStudent.insertStudents();
		ViewStudents.viewStudents();
		SelectById.selectById();
		UpdateStudents.updateStudents();
		DeleteStudents.deleteStudents();

	}

}
