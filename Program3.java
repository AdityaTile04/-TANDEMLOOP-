import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " → ");
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                if (j > 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}
