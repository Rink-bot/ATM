package test.jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCTestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver"; //mysql驱动类标识字符串
		String URL = "jdbc:mysql://127.0.0.1:3306/studb2?useUnicode=true&characterEncoding=utf8&useSSL=false";
        
		//从键盘读入用户名
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名 ：");
		String iname = sc.next();
		System.out.println(iname);
		
		
		try{
		   Class.forName(driver);
		   Connection conn = DriverManager.getConnection(URL,"root","123456");
		  // String sql = "insert into users(name,password) values ('taobao','mayun')";
		  // Statement st = conn.createStatement();
		   String sql="delete from users where name=? ";
	       PreparedStatement st = conn.prepareStatement(sql);      
	       st.setString(1, iname);

		   int res = st.executeUpdate(); //返回值是插入成功的记录条数，不成功，返回0
		   if(res>0){
			   System.out.println("数据删除成功");
		   }else{
			   System.out.println("删除数据失败");
		   }
		   
		   st.close();
		   conn.close();  
		   
        }catch(Exception e){
        	e.printStackTrace();
        	System.out.println("数据存取异常");
        }
	}


	}


