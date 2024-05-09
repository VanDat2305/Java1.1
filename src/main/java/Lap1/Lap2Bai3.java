package Lap1;

import java.util.*;

public class Lap2Bai3 {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhập x:");
        int x = sc.nextInt();
        System.out.print("Nhập y:");
        int y = sc.nextInt();

        System.out.print("Tổng x và y là:"+(x+y));
        System.out.print("\nHiệu x và y là:"+ (x-y));
        System.out.print("\nTích x và y là:" + (x*y));
        System.out.print("\nThương x và y là:" + (x/y));

    }
}
