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
		//  ����
		JFrame j = new JFrame();
		j.setResizable(false);
		j.setTitle("��½ϵͳ");
		j.setLocationRelativeTo(null);
		j.setSize(232, 150);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ӻ���
		JPanel panel = new JPanel();
		
		//  ���岼��
			//  �޸�ʽ
		panel.setLayout(null);
			// �û�����ǩ
		JLabel userbel = new JLabel("�û�����");
		userbel.setBounds(8,10,60,25);
		panel.add(userbel);
		
			// �����ǩ
		JLabel passwordnel = new JLabel("    ���룺");
		passwordnel.setBounds(8,40,60,25);
		panel.add(passwordnel);
		
			// �û��������
		JTextField userText = new JTextField(20);
		userText.setBounds(56,6,150,25);
		panel.add(userText);
		
			// ���������
		JPasswordField passworldText = new JPasswordField(20);
		passworldText.setBounds(56,40,150,25);
		panel.add(passworldText);
		
		JButton loginButton = new JButton("��¼");
		loginButton.setBounds(30,70,70,30);
		panel.add(loginButton);
		
		JButton regButton = new JButton("ע��");
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
								JOptionPane.showMessageDialog(null, "        ��¼�ɹ���", "��Ϣ",JOptionPane.PLAIN_MESSAGE);  
								loginInterface login = new loginInterface(user);
								j.setVisible(false);
							}else {
								JOptionPane.showMessageDialog(null, "�û������ڻ����벻��ȷ��","��¼ʧ��",JOptionPane.ERROR_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, "�û��������벻��Ϊ�գ�","��¼ʧ��",JOptionPane.ERROR_MESSAGE);
						}			
				}
		});
		
		
		
		j.add(panel);
		j.setVisible(true);
	}
}
	

	
