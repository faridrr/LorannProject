package model;

import java.io.IOException;
import java.sql.*;

public class DAOConnection extends DAOElements {
	public DAOConnection(java.sql.Connection connection) throws SQLException {
		super(connection);
	}

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jpublankproject?autoReconnect=true&useSSL=false";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	public char Connection(int x, int y) {
		int SQLx;
		int SQLy;
		char c = ' ';
		SQLx = x;
		SQLy = y;
		HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{call Selectlvl1(" + SQLx + "," + SQLy + ")}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			c = resultSet.getString("symbol").charAt(0);

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		return c;

	}

	@Override
	public boolean create(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Elements find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Elements find(String key) {
		// TODO Auto-generated method stub
		return null;
	}
}