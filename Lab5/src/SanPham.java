import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    private String ten;
    private double donGia;

    public SanPham(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập tên sản phẩm (nhập 'N' để kết thúc): ");
            String ten = scanner.nextLine();

            if (ten.equalsIgnoreCase("N")) {
                break;
            }

            System.out.print("Nhập giá sản phẩm: ");
            double gia = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng mới

            danhSachSanPham.add(new SanPham(ten, gia));
        }

        // Sắp xếp giảm dần theo giá và xuất danh sách
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getDonGia(), o1.getDonGia());
            }
        };

        Collections.sort(danhSachSanPham, comp);
        System.out.println("Danh sách sản phẩm giảm dần theo giá:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("Tên: " + sp.getTen() + ", Giá: " + sp.getDonGia());
        }

        // Tìm và xóa sản phẩm theo tên
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.nextLine();
        for (SanPham sp : danhSachSanPham) {
            if (sp.getTen().equalsIgnoreCase(tenCanXoa)) {
                danhSachSanPham.remove(sp);
                break;
            }
        }

        // Xuất giá trung bình của các sản phẩm
        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.getDonGia();
        }
        double giaTrungBinh = danhSachSanPham.size() > 0 ? tongGia / danhSachSanPham.size() : 0;
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}
