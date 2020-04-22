package test.jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCTestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver"; //mysql�������ʶ�ַ���
		String URL = "jdbc:mysql://127.0.0.1:3306/studb2?useUnicode=true&characterEncoding=utf8&useSSL=false";
        
		//�Ӽ��̶����û���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û��� ��");
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

		   int res = st.executeUpdate(); //����ֵ�ǲ���ɹ��ļ�¼���������ɹ�������0
		   if(res>0){
			   System.out.println("����ɾ���ɹ�");
		   }else{
			   System.out.println("ɾ������ʧ��");
		   }
		   
		   st.close();
		   conn.close();  
		   
        }catch(Exception e){
        	e.printStackTrace();
        	System.out.println("���ݴ�ȡ�쳣");
        }
	}


	}


