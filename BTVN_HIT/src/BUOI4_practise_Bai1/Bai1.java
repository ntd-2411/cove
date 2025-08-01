package BUOI4_practise_Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Student> ds = new ArrayList<>();
    public static void themSinhVien(Scanner sc) {
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("Năm sinh: ");
        int namSinh = sc.nextInt();
        int age = 2025 - namSinh;
        sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Điểm TX1: ");
        int tx1 = sc.nextInt();
        System.out.print("Điểm TX2: ");
        int tx2 = sc.nextInt();
        System.out.print("Điểm KTHP: ");
        int kthp = sc.nextInt();
        System.out.print("Số tiết nghỉ: ");
        int nghi = sc.nextInt();
        sc.nextLine();

        Student sv = new Student(name, age, diaChi, tx1, tx2, kthp, nghi);
        ds.add(sv);
        System.out.println("Đã thêm sinh viên.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            System.out.println("Dien thong tin sinh vien " + i);
            System.out.print("nhap ten sv: ");
            String name = sc.nextLine();
            System.out.print("nhap nam sinh: ");
            int namSinh = sc.nextInt();
            int age = 2025 - namSinh;
            sc.nextLine();
            System.out.print("nhap dia chi: ");
            String diaChi = sc.nextLine();
            System.out.print(("nhap diem TX1: "));
            int diemTX1 = sc.nextInt();
            System.out.print(("nhap diem TX2: "));
            int diemTX2 = sc.nextInt();
            System.out.print(("nhap diem KTHP: "));
            int diemKTHP = sc.nextInt();
            System.out.print(("nhap so tiet nghi: "));
            int soTietNghi = sc.nextInt();
            sc.nextLine();
            Student sv_i = new Student(name, age, diaChi, diemTX1, diemTX2,
                    diemKTHP, soTietNghi);
            sv_i.hienThi();
        }
        int x;
        do {
            System.out.println("\n--------- QUAN LY SINH VIEN ---------");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("4. Sắp xếp theo GPA");
            System.out.println("5. Sắp xếp theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên");
            System.out.println("7. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            x = sc.nextInt();
            sc.nextLine();
        } while (x != 0);
    }

}
