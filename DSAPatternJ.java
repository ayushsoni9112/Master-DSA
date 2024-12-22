import java.util.Scanner;

public class DSAPatternJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row and column: ");
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
                if (j == n-1 && i != 0 || i == 0 && j != n-1 || i == n-1
                || j == 0 && i > n/2) {
                    System.out.print("J ");
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
