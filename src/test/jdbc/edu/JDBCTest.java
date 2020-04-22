package test.jdbc.edu;


import java.sql.* ;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver"; 
		//mysql驱动类标识字符串
		//com.mysql.jdbc.Drivermysql驱动类标识字符串
		//数据库连接字符串，127.0.0.1(localhost本机)目标机器IP地址，3306，mysql服务器默认服务端口号，mysql是mysql上的一个数据库名
		//useUnicode=true&characterEncoding=utf8连接参数，表示使用utf-8编码，避免出现中文乱码，useSSL=false表示不使用安全连接
		String URL = "jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&characterEncoding=utf8&useSSL=false";
        // 加载jdbc驱动
		//jdbc:mysql:”表示使用的数据库存取协议是mysql 的jdbc协议。
		//127.0.0.1：数据库服务器运行机器的ip地址，这个地址表示是本机。
		//3306 ： mysql服务器运行时绑定监听的网络端口号，mysql安装时默认是3306.
		//mysql：mysql服务器上的一个名为mysql的数据库。
		//”useUnicode=true&characterEncoding=utf8&useSSL=false"，访问数据库时的参数，定义了utf-8编码数据、非安全链接方式。
		/*b 根据驱动类名，编码加载驱动类 
	      Class.forName(driver);    需要进行异常处理编码*/
		try {
			Class.forName(driver);  //加载驱动，如果jdbc jar配置不正确或driver字符串写错，则会出错
		} 
		/*try { 可能产生异常的代码 } catch (Exception e) {   异常处理代码;
		   异常处理代码;
		}*/
		catch (ClassNotFoundException e) {
		    System.out.println("JDBC驱动加载失败");
		}
		/*加载jdbc驱动
		try {
			Class.forName(driver);  //加载驱动，如果jdbc jar配置不正确或driver字符串写错，则会出错
		} catch (ClassNotFoundException e) {
		    System.out.println("JDBC驱动加载失败");
		}*/
		try {
			// 连接数据库, URL,用户名，密码正确，目标mysql服务器正常运行
		  Connection conn =	DriverManager.getConnection(URL, "root", "123456");
		  System.out.println("数据库连接成功");
		  // 准备sql
		  String sql = "select * from user";//"select * from user where name='"+name+"'";
		  Statement  st = conn.createStatement(); //对应sql语句
		  ResultSet rs = st.executeQuery(sql);  // 执行sql，返回查询结果
		  // 循环读取并输出结果
		  while(rs.next()){ //循环判断是否有下一条记录，如果有，则移动到下一条记录
			  String name = rs.getString("user"); //根据表字段名，读取user字段值，varchar对应String
			  String host = rs.getString("host");
			  System.out.println(name+"  "+host);		  
		  }		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库存取失败"+e.getMessage());
		}
	}

}
