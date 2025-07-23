package BUOI3_class;

import java.util.Scanner;

public class bai4 {
    public static int F(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return(F(n-1) + F(n -2));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int F0 = 0;
        final int F1 = 1;
        int n;
        // nhap n
        do{
            System.out.print("nhap n: ");
            n = sc.nextInt();
            if(n < 0) System.out.println("loi nhap, lai");
        }while(n < 0);
        int tong = 1;
        for(int i = 0; i <= n; i++){
            int value = F(i);
            System.out.print(F(i) + " ");
            if(value % 2 != 0) tong += F(i);
        }System.out.println();
        System.out.print("tong cac phan tu trong day = " + tong);
    }
}
