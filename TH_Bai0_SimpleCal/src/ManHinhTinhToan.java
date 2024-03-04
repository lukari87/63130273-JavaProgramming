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

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(67, 39, 160, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)\r\n");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(67, 118, 160, 35);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(242, 39, 307, 35);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(242, 118, 307, 35);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xu ly cong
				// Viết lệnh ở một thủ tục/hàm, rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(126, 176, 85, 35);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xu ly tru
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(242, 176, 85, 35);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xu ly nhan
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(355, 176, 85, 35);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xu ly chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(464, 176, 85, 35);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả phép tính:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(67, 221, 160, 35);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(242, 221, 307, 35);
		contentPane.add(txtKetQua);
	} // hết hàm tạo
	void HamXuLyCong() {
		// Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// Tính toán
		double tong = soA + soB;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		// Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// Tính toán
		double hieu = soA - soB;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		// Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// Tính toán
		double tich = soA*soB;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tich));
	}
	void HamXuLyChia() {
		// Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// Tính toán
		double thuong = soA/soB;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(thuong));
	}
}