import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("Homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//确认按钮点击
				//验证按钮事件被正确触发
				System.out.println("确认按钮被点击"); //调试输出
				balanceinquiry bi=new balanceinquiry();				
				bi.setVisible(true);  
				HomePage.this.setVisible(false);
			}
		});
		button.setBounds(60, 50, 110, 30);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u5B58\u6B3E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//确认按钮点击
				//验证按钮事件被正确触发
				System.out.println("确认按钮被点击"); //调试输出
				ATMdeposit de=new ATMdeposit();				
				de.setVisible(true);  
				HomePage.this.setVisible(false);
			}
		});
		btnNewButton.setBounds(240, 50, 110, 30);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("\u8F6C\u8D26");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//确认按钮点击
				//验证按钮事件被正确触发
				System.out.println("确认按钮被点击"); //调试输出
				transferaccounts ta=new transferaccounts();				
				ta.setVisible(true);  
				HomePage.this.setVisible(false);
			}
		});
		button_1.setBounds(60, 120, 110, 30);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6B3E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//确认按钮点击
				//验证按钮事件被正确触发
				System.out.println("确认按钮被点击"); //调试输出
				ATMwithdrawal wi=new ATMwithdrawal();				
				wi.setVisible(true);  
				HomePage.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(240, 120, 110, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u4EA4\u6613\u660E\u7EC6");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//确认按钮点击
				//验证按钮事件被正确触发
				System.out.println("确认按钮被点击"); //调试输出
				transactiondetail td=new transactiondetail();				
				td.setVisible(true);  
				HomePage.this.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(60, 190, 110, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u4FEE\u6539\u5BC6\u7801");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//确认按钮点击
				//验证按钮事件被正确触发
				System.out.println("确认按钮被点击"); //调试输出
				changepassword cp=new changepassword();				
				cp.setVisible(true);  
				HomePage.this.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(240, 190, 110, 30);
		contentPane.add(btnNewButton_3);
	}

}
