package standrad;

/**
 * Created by Administrator on 2018/1/10.
 */
public class Main7 {
    public static void main(String[] args) {
        int a,b,c;
        for(int i=100;i<1000;i++){
            a=i%10;
            b=i/10%10;
            c=i/100;
            int sum=a*a*a+b*b*b+c*c*c;
            if(i==sum)
                System.out.println(i);
        }
    }
}
