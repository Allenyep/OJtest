package before;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by allen on 2017/4/26.
 */
public class Main23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ostr = in.nextLine();
        StringBuffer str = new StringBuffer(ostr);
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {
        String newstr = null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i, i + 1, "%20");
            }
        }
        newstr = str.toString();
        return newstr;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
