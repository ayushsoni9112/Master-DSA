import java.util.Scanner;

public class DSAPatternC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row and colums: ");
        createPattern(sc.nextInt());
        sc.close();
        //letuscodeit
    }
    public static void createPattern(int n) {
        n = n%2==0 ? n++ : n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != 0 && i != n-1 || i == 0 && j != 0 &&
                j != n-1 || i == n-1 && j != 0 && j != n-1 || i == 1 &&
                 j == n-1 || i == n-2 && j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
