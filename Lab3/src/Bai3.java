import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            mang[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(mang);

        // Xuất mảng
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i : mang) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Tìm và xuất phần tử nhỏ nhất
        int min = mang[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, mang[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);

        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i : mang) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        double avg = (count > 0) ? (double) sum / count : 0;
        System.out.printf("Trung bình cộng các phần tử chia hết cho 3: %.2f%n", avg);

        scanner.close();
    }
}
