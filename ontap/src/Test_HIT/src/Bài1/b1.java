package Bài1;

import java.util.Scanner;

public class b1 {
    public static boolean Check(String a){
        for(int i= 0; i < a.length();){
            char x = a.charAt(i);
            for(int j = a.length() - 1; j > i; j--){
                if(x == a.charAt(j)){
                    return false;
                }else{
                    i++;
                }
            }
        }return true;
    }
    public static void DaoNguoc(String a){
        char temp;
        for(int i = 0; i < a.length(); i++){
            char x = a.charAt(i);
            for(int j = a.length() - 1; j > i; j--){
                temp = x;
                x = a.charAt(j);
                a.charAt(j) = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi can check: ");
        String s = sc.nextLine();
        if(Check(s)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        int dem = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))){
                dem++;
            }
        }
        System.out.println("so ky tu khoang trang: " + dem);
        DaoNguoc(s);
        System.out.println("chuoi sau dao nguoc: " + s);
    }

}
