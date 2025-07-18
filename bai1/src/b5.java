import java.util.Scanner;

public class b5 {

//    Bài tập: Viết chương trình in ra bảng cửu chương của số 5 (từ 5x1 đến 5x10).
//    Sau đó in ra tổng các số chẵn từ 1 đến 100 bằng vòng lặp for và while
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println("5 * " + i + " = " + (5 * i));
        }
        int tong = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) tong += i;
        }
        System.out.println("tong cac so chan tu 1 den 100 = " + tong);
    }
}
