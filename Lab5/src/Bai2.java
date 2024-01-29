import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<String> danhSach = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập họ tên (nhập 'N' để kết thúc): ");
            String hoTen = scanner.nextLine();

            if (hoTen.equalsIgnoreCase("N")) {
                break;
            }

            danhSach.add(hoTen);
        }

        // Xuất danh sách vừa nhập
        System.out.println("Danh sách vừa nhập:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }

        // Xuất danh sách ngẫu nhiên
        System.out.println("Danh sách ngẫu nhiên:");
        Collections.shuffle(danhSach);
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }

        // Sắp xếp giảm dần và xuất danh sách
        System.out.println("Danh sách giảm dần theo họ tên:");
        Collections.sort(danhSach, Collections.reverseOrder());
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }

        // Tìm và xóa họ tên
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        for (String hoTen : danhSach) {
            if (hoTen.equalsIgnoreCase(hoTenCanXoa)) {
                danhSach.remove(hoTen);
                break;
            }
        }

        // Xuất danh sách sau khi xóa
        System.out.println("Danh sách sau khi xóa:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }
}
