package Lap1;

import java.util.*; // thư viện chứa các lệnh nhập sử dụng Scanner
import java.io.*; // thư viện chứa các lớp cho việc xuất, nhập

public class Lap1Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sinh viên: ");
        String masv = sc.nextLine();

        System.out.print("Nhập tên sinh viên:");
        String ten = sc.nextLine();

        System.out.print("Nhập điểm trung bình:");
        byte tuoi = sc.nextByte();

        System.out.print("Ma SV: "+masv);
        System.out.print("\nTên SV: "+ten);
        System.out.print("\nĐiểm tb: "+tuoi);
    }
}
