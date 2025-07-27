package BUOI3_practise;

import java.util.Scanner;

public class Bai2 {
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
        System.out.print("nhap chuoi s: ");
        String s = sc.nextLine();
        if(check(s)){
            System.out.print(s.toUpperCase() + " la chuoi doi xung");
        }else System.out.print(s.toLowerCase() + " khong la chuoi doi xung");
    }
}
