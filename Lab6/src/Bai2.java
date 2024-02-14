import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo mảng sản phẩm
        String[][] sanPham = new String[5][3];

        // Nhập thông tin các sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            sanPham[i][0] = scanner.nextLine();
            System.out.print("Giá: ");
            sanPham[i][1] = scanner.nextLine();
            System.out.print("Hãng: ");
            sanPham[i][2] = scanner.nextLine();
        }

        // Xuất thông tin các sản phẩm có hãng là "Nokia"
        System.out.println("\nThông tin các sản phẩm có hãng là Nokia:");
        for (int i = 0; i < 5; i++) {
            if (sanPham[i][2].equalsIgnoreCase("Nokia")) {
                System.out.println("Tên: " + sanPham[i][0]);
                System.out.println("Giá: " + sanPham[i][1]);
                System.out.println("Hãng: " + sanPham[i][2]);
                System.out.println("------------------------");
            }
        }
    }
}
