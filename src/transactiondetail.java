import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class transactiondetail extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					transactiondetail frame = new transactiondetail();
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
	public transactiondetail() {
		setTitle("transactiondetail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ȷ�ϰ�ť�����");
				HomePage hp = new HomePage();  
				hp.setVisible(true);  
				transactiondetail.this.setVisible(false);
			}
		});
		button.setBounds(57, 169, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(transactiondetail.this, "ȷ���˳�ϵͳ");  //ȷ�϶Ի���
			    if(res == JOptionPane.YES_OPTION){   //���yes��ť
				   System.exit(0);    //�˳�����
			}
			}
		});
		button_1.setBounds(237, 169, 113, 27);
		contentPane.add(button_1);
	}

}
