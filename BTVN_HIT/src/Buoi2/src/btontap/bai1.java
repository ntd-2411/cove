package btontap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159265;
        System.out.print("nhap ban kinh r: ");
        double r = sc.nextDouble();
        System.out.print("nhap so mu k: ");
        int k = sc.nextInt();
        System.out.println("chu vi hinh tron = " + (2.0 * PI * r));
        System.out.println("dien tich hinh tron = " + (PI * Math.pow(r, 2)));
        System.out.println("r^k = " + (Math.pow(r, k)));
        System.out.println("(r+k)^2 = " + (Math.pow(r + k, 2)));
        System.out.println("|r-k| = " + (Math.abs(r - k)));
    }

}
