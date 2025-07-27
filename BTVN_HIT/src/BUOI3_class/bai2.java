package BUOI3_class;

import java.util.Scanner;

public class Bai2 {
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
        System.out.println("chu vi hinh tron: C = " + Math.round(2.0 * PI * r * 1000) / 1000.0);
        System.out.println("dien tich hinh tron: S = " + Math.round(PI * r * r * 1000) / 1000.0);
        System.out.println("r^k = " + Math.round(Math.pow(r, k) * 1000) / 1000.0);
        System.out.println("(r + k)^1/2 = " + Math.round(Math.sqrt(r + k) * 1000) / 1000.0);
        System.out.print("|r - k| = " + Math.round(Math.abs(r - k) * 1000) / 1000.0);
    }
}
