import java.util.Scanner;

public class LARGESTSECONDLARGEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                if (A[i] > largest) {
                    secondLargest = largest;
                    largest = A[i];
                } else if (A[i] > secondLargest && A[i] != largest) {
                    secondLargest = A[i];
                }
            }
            System.out.println(largest + secondLargest);
        }

        scanner.close();
    }
}
