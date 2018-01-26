package offer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序
 * Created by Administrator on 2018/1/26.
 */
public class Main {
    public static void main(String[] args) {
        reOrderArray(new int[]{1, 2, 3, 4, 5, 6,8});
    }

    public static void reOrderArray(int[] array) {
        int length = array.length;
        int newlength;
        if (length % 2 == 0) newlength = length / 2;
        else newlength = length / 2 + 1;
        int[] arrji = new int[newlength];
        int[] arrou = new int[newlength];
        int temp1 = 0, temp2 = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0)
                arrji[temp1++] = array[i];
            else
                arrou[temp2++] = array[i];
        }
        temp1=0;
        for (int i = 0; i < length; i++) {
            if(i<arrji.length&&arrji[i]!=0)
                array[i]=arrji[i];
            else
                array[i]=arrou[temp1++];
        }
        System.out.println();
    }
}
