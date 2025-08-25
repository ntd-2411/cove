import java.util.Scanner;

public class bai21_ham {
    public static String giaiPTB2(int x, int y, int z){
        if(x == 0){
            if(y == 0 && z == 0) return "phuong trinh b1 vo so nghiem!";
            else if(y == 0 && z != 0) return "phuong trinh b1 vo nghiem!";
            else return "phuong trinh co 1 nghiem x = " + (1.0*(-z)/y);
        }else{
            double denta = Math.pow(y,2) - 4 * x *z;
            if(denta < 0) return "Phuong trinh b2 vo nghiem!";
            else if(denta == 0) return "phuong trinh co nghiem kep x1 = x2 = " + (-y/ (2.0 * x));
            else{
                return ("phuong trinh co 2 nghiem phan biet x1 = " +
                        (- y + Math.sqrt(denta))/ (2 * x)) + "; x2 = "  + (- y - Math.sqrt(denta))/ (2 * x);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lan luot nhap cac chi so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(giaiPTB2(a,b,c));
    }
}
