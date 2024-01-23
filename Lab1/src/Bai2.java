import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        // Đóng đối tượng Scanner sau khi sử dụng xong
        scanner.close();

        // Tính chu vi, diện tích và cạnh nhỏ của hình chữ nhật
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;
        double canhNho = Math.min(chieuDai, chieuRong);

        // Xuất thông tin hình chữ nhật ra màn hình
        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Diện tích: %.2f%n", dienTich);
        System.out.printf("Cạnh nhỏ: %.2f%n", canhNho);
    }
}
