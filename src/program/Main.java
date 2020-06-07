package program;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import db.DB;
import db.DBException;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) throws SQLException {

		Department dp1 = new Department(1,"Vendas");
		Seller seller1 = new Seller(1,"Andre","andre@gmail.com",new Date(),3000.0,dp1);
		
		System.out.println(seller1);
		
		
		
	}

}
