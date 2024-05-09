package Lap2;
import java.util.*;

public class SinhVien2 {
    private String hoTen, diaChi, gioiTinh;
    private double diem;

    public SinhVien2() {}

    public SinhVien2(String hoTen, String diaChi, String gioiTinh, double diem) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setDiaChi(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        this.setGioiTinh(sc.nextLine());
        System.out.print("Nhập điểm: ");
        this.setDiem(sc.nextDouble());
    }

    public String xepLoai() {
        String rep = "";
        if (this.diem < 5) {
            rep = "Yếu";
        } else if (this.diem >= 5 && this.diem < 6.5) {
            rep = "Trung Bình";
        } else if (this.diem >= 6.5 && this.diem < 8) {
            rep = "Khá";
        } else if (this.diem >= 8 && this.diem < 10) {
            rep = "Giỏi";
        } else {
            rep = "Quá xuất sắc ạ";
        }
        return rep;
    }

    public void xuat() {
        String xepLoai = this.xepLoai();
        System.out.println("--- Tên ---- Địa chỉ ------ Giới tính ------ Điểm -------- Xếp loại --");
        System.out.println(this.getHoTen() + " - " +
                this.getDiaChi() + " - " +
                this.getGioiTinh() + " - " +
                this.getDiem() + " - " + xepLoai
        );
    }

    // Hàm nhập vào danh sách n sinh viên
    public static ArrayList<SinhVien2> nhapDanhSachSinhVien(int n) {
        ArrayList<SinhVien2> danhSach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien2 sv = new SinhVien2();
            sv.nhap();
            danhSach.add(sv);
        }
        return danhSach;
    }

    // In danh sách sinh viên ra màn hình
    public static void inDanhSachSinhVien(ArrayList<SinhVien2> danhSach) {
        System.out.println("--- DANH SÁCH SINH VIÊN ---");
        for (SinhVien2 sv : danhSach) {
            sv.xuat();
        }
    }

    // Hàm sắp xếp danh sách sinh viên tăng dần theo điểm
    public static void sapXepTheoDiem(ArrayList<SinhVien2> danhSach) {
        Collections.sort(danhSach, new Comparator<SinhVien2>() {
            @Override
            public int compare(SinhVien2 sv1, SinhVien2 sv2) {
                return Double.compare(sv1.getDiem(), sv2.getDiem());
            }
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        ArrayList<SinhVien2> danhSach = nhapDanhSachSinhVien(n);
        inDanhSachSinhVien(danhSach);

        // Sắp xếp danh sách sinh viên theo điểm
        sapXepTheoDiem(danhSach);
        System.out.println("\n--- DANH SÁCH SINH VIÊN SAU KHI SẮP XẾP THEO ĐIỂM ---");
        inDanhSachSinhVien(danhSach);
    }
}
