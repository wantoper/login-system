package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class reg {
	Boolean f = false;
	String user;
	
	
	
	
	public reg(String usera) {
		this.user = usera;
	}
	
	public Boolean rega() {
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
   
            String sql = "select * from user where user = '" + user+"' ";
              
            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next()) {
            	f = true;
            	
            }
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return f;
	}
	
	public void add(String u,String p) {
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
   
            String sql = "insert into user values(null" + ","  + "'"+ u +"'" + "," + "'"+p+"'"+")";
              
            // 执行查询语句，并把结果集返回给ResultSet
            s.execute(sql);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		reg a = new reg("admin");
		
		a.add("wandefi", "wandefi");
	}
}
