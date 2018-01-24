import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        String [] arr = str.split("\\s+");
        switch (arr[0]){
            case "+":plus(arr[1],arr[2]);break;
            case "-":jian(arr[1],arr[2]);break;
            case "*":cheng(arr[1],arr[2]);break;
            case "/":chu(arr[1],arr[2]);break;
            default:break;
        }

    }
    public static void plus(String a,String b){
        int result=Integer.valueOf(a)+Integer.valueOf(b);
        System.out.println(result);
    }
    public static void jian(String a,String b){
        int result=Integer.valueOf(a)-Integer.valueOf(b);
        System.out.println(result);
    }
    public static void cheng(String a,String b){
        int result=Integer.valueOf(a)*Integer.valueOf(b);
        System.out.println(result);
    }
    public static void chu(String a,String b){
        int result=Integer.valueOf(a)/Integer.valueOf(b);
        System.out.println(result);
    }
}
