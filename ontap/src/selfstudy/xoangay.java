package selfstudy;

import java.util.Scanner;

public class xoangay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        // Nhập n > 0
        do {
            System.out.print("nhap n: ");
            n = sc.nextInt();
            if(n <= 0) System.out.print("loi nhap, lai \n");
        } while(n <= 0);

        sc.nextLine(); // 🔥 THÊM DÒNG NÀY để bỏ dòng xuống sau nextInt()

        char[] a = new char[n];

        // Nhập từng ký tự
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            String s = sc.nextLine(); // ✅ Giờ s sẽ nhập được bình thường
            if(s.length() > 0)
                a[i] = s.charAt(0);
            else
                a[i] = ' ';
        }

        // In mảng
        System.out.print("Mang vua nhap: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

