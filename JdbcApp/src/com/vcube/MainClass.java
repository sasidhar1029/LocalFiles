package com.vcube;
import com.da.DBOperations;
import com.dto.StudentDTO;

public class MainClass {
    public static void main(String[] args) {
        DBOperations dbo = new DBOperations();
        StudentDTO sd = new StudentDTO();
        
        sd.setId(5);
        sd.setName("arjun");
        sd.setEmail("sasidhar1029@gmail.com");
        sd.setCourse("pfs");

        String s = dbo.insertStudents(sd);

        if (s.equals("Success")) {
            System.out.println("Data inserted successfully");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
