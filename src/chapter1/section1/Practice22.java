package chapter1.section1;

import java.util.Arrays;

public class Practice22 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 8};

        System.out.println("原数组为：" + Arrays.toString(nums));
        System.out.println("查找元素：-1，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, -1, 0, nums.length - 1, 0));
        System.out.println("查找元素：0，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 0, 0, nums.length - 1, 0));
        System.out.println("查找元素：1，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 1, 0, nums.length - 1, 0));
        System.out.println("查找元素：2，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 2, 0, nums.length - 1, 0));
        System.out.println("查找元素：3，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 3, 0, nums.length - 1, 0));
        System.out.println("查找元素：4，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 4, 0, nums.length - 1, 0));
        System.out.println("查找元素：5，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 5, 0, nums.length - 1, 0));
        System.out.println("查找元素：6，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 6, 0, nums.length - 1, 0));
        System.out.println("查找元素：7，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 7, 0, nums.length - 1, 0));
        System.out.println("查找元素：8，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 8, 0, nums.length - 1, 0));
        System.out.println("查找元素：9，查找过程为：");
        System.out.println("查找结果为：" + binarySearch(nums, 9, 0, nums.length - 1, 0));
    }
    public static int binarySearch(int[] nums, int target, int low, int high, int deep) {
        printTab(deep);
        System.out.printf("low: %d, high: %d%n", low, high);
        if (low > high) {
            return -1;
        }
        int middle = low + (high - low) / 2;
        if (target > nums[middle]) {
            return binarySearch(nums, target, low + 1, high,  deep + 1);
        }
        if (target < nums[middle]) {
            return binarySearch(nums, target, low, middle - 1, deep + 1);
        }
        return middle;
    }

    public static void printTab(int count) {
        System.out.print("    ".repeat(Math.max(0, count)));
    }
}
