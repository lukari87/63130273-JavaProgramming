import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số của phương trình ax^2 + bx + c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Đóng đối tượng Scanner sau khi sử dụng xong
        scanner.close();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Kiểm tra delta để tránh tính căn của số âm
        if (delta >= 0) {
            // Tính căn delta
            double canDelta = Math.sqrt(delta);

            // Xuất căn delta ra màn hình
            System.out.printf("Căn delta của phương trình là %.2f%n", canDelta);
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }
}
