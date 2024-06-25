package chapter1.section1.practice;

import java.util.Arrays;
import java.util.Random;

public class Practice38 {
    public static void main(String[] args) {
        int n = 10000000;
        Random rand = new Random();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = rand.nextInt(n);
        }

        Arrays.sort(nums);

        int key = rand.nextInt(n);
        System.out.println("查找值：" + key);
        long start = System.currentTimeMillis();
        int index = rank(key, nums);
        long end = System.currentTimeMillis();
        System.out.println("暴力查找结果：" + index);
        System.out.println("暴力查找耗时：" + (end - start));

        start = System.currentTimeMillis();
        index = binarySearch(key, nums);
        end = System.currentTimeMillis();
        System.out.println("二分查找结果：" + index);
        System.out.println("二分查找耗时：" + (end - start));
    }
    public static int rank(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }

    public static int binarySearch(int key, int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (a[middle] == key) {
                return middle;
            } else if (a[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
