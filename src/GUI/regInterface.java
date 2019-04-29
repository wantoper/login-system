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

public class regInterface extends JFrame{
	public regInterface() {
		JFrame j = new JFrame();
		j.setResizable(false);
		j.setTitle("注册");
		j.setLocationRelativeTo(null);
		j.setSize(232, 150);
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
		JTextField passworldText = new JTextField(20);
		passworldText.setBounds(56,40,150,25);
		panel.add(passworldText);

		JButton regButton = new JButton("注册新用户");
		regButton.setBounds(35,70,150,30);
		panel.add(regButton);

		regButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg a = new reg(userText.getText());
				String regex = "[\u4E00-\u9FA5]+";
					if(userText.getText().trim().length() !=0 && passworldText.getText().trim().length() !=0) {
						if(a.rega()) {
							JOptionPane.showMessageDialog(null, "用户名已存在！"+"\n"+"请更换其他用户名","注册失败",JOptionPane.ERROR_MESSAGE);	
						}else {
							a.add(userText.getText(), passworldText.getText());
							JOptionPane.showMessageDialog(null,"注册成功！");
						}
					}else {
						JOptionPane.showMessageDialog(null, "用户名或密码不能为空！！","注册失败",JOptionPane.ERROR_MESSAGE);
					}
				
			}});

		j.add(panel);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		regInterface a = new regInterface();
	}

}
