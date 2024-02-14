import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo mảng sinh viên
        String[][] sinhVien = new String[5][4];

        // Nhập thông tin các sinh viên và kiểm tra định dạng
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            sinhVien[i][0] = scanner.nextLine();
            System.out.print("Email: ");
            sinhVien[i][1] = kiemTraEmail(scanner.nextLine());
            System.out.print("Số điện thoại: ");
            sinhVien[i][2] = kiemTraSoDienThoai(scanner.nextLine());
            System.out.print("Chứng minh nhân dân: ");
            sinhVien[i][3] = kiemTraCMND(scanner.nextLine());
        }

        // Xuất thông tin các sinh viên
        System.out.println("\nThông tin các sinh viên:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ và tên: " + sinhVien[i][0]);
            System.out.println("Email: " + sinhVien[i][1]);
            System.out.println("Số điện thoại: " + sinhVien[i][2]);
            System.out.println("Chứng minh nhân dân: " + sinhVien[i][3]);
            System.out.println("------------------------");
        }
    }

    // Phương thức kiểm tra định dạng email
    public static String kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return email;
        } else {
            System.out.println("Email không đúng định dạng. Vui lòng nhập lại.");
            return kiemTraEmail(new Scanner(System.in).nextLine());
        }
    }

    // Phương thức kiểm tra định dạng số điện thoại
    public static String kiemTraSoDienThoai(String soDienThoai) {
        String regex = "^0[0-9]{9,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        if (matcher.matches()) {
            return soDienThoai;
        } else {
            System.out.println("Số điện thoại không đúng định dạng. Vui lòng nhập lại.");
            return kiemTraSoDienThoai(new Scanner(System.in).nextLine());
        }
    }

    // Phương thức kiểm tra định dạng chứng minh nhân dân
    public static String kiemTraCMND(String cmnd) {
        String regex = "^[0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        if (matcher.matches()) {
            return cmnd;
        } else {
            System.out.println("Chứng minh nhân dân không đúng định dạng. Vui lòng nhập lại.");
            return kiemTraCMND(new Scanner(System.in).nextLine());
        }
    }
}
