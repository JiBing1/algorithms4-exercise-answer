package chapter1.section1;

import java.util.Arrays;

public class Practice30 {
    public static void main(String[] args) {
        f(5);
    }

    /**
     * 1和任何自然数互质，包括0
     * @param n 数组大小
     */
    private static void f(int n) {
        boolean[][] nums = new boolean[n][n];

        for (int i = 0;  i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (gcd(i, j) == 1) {
                    nums[i][j] = true;
                }
            }
        }
        for (boolean[] item : nums) {
            System.out.println(Arrays.toString(item));
        }
    }

    private static int gcd(int i, int j) {
        if (j == 0) return i;
        return gcd(j, i % j);
    }
}
