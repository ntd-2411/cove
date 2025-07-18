import java.util.Scanner;

public class b2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten hoc sinh: ");
        String name = sc.nextLine();
        System.out.print("nhap tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("nhap lop hoc: ");
        String lophoc = sc.nextLine();
        System.out.print("nhap gpa: ");
        float gpa = sc.nextFloat();
        sc.nextLine();
        System.out.print("Ten: " + name + " - Tuoi: " + age + " - lop: " + lophoc + " - GPA:  " + gpa);
    }
}
