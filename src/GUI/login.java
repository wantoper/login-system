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
              
            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
            ResultSet rs = s.executeQuery(sql);
              
            if(rs.next())
                f = true;
            
			
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		return f;
	}
	public static void main(String[] args) {
		login a = new login("admin","13");
		if(a.iflogin()) 
			System.out.println("��½�ɹ�");
		else
			System.out.println("��½ʧ��");
	}


}
