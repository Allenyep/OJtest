package lanqiao;

import java.util.Scanner;

/**
 *  历届试题 大臣的旅费  
 *  深度优先遍历。
 * @author Allen
 *
 */
public class Main9 {
	
	static int n;
	static int[][] gra;
	static boolean[] isVisited;
	static int maxpay=0;
	static int max=0;
	
	public static int DFS(int s,int sum){
		for(int i=0;i<n;i++){
			if(!isVisited[i]&&gra[s][i]!=0){
				isVisited[i]=true;
				sum+=gra[s][i];
				max=max<sum?sum:max;
				DFS(i,sum);//不懂
				sum-=gra[s][i];
			}
		}
		return max = (max < sum)?sum :max;
	}
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     n = in.nextInt();
	     gra=new int[n][n];
	     //isVisited=new boolean[n];
	     for(int i=0;i<n-1;i++){
	    	 int a = in.nextInt()-1;
	         int b = in.nextInt()-1;
	         int c = in.nextInt();
	         
	         gra[a][b]=c;
	         gra[b][a]=c;
	         
	     }
	     for(int i = 0 ; i < n ; i++){
	    	 isVisited = new boolean[n];
	    	 isVisited[i] = true;
	    	 max=0;
	    	 int temp=DFS(i,0);
	    	 maxpay=maxpay>temp?maxpay:temp;
	    	 
	    	 
	     }
	     System.out.println(maxpay*(maxpay+21)/2);
	}
}
