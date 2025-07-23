package btkienthuccb;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("lan luot nhap 2 so nguyen: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + " + " + b + " = " + (a + b));
            System.out.println(a + " - " + b + " = " + (a - b));
            System.out.println(a + " * " + b + " = " + (a * b));
            System.out.println(a + " / " + b + " = " + ( 1.0*a / b));
            System.out.println(a + " % " + b + " = " + (a % b));
            if(a == b) System.out.print("2 so vua nhap bang nhau \n");
            else System.out.println("2 so vua nhap khac nhau");
        }
    }
}
