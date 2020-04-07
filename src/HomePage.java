import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		setBounds(100, 100, 451, 325);
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
		button.setBounds(60, 50, 100, 25);
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
		btnNewButton.setBounds(240, 50, 100, 25);
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
		button_1.setBounds(60, 100, 100, 25);
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
		btnNewButton_1.setBounds(240, 100, 100, 25);
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
		btnNewButton_2.setBounds(60, 150, 100, 25);
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
		btnNewButton_3.setBounds(240, 150, 100, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel label = new JLabel("\u8BF7\u60A8\u9009\u62E9\u9700\u8981\u7684\u4E1A\u52A1");
		label.setBounds(135, 19, 141, 18);
		contentPane.add(label);
		
		JButton btnNewButton_4 = new JButton("\u8FD4\u56DE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//确认按钮点击
				//验证按钮事件被正确触发
				System.out.println("确认按钮被点击"); //调试输出
				logininterface cp=new logininterface();				
				cp.setVisible(true);  
				HomePage.this.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(57, 200, 100, 25);
		contentPane.add(btnNewButton_4);
		
		JButton button_2 = new JButton("\u9000\u51FA");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(HomePage.this, "确定退出系统");  //确认对话框
			    if(res == JOptionPane.YES_OPTION){   //点击yes按钮
				   System.exit(0);    //退出程序
			    }
			}
		});
		button_2.setBounds(240, 200, 100, 25);
		contentPane.add(button_2);
	}
}
