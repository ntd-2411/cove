import java.util.Scanner;

public class b10_Scanner {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("nhap ten: ");
        String x = a.nextLine();
        System.out.println("hello " + x);
    }
}
