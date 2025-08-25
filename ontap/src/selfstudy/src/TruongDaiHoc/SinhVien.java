package TruongDaiHoc;

public class SinhVien {
    private String name;
    private  int age;

    private double diem;
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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float dtb(int DiemVan, int DiemToan){
        return (DiemToan + DiemVan)/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private  boolean checkdiem(){
        return this.diem >= 10;
    }
    public void checkhopdiem(){
        if(checkdiem()){
            System.out.println("diem hop le");
        }else
            System.out.println("diem khong hop le");
    }
}
