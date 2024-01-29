import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập số thực (nhập 'N' để kết thúc): ");
            double x = scanner.nextDouble();
            list.add(x);

            System.out.print("Nhập thêm (Y/N)? ");
            if (scanner.next().equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Danh sách số thực:");
        for (double num : list) {
            System.out.println(num);
        }

        double sum = 0;
        for (double num : list) {
            sum += num;
        }
        System.out.println("Tổng của danh sách: " + sum);
    }
}
