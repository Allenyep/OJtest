import java.util.Scanner;

public class newcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int max=0;
		int[][] arr=new int[N+1][N+1];
		int a,b,c;
		for(int i=0;i<M;i++){
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			arr[a][b]=c;
			arr[b][a]=c;
			if(max<c)
				max=c;
		}
		System.out.println(max);
	}

}
