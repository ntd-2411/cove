import TruongDaiHoc.SinhVien;

public class b30_oopb1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Nam", 18);
        sv3.hienThiThongTin();
        SinhVien sv2 = new SinhVien("dung", 18);
        System.out.println(sv2.getName());
        sv2.setName("tien");
        System.out.println(sv2.getName());
        float tbsv3 = sv3.dtb(3, 6);
        System.out.println("dtb sv3 = " + tbsv3);
        System.out.println(sv3);
        sv3.checkhopdiem();

    }
}
