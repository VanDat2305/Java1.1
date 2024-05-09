package Lap1;
import java.util.*;
public class Lap1Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài HCN:");
        int chieuDai = sc.nextInt();
        System.out.print("Nhập rộng dài HCN:");
        int chieuRong = sc.nextInt();

        System.out.print("Chu vi HCN là :" + ((chieuDai+chieuRong)*2));
        System.out.print("\nDiện tích HCN là :" + (chieuDai*chieuRong));
        System.out.print("\nCảnh nhỏ nhất HCN là :" + Math.min(chieuRong, chieuDai));

    }
}
