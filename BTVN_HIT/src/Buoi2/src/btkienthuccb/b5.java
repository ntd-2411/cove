package btkienthuccb;

import java.util.Scanner;

public class b5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println("5 * " + i + " = " + (5 * i));
        }
        int tong = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) tong += i;
        }
        System.out.println("tong cac so chan tu 1 den 100 = " + tong);
    }
}
