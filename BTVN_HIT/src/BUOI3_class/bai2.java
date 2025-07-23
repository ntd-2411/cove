package BUOI3_class;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159265;
        double r; int k;
        do{
            System.out.print("nhap  ban kinh r: ");
            r = sc.nextDouble();
            if(r <= 0) System.out.println("loi nhap, lai");
            System.out.print("nhap mu k: ");
            k = sc.nextInt();
        }while(r <= 0);
        System.out.println("chu vi hinh tron: C = " + String.format("%.2f",2.0 * PI * r));
        System.out.println("dien tich hinh tron: S = " + String.format("%.2f",PI * r * r));
        System.out.println("r^k = " + String.format("%.2f",Math.pow(r, k)));
        System.out.println("(r + k)^1/2 = " + String.format("%.2f",Math.sqrt(r + k)));
        System.out.print("|r - k| = " + String.format("%.2f",Math.abs(r - k)));
    }
}
