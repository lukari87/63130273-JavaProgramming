import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int giaCoBan = 1000;
        int giaVuotMuc = 1200;
        int mucVuot = 50;

        int tienDien;

        if (soDien <= mucVuot) {
            tienDien = soDien * giaCoBan;
        } else {
            tienDien = mucVuot * giaCoBan + (soDien - mucVuot) * giaVuotMuc;
        }

        System.out.printf("Tiền điện phải trả: %d%n", tienDien);

        scanner.close();
    }
}
