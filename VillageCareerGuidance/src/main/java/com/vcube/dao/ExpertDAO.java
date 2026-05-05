package com.vcube.dao;

import com.vcube.model.Expert;
import com.vcube.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpertDAO {

	public List<Expert> getAllExperts() {
		List<Expert> list = new ArrayList<>();
		String sql = "SELECT * FROM experts ORDER BY created_at DESC";
		try (Connection con = DBConnection.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()) {

			while (rs.next()) {
				Expert e = new Expert();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSector(rs.getString("sector"));
				e.setShortBio(rs.getString("short_bio"));
				e.setLinkedin(rs.getString("linkedin"));
				e.setEmail(rs.getString("email"));
				list.add(e);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	public boolean addExpert(Expert e) {
		String sql = "INSERT INTO experts (name, sector, short_bio, linkedin, email) VALUES (?,?,?,?,?)";
		try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, e.getName());
			pst.setString(2, e.getSector());
			pst.setString(3, e.getShortBio());
			pst.setString(4, e.getLinkedin());
			pst.setString(5, e.getEmail());
			int n = pst.executeUpdate();
			return n > 0;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}