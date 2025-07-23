package BUOI3_practise;
//a, b: trong [0, 100]
//        c: trong [0, 200]
//        Hiển thị phép toán: a + b = c
//        Người dùng trả lời vào “Correct” hoặc “Incorrect” ->  int ra thông báo “Bạn đã trời đúng “ nếu đúng ngược lại thì thông báo ““Bạn đã trời đúng Sai “

import java.util.Scanner;

public class bai3 {
    public static int nhap1(Scanner sc){
        int x;
        do{
            x = sc.nextInt();
            if(x < 0 || x > 100) System.out.println("loi nhap, lai");
        }while(x < 0 || x > 100);
        return x;
    }
    public static int nhap2(Scanner sc){
        int x;
        do{
            x = sc.nextInt();
            if(x < 0 || x > 200) System.out.println("loi nhap, lai");
        }while(x < 0 || x > 200);
        return x;
    }
    public static boolean check(boolean dung, String kq){
        if((dung && kq.equalsIgnoreCase("Correct")) || !dung && kq.equalsIgnoreCase("Incorrect"))
            return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("nhap a, thuoc [0, 100]: ");
        a = nhap1(sc);
        System.out.print("nhap b, thuoc [0, 100]: ");
        b = nhap1(sc);
        System.out.print("nhap c, thuoc [0, 200]: ");
        c = nhap2(sc);
        System.out.println(a + " + " + b + " = " + c);
        boolean dung = (a + b == c);
        sc.nextLine();
        System.out.println("theo ban la Correct or Incorrect? ");
        String kq = sc.nextLine();
        if(check(dung, kq)) System.out.print("ban da tra loi dung");
        else System.out.print("ban tra loi chua dung");
    }
}
