package BUOI4_class_Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student sv = new Student("teo", 18);
        sv.hienThi();
        System.out.println(sv.getName());
        System.out.println(sv.getAge());
        sv.setName("ty");
        sv.setAge(10);
        System.out.print("ten va tuoi sau khi ban da thay the: ");
        System.out.println(sv.getName());
        System.out.println(sv.getAge());

    }
}
