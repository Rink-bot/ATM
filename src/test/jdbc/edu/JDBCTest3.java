package test.jdbc.edu;
import java.sql.* ;
public class JDBCTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://127.0.0.1:3306/studb2?useUnicode=true&characterEncoding=utf8&useSSL=false";
		Connection  conn = null;
		Statement st = null;
		
		try{
		  Class.forName(driver);
		}catch(Exception e){
			System.out.println("��������ش���");
		}
		
		try {
		   conn = DriverManager.getConnection(URL,"root","123456");
		   String sql = "insert into users(name,password) values ('����','ok') " ;
		   st = conn.createStatement();
		   int res = st.executeUpdate(sql);  // ����ֵ�ǲ���ɹ������������ɹ�������0
		   if(res>0){
			   System.out.println("����ɹ�");
		   }else{
			   System.out.println("��������ʧ��") ;
		   }
		   
		   sql = " delete from users where name='����' "  ;
		   res = st.executeUpdate(sql); // ����ֵ��ɾ���ɹ������������ɹ�������0
		   if(res>0){
			   System.out.println("ɾ���ɹ�");
		   }else{
			   System.out.println("ɾ��ʧ��");
		   }
		   
		   
		   sql = "update users set password='123456' where name='fh' ";
		   res = st.executeUpdate(sql);// ����ֵ�Ǹ��³ɹ��ļ�¼�������ɹ�������0
		   if(res>0){
			   System.out.println("���¼�¼�ɹ�");
		   }else{
			   System.out.println("���¼�¼ʧ��") ;
		   }		   
		
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("���ݴ�ȡʧ��");
		} finally{
		  try{	
			if(conn!=null){
				conn.close();
			}
		  }catch(Exception e){
			  e.printStackTrace();   //����쳣��Ϣ
		  }
		}

	}

}
