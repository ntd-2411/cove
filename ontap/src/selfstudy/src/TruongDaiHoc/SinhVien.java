public class SinhVien {
    private String name;
    private  int age;

    public void hienThiThongTin(){
        System.out.println(name + ": " + age);
    }

    public SinhVien() {
        name = "no name";
        age = 0;
    }

    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
