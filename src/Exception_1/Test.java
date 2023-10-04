package Exception_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] a = {4, 5, 6};
        int[] b = {1, 2, 3, 5};

        String arr = Arrays.toString(sub(a, b));
        System.out.println(arr);








    }

    public static int[] sub(int[] a, int[] b){
        int[] c;
        if (a.length == b.length){
            c = new int[a.length];
            for (int i = 0; i < a.length; i++){
                c[i] = a[i] - b[i];
            }
            return c;
        } else {
            c = new int[1];
            return c;
        }
    }
}
