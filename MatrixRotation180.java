import java.util.Scanner;

public class MatrixRotation180 {
    public static void rotateMatrixBy180(int[][] matrix, int N) {
        for (int i = 0; i < N / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[N - 1 - i];
            matrix[N - 1 - i] = temp;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            rotateMatrixBy180(matrix, N);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
