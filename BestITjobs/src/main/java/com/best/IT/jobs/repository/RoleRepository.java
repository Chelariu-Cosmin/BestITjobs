package com.best.IT.jobs.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.best.IT.jobs.hibernate.Rol;
import com.best.IT.jobs.utility.JDBCDataSource;

public class RoleRepository {

	public static Rol findByRol(String rolNume)
	{
		Rol rol=new Rol();
		
		try {
			Connection con=JDBCDataSource.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from rol where numeRol=?");
			ps.setString(1,rolNume);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				rol.setId(rs.getInt("rol_id"));
				rol.setNume(rs.getString("numeRol"));
				
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rol;
	}
}
