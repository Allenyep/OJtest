package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main12_2 {
    public static int n, m;
    public static int count;
    public static int[] DFN;
    public static int[] Low;
    public static int[] parent;
    public static ArrayList<Integer>[] list;
    public static ArrayList<Integer> point;
    
    @SuppressWarnings("unchecked")
    public void init() {
        count = 0;
        DFN = new int[n + 1];
        Low = new int[n + 1];
        parent = new int[n + 1];
        list = new ArrayList[n + 1];
        point = new ArrayList<Integer>();
        for(int i = 1;i <= n;i++)
            list[i] = new ArrayList<Integer>();
    }
    
    public void TarJan(int start, int father) {
        DFN[start] = ++count;
        Low[start] = DFN[start];
        parent[start] = father;
        int childern = 0;
        for(int i = 0;i < list[start].size();i++) {
            int j = list[start].get(i);
            if(DFN[j] == 0) {
                childern++;
                TarJan(j, start);
                Low[start] = Math.min(Low[start], Low[j]);
                if(parent[start] == -1 && childern > 1) {
                    if(!point.contains(start))
                        point.add(start);
                }
                if(parent[start] != -1 && Low[j] >= DFN[start]) {
                    if(!point.contains(start))
                        point.add(start);
                }
                
            } else if(j != parent[start]) {
                Low[start] = Math.min(Low[start], DFN[j]);
            }
        }
    }
    
    public void dfs(int a, boolean[] visited) {
        visited[a] = true;
        for(int i = 0;i < list[a].size();i++) {
            int j = list[a].get(i);
            if(visited[j] == false)
                dfs(j, visited);
        }
    }
    
    public void getResult(int a, int b) {
        TarJan(1, -1);
        int result = 0;
        for(int i = 0;i < point.size();i++) {
            if(point.get(i) == a || point.get(i) == b)
                continue;
            else {
                boolean[] visited = new boolean[n + 1];
                visited[point.get(i)] = true;
                dfs(a, visited);
                if(visited[b] == false) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Main12_2 test = new Main12_2();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        test.init();
        for(int i = 1;i <= m;i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            list[u].add(v);
            list[v].add(u);
        }
        int a = in.nextInt();
        int b = in.nextInt();
        test.getResult(a, b);
    }
    
}