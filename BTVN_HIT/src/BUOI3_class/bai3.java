package BUOI3_class;

import java.util.Scanner;

public class Bai3 {
    public static boolean check(String s){
        int left = 0; int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }left++;
            right--;
        }return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 chuoi: ");
        String s = sc.nextLine();
        System.out.println("chuoi vua nhap: " + s);
        System.out.println("chuoi sau khi xoa khoang trang dau va cuoi: " + s.trim());
        if(check(s)) System.out.println("chuoi vua nhap doi xung");
        else System.out.println("chuoi vua nhap khong doi xung");
        char[] a = new char[s.length()];
        char temp;
        for(int i = 0; i < s.length(); i++){
            a[i] = s.charAt(i);
        }for(int i = 0; i <= 0.5*s.length();){
            for(int j = s.length() -1; j >= 0.5*s.length(); j--){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }break;
        }for(int i = 0; i < s.length(); i++){
            System.out.print(a[i]);
        }System.out.println();
    }
}
