//3. Find the sum of all elements in an array.  

public class DSAArray3 {
    public static void main(String[] args) {
        int[] a = {12,32,43,54,56,76,87,98,43};
        System.out.println("Array: " + a);
        System.out.println("Sum: " + getSum(a));
    }
    public static int getSum(int[] a) {
        //letuscodeit
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }
}
