package Bài1;

public class DaoNguoc {
    private String s;

    public Check() {
        System.out.println("chuoi vua nhap: " + s);
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public static void DaoNguoc(String a){
        char temp;
        for(int i = 0; i < a.length(); i++){
            char x = a.charAt(i);
            for(int j = a.length() - 1; j > i; j--){
                temp = x;
                x = a.charAt(j);
                a.charAt(j) = temp;
            }
        }
    }

}
