package shiti;


import java.util.Scanner;
//  历届试题 剪格子  
public class Main4 {
    static int[][] map;
    static int sum = 0;
    static int n, m;
    static int out = 987654321;
    static int stepNum = 987654321;
    static int[][] vis;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        map = new int[n][m];
        vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
                sum += map[i][j];
            }
        }
        sum /= 2;
        dfs(0, 0, 0, 1);
        System.out.println(stepNum);
    }

    public static void dfs(int row, int col, int res, int step) {
        if (row >= n || col >= m || row < 0 || col < 0) {
            return;
        }
        if (vis[row][col] == 1) {
            return;
        }
        if (res > sum) {
            return;
        }
        vis[row][col] = 1;
        res += map[row][col];
        if (res == sum) {
            int num = step;
            int flag = 0;
            stepNum = stepNum < num ? stepNum : num;
        }
        dfs(row + 1, col, res, step + 1);
        dfs(row - 1, col, res, step + 1);
        dfs(row, col - 1, res, step + 1);
        dfs(row, col + 1, res, step + 1);
        vis[row][col] = 0;
    }

}