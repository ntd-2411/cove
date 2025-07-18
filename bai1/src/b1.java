import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class b1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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