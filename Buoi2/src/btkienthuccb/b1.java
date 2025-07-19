package btkienthuccb;

import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten cua ban: ");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();
        System.out.println("nhap chieu cao cua ban: ");
        int cao = sc.nextInt();
        System.out.print(ten + " " + tuoi + " tuoi " + "cao " + cao + " cm");
    }
}