package lanqiao;

import java.util.Scanner;

/**
 * �㷨��� ����ת  
 * ʹ��̰�ġ�
 * @author Allen
 *
 */
public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] arr=new int[n][n];
		int max=0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=in.nextInt();
				max+=arr[i][j];
			}
		}
		
		int x=(n+1)/2;
		
		
		
	}

}
