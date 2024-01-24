import java.util.Scanner;

public class SanPham {
    // Khai báo thuộc tính
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm tạo
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Phương thức tính thuế nhập khẩu
    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    // Phương thức xuất thông tin sản phẩm ra màn hình
    public void xuat() {
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    // Phương thức nhập thông tin sản phẩm từ bàn phím
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        this.giamGia = scanner.nextDouble();
    }

    public static void main(String[] args) {
        // Tạo một đối tượng sản phẩm
        SanPham sanPham = new SanPham("Laptop", 1500, 100);

        // Gọi phương thức xuất để hiển thị thông tin sản phẩm
        sanPham.xuat();
    }
}
