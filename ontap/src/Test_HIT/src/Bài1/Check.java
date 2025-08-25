package Bài1;

public class Check {
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

    public boolean check(String a){
        for(int i= 0; i < a.length();){
            char x = a.charAt(i);
            for(int j = a.length() - 1; j > i; j--){
                if(x == a.charAt(j)){
                    return false;
                }else{
                    i++;
                }
            }
        }return true;

    }
}
