package Lap1;
import java.util.Scanner;

public class Lap1Bai1 {
    public static void main(String[] args){
        //Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên : "); String hoten = sc.nextLine();
        System.out.print("Điểm TB : "); double dtb = sc.nextDouble();
        //Xuất dữ liệu
        System.out.print(hoten + ", điểm trung bình là : " + dtb + "\n");
        System.out.println(hoten + ",điểm trung bình là : " + dtb);
        System.out.printf("%s %.2f điểm\n",hoten, dtb);
    }

}
