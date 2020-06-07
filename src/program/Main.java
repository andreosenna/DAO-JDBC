package program;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBException;

public class Main {

	public static void main(String[] args) throws SQLException {

		Connection conn = DB.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
		st = (Statement) conn.createStatement();
		rs = st.executeQuery("Select * from department");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " - "+ rs.getString(2));
						}
			}
		catch(SQLException e) {
			throw new DBException(e.getMessage());
		
		}
		
		
		
		DB.closeResultSet(rs);
		DB.closeStatement(st);
		DB.closeConnection();
	}

}
