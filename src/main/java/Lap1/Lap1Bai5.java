package Lap1;
import java.util.*;
public class Lap1Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a:");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b:");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c:");
        double c = sc.nextDouble();

        double delta = b*b - 4 * a * c;

        // Kiểm tra delta
        if (delta < 0) {
            System.out.println("Delta < 0, phương trình không có nghiệm thực.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Delta = 0, phương trình có một nghiệm kép: x = " + x);
        } else {
            double sqrtDelta = Math.sqrt(delta);
            System.out.println("Delta > 0, phương trình có hai nghiệm:");
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            System.out.println("Nghiệm thứ nhất: x1 = " + x1);
            System.out.println("Nghiệm thứ hai: x2 = " + x2);
        }

        System.out.print("Căn delta là:" + Math.sqrt(delta));

    }
}
