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
		j.setTitle("ע��");
		j.setLocationRelativeTo(null);
		j.setSize(232, 150);
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
		JTextField passworldText = new JTextField(20);
		passworldText.setBounds(56,40,150,25);
		panel.add(passworldText);

		JButton regButton = new JButton("ע�����û�");
		regButton.setBounds(35,70,150,30);
		panel.add(regButton);

		regButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg a = new reg(userText.getText());
				String regex = "[\u4E00-\u9FA5]+";
					if(userText.getText().trim().length() !=0 && passworldText.getText().trim().length() !=0) {
						if(a.rega()) {
							JOptionPane.showMessageDialog(null, "�û����Ѵ��ڣ�"+"\n"+"����������û���","ע��ʧ��",JOptionPane.ERROR_MESSAGE);	
						}else {
							a.add(userText.getText(), passworldText.getText());
							JOptionPane.showMessageDialog(null,"ע��ɹ���");
						}
					}else {
						JOptionPane.showMessageDialog(null, "�û��������벻��Ϊ�գ���","ע��ʧ��",JOptionPane.ERROR_MESSAGE);
					}
				
			}});

		j.add(panel);
		j.setVisible(true);
	}
	public static void main(String[] args) {
		regInterface a = new regInterface();
	}

}
