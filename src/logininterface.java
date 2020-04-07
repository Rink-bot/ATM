import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logininterface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logininterface frame = new logininterface();
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
	public logininterface() {
		setTitle("Login inferface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u60A8\u7684\u5361\u53F7");
		label.setBackground(new Color(240, 240, 240));
		label.setBounds(40, 60, 110, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u60A8\u7684\u5BC6\u7801");
		label_1.setBounds(40, 110, 110, 20);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(210, 60, 120, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(210, 110, 120, 25);
		contentPane.add(passwordField);
		
		JButton button = new JButton("\u7EE7\u7EED");
		button.setBounds(66, 174, 113, 27);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u9000\u51FA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(logininterface.this, "确定退出系统");  //确认对话框
			    if(res == JOptionPane.YES_OPTION){   //点击yes按钮
				   System.exit(0);    //退出程序
			    }
			}
		});
		btnNewButton.setBounds(236, 174, 113, 27);
		contentPane.add(btnNewButton);
	}
}
