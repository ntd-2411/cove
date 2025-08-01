package BUOI4_class_Bai1;

import BUOI4_class_Bai1.Student;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student sv1 = new Student();
        System.out.print("nhap ten: ");
        String name = sc.nextLine();
        System.out.print("nhap tuoi: ");
        int age = sc.nextInt();
        sv1.name = name;
        sv1.age = age;
        sv1.sayHello();
    }
}
