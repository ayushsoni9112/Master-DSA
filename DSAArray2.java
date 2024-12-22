//2. Reverse an array.  

import java.util.Arrays;

public class DSAArray2 {
    public static void main(String[] args) {
        int[] x = {32,43,54,65,76,87,56,13};
        System.out.println("Array: " + Arrays.toString(x));
        reverse(x);
        System.out.println("Reversed Array: " + Arrays.toString(x));
    }
    public static void reverse(int[] x) {
        //letuscodeit
        for (int i = 0; i < x.length/2; i++) {
            int temp = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = temp;
        }
    }
}
