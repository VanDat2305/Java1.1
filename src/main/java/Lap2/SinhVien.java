package Lap2;
import java.util.*;
public class SinhVien {
    //properties
    private String hoTen, diaChi, gioiTinh;
    private double diem;
    //constructor
    public SinhVien(){};
    public SinhVien(String hoTen, String diaChi, String gioiTinh, double diem){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;

    }
    //getter/setter
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

    public void  nhap(){
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
    public <reuturn> String xepLoai(){
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
            rep = "Quas xuac sac ạ";
        }
        return rep;
    }

    public void  xuat(){
        String xepLoai = this.xepLoai();
        System.out.print("--- Tên ---- Địa chỉ ------ Giới tính ------ Điểm -------- Xếp loại --");
        System.out.print("\n" + this.getHoTen() + " - " +
                this.getDiaChi() + " - " +
                this.getGioiTinh() + " - " +
                this.getDiem() + " - " + xepLoai
                );
    }


    public  static void main(String[] args){
//        SinhVien sv = new SinhVien();
//        sv.nhap();
//        sv.xuat();
        SinhVien sv1 = new SinhVien("Đạt", "Nghệ An", "Nam", 9);
        sv1.xuat();

    }
}
