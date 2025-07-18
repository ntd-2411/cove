import java.util.Scanner;

public class b3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap co ma tran n: ");
            n = sc.nextInt();
            if(n <= 0) System.out.print("loi nhap, lai \n");
        }while(n <= 0);
        int[][] a = new int[n][n];
        int dongxuong = 0; int cotsangtrai = n - 1;
        int donglen = n - 1; int cotsangphai = 0;
        int gt = 1;
        while(gt<= n*n){
            for(int j = cotsangphai; j <= cotsangtrai; j++){
                a[dongxuong][j] = gt;
                gt++;
            }dongxuong++;
            for(int j = dongxuong; j <= donglen; j++){
                a[j][cotsangtrai] = gt;
                gt++;
            }cotsangtrai--;
            for(int j = cotsangtrai; j >= cotsangphai; j--){
                a[donglen][j] = gt;
                gt++;
            }donglen--;
            for(int j = donglen; j >= dongxuong; j--){
                a[j][cotsangphai] = gt;
                gt++;
            }cotsangphai++;

        }System.out.print("ma tran xoan oc kich thuoc " + n  + " * " + n + " : \n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }System.out.println();
        }

    }
}
