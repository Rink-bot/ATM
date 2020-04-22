package test.jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest2 {

	public static void main(String[] args) {
				String driver = "com.mysql.jdbc.Driver"; 
				String URL = "jdbc:mysql://127.0.0.1:3306/studb2?useUnicode=true&characterEncoding=utf8&useSSL=false";		 
				Scanner sc = new Scanner(System.in);
				System.out.println("请输入用户名：");
				String name = sc.next();   //读入用户名
				try {
					Class.forName(driver); 
				} 
				catch (ClassNotFoundException e) {
				    System.out.println("JDBC驱动加载失败");
				}
				try {
				  Connection conn =	DriverManager.getConnection(URL, "root", "123456");
				  System.out.println("数据库连接成功");
				  String sql = "select * from users where name='"+name+"'";// "select * from users where name='wj'";
				  Statement  st = conn.createStatement(); 
				  ResultSet rs = st.executeQuery(sql);
				  while(rs.next()){ 
					  String name2 = rs.getString("name"); 
					  String host = rs.getString("password");
					  System.out.println(name2+"  "+host);	  
				  }
		  //"select * from users where name='"+name+"'";
				} catch (SQLException e) {
					System.out.println("数据库存取失败"+e.getMessage());
				}
				
				
				
				
				
				
			}

		}
