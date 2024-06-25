package chapter1.section1.practice;

import java.util.Arrays;

public class Practice15 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 1, 2, 67, 7, 4, 132, 5, 8};
        int m = 10;
        System.out.println("原数组为：" + Arrays.toString(nums));
        System.out.println("统计小于" + m + "的之后数组：" + Arrays.toString(histogram(nums, m)));
    }
    public static int[] histogram(int[] nums, int m) {
        int[] result = new int[m];
        for (int num : nums) {
            if (num < m && num >= 0) {
                result[num]++;
            }
        }
        return result;
    }
}
