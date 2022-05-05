package com.best.IT.jobs.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.best.IT.jobs.exceptions.InvalidPassException;
import com.best.IT.jobs.hibernate.*;
import com.best.IT.jobs.utility.EncryptAndDecryptPass;
import com.best.IT.jobs.utility.JDBCDataSource;
//import jdk.nashorn.internal.ir.WhileNode;

public class UserRepository {

	private static RoleRepository roleRepository;

	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(id) from user");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				pk = rs.getLong(1);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return pk + 1;

	}

	public static long addUser(User user) {
		int i = 0;

		try {
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setString(2, user.getUserName());
			stmt.setString(3, EncryptAndDecryptPass.encrypt(user.getPassword(), EncryptAndDecryptPass.HiddenKey));
			stmt.setInt(4, user.getRolId());
			stmt.setString(5, user.getFirstName());
			stmt.setString(6, user.getLastName());
			stmt.setDate(7, new java.sql.Date(user.getDateOfBirth().getTime()));
			stmt.setString(8, user.getEmail());
			i = stmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return i;

	}

//Login User......
	public static User UserLogin(String userName, String password) throws Exception {
		Connection con;
		User user = null;
		con = JDBCDataSource.getConnection();
		PreparedStatement stmt = con.prepareStatement("Select * from user where userName=?");
		stmt.setString(1, userName);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			user = new User();
			System.out.println("ID: " + rs.getLong("id"));
			user.setUserId(rs.getInt("id"));
			user.setFirstName(rs.getString("firstName"));
			user.setLastName(rs.getString("lastName"));
			user.setUserName(rs.getString("userName"));
			user.setPassword(rs.getString("password"));
			user.setDateOfBirth(rs.getDate("dateOfBirth"));
			user.setEmail(rs.getString("email"));
			user.setRolId(rs.getInt("rol_Id"));

			String decryptPass = EncryptAndDecryptPass.decrypt(user.getPassword(), EncryptAndDecryptPass.HiddenKey);
			if (!decryptPass.equals(password)) {
				throw new InvalidPassException("Atentie: nume utilizator sau parola gresite");
			}
		} else {
			return null;

		}
		return user;
	}
}
