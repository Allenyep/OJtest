import java.util.Scanner;

public class newcode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s=in.nextInt();
		int[] data=new int[10];
		int result=0;
		for(int i=0;i<n;i++){
			data[i]=in.nextInt();
		}
		
		for(int i=0;i<Math.pow(2, n);i++){
			int mincoin = 10000, sum = 0, sumcoin = 0;
			int temp = i;
			for (int j = 0; j < n; j++) {
				if (temp%2>0) {
				sum += data[j];
				mincoin = mincoin < data[j] ? mincoin : data[j];
				sumcoin++;
				}
				temp >>= 1;
			}
			result = sum >= s && sum - mincoin < s ? result>sumcoin ? result : sumcoin : result;
		}
		System.out.println(result);
	}

}
