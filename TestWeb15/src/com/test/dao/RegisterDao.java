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


//connection
public class RegisterDao {
   public static Connection getConnection() 
         throws NamingException, SQLException {
      InitialContext ic = new InitialContext();
      DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
      return ds.getConnection();
   }
   //select
   public static List<Register> getAllRecords() throws NamingException, SQLException{
      List<Register> list = new ArrayList<Register>();
      Connection conn = getConnection();
      String strSql = "select * from register order by ID";
      PreparedStatement stmt = conn.prepareStatement(strSql);
      ResultSet rs = stmt.executeQuery();
      while(rs.next()) {
         Register r =new Register();
         r.setId(rs.getInt("ID"));
         r.setName(rs.getString("NAME"));
         r.setPassword(rs.getString("PASSWORD"));
         r.setSex(rs.getString("SEX"));
         r.setEmail(rs.getString("EMAIL"));
         r.setCountry(rs.getString("Country"));
         list.add(r);
      }
      rs.close();
      stmt.clearBatch();
      conn.close();
      return list;
   }
   public static Register getRecordById(int id) throws NamingException, SQLException {
	   	  Connection conn = getConnection();
	      String strSql = "select * from register where ID = ? ";
	      PreparedStatement stmt = conn.prepareStatement(strSql);
	      stmt.setInt(1, id);
	      ResultSet rs = stmt.executeQuery();
	      Register r= null;
	      while(rs.next()) {
	         r = new Register();
	         r.setId(rs.getInt("ID"));
	         r.setName(rs.getString("NAME"));
	         r.setPassword(rs.getString("PASSWORD"));
	         r.setSex(rs.getString("SEX"));
	         r.setEmail(rs.getString("EMAIL"));
	         r.setCountry(rs.getString("Country"));
	      }
	      rs.close();
	      stmt.clearBatch();
	      conn.close();
	      return r;
	   }
	   
	   
   
   //insert
   public static int save(Register r) {
      return 0;
   }
   
   //update
   public static int update(Register r) {
      return 0;
   }
   //delete
   public static int delete(Register r) {
      return 0;
   }
   
   
   
   
}