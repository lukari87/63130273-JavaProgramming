import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        // Khai báo mảng họ tên, điểm và học lực
        String[] names = new String[n];
        double[] scores = new double[n];
        String[] grades = new String[n];

        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            names[i] = scanner.next();
            System.out.print("Điểm: ");
            scores[i] = scanner.nextDouble();

            // Xét học lực
            if (scores[i] < 5) {
                grades[i] = "Yếu";
            } else if (scores[i] < 6.5) {
                grades[i] = "Trung bình";
            } else if (scores[i] < 7.5) {
                grades[i] = "Khá";
            } else if (scores[i] < 9) {
                grades[i] = "Giỏi";
            } else {
                grades[i] = "Xuất sắc";
            }
        }

        // Xuất thông tin sinh viên
        System.out.println("\nThông tin sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + grades[i]);
            System.out.println();
        }

        // Sắp xếp danh sách sinh viên theo điểm tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    // Hoán đổi vị trí
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    String tempGrade = grades[i];
                    grades[i] = grades[j];
                    grades[j] = tempGrade;
                }
            }
        }

        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm tăng dần:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + grades[i]);
            System.out.println();
        }
    }
}
