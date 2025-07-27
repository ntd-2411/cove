package BUOI3_class;

import java.util.Scanner;

public class Bai1 {
    public static boolean check(int x){
        if(x < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(x); i++){
                if(x % i == 0) return false;
            }return true;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n;
        // nhap n
        do{
            System.out.print("nhap n: ");
            n = sc.nextInt();
            if(n <= 0) System.out.println("loi nhap, lai");
        }while(n <= 0);
        //nhap mang
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        //hien mang
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }System.out.println();
        //tong cac so chan
        int demChan = 0; int tong = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                demChan++;
                tong += a[i];
            }
        }System.out.println("co "+ demChan + " phan tu chan " +
                "va tong cua chung = "+ tong);
        //tong cac so le
        int demLe = 0; int tongLe = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 != 0){
                demLe++;
                tongLe += a[i];
            }
        }System.out.println("co "+ demLe + " phan tu chan " +
                "va tong cua chung = "+ tongLe);
        //so luong snt
        int demNT = 0;
        for(int i = 0; i < n; i++){
            if(check(a[i])) demNT++;
        }System.out.print("co " + demNT + " so nguyen to trong mang");
    }
}
