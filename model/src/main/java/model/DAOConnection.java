package model;

import java.io.IOException;
import java.sql.*;

public class DAOConnection extends DAOElements {
	public DAOConnection(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	public char checkMap(int x, int y) {
		char c = ' ';

		try {
			DAOConnection co = new DAOConnection(DBConnection.getInstance().getConnection());

			final String sql = "{call Selectlvl1(?,?)}";
			final CallableStatement call = co.getConnection().prepareCall("{call Selectlvl1(?,?)}"); 
			call.setInt(1, x);
			call.setInt(2, y);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.next()) {
			    c = resultSet.getString("symbol").charAt(0);
			}

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