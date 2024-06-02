package chapter1.section1;

import java.util.Arrays;
import java.util.Random;

public class Practice39 {
    private static Random rand = new Random();
    public static void main(String[] args) {
        int count = 5;
        System.out.println("1000: " + avg(count, 1000));
        System.out.println("10000: " + avg(count, 10000));
        System.out.println("100000: " + avg(count, 100000));
        System.out.println("1000000: " + avg(count, 1000000));
    }

    private static double avg(int count, int len) {
        double avg = 0;
        int i = 0;

        while (i < count) {
            int[] nums1 = init(len);
            int[] nums2 = init(len);
            Arrays.sort(nums2);
            int cnt = 0;
            for (int j = 0; j < nums1.length; j++) {
                int index = binarySearch(nums1[j], nums2);
                if (index != -1) {
                    cnt++;
                }
            }
            avg = (avg * i + cnt) / (i + 1);
            i++;
        }
        return avg;
    }

    private static int binarySearch (int key, int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == key) {
                return middle;
            } else if (key < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    private static int[] init (int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = rand.nextInt(1000000);
        }
        return nums;
    }
}
