import java.util.Scanner;

public class DSAPatternA {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        createPattern(sc.nextInt());
        //letuscodeit
        sc.close();
    }
    public static void createPattern(int n) {
        n = n%2==0 ? n++ : n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != 0 && j != n-1 && i == 0 || i != 0 
                && j == 0 || i != 0 && j == n-1 || i == n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
 }