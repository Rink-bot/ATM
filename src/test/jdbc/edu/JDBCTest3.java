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
			System.out.println("驱动类加载错误");
		}
		
		try {
		   conn = DriverManager.getConnection(URL,"root","123456");
		   String sql = "insert into users(name,password) values ('关羽','ok') " ;
		   st = conn.createStatement();
		   int res = st.executeUpdate(sql);  // 返回值是插入成功的条数，不成功，返回0
		   if(res>0){
			   System.out.println("插入成功");
		   }else{
			   System.out.println("插入数据失败") ;
		   }
		   
		   sql = " delete from users where name='关羽' "  ;
		   res = st.executeUpdate(sql); // 返回值是删除成功的条数，不成功，返回0
		   if(res>0){
			   System.out.println("删除成功");
		   }else{
			   System.out.println("删除失败");
		   }
		   
		   
		   sql = "update users set password='123456' where name='fh' ";
		   res = st.executeUpdate(sql);// 返回值是更新成功的记录数，不成功，返回0
		   if(res>0){
			   System.out.println("更新记录成功");
		   }else{
			   System.out.println("更新记录失败") ;
		   }		   
		
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("数据存取失败");
		} finally{
		  try{	
			if(conn!=null){
				conn.close();
			}
		  }catch(Exception e){
			  e.printStackTrace();   //输出异常信息
		  }
		}

	}

}
