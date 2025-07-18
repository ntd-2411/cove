import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static float tong(float a,float b){
        return a + b;
    }
    public static void tong1(float a, float b){
        System.out.print("a + b = " + (a + b));
    }
    public static void hamlap(numbers[], int n){
        for(int i = 0; i < n; i++){
            int tong += numbers[i];
        }
        System.out.print("a + b = " + tong);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }
        Scanner sc = new Scanner(System.in);
//        System.out.print("Hay nhap ten cua ban: ");
//        String name = sc.nextLine();
//        System.out.println("Xin chao " + name);
//
//        System.out.print("Hay nhap lop cua ban: ");
//        String lop = sc.nextLine();
//        System.out.println(name + " thuoc lop " + lop);
//
//        System.out.print("Hay nhap ma sinh vien: ");
//        int msv = sc.nextInt();
//        System.out.println(name + " ma sinh vien " + msv);
        System.out.print("Hay nhap a: ");
        float a = sc.nextFloat();
        System.out.print("Hay nhap b: ");
        float b = sc.nextFloat();
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a * b = " + (a * b));
//        float x = (float) a;
//        float y = (float) x / b;
//        System.out.println("a / b = " + y);
//        System.out.println("a % b = " + (a % b));
//        if (a > b)
//            System.out.println("a > b");
//        else
//            System.out.println("a < b");
//        int n;
        do {
            System.out.print("nhap so nguyen n: ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("loi nhap, lai ");
        } while (n <= 0);
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("mang vua nhap: ");
        for(int i = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    hamlap(number[], n);
//      float result = tong(a,b);
//      System.out.println("ket qua theo ham float");
//      System.out.println("a + b = " + result);
//      System.out.println("ket qua theo ham void");
//      tong1(a,b);
}
//ep kieu: int a = x;
//double b = (double) a;
//bien, quy tac dat ten:
//quy tac dat ten:
//        ten bien dung chu cai thuong
//        khong dung tieng viet co dau
//        khong trung ngon ngu java
//*toan tu: tuong tu c++
//1.Mang
//int[] numbers = new int[5];
//string[] names = {"an","binh","cuong"};
//*truy cap phan tu
//2. Vong lap. tuong tu c++;
//* foreach(dung voi mang): ton dung luong
//    int[]arr = {sdfsf};
//for(int num : arr){
//        }
//*switch
//int day = 1;
//switch(day){
//    caus 1:
//        System....
//        }
//*Ham
//public class Main{
//    public static void sayhellp(String name){
//        System.out.println("Xin chao, " + name);
//    }
//    public static int add(int a, int b){
//        return a + b;
//    }
//    public static void main(string[] args){
//        sayhello("toan");
//        int resutl = add(3,4);
//        System.out.println("Tong la: "+ result);
//    }
//*kdl tham chieu va chuoi
//* so sanh chuoi:
//        string a ="hello";
//string b = new string("hello");
//System.out.println(a === b); false(so sanh dia chi)
//System.out.println(a.equals(b)); true(so sanh noi dung)
//        *null va kiem tra null
//
}
