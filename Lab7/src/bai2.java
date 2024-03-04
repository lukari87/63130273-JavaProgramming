// Định nghĩa lớp SinhVienPoly
abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    // Constructor
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng
    public abstract double getDiem();

    // Phương thức để xếp loại học lực
    public String getHocLuc() {
        double diem = getDiem();
        if (diem >= 9.0) {
            return "Xuất sắc";
        } else if (diem >= 8.0) {
            return "Giỏi";
        } else if (diem >= 7.0) {
            return "Khá";
        } else if (diem >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    // Phương thức xuất thông tin sinh viên
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
