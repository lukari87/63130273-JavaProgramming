import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên của bạn: ");
        String hoTen = scanner.nextLine();

        // Chia chuỗi họ và tên thành các thành phần
        // Ví dụ: "Nguyen Van A" sẽ được chia thành ['Nguyen', 'Van', 'A']
        String[] thanhPhan = hoTen.split(" ");

        // Tên và họ được chuyển thành chữ IN HOA
        String ho = thanhPhan[0].toUpperCase();
        String ten = thanhPhan[thanhPhan.length - 1].toUpperCase();
        String tenDem = "";
        for (int i = 1; i < thanhPhan.length - 1; i++) {
            tenDem += thanhPhan[i] + " ";
        }

        // Xuất ra màn hình
        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem.trim());
        System.out.println("Tên: " + ten);
    }
}
