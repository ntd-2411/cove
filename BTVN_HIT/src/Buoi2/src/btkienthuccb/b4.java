package btkienthuccb;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("a["+ i + "] = ");
            a[i]  = sc.nextInt();
        }
        int tong = 0;
        int m = a[0];
        for(int i = 0; i < 5; i++){
            System.out.println(a[i] + " ");
            tong += a[i];
            if(m < a[i])    m = a[i];
        }
        System.out.println("tong cac phan tu trong mang = " + tong);
        System.out.print("phan tu max trong mang: " + m);
    }
}
