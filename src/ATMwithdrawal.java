import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ATMwithdrawal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMwithdrawal frame = new ATMwithdrawal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ATMwithdrawal() {
		setTitle("ATMwithdrawal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u60A8\u8981\u53D6\u6B3E\u7684\u91D1\u989D\u4E3A");
		label.setBounds(145, 19, 127, 18);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("100");
		btnNewButton.setBounds(50, 50, 100, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("300");
		btnNewButton_1.setBounds(50, 100, 100, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("500");
		btnNewButton_2.setBounds(50, 150, 100, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u81EA\u5B9A\u4E49");
		btnNewButton_3.setBounds(250, 150, 100, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("400");
		btnNewButton_4.setBounds(250, 100, 100, 25);
		contentPane.add(btnNewButton_4);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("确认按钮被点击");
				HomePage hp = new HomePage();  
				hp.setVisible(true);  
				ATMwithdrawal.this.setVisible(false);
			}
		});
		
		JButton btnNewButton_5 = new JButton("200");
		btnNewButton_5.setBounds(250, 50, 100, 25);
		contentPane.add(btnNewButton_5);
		button.setBounds(50, 200, 100, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(ATMwithdrawal.this, "确定退出系统");  //确认对话框
			    if(res == JOptionPane.YES_OPTION){   //点击yes按钮
				   System.exit(0);    //退出程序
			}
			}
		});
		button_1.setBounds(250, 200, 100, 25);
		contentPane.add(button_1);
	}

}
