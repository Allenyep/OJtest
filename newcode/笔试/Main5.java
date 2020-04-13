import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        
    }

    public int GetMaxStaffs (char[][] pos) {
        // write code here
        if(pos.length==0){
            return 0;
        }
        
        int pointNum = 0;
        int ans = 0;
        int m = pos.length;
        int n = pos[0].length;
        char[][] pos1 = new char[m+2][n+2];

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                pos1[i][j] = pos[i-1][j-1];
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(pos1[i][j]=='.'){
                    pointNum++;
                }
                if(pos1[i][j]=='.'&&pos1[i-1][j]=='*'&&pos1[i+1][j]=='*'&&pos1[i][j-1]=='*'&&pos1[i][j+1]=='*'){
                    ans++;
                }
            }
        } 

        if((pointNum-ans)%2==0){
            return pointNum-2;
        }else{
            return pointNum-1;
        }

    }

}