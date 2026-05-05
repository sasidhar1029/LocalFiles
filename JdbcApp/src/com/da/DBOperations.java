package com.da;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dto.StudentDTO;
import com.utility.DBConnection;

public class DBOperations implements DBOperationsInterface {
    String status = "fail";

    @Override
    public String insertStudents(StudentDTO sd) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into students values(?,?,?,?)");
            pst.setInt(1, sd.getId());
            pst.setString(2, sd.getName());
            pst.setString(3, sd.getEmail());
            pst.setString(4, sd.getCourse());

            int n = pst.executeUpdate();
            if (n > 0) {
                status = "Success";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
