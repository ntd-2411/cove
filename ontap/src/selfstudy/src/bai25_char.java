import java.util.Scanner;

public class bai25_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi muon check: ");
        String s = sc.nextLine();
        System.out.print("ban muon kiem tra ki tu thu bn: ");
        int a = sc.nextInt();
        System.out.println(Character.isDigit(s.charAt(a)));
        System.out.println(Character.isLetter(s.charAt(a)));
        System.out.println(Character.isWhitespace(s.charAt(a)));
        System.out.println(Character.isLowerCase(s.charAt(a)));
        System.out.println(Character.isUpperCase(s.charAt(a)));

    }

}
