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
//		JLabel welcome = new JLabel("��ӭʹ��XX��¼ϵͳ");
//		welcome.setBounds(45,0,200,25);
//		panel.add(welcome);
		
//		JLabel yhu = new JLabel("�û�����" + yhum);
//		yhu.setBounds(10,0,200,25);
//		panel.add(yhu);
		
		JTextArea ltk = new JTextArea(12,35);
		ltk.setEditable(false);
		//ltk.setBounds(0, 2, 500, 310);
		panel.add(ltk);
		ltk.append("��ӭ����***��������������� \n");
		
		JScrollPane showpanel = new JScrollPane(ltk);
		showpanel.setBounds(0, 2, 480, 310);
		showpanel.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(showpanel);
		
		JLabel xx = new JLabel("������Ϣ");
		xx.setBounds(20,325,200,25);
		panel.add(xx);
		
		JTextField xxck = new JTextField();
		xxck.setBounds(82,320,300,35);
		panel.add(xxck);
		
		JButton fs = new JButton("����");
		fs.setBounds(390, 322, 80, 30);
		panel.add(fs);
		
		fs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(xxck.getText().trim().length() !=0 && xxck.getText().trim().length()!=0) {
					ltk.append(yhum +": "+xxck.getText() +"\n");
				}else {
					ltk.append("��Ϣ����Ϊ�գ� \n");
				}
					
			}
		});
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("�û�����   " + "�û�:"+yhum);
		j.setLocationRelativeTo(null);
		j.setSize(500, 400);
		j.add(panel);
		j.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		loginInterface a=  new loginInterface("test");

	}

}
