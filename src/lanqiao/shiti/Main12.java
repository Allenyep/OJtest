package lanqiao;

import java.util.Scanner;
/**
 *   历届试题 危险系数  
 *   图  遍历
 * @author Allen
 *
 */
public class Main12 {
	static int result=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		
		int[][] arr=new int[n+1][n+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				arr[i][j]=0;
			}
		}
		
		for(int i=0;i<m;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			
			arr[a][b]=1;
			arr[b][a]=1;
		}
		int u=in.nextInt();
		int v=in.nextInt();
		
//		for(int i=0;i<n+1;i++){
//			for(int j=0;j<n+1;j++){
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		if(arr[u][v]==1){
			System.out.println(0);
			return;
		}
		
		for(int i=1;i<n;i++){
			FD(u,v,arr,i);
		}
		
		if(result==0)result=-1;
		
		System.out.println(result);
		
	}
	static boolean Find(int x,int y,int[][] arr){
		if(arr[x][y]==1)return true;
		for(int i=x;i<arr.length;i++){
			if(arr[x][i]==1)
				return Find(i,y,arr);
		}
		
		return false;
	}
	static void FD(int x,int y,int[][] arr,int i){
		if(i==x||i==y)return;
		int[] temparr=new int[arr.length];
		for(int j=1;j<arr.length;j++){
			temparr[j]=arr[i][j];
			arr[i][j]=0;
			arr[j][i]=0;
		}
		if(!Find(x,y,arr)){
			result++;
		}
		for(int j=1;j<arr.length;j++){
			arr[i][j]=temparr[j];
			arr[j][i]=temparr[j];
		}
	}
	
}
