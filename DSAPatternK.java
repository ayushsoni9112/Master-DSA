import java.util.Scanner;

public class DSAPatternK {
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
        //letuscodeit
        int star = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == star) {
                    System.out.print("K ");
                } else {
                    System.out.print("  ");
                }
            }
            if (i < n/2) {
                star-=2;
            } else {
                star+=2;
            }
            System.out.println();
        }
        System.out.println();
    }
}
