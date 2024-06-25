package chapter1.section1.practice;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Practice36 {
    public static void main(String[] args) {
        int arrayLen = 10;
        int testCount = 10000000;
        int[][] countMap = new int[arrayLen][arrayLen];
        shuffleTest(countMap, arrayLen, testCount);

        int val = testCount / arrayLen;
        System.out.println("期望值：");
        for (int i = 0; i < arrayLen; i++) {
            for (int j = 0; j < arrayLen; j++) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }

        System.out.println("实际结果：");
        for (int[] ints : countMap) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static void shuffleTest(int[][] countMap, int arrayLen, int testCount) {
        int[] nums = new int[arrayLen];

        for (int i = 0; i < testCount; i++) {
            reset(nums);
            shuffle(nums);
            for (int j = 0; j < nums.length; j++) {
                countMap[j][nums[j]]++;
            }
        }
    }

    private static void shuffle(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + StdRandom.uniform(n - i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }

    }

    private static void reset(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
    }
}
