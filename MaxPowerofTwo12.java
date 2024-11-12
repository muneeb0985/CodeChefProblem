import java.util.Scanner;

public class MaxPowerofTwo12 {
    public static int powerOfTwo(int n) {
        int count = 0;
        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N + 1];
        int[] power2 = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            power2[i] = powerOfTwo(A[i]);
        }

        int[] delta = new int[N + 1];

        for (int q = 0; q < Q; q++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();

            int powerInX = powerOfTwo(x);

            delta[l] += powerInX;
            if (r + 1 <= N) {
                delta[r + 1] -= powerInX;
            }
        }

        int maxPower = Integer.MIN_VALUE;
        int currentPower = 0;

        for (int i = 1; i <= N; i++) {
            currentPower += delta[i];
            int finalPower = power2[i] + currentPower;
            maxPower = Math.max(maxPower, finalPower);
        }

        System.out.println(maxPower);

        sc.close();
    }
}
