package chapter1.section1;

import java.util.Arrays;
import java.util.Random;

public class Practice35 {
    private static final Random RANDOM_1 = new Random();
    private static final Random RANDOM_2 = new Random();
    public static void main(String[] args) {
        //两个骰子之和得概率分布
        double[] dist = new double[13];

        int[] count = new int[13];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                count[i + j]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            dist[i] = count[i] / 36.0;
        }
        game(100000000);
        System.out.println(Arrays.toString(dist));
    }

    public static void game(int n) {
        int[] count = new int[13];
        for (int i = 0; i < n; i++) {
            int num1 = RANDOM_1.nextInt(6) + 1;
            int num2 = RANDOM_2.nextInt(6) + 1;
            count[num1 + num2]++;
        }

        double[] dist = new double[13];
        for (int i = 0; i < count.length; i++) {
            dist[i] = (double) count[i] / n;
        }
        System.out.println(Arrays.toString(dist));
    }
}
