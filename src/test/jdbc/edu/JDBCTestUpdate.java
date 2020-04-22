package test.jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCTestUpdate {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver"; //mysql驱动类标识字符串
		String URL = "jdbc:mysql://127.0.0.1:3306/studb2?useUnicode=true&characterEncoding=utf8&useSSL=false";
        
		//从键盘读入用户名和密码
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名 密码：");
		String iname = sc.next();
		String ipasswd = sc.next();
		System.out.println(iname+","+ipasswd);
		
		
		try{
		   Class.forName(driver);
		   Connection conn = DriverManager.getConnection(URL,"root","123456");
		  // String sql = "insert into users(name,password) values ('taobao','mayun')";
		  // Statement st = conn.createStatement();
		   String sql="update users set password=? where name=? ";
	       PreparedStatement st = conn.prepareStatement(sql);
	       st.setString(1, ipasswd); //第一个参数对应是密码
	       st.setString(2, iname);

		   int res = st.executeUpdate(); //返回值是插入成功的记录条数，不成功，返回0
		   if(res>0){
			   System.out.println("插入数据更新成功");
		   }else{
			   System.out.println("插入数据失败");
		   }
		   
		   st.close();
		   conn.close();  
		   
        }catch(Exception e){
        	e.printStackTrace();
        	System.out.println("数据存取异常");
        }
	}
}