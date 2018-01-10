package standrad;

/**
 * Created by Administrator on 2018/1/10.
 */
public class Main6 {
    public static void main(String[] args) {
        int a,b,c,d;
        for(int i=1000;i<10000;i++){
            a=i%10;
            b=i/10%10;
            c=i/100%10;
            d=i/1000;
            if(a==d&&b==c){
                System.out.println(i);
            }
        }
    }
}
