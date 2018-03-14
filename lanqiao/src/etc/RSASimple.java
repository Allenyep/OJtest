package etc;

import java.util.Random;

/**
 * 简单实现RAS加密
 * Created by Administrator on 2018/2/2.
 */
public class RSASimple {
    public static void main(String[] args) {
        buildN();
        buildD(E,faiN);
        while (d<=1){
            buildN();
            buildD(E,faiN);
        }

        System.out.println("public:"+N+","+E);
        System.out.println("private:"+N+","+d);


        long message=RSASimpleBoxing(65);
        System.out.println(message);
        System.out.println(RSASimpleReboxing(message));
    }


    //加密
    public static long RSASimpleBoxing(long m){
        long c= 1;
        for(int i=0;i<E;i++){
            c*=m;
            if(c>N)
                c%=N;
        }
        return c;
    }

    //解密
    public static long RSASimpleReboxing(long c){
        long m=1;
        for(int i=0;i<d;i++){
            m*=c;
            if(m>N)
                m%=N;
        }
        return m;
    }

    //测试数据
    public static final int E=17;
    public static long p=61;
    public static long q=53;
    public static long N=3233;
    public static long faiN=3120;
    public static long d=2753;

    //随机生成p,q
    public static void buildN(){
        Random r=new Random();
        int[] primeArr=new int[100];
        int temp=2,num=0;
        while (num!=100){
            if(isPrime(temp)){
                primeArr[num]=temp;
                num++;
            }
            temp++;
        }
        p= primeArr[r.nextInt(100)];
        q= primeArr[r.nextInt(100)];

        while (p==q){
            q=primeArr[r.nextInt(100)];
        }

        N= p*q;
        faiN=(p-1)*(q-1);
//        System.out.println(p+" "+q+" "+N+" "+faiN);
    }

    //计算d
    public static void buildD(long E,long faiN){
        long[] result=extend_gcd(E,faiN);
        d=result[1];
    }

    //判断素数
    public static boolean isPrime(long n){
        if(n<=1)return false;
        else if(n==2)return true;
        else if(n==4)return false;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    //扩展欧几里得算法，已知ab求解xy
    //返回的数组中，第一个值是最大公约数，第二个值表示C++语言实现中的x，第三个值表示y。
    //TODO:这个算法会让生成的d为负数，造成解密失败
    public static long[] extend_gcd(long a,long b){
        long ans;
        long[] result=new long[3];
        if(b==0)
        {
            result[0]=a;
            result[1]=1;
            result[2]=0;
            return result;
        }
        long [] temp=extend_gcd(b,a%b);
        ans = temp[0];
        result[0]=ans;
        result[1]=temp[2];
        result[2]=temp[1]-(a/b)*temp[2];
        return result;
    }

}
