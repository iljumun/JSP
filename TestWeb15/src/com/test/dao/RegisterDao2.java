package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.test.beans.Register;

public class RegisterDao2 {
	
	// * CRUD : Create Retrieve Update Delete
	//SELECT
	//VIEW
	//INSERT
	//UPDATE
	//DELETE

	public static Connection getConnection() throws NamingException, SQLException {
		  InitialContext ic = new InitialContext();
	      DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
	      return ds.getConnection();
	}
	
	public static List<Register> getAllRecords() throws NamingException, SQLException{
		Connection conn = getConnection();
		String strsql = "SELECT * FROM REGISTER";
		PreparedStatement stmt = conn.prepareStatement(strsql);
		ResultSet rs = stmt.executeQuery();
		List<Register> list = new ArrayList<Register>(); //빈 어레이 리스트 생성
		while(rs.next()) {
			Register r = new Register();
			r.setId(rs.getInt("ID")); // r에 set 무엇을? rs의 ID를
			r.setName(rs.getNString("NAME"));
			r.setPassword(rs.getString("PASSWORD"));
			r.setSex(rs.getString("SEX"));
			r.setEmail(rs.getString("EMAIL"));
			r.setCountry(rs.getString("COUNTRY"));
			list.add(r); // r을 list에 add 
		}
		return list;
		
	}
}
