import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập cạnh của khối lập phương
        System.out.print("Nhập độ dài cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        // Đóng đối tượng Scanner sau khi sử dụng xong
        scanner.close();

        // Tính thể tích của khối lập phương
        double theTich = Math.pow(canh, 3);

        // Xuất thể tích ra màn hình
        System.out.printf("Thể tích của khối lập phương là %.2f%n", theTich);
    }
}
