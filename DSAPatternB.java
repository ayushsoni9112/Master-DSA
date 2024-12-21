import java.util.Scanner;

public class DSAPatternB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row and columns: ");
        createPattern(sc.nextInt());
        //letuscodeit
        sc.close();
    }
    public static void createPattern(int n) {
        n = n%2==0 ? n++ : n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != n-1 || j == 0 ||j == n-1 && i != 0
                && i != n-1 && i != n/2 || i == n/2 && j != n-1 || i == n-1 && j != n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
