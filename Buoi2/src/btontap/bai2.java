package btontap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap nguyen n: ");
            n = sc.nextInt();
            if(n <= 0) System.out.print("loi nhap, lai \n");
        }while(n <= 0);
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }System.out.println();

        for(int i = 0; i < n; i++){
            if(i % 2 != 0 && i == n - 1) a[i] = a[i] + a[i - 1];
            else if(i % 2 !=0 && i != n-1) a[i] = a[i] + Math.abs(a[i + 1] - a[i - 1]);
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }
}
