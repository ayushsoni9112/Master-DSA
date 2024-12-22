import java.util.Scanner;

public class DSAPatternS {
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
        //letuscodeit
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != 0 && i == 0 ||
                i != 0 && i < n/2 && j == 0 ||
                j != 0 && j != n-1 && i == n/2 ||
                i > n/2 && i != n-1 && j == n-1 ||
                j != n-1 && i == n-1) {
                    System.out.print("S ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
