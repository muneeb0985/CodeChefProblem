import java.util.Scanner;

public class MountainHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] heights = new int[N];
            for (int i = 0; i < N; i++) {
                heights[i] = scanner.nextInt();
            }
            int maxHeight = heights[0];
            for (int i = 1; i < N; i++) {
                if (heights[i] > maxHeight) {
                    maxHeight = heights[i];
                }
            }
            System.out.println(maxHeight);
        }

        scanner.close();
    }
}
