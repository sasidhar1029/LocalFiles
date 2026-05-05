//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//import com.vcube.dto.UpasswordDto;
//import com.vcube.utility.DBConnection;
//
//public String updateStudent(UpasswordDto u) {
//
//    try (Connection con = DBConnection.getConnection();
//         PreparedStatement ps = con.prepareStatement(
//                 "UPDATE students SET password=? WHERE username=?")) {
//
//        ps.setString(1, u.getNewPassword());
//        ps.setString(2, u.getUsername());
//
//        return ps.executeUpdate() > 0 ? "success" : "failure";
//
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    return "failure";
//}
