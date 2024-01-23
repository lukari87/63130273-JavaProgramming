import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên sinh viên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        // Đóng đối tượng Scanner sau khi sử dụng xong
        scanner.close();

        // Xuất ra màn hình theo định dạng
        System.out.printf("%s %.2f điểm.%n", hoTen, diemTrungBinh);
    }
}
