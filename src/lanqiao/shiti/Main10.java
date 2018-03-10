package lanqiao;

import java.util.Scanner;

/**
 *   历届试题 幸运数  
 *   使用堆来维护。
 * @author Allen
 *
 */
public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int result=0;
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=2*i+1;
		}
		
		getLucknumber(arr, m, n);
		for(int i=0;i<n&&arr[i]<n;i++){
			if(arr[i]>m&&arr[i]<n){
				result++;
			}
		}
		System.out.println(result);
		
		
	}
	static void getLucknumber(int[] a,int start,int end){
		int k=start;
		int x=a[start];
		for(int i=start;i<end;i++){
			if((i+1)%x!=0){
				a[k]=a[i];
				k++;
			}
		}
		if(x<end){
			getLucknumber(a, start+1, end);
		}
	}
}
