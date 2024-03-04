import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ManHinhGiaiPTB2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	public ManHinhGiaiPTB2() {
		setTitle("PTB2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(64, 58, 102, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(64, 103, 102, 35);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpC.setBounds(64, 148, 102, 35);
		contentPane.add(lblNhpC);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(64, 274, 102, 35);
		contentPane.add(lblKtQu);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(176, 58, 102, 35);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(176, 103, 102, 35);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(176, 148, 102, 35);
		contentPane.add(txtC);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(176, 274, 433, 129);
		contentPane.add(txtKQ);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyGiaiPTB2();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiai.setBounds(174, 211, 111, 41);
		contentPane.add(btnGiai);
	}
	void XuLyGiaiPTB2() {
	    // Lấy các giá trị a, b, c từ JTextField và chuyển thành kiểu double
	    double a = Double.parseDouble(txtA.getText());
	    double b = Double.parseDouble(txtB.getText());
	    double c = Double.parseDouble(txtC.getText());

	    // Tính delta
	    double delta = b * b - 4 * a * c;

	    // Khai báo biến để lưu kết quả
	    String result;

	    // Kiểm tra delta để xác định số nghiệm và tính toán
	    if (delta > 0) {
	        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	        result = "\nPhương trình có hai nghiệm phân biệt:\n x1 = " + x1 + "\n x2 = " + x2;
	    } else if (delta == 0) {
	        double x = -b / (2 * a);
	        result = "Phương trình có nghiệm kép:\n x = " + x;
	    } else {
	        result = "Phương trình vô nghiệm";
	    }

	    // Hiển thị kết quả lên JTextField
	    txtKQ.setText(result);
	}

}