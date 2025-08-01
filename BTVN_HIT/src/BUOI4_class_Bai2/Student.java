package BUOI4_class_Bai2;

//Trong phương thức main():
//Tạo một đối tượng Student bằng constructor
//Sử dụng setName() và setAge() để thay đổi thông tin
//Sử dụng getName() và getAge() để in ra màn hình tên và tuổi mới
public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void hienThi(){
        System.out.println(name + " " + age + " tuoi");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
