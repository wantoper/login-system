package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainInterface extends JFrame{
	
	public static void main(String[] args) {
		MainInterface a = new MainInterface();
		
	}

	
	public MainInterface() {
		//  界面
		JFrame j = new JFrame();
		j.setResizable(false);
		j.setTitle("登陆系统");
		j.setLocationRelativeTo(null);
		j.setSize(232, 150);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 添加画板
		JPanel panel = new JPanel();
		
		//  画板布局
			//  无格式
		panel.setLayout(null);
			// 用户名标签
		JLabel userbel = new JLabel("用户名：");
		userbel.setBounds(8,10,60,25);
		panel.add(userbel);
		
			// 密码标签
		JLabel passwordnel = new JLabel("    密码：");
		passwordnel.setBounds(8,40,60,25);
		panel.add(passwordnel);
		
			// 用户名输入框
		JTextField userText = new JTextField(20);
		userText.setBounds(56,6,150,25);
		panel.add(userText);
		
			// 密码输入框
		JPasswordField passworldText = new JPasswordField(20);
		passworldText.setBounds(56,40,150,25);
		panel.add(passworldText);
		
		JButton loginButton = new JButton("登录");
		loginButton.setBounds(30,70,70,30);
		panel.add(loginButton);
		
		JButton regButton = new JButton("注册");
		regButton.setBounds(130,70,70,30);
		panel.add(regButton);
		
		regButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					regInterface reg = new regInterface();
			}
		});
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = userText.getText();
				char [] mm =passworldText.getPassword();
				String password = String.valueOf(mm);
				login a= new login(user,password);
						if(user.trim().length() !=0 && password.trim().length()!=0) {
							if(a.iflogin()) {
								JOptionPane.showMessageDialog(null, "        登录成功！", "消息",JOptionPane.PLAIN_MESSAGE);  
								loginInterface login = new loginInterface(user);
								j.setVisible(false);
							}else {
								JOptionPane.showMessageDialog(null, "用户不存在或密码不正确！","登录失败",JOptionPane.ERROR_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, "用户名或密码不能为空！","登录失败",JOptionPane.ERROR_MESSAGE);
						}			
				}
		});
		
		
		
		j.add(panel);
		j.setVisible(true);
	}
}
	

	
