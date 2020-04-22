package test.jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCTestUpdate {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver"; //mysql�������ʶ�ַ���
		String URL = "jdbc:mysql://127.0.0.1:3306/studb2?useUnicode=true&characterEncoding=utf8&useSSL=false";
        
		//�Ӽ��̶����û���������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û��� ���룺");
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
	       st.setString(1, ipasswd); //��һ��������Ӧ������
	       st.setString(2, iname);

		   int res = st.executeUpdate(); //����ֵ�ǲ���ɹ��ļ�¼���������ɹ�������0
		   if(res>0){
			   System.out.println("�������ݸ��³ɹ�");
		   }else{
			   System.out.println("��������ʧ��");
		   }
		   
		   st.close();
		   conn.close();  
		   
        }catch(Exception e){
        	e.printStackTrace();
        	System.out.println("���ݴ�ȡ�쳣");
        }
	}
}