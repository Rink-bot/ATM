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
				System.out.println("�������û�����");
				String name = sc.next();   //�����û���
				try {
					Class.forName(driver); 
				} 
				catch (ClassNotFoundException e) {
				    System.out.println("JDBC��������ʧ��");
				}
				try {
				  Connection conn =	DriverManager.getConnection(URL, "root", "123456");
				  System.out.println("���ݿ����ӳɹ�");
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
					System.out.println("���ݿ��ȡʧ��"+e.getMessage());
				}
				
				
				
				
				
				
			}

		}
