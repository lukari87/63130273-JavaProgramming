import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            // Gọi hàm giải phương trình bậc nhất nếu a == 0
            System.out.println("Phương trình bậc nhất:");
            giaiPTBacNhat(b, c);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép x = %.2f%n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f, x2 = %.2f%n", x1, x2);
            }
        }

        scanner.close();
    }

    // Hàm giải phương trình bậc nhất
    private static void giaiPTBacNhat(double b, double c) {
        if (b == 0) {
            System.out.println("Phương trình có vô số nghiệm.");
        } else {
            double x = -c / b;
            System.out.printf("Phương trình có nghiệm duy nhất x = %.2f%n", x);
        }
    }
}
