import java.util.Scanner;

/**
 *   算法训练 数字三角形
 * Created by allen on 2018/1/7.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=n-2;i>=0;i--){
            for (int j=0;j<=i;j++){
                arr[i][j]=arr[i][j]+Math.max(arr[i+1][j],arr[i+1][j+1]);
            }
        }

        /*for(int i=n-1;i>=1;i--){
            for (int j=1;j<=i;j++){
                arr[i][j] = arr[i][j] + Math.max(arr[i+1][j],arr[i+1][j+1]);
            }
        }*/
        System.out.println(arr[0][0]);
    }

}
