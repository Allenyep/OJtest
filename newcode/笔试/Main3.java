import java.util.Scanner;
import java.util.Stack;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int p1=0,left=0,right=0;
        
        Stack<Character> stack = new Stack<>();
        
        for(char c:str.toCharArray()){
            if(c=='('){
                stack.push('(');
            }else if(c==')' && !stack.isEmpty()){
                p1++;
                stack.pop();
            }else if(c==')'){
                right++;
            }
        }
        left = stack.size();

        
        System.out.println(p1+" "+left+" "+right);
    }
}