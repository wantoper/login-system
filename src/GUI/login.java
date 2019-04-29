package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login {
	private static String user;
	private static String password;
	
	public login(String user,String password) {
		this.user = user;
		this.password = password;
	}
	
	public boolean iflogin() {
		boolean f = false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try(
				Connection c = DriverManager.getConnection(
                        "jdbc:mysql://192.168.175.129:3306/loginsystem?characterEncoding=UTF-8",
                        "root", "root");
				Statement s = c.createStatement();
				){



   
            String sql = "select * from user where user = '" + user +"' and password = '" + password+"'";
              
            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
              
            if(rs.next())
                f = true;
            
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return f;
	}
	public static void main(String[] args) {
		login a = new login("admin","13");
		if(a.iflogin()) 
			System.out.println("登陆成功");
		else
			System.out.println("登陆失败");
	}


}
