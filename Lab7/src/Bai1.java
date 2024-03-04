import java.util.Scanner;

// Lớp Cha
class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return 2 * (rong + dai);
    }

    public double getDienTich() {
        return rong * dai;
    }

    public void xuat() {
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Chiều dài: " + dai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

// Lớp Con
class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + rong); // Vì là vuông nên chiều rộng và chiều dài bằng nhau
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho hình chữ nhật thứ nhất
        System.out.println("Nhập chiều rộng của hình chữ nhật thứ nhất: ");
        double rong1 = scanner.nextDouble();
        System.out.println("Nhập chiều dài của hình chữ nhật thứ nhất: ");
        double dai1 = scanner.nextDouble();

        // Nhập thông tin cho hình chữ nhật thứ hai
        System.out.println("Nhập chiều rộng của hình chữ nhật thứ hai: ");
        double rong2 = scanner.nextDouble();
        System.out.println("Nhập chiều dài của hình chữ nhật thứ hai: ");
        double dai2 = scanner.nextDouble();

        // Nhập thông tin cho hình vuông
        System.out.println("Nhập cạnh của hình vuông: ");
        double canh = scanner.nextDouble();

        // Tạo đối tượng hình chữ nhật thứ nhất
        ChuNhat hinhChuNhat1 = new ChuNhat(rong1, dai1);
        System.out.println("Thông tin hình chữ nhật thứ nhất:");
        hinhChuNhat1.xuat();

        // Tạo đối tượng hình chữ nhật thứ hai
        ChuNhat hinhChuNhat2 = new ChuNhat(rong2, dai2);
        System.out.println("Thông tin hình chữ nhật thứ hai:");
        hinhChuNhat2.xuat();

        // Tạo đối tượng hình vuông
        Vuong hinhVuong = new Vuong(canh);
        System.out.println("Thông tin hình vuông:");
        hinhVuong.xuat();

        scanner.close();
    }
}
