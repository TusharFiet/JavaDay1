package com.tushar.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.tushar.bean.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public int checkBalance(int accNo) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int balance=0;
		
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT BALANCE FROM ACCOUNT WHERE ACCNO=?");
			
			preparedStatement.setInt(1, accNo);
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			
			if(resultSet.next()) {
				balance = resultSet.getInt("BALANCE");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return balance;
	}

	@Override
	public int updateNameByAccountName(int accNo, String name) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			
//			2. Query
			preparedStatement=connection.prepareStatement("UPDATE ACCOUNT SET ACCNAME=? WHERE ACCNO=?");
			
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, accNo);
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int updateBalance(int accNo, int amount) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			
//			2. Query
			preparedStatement=connection.prepareStatement("UPDATE ACCOUNT SET BALANCE=? WHERE ACCNO=?");
			
			preparedStatement.setInt(1, amount);
			preparedStatement.setInt(2, accNo);
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	

}
