package test.jdbc.edu;


import java.sql.* ;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver"; 
		//mysql�������ʶ�ַ���
		//com.mysql.jdbc.Drivermysql�������ʶ�ַ���
		//���ݿ������ַ�����127.0.0.1(localhost����)Ŀ�����IP��ַ��3306��mysql������Ĭ�Ϸ���˿ںţ�mysql��mysql�ϵ�һ�����ݿ���
		//useUnicode=true&characterEncoding=utf8���Ӳ�������ʾʹ��utf-8���룬��������������룬useSSL=false��ʾ��ʹ�ð�ȫ����
		String URL = "jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&characterEncoding=utf8&useSSL=false";
        // ����jdbc����
		//jdbc:mysql:����ʾʹ�õ����ݿ��ȡЭ����mysql ��jdbcЭ�顣
		//127.0.0.1�����ݿ���������л�����ip��ַ�������ַ��ʾ�Ǳ�����
		//3306 �� mysql����������ʱ�󶨼���������˿ںţ�mysql��װʱĬ����3306.
		//mysql��mysql�������ϵ�һ����Ϊmysql�����ݿ⡣
		//��useUnicode=true&characterEncoding=utf8&useSSL=false"���������ݿ�ʱ�Ĳ�����������utf-8�������ݡ��ǰ�ȫ���ӷ�ʽ��
		/*b ��������������������������� 
	      Class.forName(driver);    ��Ҫ�����쳣�������*/
		try {
			Class.forName(driver);  //�������������jdbc jar���ò���ȷ��driver�ַ���д��������
		} 
		/*try { ���ܲ����쳣�Ĵ��� } catch (Exception e) {   �쳣�������;
		   �쳣�������;
		}*/
		catch (ClassNotFoundException e) {
		    System.out.println("JDBC��������ʧ��");
		}
		/*����jdbc����
		try {
			Class.forName(driver);  //�������������jdbc jar���ò���ȷ��driver�ַ���д��������
		} catch (ClassNotFoundException e) {
		    System.out.println("JDBC��������ʧ��");
		}*/
		try {
			// �������ݿ�, URL,�û�����������ȷ��Ŀ��mysql��������������
		  Connection conn =	DriverManager.getConnection(URL, "root", "123456");
		  System.out.println("���ݿ����ӳɹ�");
		  // ׼��sql
		  String sql = "select * from user";//"select * from user where name='"+name+"'";
		  Statement  st = conn.createStatement(); //��Ӧsql���
		  ResultSet rs = st.executeQuery(sql);  // ִ��sql�����ز�ѯ���
		  // ѭ����ȡ��������
		  while(rs.next()){ //ѭ���ж��Ƿ�����һ����¼������У����ƶ�����һ����¼
			  String name = rs.getString("user"); //���ݱ��ֶ�������ȡuser�ֶ�ֵ��varchar��ӦString
			  String host = rs.getString("host");
			  System.out.println(name+"  "+host);		  
		  }		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���ݿ��ȡʧ��"+e.getMessage());
		}
	}

}
