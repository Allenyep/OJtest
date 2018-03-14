package before;

import java.util.Scanner;

/**
 * Created by allen on 2017/4/26.
 */
public class Main22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int tar=in.nextInt();
        //[[1,2,8,9],[4,7,10,13]]      {1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}
        int[][] arr=new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(tar,arr));
    }

    public static boolean Find(int target, int [][] array) {
        int row=array[0].length;
        int col=array.length;
        if(row==0||col==0){
            return false;
        }
        int newrow=0,newcol=0;
        for(int i=0;i<row;i++){
            if(target==array[0][i]){
                return true;
            }
            if(target>array[0][row-1]){
                newrow=row;
                break;
            }
            else if(target<array[0][i]){
                newrow=i;
                break;
            }
        }
        for (int i=0;i<col;i++){
            if (target==array[i][0]){
                return true;
            }
            if(target>array[col-1][0]){
                newcol=col;
                break;
            }
            else if(target<array[i][0]){
                newcol=i;
                break;
            }

        }
        for (int i=0;i<newrow;i++){
            for (int j=0;j<newcol;j++){
                if(target==array[j][i]){
                    return true;
                }
            }
        }
        return false;
    }
}
