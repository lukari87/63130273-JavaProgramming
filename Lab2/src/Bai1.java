import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                double x = -b / a;
                System.out.printf("Phương trình có nghiệm duy nhất x = %.2f%n", x);
            }
        } else {
            System.out.println("Phương trình có nghiệm duy nhất x = 0.");
        }

        scanner.close();
    }
}
