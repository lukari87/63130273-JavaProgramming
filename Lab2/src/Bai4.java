import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            menu();
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Chức năng giải phương trình bậc nhất:");
                    // Gọi hàm giải phương trình bậc nhất
                    break;
                case 2:
                    System.out.println("Chức năng giải phương trình bậc hai:");
                    // Gọi hàm giải phương trình bậc hai
                    break;
                case 3:
                    System.out.println("Chức năng tính tiền điện:");
                    // Gọi hàm tính tiền điện
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }
}
