import java.util.Scanner;

public class DSAPatternN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows and columns: ");
        createPattern(sc.nextInt());
        sc.close();
    }
    public static void createPattern(int n) {
        if (n%2==0) {
            n++;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n-1 || j == i) {
                    System.out.print("N ");
                } else {
                    System.out.print("  ");
                }
            }
            //letuscodeit
            System.out.println();
        }
        System.out.println();
    }
}
