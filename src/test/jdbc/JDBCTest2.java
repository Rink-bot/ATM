package test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {

	public static void main(String[] args) {
				String driver = "com.mysql.jdbc.Driver"; 
				String URL = "jdbc:mysql://127.0.0.1:3306/studb?useUnicode=true&characterEncoding=utf8&useSSL=false";		 
				try {
					Class.forName(driver); 
				} 
				catch (ClassNotFoundException e) {
				    System.out.println("JDBC��������ʧ��");
				}
				try {
				  Connection conn =	DriverManager.getConnection(URL, "root", "123456");
				  System.out.println("���ݿ����ӳɹ�");
				  String sql = "select * from users";
				  Statement  st = conn.createStatement(); 
				  ResultSet rs = st.executeQuery(sql);
				  while(rs.next()){ 
					  String name = rs.getString("name"); 
					  String host = rs.getString("password");
					  System.out.println(name+"  "+host);	  
				  }
		  //"select * from users where name='"+name+"'";
				} catch (SQLException e) {
					System.out.println("���ݿ��ȡʧ��"+e.getMessage());
				}
			}

		}
