import java.util.Scanner;

import static java.lang.Math.sqrt;

public class b1 {
    public static boolean check(float x){
        if(x < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(x) ; i++){
                if(x % i == 0) return false;
            }return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap n nguyen: ");
            n = sc.nextInt();
            if(n <= 0) System.out.print("loi nhap, lai \n");
        }while(n <= 0);
        float[] a = new float[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextFloat();
        }
        int dem = 0;
        int tongchan = 0;
        int tongle = 0;
        int songuyento = 0;
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
            dem++;
            if(a[i] % 2 == 0) tongchan += a[i];
            else tongle += a[i];
            if(check(a[i])) songuyento += a[i];
        }System.out.println();
        System.out.println("co " + dem + " phan tu trong mang");
        System.out.println("tong phan tu chan = " + tongchan);
        System.out.println("tong phan tu le = " + tongle);
        System.out.println("tong so nguyen to = " + songuyento);

    }

}
