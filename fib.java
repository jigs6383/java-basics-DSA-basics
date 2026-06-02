import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms (n): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series for " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first);
            if (i < n) {
                System.out.print(" ");
            }
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
