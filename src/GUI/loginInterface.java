package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class loginInterface extends JFrame {
	public loginInterface( String yhum) {
		JFrame j = new JFrame();
		j.setResizable(false);
		JPanel panel = new JPanel();
		panel.setLayout(null);
//		JLabel welcome = new JLabel("欢迎使用XX登录系统");
//		welcome.setBounds(45,0,200,25);
//		panel.add(welcome);
		
//		JLabel yhu = new JLabel("用户名：" + yhum);
//		yhu.setBounds(10,0,200,25);
//		panel.add(yhu);
		
		JTextArea ltk = new JTextArea(12,35);
		ltk.setEditable(false);
		//ltk.setBounds(0, 2, 500, 310);
		panel.add(ltk);
		ltk.append("欢迎来到***软件，请文明聊天 \n");
		
		JScrollPane showpanel = new JScrollPane(ltk);
		showpanel.setBounds(0, 2, 480, 310);
		showpanel.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(showpanel);
		
		JLabel xx = new JLabel("聊天消息");
		xx.setBounds(20,325,200,25);
		panel.add(xx);
		
		JTextField xxck = new JTextField();
		xxck.setBounds(82,320,300,35);
		panel.add(xxck);
		
		JButton fs = new JButton("发送");
		fs.setBounds(390, 322, 80, 30);
		panel.add(fs);
		
		fs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(xxck.getText().trim().length() !=0 && xxck.getText().trim().length()!=0) {
					ltk.append(yhum +": "+xxck.getText() +"\n");
				}else {
					ltk.append("消息不能为空！ \n");
				}
					
			}
		});
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("用户界面   " + "用户:"+yhum);
		j.setLocationRelativeTo(null);
		j.setSize(500, 400);
		j.add(panel);
		j.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		loginInterface a=  new loginInterface("test");

	}

}
