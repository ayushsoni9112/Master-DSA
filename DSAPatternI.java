import java.util.Scanner;

public class DSAPatternI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        createPattern(sc.nextInt());
        //letuscodeit
        sc.close();
    }
    public static void createPattern(int n) {
        if (n%2==0) {
            n++;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n/2 ||i == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
