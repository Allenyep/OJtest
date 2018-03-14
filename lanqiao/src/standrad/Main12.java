package standrad;

/**
 *  基础练习 01字串
 * Created by Administrator on 2018/1/10.
 */
public class Main12 {
    public static void main(String[] args) {
        for(int i=0;i<32;i++){
            StringBuilder sb=new StringBuilder(Integer.toBinaryString(i));
            if(sb.length()==1){
                System.out.println("0000"+sb);
            }else if(sb.length()==2){
                System.out.println("000"+sb);
            }else if(sb.length()==3){
                System.out.println("00"+sb);
            }else if (sb.length()==4){
                System.out.println("0"+sb);
            }else
                System.out.println(sb);
        }
    }
}
