package BUOI3_class;
//        Tính và in tổng các phần tử trên 2 đường chéo chính và phụ
import java.util.Scanner;

public class bai5 {
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
        int trenxuong = 0; int duoilen = n - 1;
        int traisang = 0; int phaisang = n - 1;
        for(int i = traisang; i <= phaisang; i++){
            a[trenxuong][i] = value;
            value++;
        }trenxuong++;
        for(int j = 0; j < n; j++){
            for(int i = trenxuong; i <= duoilen; i++){
                a[i][phaisang] = value;
                value++;
            }phaisang--;
            for(int i = phaisang; i >= traisang; i--){
                a[duoilen][i] = value;
                value++;
            }duoilen--;
            for(int i = duoilen; i >= trenxuong; i--){
                a[i][traisang] = value;
                value++;
            }traisang++;
        }for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }System.out.println();
        }System.out.println();
        int tongching = 0; int tongphu = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) tongching += a[i][j];
            }
        }for(int i = 0; i < n;){
            for(int j = n -1; j >= 0; j--){
                tongphu += a[i][j];
                i++;
            }
        }System.out.println("tong cac phan tu tren duong cheo ching = " + tongching);
        System.out.println("tong cac phan tu tren duong cheo phu = " + tongphu);
    }
}
