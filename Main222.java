import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main222 {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
//            System.out.println(line.trim());
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    // write your code here
    public static int resolve(String expr) {
        char[] chs=expr.toCharArray();
        int intnums=0;
        Stack<Integer> stack=new Stack<>();
        String[] arr=expr.split("\\s+");
        for(String ss : arr){
            switch (ss){
                case "^":
                    if(stack.size()>0){
                        int temp=stack.pop();
                        temp++;
                        stack.push(temp);
                        break;
                    }
                    return -1;
                case "+":
                    if(stack.size()>1){
                        int temp1=stack.pop();
                        int temp2=stack.pop();
                        stack.push(temp1+temp2);
                        break;
                    }
                    return -1;
                case "*":
                    if (stack.size()>1){
                        int temp1=stack.pop();
                        int temp2=stack.pop();
                        stack.push(temp1*temp2);
                        break;
                    }
                    return -1;
                case " ":break;
                default:
                    int temp=Integer.valueOf(ss);
                    stack.push(temp);
                    intnums++;
                    if(intnums>16){
                        return -2;
                    }
            }
        }
//        for(int i=0;i<chs.length;i++){
//            switch (chs[i]){
//                case '^':
//                    if(stack.size()>0){
//                        int temp=stack.pop();
//                        temp++;
//                        stack.push(temp);
//                        break;
//                    }
//                    return -1;
//                case '+':
//                    if(stack.size()>1){
//                        int temp1=stack.pop();
//                        int temp2=stack.pop();
//                        stack.push(temp1+temp2);
//                        break;
//                    }
//                    return -1;
//                case '*':
//                    if (stack.size()>1){
//                        int temp1=stack.pop();
//                        int temp2=stack.pop();
//                        stack.push(temp1*temp2);
//                        break;
//                    }
//                    return -1;
//                case ' ':break;
//                default:
//                    int temp=chs[i]-'0';
//                    stack.push(temp);
//                    intnums++;
//                    if(intnums>16){
//                        return -2;
//                    }
//            }
//        }
        return  stack.pop();
    }
}