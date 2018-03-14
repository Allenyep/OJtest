import java.util.Scanner;

public class newcode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] R=new int[n];
		int temp;
		
		for (int i = 0; i < n; i++) {
			temp=in.nextInt();
			R[i]=in.nextInt();
			R[i] -= temp;
			m-=temp;
		}
		long[][] DP=new long[n][];
		for (int i = 0; i < n; i++) {
			DP[i] = new long[m + 1];
			for(int j=0;j<DP[i].length;j++){
				DP[i][j]=0;
			}
		}
		
		for (int i = 0; i <= R[0]; i++) {
	        DP[0][i] = 1;
	    }
		

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= R[i]; j++) {
				for (int k = 0; k <= m - j; k++) {
					DP[i][k + j] += DP[i - 1][k];
				}
			}
		}
		
		System.out.println(DP[n - 1][m]);
		
		
	
	}

}
