package BUOI3_practise;

import java.util.Scanner;


public class Bai1 {

    static final String SQUARE = "1";
    static final String TRANGLE = "2";
    static final String CIRCLE = "3";

    //tuong tu tham chieu trong c++, gan gia tri x vao sc roi truyen tham so trong ham main
    public static int nhap(Scanner sc){
        int x;
        do{
            System.out.print("nhap nguyen duong < 10: ");
            x = sc.nextInt();
            if(x < 0 || x >= 10) System.out.println("loi nhap, lai");
        }while(x < 0 || x >= 10);
        return x;
    }
    //so sanh 2 chuoi
    public static void check(String type){
        if(type.equalsIgnoreCase(SQUARE)) System.out.println("Ban chon hinh vuong");
        else if (type.equalsIgnoreCase(TRANGLE)) System.out.println("Ban chon hinh tam giac");
        else if (type.equalsIgnoreCase( CIRCLE)) System.out.println("Ban chon hinh tron");
        else System.out.println("Hinh dang khong hop le");
    }
    public static int dienTichHinhVuong(Scanner sc){
        System.out.print("nhap chieu dai canh: ");
        int a = sc.nextInt();
        return a*a;
    }
    public static double dienTichHinhTamGiac(Scanner sc){
        System.out.print("lan luot nhap chieu 3 canh: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double p = 1.0*(a + b + c) * 0.5;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
    public static double dienTichHinhTron(Scanner sc){
        final double PI = 3.14159265;
        System.out.print("nhap ban kinh: ");
        int r = sc.nextInt();
        return PI*r*r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so bat ki: ");
        int a = nhap(sc);
        //ep kieu
        String type = Integer.toString(a);
        check(type);
        if(type.equalsIgnoreCase("1")){
            System.out.print("S = " + dienTichHinhVuong(sc));
        }else if(type.equalsIgnoreCase("2")){
            System.out.print("S = " + (Math.round(dienTichHinhTamGiac(sc)*1000))/1000.0);
        }else if(type.equalsIgnoreCase("3")){
            System.out.print("S = " + (Math.round(dienTichHinhTron(sc)*1000))/1000.0);
        }
    }
}
