package com.xworkz.ott.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.xworkz.ott.dto.OttDTO;

@Component
public class OttDAOImpl implements OttDAO {

	@Override
	public boolean save(OttDTO dto) {
		String sql = "INSERT INTO ottplatform VALUES(?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz-jdbc", "root",
				"Xworkzodc@123")) {

			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, dto.getOtt());
			statement.setString(2, dto.getRegion());
			statement.setString(3, dto.getSubscribe());
			statement.setInt(4, dto.getUsers());
			statement.setString(5, dto.getLanguage());
			statement.setInt(6, dto.getSince());
			statement.setBoolean(7, dto.isStatus());

			int rows = statement.executeUpdate();
			System.out.println("No. of Rows Affected= " + rows + statement);

			return rows > 0;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return true;
	}

}
