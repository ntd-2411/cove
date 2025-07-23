package selfstudy;

//In chuỗi đảo ngược.
import java.util.Scanner;

public class st1 {
    public static boolean check(String s){
        int a = 0;
        int b = s.length() - 1;
        while(a < b){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }a++;
            b--;
        }return true;
    }
    public static void swap(String s){
        char[] a = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            a[i] = s.charAt(i);
        }char temp;
        for(int i = 0; i <= 0.5*s.length(); ){
            for(int j = s.length() -1 ; j >= 0.5 * s.length(); j-- ){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }System.out.print("chuoi sau hoan doi: ");
        for(int i = 0; i < s.length(); i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("chuoi vua nhap: " + s);
        System.out.println("chuoi sau xoa khoang trang: " + s.trim());
        if(check(s)) System.out.println("chuoi doi xung");
        else System.out.println("chuoi khong doi xung");
        swap(s);
    }
}
