//1. Find the maximum and minimum in an array.  

import java.util.Arrays;

public class DSAArray1 {
    public static void main(String[] args) {
        int [] x = {80,43,65,12,76,9,34,8,43};
        System.out.println("Array: " + Arrays.toString(x));
        find(x);
    }
    public static void find(int[] x) {
        //letuscodeit
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : x) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
