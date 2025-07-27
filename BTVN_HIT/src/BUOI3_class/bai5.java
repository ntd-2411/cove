package BUOI3_class;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        // nhap n
        do{
            System.out.print("nhap n: ");
            n = sc.nextInt();
            if(n <= 0) System.out.println("loi nhap, lai");
        }while(n <= 0);
        int[][] a = new int[n][n];
        int value = 1;
        int trenXuong = 0; int duoiLen = n - 1;
        int traiSang = 0; int phaiSang = n - 1;
        for(int i = traiSang; i <= phaiSang; i++){
            a[trenXuong][i] = value;
            value++;
        }trenXuong++;
        for(int j = 0; j < n; j++){
            for(int i = trenXuong; i <= duoiLen; i++){
                a[i][phaiSang] = value;
                value++;
            }phaiSang--;
            for(int i = phaiSang; i >= traiSang; i--){
                a[duoiLen][i] = value;
                value++;
            }duoiLen--;
            for(int i = duoiLen; i >= trenXuong; i--){
                a[i][traiSang] = value;
                value++;
            }traiSang++;
        }for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }System.out.println();
        }System.out.println();
        int tongChing = 0; int tongPhu = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) tongChing += a[i][j];
            }
        }for(int i = 0; i < n;){
            for(int j = n -1; j >= 0; j--){
                tongPhu += a[i][j];
                i++;
            }
        }System.out.println("tong cac phan tu tren duong cheo ching = " + tongChing);
        System.out.println("tong cac phan tu tren duong cheo phu = " + tongPhu);
    }
}
