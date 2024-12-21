import java.util.Scanner;

public class DSAPatternE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row and colums: ");
        createPattern(sc.nextInt());
        sc.close();
        //letuscodeit
    }
    public static void createPattern(int n) {
        if (n%2==0) {
            n++;
        }
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n/2 || i == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }
}
