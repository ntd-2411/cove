package Bài1;

import java.util.Scanner;

public class b1 {

     public static void main(String[] args) {
        Check s = new Check();
        System.out.print("nhap chuoi can check: ");
        String a = s.nextLine();

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
